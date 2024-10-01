package com.amirul.muslimpro.repository;

import com.amirul.muslimpro.entity.CaptionReview;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaptionReviewRespository extends JpaRepository<CaptionReview, Integer> {
    CaptionReview findByEmail(String email);
}
