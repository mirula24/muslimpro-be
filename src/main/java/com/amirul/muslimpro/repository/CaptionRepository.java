package com.amirul.muslimpro.repository;

import com.amirul.muslimpro.entity.Caption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CaptionRepository extends JpaRepository<Caption, Integer> {

    @Query(value = "WITH row_count AS (" +
            "   SELECT COUNT(*) as total_rows FROM captions" +
            ") " +
            "SELECT * " +
            "FROM captions " +
            "OFFSET FLOOR(RANDOM() * (SELECT total_rows FROM row_count)) " +
            "LIMIT 1", nativeQuery = true)
    Caption randomCaption();
}
