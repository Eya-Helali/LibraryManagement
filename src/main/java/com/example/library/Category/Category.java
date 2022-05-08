package com.example.library.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode
@Entity
@Table
public class Category {
    @Id
    private String code;
    private String label;


}
