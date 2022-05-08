package com.example.library.Loan;

import com.example.library.Book.Book;
import com.example.library.Customer.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data @AllArgsConstructor @NoArgsConstructor  @EqualsAndHashCode
@Entity
@Table
public class Loan{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer loanId;
    private LocalDate beginDate  ;
    private LocalDate endDate;
    private LoanStatus status;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Customer customer ;

}
