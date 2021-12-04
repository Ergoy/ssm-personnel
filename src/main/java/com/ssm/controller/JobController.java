package com.ssm.controller;

import com.ssm.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JobController {
    @Autowired
    private JobService jobService;
}
