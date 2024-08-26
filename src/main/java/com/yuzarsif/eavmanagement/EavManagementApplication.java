package com.yuzarsif.eavmanagement;

import com.yuzarsif.eavmanagement.model.*;
import com.yuzarsif.eavmanagement.model.Boolean;
import com.yuzarsif.eavmanagement.model.Number;
import com.yuzarsif.eavmanagement.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.w3c.dom.Attr;

import java.util.Optional;

@SpringBootApplication
public class EavManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EavManagementApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            BaseEntityRepository baseEntityRepository,
            EntityTypeRepository entityTypeRepository,
            SubEntityRepository subEntityRepository,
            AttributeRepository attributeRepository,
            VarCharRepository varCharRepository,
            BooleanRepository booleanRepository,
            NumberRepository numberRepository,
            BaseEntityAttributeRepository baseEntityAttributeRepository) {
        return args -> {

//            for (int i = 0; i < 1000; i++) {
//                BaseEntity baseEntity = new BaseEntity();
//                baseEntityRepository.save(baseEntity);
//            }
//
//            Optional<EntityType> byId = entityTypeRepository.findById(1L);
//            Optional<SubEntity> byId1 = subEntityRepository.findById(2L);
//
//            Attribute savedAttribute = attributeRepository.findById(1L).get();
//
//            Attribute savedAttribute2 = attributeRepository.findById(2L).get();
//
//            Attribute savedAttribute3 = attributeRepository.findById(3L).get();
//
//            Attribute attribute4 = Attribute
//                    .builder()
//                    .name("Motor")
//                    .isReadOnly(false)
//                    .displayName("Kotor Gücü (kW)")
//                    .description("Power of an engine")
//                    .valueType("integer")
//                    .isRequired(true)
//                    .subEntity(byId1.get())
//                    .build();
//
//            Attribute savedAttribute4 = attributeRepository.save(attribute4);
//
//            Attribute attribute5 = Attribute
//                    .builder()
//                    .name("Uzunluj")
//                    .isReadOnly(false)
//                    .displayName("Uzunluk (cm)")
//                    .description("Height of a bicycle")
//                    .valueType("integer")
//                    .isRequired(true)
//                    .subEntity(byId1.get())
//                    .build();
//
//            Attribute savedAttribute5 = attributeRepository.save(attribute5);
//
//            for (int i = 1000; i < 2000; i++) {
//                Optional<BaseEntity> byId2 = baseEntityRepository.findById((long) i);
//                BaseEntityAttribute baseEntityAttribute = BaseEntityAttribute
//                        .builder()
//                        .attribute(savedAttribute)
//                        .baseEntity(byId2.get())
//                        .build();
//
//                BaseEntityAttribute savedBaseEntityAttribute = baseEntityAttributeRepository.save(baseEntityAttribute);
//
//                VarChar varChar = VarChar
//                        .builder()
//                        .value("LG TV " + i)
//                        .attribute(savedBaseEntityAttribute)
//                        .build();
//
//                varCharRepository.save(varChar);
//
//                BaseEntityAttribute baseEntityAttribute2 = BaseEntityAttribute
//                        .builder()
//                        .attribute(savedAttribute2)
//                        .baseEntity(byId2.get())
//                        .build();
//
//                BaseEntityAttribute savedBaseEntityAttribute2 = baseEntityAttributeRepository.save(baseEntityAttribute2);
//
//                Number number = Number
//                        .builder()
//                        .value(7000.0 + i)
//                        .attribute(savedBaseEntityAttribute2)
//                        .build();
//
//                numberRepository.save(number);
//
//                BaseEntityAttribute baseEntityAttribute3 = BaseEntityAttribute
//                        .builder()
//                        .attribute(savedAttribute3)
//                        .baseEntity(byId2.get())
//                        .build();
//
//                BaseEntityAttribute savedBaseEntityAttribute3 = baseEntityAttributeRepository.save(baseEntityAttribute3);
//
//                Number number2 = Number
//                        .builder()
//                        .value(700.0 + i)
//                        .attribute(savedBaseEntityAttribute3)
//                        .build();
//
//                numberRepository.save(number2);
//
//                BaseEntityAttribute baseEntityAttribute4 = BaseEntityAttribute
//                        .builder()
//                        .attribute(savedAttribute4)
//                        .baseEntity(byId2.get())
//                        .build();
//
//                BaseEntityAttribute savedBaseEntityAttribute4 = baseEntityAttributeRepository.save(baseEntityAttribute4);
//
//                Number number3 = Number
//                        .builder()
//                        .value(70.0 + i)
//                        .attribute(savedBaseEntityAttribute4)
//                        .build();
//
//                numberRepository.save(number3);
//
//                BaseEntityAttribute baseEntityAttribute5 = BaseEntityAttribute
//                        .builder()
//                        .attribute(savedAttribute5)
//                        .baseEntity(byId2.get())
//                        .build();
//
//                BaseEntityAttribute savedBaseEntityAttribute5 = baseEntityAttributeRepository.save(baseEntityAttribute5);
//
//                Number number4 = Number
//                        .builder()
//                        .value(70.0 + i)
//                        .attribute(savedBaseEntityAttribute5)
//                        .build();
//
//                numberRepository.save(number4);
//            }

        };
    }
}
