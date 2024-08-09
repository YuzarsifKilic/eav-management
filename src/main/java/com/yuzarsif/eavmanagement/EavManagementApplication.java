package com.yuzarsif.eavmanagement;

import com.yuzarsif.eavmanagement.model.*;
import com.yuzarsif.eavmanagement.model.Boolean;
import com.yuzarsif.eavmanagement.model.Number;
import com.yuzarsif.eavmanagement.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
            NumberRepository numberRepository) {
        return args -> {

        };
    }
}
