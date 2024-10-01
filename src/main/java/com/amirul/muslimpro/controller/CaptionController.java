package com.amirul.muslimpro.controller;
import com.amirul.muslimpro.dto.request.CaptionRequest;
import com.amirul.muslimpro.service.CaptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/caption")
@RequiredArgsConstructor
@Validated
public class CaptionController {
    private final CaptionService captionService;

    @PostMapping
    public ResponseEntity<?> create (@RequestBody CaptionRequest request){
        return new ResponseEntity<>(captionService.createCaption(request), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneCaption(@PathVariable Integer id){
        return new ResponseEntity<>(captionService.getOneCaption(id), HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<?> getAllCaption(){
        return new ResponseEntity<>(captionService.getAllCaption(), HttpStatus.ACCEPTED);
    }

    @PutMapping
    public ResponseEntity<?> updateCaption(@PathVariable Integer id, @RequestBody CaptionRequest request){
        return new ResponseEntity<>(captionService.updateCaption(id,request), HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    public ResponseEntity<?> Deleted(@PathVariable Integer id){
        captionService.delete(id);
        return new ResponseEntity<>( HttpStatus.ACCEPTED);
    }

    @GetMapping("/random")
    public ResponseEntity<?> randomCaption(){
        return new ResponseEntity<>(captionService.randomCaption(),HttpStatus.ACCEPTED);
    }

}
