package com.library.libraryapp.db.entity.books;

//import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table(name = "book_cover")
public class BookCover {
//    @Id
//    @GeneratedValue
    private long id;
    private String filePath;
    private long fileSize;
    private String mediaType;
//    @Lob
    private byte[] preview;
//    @OneToOne(mappedBy = "bookCover")
    private Book book;
}
