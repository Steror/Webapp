package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue
    private long id;
    private @NonNull String name;
    private @NonNull String manufacturer;
    private String engineVolume;
}
