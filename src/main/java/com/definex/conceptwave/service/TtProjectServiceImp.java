package com.definex.conceptwave.service;

import com.definex.conceptwave.dao.TtProjectRepository;
import com.definex.conceptwave.entity.TtProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TtProjectServiceImp implements  TtProjectService {

    @Autowired
    private TtProjectRepository ttProjectRepository;

    @Override
    public List<TtProject> findAll() {
        return ttProjectRepository.findAll();
    }
}
