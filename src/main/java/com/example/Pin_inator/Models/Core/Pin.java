package com.example.Pin_inator.Models.Core;

import jakarta.persistence.*;
import lombok.*;
import com.example.Pin_inator.Models.Core.Enum.PinType;
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pin {
    @SequenceGenerator(
            name = "pin_sequence",
            sequenceName = "pin_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "pin_sequence"
    )
    @Id
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String lat;
    @Getter
    @Setter
    private String Lng;
    @Getter
    @Setter
    private String label;
    @Getter
    @Setter
    private String content;
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private PinType type;
    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    private Article article;
}
