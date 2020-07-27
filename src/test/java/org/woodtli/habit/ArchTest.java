package org.woodtli.habit;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("org.woodtli.habit");

        noClasses()
            .that()
                .resideInAnyPackage("org.woodtli.habit.service..")
            .or()
                .resideInAnyPackage("org.woodtli.habit.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..org.woodtli.habit.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
