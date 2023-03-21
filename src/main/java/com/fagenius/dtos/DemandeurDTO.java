package com.fagenius.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Data
public class DemandeurDTO {
    private int id;
    private String nom;
    private String prenom;
    private String email;
}
