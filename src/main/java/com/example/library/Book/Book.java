package com.example.library.Book;

import com.example.library.Category.Category;
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
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String isbn;
    private String title;
    private String author;
    private Integer totalExamplaries ;
    private LocalDate registerDate  ;
    private LocalDate releaseDate  ;
    @OneToMany(mappedBy="book", fetch=FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Loan> loans = new HashSet<Loan>();
    @ManyToOne
    private Category category ;






}
