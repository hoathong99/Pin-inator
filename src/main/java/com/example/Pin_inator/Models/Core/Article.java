package com.example.Pin_inator.Models.Core;

import com.example.Pin_inator.Models.Core.User.User;
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
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("position ASC") // Ensures correct order of blocks
    private List<ArticleContentBlock> blocks;
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Getter
    @Setter
    private List<Pin> pinLst;
}
