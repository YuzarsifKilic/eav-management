package com.yuzarsif.eavmanagement.service;

import com.yuzarsif.eavmanagement.dto.BaseEntityAttributeDto;
import com.yuzarsif.eavmanagement.dto.CreateBaseEntityRequest;
import com.yuzarsif.eavmanagement.model.*;
import com.yuzarsif.eavmanagement.model.Number;
import com.yuzarsif.eavmanagement.repository.BaseEntityAttributeRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.lang.Boolean;
import java.util.List;

@Service
public class BaseEntityAttributeService {

    private final BaseEntityAttributeRepository baseEntityAttributeRepository;
    private final SubEntityService subEntityService;
    private final AttributeService attributeService;
    private final BaseEntityService baseEntityService;
    private final VarCharService varCharService;
    private final BooleanService booleanService;
    private final NumberService numberService;

    public BaseEntityAttributeService(BaseEntityAttributeRepository baseEntityAttributeRepository, SubEntityService subEntityService, AttributeService attributeService, BaseEntityService baseEntityService, VarCharService varCharService, BooleanService booleanService, NumberService numberService) {
        this.baseEntityAttributeRepository = baseEntityAttributeRepository;
        this.subEntityService = subEntityService;
        this.attributeService = attributeService;
        this.baseEntityService = baseEntityService;
        this.varCharService = varCharService;
        this.booleanService = booleanService;
        this.numberService = numberService;
    }


    public List<BaseEntityAttributeDto> getAttributesBySubEntity(Long id) {
        SubEntity subEntityById = subEntityService.getSubEntityById(id);
        Pageable pageable = Pageable.ofSize(50).withPage(1);
        long baslangicZamani = System.currentTimeMillis();
        List<BaseEntityAttributeDto> list = baseEntityAttributeRepository.findAll(pageable)
                .stream()
                .map(BaseEntityAttributeDto::convert)
                .toList();

        long bitisZamani = System.currentTimeMillis();

        // Geçen süreyi hesapla
        long gecenSureMilisaniye = bitisZamani - baslangicZamani;

        // Milisaniye cinsinden gösterim
        System.out.println("İşlem " + gecenSureMilisaniye + " milisaniye sürdü.");

        // Saniye cinsinden gösterim (milisaniyeyi saniyeye çevirme)
        double gecenSureSaniye = gecenSureMilisaniye / 1000.0;
        System.out.println("İşlem " + gecenSureSaniye + " saniye sürdü.");
        return list;
    }

    public void createBaseEntityAttribute(List<CreateBaseEntityRequest> request) {
        BaseEntity baseEntity = baseEntityService.createBaseEntity();

        for (CreateBaseEntityRequest createBaseEntityRequest : request) {
            BaseEntityAttribute baseEntityAttribute = new BaseEntityAttribute();
            baseEntityAttribute.setBaseEntity(baseEntity);
            BaseEntityAttribute savedBaseAttribute = baseEntityAttributeRepository.save(baseEntityAttribute);

            Attribute attributeById = attributeService.findAttributeById(createBaseEntityRequest.attributeId());

            VarChar varChar = new VarChar();
            if (attributeById.getValueType().equals("string")) {
                varChar.setValue((String) createBaseEntityRequest.value());
                varChar.setAttribute(savedBaseAttribute);
                varCharService.createVarChar(varChar);
            }

            com.yuzarsif.eavmanagement.model.Boolean booleanValue = new com.yuzarsif.eavmanagement.model.Boolean();
            if (attributeById.getValueType().equals("boolean")) {
                booleanValue.setValue((Boolean) createBaseEntityRequest.value());
                booleanValue.setAttribute(savedBaseAttribute);
                booleanService.createBoolean(booleanValue);
            }

            Number number = new Number();
            if (attributeById.getValueType().equals("float") || attributeById.getValueType().equals("integer")) {
                number.setValue((Double) createBaseEntityRequest.value());
                number.setAttribute(savedBaseAttribute);
                numberService.createNumber(number);
            }
        }

    }
}
