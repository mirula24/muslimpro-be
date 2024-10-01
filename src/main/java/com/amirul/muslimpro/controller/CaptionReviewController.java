package com.amirul.muslimpro.controller;
import com.amirul.muslimpro.dto.request.CaptionRequest;
import com.amirul.muslimpro.entity.CaptionReview;
import com.amirul.muslimpro.service.CaptionReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/caption-for-review")
@RequiredArgsConstructor
@Validated
public class CaptionReviewController {
    private final CaptionReviewService captionReviewService;

    @PostMapping
    public ResponseEntity<?> create (@RequestBody CaptionRequest request){
        return new ResponseEntity<>(captionReviewService.createCaption(request), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneCaption(@PathVariable Integer id){
        return new ResponseEntity<>(captionReviewService.getOneCaption(id), HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<?> getAllCaption(){
        return new ResponseEntity<>(captionReviewService.getAllCaption(), HttpStatus.ACCEPTED);
    }

    @PutMapping
    public ResponseEntity<?> updateCaption(@PathVariable Integer id, @RequestBody CaptionRequest request){
        return new ResponseEntity<>(captionReviewService.updateCaption(id,request), HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    public ResponseEntity<?> Deleted(@PathVariable Integer id){
        captionReviewService.delete(id);
        return new ResponseEntity<>( HttpStatus.ACCEPTED);
    }

}
