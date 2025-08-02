package com.project.techlog.domain.summary;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(schema = "techlog", name="summary")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "summaryId")
    private Long summaryId;

    @Column(name = "sourceUrl")
    private String summaryContent;

    @Column(name = "sourceUrl")
    private String sourceUrl;
}
