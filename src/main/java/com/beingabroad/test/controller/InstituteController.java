package com.beingabroad.test.controller;

import com.beingabroad.test.dto.InstitutionDTO;
import com.beingabroad.test.entity.Institution;
import com.beingabroad.test.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/being")
public class InstituteController {

    @Autowired
    private InstitutionService iService;
    // testEndPoint,
    @GetMapping("/test/{st}")
    @ResponseStatus(code = HttpStatus.CONTINUE)
    public String testEndPoint(@PathVariable String st) {
        return "Welcome! "+st;
    }

    // INSERT INTO TABLE VALUES();
    @PostMapping("/saveInstitute")
    public Institution saveInstitute(@RequestBody InstitutionDTO institutionDTO){
        return iService.saveInstitutte(institutionDTO);
    }

    // SELECT * FROM TABLE WHERE id=?,
    @GetMapping("/getInstitute/{id}")
    public Institution getInstitute(@PathVariable Integer id){
        return iService.getInstitute(id);
    }

    // Update the institution by id.,
    @PutMapping("/upDate/{id}")
    public Institution updateInstitute(@PathVariable Integer id){
        return iService.updateInstitute(id);
    }

}
