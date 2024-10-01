package com.amirul.muslimpro.service.implement;

import com.amirul.muslimpro.dto.request.CaptionRequest;
import com.amirul.muslimpro.entity.Caption;
import com.amirul.muslimpro.repository.CaptionRepository;
import com.amirul.muslimpro.service.CaptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CaptionServiceImpl implements CaptionService {
    private final CaptionRepository captionRepository;
    @Override
    public Caption createCaption(CaptionRequest request) {
        Caption newCaption = Caption.builder()
                .email(request.getEmail())
                .baris1(request.getBaris1())
                .baris2(request.getBaris2())
                .baris3(request.getBaris3())
                .baris4(request.getBaris4())
                .build();
        return captionRepository.save(newCaption);
    }

    @Override
    public Caption getOneCaption(Integer id) {

        return captionRepository.findById(id).orElseThrow(()-> new RuntimeException("Caption not Found"));
    }

    @Override
    public List<Caption> getAllCaption() {
        return captionRepository.findAll();
    }

    @Override
    public Caption updateCaption(Integer id, CaptionRequest request) {
        Caption updateCaption = getOneCaption(id);
        updateCaption.setEmail(request.getEmail());
        updateCaption.setBaris1(request.getBaris1());
        updateCaption.setBaris2(request.getBaris2());
        updateCaption.setBaris3(request.getBaris3());
        updateCaption.setBaris4(request.getBaris4());


        return captionRepository.save(updateCaption);
    }

    @Override
    public void delete(Integer id) {
        Caption delete = getOneCaption(id);

        captionRepository.delete(delete);

    }

    @Override
    public Caption randomCaption() {
        return captionRepository.randomCaption();
    }
}
