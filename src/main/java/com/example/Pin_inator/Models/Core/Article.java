package com.example.Pin_inator.Models.Core;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {

    @SequenceGenerator(
            name = "article_sequence",
            sequenceName = "article_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "article_sequence"
    )
    @Id
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String ownerId;
    @Getter
    @Setter
    private String header;
    @Getter
    @Setter
    private String content;
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Getter
    @Setter
    private List<Pin> pinLst;
}
