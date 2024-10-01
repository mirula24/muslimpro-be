package com.amirul.muslimpro.service;

import com.amirul.muslimpro.dto.request.CaptionRequest;
import com.amirul.muslimpro.entity.CaptionReview;

import java.util.List;

public interface CaptionReviewService {
    CaptionReview createCaption(CaptionRequest request);
    CaptionReview getOneCaption(Integer id);
    List<CaptionReview> getAllCaption();
    CaptionReview updateCaption (Integer id,CaptionRequest request);
    void delete(Integer id);
}
