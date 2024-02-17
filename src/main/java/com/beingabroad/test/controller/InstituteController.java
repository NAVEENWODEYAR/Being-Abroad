package com.beingabroad.test.controller;

import com.beingabroad.test.dto.InstitutionDTO;
import com.beingabroad.test.entity.Institution;
import com.beingabroad.test.exception.InstitutionNotFoundException;
import com.beingabroad.test.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/being/abroad")
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

        var institute = iService.getInstitute(id);
        if(!(institute == null))
           new InstitutionNotFoundException("Please provide the correct institute id");
        return iService.getInstitute(id);
    }

    // Update the institution by id.,
    @PutMapping("/upDate/{id}")
    public Institution updateInstitute(@PathVariable Integer id,InstitutionDTO institutionDTO){
        return iService.updateInstitute(id,institutionDTO);
    }

    // delete institute by id,
    @DeleteMapping("/deleteInstitute/{id}")
    public String deleteInstitute(@PathVariable Integer id){
         iService.deleteInstitute(id);
        return "Institution with id " + id+" deleted successfully from databse";
    }

}
