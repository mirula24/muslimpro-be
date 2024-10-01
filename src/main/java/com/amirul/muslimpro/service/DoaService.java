package com.amirul.muslimpro.service;

import com.amirul.muslimpro.dto.request.DoaRequest;
import com.amirul.muslimpro.entity.Doa;

import java.util.List;

public interface DoaService {
    Doa create(DoaRequest request);
    Doa getOneDoa(Integer id);
    List<Doa> getAllDoa();
    Doa update(Integer id, DoaRequest request);
    void delete(Integer id);
}
