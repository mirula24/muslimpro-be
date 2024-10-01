package com.amirul.muslimpro.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CaptionRequest {
    private String email;
    private String baris1;
    private String baris2;
    private String baris3;
    private String baris4;
}
