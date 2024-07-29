
package com.epam.autotasks;

import lombok.Builder;
import lombok.Data;

import java.util.function.Supplier;

@Data
@Builder
public class Cat  {

    private String name;
    private Integer age;
    private Breed breed;

    public enum Breed {

        BRITISH, MAINE_COON, MUNCHKIN, PERSIAN, SIBERIAN
    }
}
