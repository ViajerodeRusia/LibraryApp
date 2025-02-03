package com.library.libraryapp.db.entity.library_member;

import com.library.libraryapp.db.entity.books.Book;
//import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table(name = "library_member")
public class LibraryMember {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthDate;
    private String email;
    private String phone;

//    @OneToOne
//    @JoinColumn(name = "address_id")
    private Address address;

//    @OneToMany(mappedBy = "libraryMember")
    private Set<Book> books;

}
