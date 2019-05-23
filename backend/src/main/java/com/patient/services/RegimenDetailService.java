package com.patient.services;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.patient.models.RegimenDetail;
import com.patient.repos.RegimenDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class RegimenDetailService {

    @Autowired
    private RegimenDetailRepository regimenDetailRepository;

    public List<RegimenDetail> getAllRegimenDetails(){
        return regimenDetailRepository.findAll();
    }

    public RegimenDetail getRegimenDetailId(int id){
        return regimenDetailRepository.findOne((long) id);
    }

    public long deleteRegimenDetail(long id) {
        RegimenDetail regimenDetail = regimenDetailRepository.findOne(id);
        regimenDetailRepository.delete(regimenDetail);
        return id;
    }

    public RegimenDetail addOrUpdateRegimenDetail(String payLoad) throws JsonParseException, JsonMappingException, IOException {
        RegimenDetail regimenDetail = new RegimenDetail();
        regimenDetail = regimenDetailRepository.save(regimenDetail);
        return regimenDetail;
    }


}
