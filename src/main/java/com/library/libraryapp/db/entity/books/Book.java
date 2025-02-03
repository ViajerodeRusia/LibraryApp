package com.library.libraryapp.db.entity.books;

import com.library.libraryapp.db.entity.library_member.LibraryMember;
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
//@Table(name = "book")
public class Book {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

////    @OneToOne
//    private BookCover bookCover;

//    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;  // ManyToMany

//    @OneToOne
//    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    private Integer year;
    private String genre;

//    @Column(name = "is_borrowed", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean isBorrowed;

//    @ManyToOne
//    @JoinColumn(name = "library_member_id")
    private LibraryMember libraryMember;

}
