package com.beingabroad.test.service;

import com.beingabroad.test.dto.InstitutionDTO;
import com.beingabroad.test.entity.Institution;
import com.beingabroad.test.repo.InstituteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionService {

    @Autowired
    private InstituteRepo iRepo;

    // add the institution details to db,
    public Institution saveInstitutte(InstitutionDTO institutionDTO){
        Institution institution = new Institution(institutionDTO);
        return iRepo.save(institution);
    }

    // find the institute by id,
    public Institution getInstitute(Integer institutionId){
        return iRepo.findById(institutionId).get();
    }

    // update the institution with institutionId,
    public Institution updateInstitute(Integer institutionId,InstitutionDTO institutionDTO){
        Institution institution = iRepo.findById(institutionId).get();
                    institution.setName(institutionDTO.getName());
                    institution.setAddress(institutionDTO.getAddress());
                    institution.setContactNo(institutionDTO.getContactNo());
                    institution.setLocation(institutionDTO.getLocation());

                    return iRepo.save(institution);
    }

    // find all the institutions available.,
    public List<Institution> getInstitutions(){
        List<Institution> list = iRepo.findAll();
        return list;
    }
}
