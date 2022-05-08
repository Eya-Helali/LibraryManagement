package com.example.library.Customer;

import com.example.library.Loan.Loan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode
@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String lastName;
    private String firstName;
    private String email;
    private String address;
    private String occupation;
    private LocalDate enrollmentDate;
     @OneToMany(mappedBy ="customer",fetch= FetchType.LAZY,cascade= CascadeType.ALL)
    private Set<Loan> loans = new HashSet<Loan>();

}
