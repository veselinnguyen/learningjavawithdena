package com.learning.java.bank.domainmodel;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Speakable{
    private String name;
    private String email;
    private int age;

    @Override
    public void speak() {
        System.out.println("Type: Person");
    }
}
