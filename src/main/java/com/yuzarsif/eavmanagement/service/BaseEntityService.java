package com.yuzarsif.eavmanagement.service;

import com.yuzarsif.eavmanagement.dto.BaseEntityDto;
import com.yuzarsif.eavmanagement.model.BaseEntity;
import com.yuzarsif.eavmanagement.repository.BaseEntityRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseEntityService {

    private final BaseEntityRepository baseEntityRepository;

    public BaseEntityService(BaseEntityRepository baseEntityRepository) {
        this.baseEntityRepository = baseEntityRepository;
    }

    public List<BaseEntityDto> getBaseEntities() {
        long baslangicZamani = System.currentTimeMillis();
        Pageable pageable = Pageable.ofSize(50).withPage(1);
        List<BaseEntityDto> list = baseEntityRepository.findAll(pageable)
                .stream()
                .map(BaseEntityDto::convert)
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

    public List<BaseEntityDto> getAttributesBySubEntityId(Long id) {
        long baslangicZamani = System.currentTimeMillis();
        Pageable pageable = Pageable.ofSize(50).withPage(1);
        List<BaseEntityDto> list = baseEntityRepository.findBySubEntity(id, pageable)
                .stream()
                .map(BaseEntityDto::convert)
                .toList();
        long bitisZamani = System.currentTimeMillis();

        long gecenSureMilisaniye = bitisZamani - baslangicZamani;

        System.out.println("İşlem " + gecenSureMilisaniye + " milisaniye sürdü.");

        double gecenSureSaniye = gecenSureMilisaniye / 1000.0;
        System.out.println("İşlem " + gecenSureSaniye + " saniye sürdü.");
        return list;
    }

    protected BaseEntity createBaseEntity() {
        BaseEntity baseEntity = new BaseEntity();
        BaseEntity savedBaseEntity = baseEntityRepository.save(baseEntity);
        return savedBaseEntity;
    }
}
