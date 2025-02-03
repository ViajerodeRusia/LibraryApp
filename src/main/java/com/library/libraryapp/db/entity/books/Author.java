package com.library.libraryapp.db.entity.books;

//import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table(name = "author")
public class Author {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(name = "author_name")
    private String authorName;

//    @ManyToMany
//    @JoinTable(
//            name = "book_author",
//            joinColumns = @JoinColumn(name = "author_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id")
//            )
    private Set<Book> books;


}
