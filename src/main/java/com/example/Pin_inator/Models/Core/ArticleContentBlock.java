package com.example.Pin_inator.Models.Core;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.Pin_inator.Models.Core.Enum.BlockType;
@Entity
@Table(name = "article_blocks")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleContentBlock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer position; // To order blocks

    @Enumerated(EnumType.STRING)
    private BlockType type; // TEXT or IMAGE

    @Column(columnDefinition = "TEXT")
    private String content; // Stores text OR image URL

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    private Article article;
}
