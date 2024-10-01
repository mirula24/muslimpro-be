package com.amirul.muslimpro.service;

import com.amirul.muslimpro.dto.request.CaptionRequest;
import com.amirul.muslimpro.entity.Caption;

import java.util.List;

public interface CaptionService {
    Caption createCaption(CaptionRequest request);
    Caption getOneCaption(Integer id);
    List<Caption> getAllCaption();
    Caption updateCaption (Integer id,CaptionRequest request);
    void delete(Integer id);

    Caption randomCaption();
}
