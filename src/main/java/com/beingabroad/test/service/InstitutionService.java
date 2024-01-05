package com.beingabroad.test.service;

import com.beingabroad.test.repo.InstituteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitutionService {

    @Autowired
    private InstituteRepo iRepo;
}
