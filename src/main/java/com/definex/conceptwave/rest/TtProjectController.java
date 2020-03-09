package com.definex.conceptwave.rest;

import com.definex.conceptwave.entity.TtProject;
import com.definex.conceptwave.service.TtProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tt-project")
public class TtProjectController {

    @Autowired
    private TtProjectService ttProjectService;

    @GetMapping("/all")
    public List<TtProject> findAll(){
        return ttProjectService.findAll();
    }

}
