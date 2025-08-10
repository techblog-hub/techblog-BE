package com.project.techlogdomain.repository;

import com.project.techlogdomain.entity.SummarizePost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SummarizePostRepository extends JpaRepository<SummarizePost, Long> {
}
