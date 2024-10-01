package com.amirul.muslimpro.service.implement;

import com.amirul.muslimpro.dto.request.CaptionRequest;
import com.amirul.muslimpro.entity.CaptionReview;
import com.amirul.muslimpro.repository.CaptionReviewRespository;
import com.amirul.muslimpro.service.CaptionReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CaptionReviewServiceImpl implements CaptionReviewService {
    private final CaptionReviewRespository captionReviewRespository;
    @Override
    public CaptionReview createCaption(CaptionRequest request) {
        CaptionReview newCaption = CaptionReview.builder()
                .baris1(request.getBaris1())
                .baris2(request.getBaris2())
                .baris3(request.getBaris3())
                .baris4(request.getBaris4())
                .email(request.getEmail())
                .build();
        return captionReviewRespository.save(newCaption);
    }

    @Override
    public CaptionReview getOneCaption(Integer id) {
        return captionReviewRespository.findById(id).orElseThrow(()-> new RuntimeException("caption for review not found "));
    }

    @Override
    public List<CaptionReview> getAllCaption() {
        return captionReviewRespository.findAll();
    }

    @Override
    public CaptionReview updateCaption(Integer id, CaptionRequest request) {
        CaptionReview update = getOneCaption(id);
        update.setBaris1(request.getBaris1());
        update.setBaris2(request.getBaris2());
        update.setBaris3(request.getBaris3());
        update.setBaris4(request.getBaris4());
        update.setEmail(request.getEmail());
        return captionReviewRespository.save(update);
    }

    @Override
    public void delete(Integer id) {
    CaptionReview delete = getOneCaption(id);

    captionReviewRespository.delete(delete);
    }
}
