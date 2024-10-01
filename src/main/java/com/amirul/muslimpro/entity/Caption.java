package com.amirul.muslimpro.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "caption_for_review")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Caption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;

    @Column(columnDefinition = "TEXT")
    private String baris1;

    @Column(columnDefinition = "TEXT")
    private String baris2;

    @Column(columnDefinition = "TEXT")
    private String baris3;

    @Column(columnDefinition = "TEXT")
    private String baris4;

}
