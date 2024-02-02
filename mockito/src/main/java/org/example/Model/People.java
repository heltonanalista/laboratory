package org.example.Model;

import lombok.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class People {


    private String name;
    private String cpf;
    private String age;
    private Double weight;
    private Double height;

}
