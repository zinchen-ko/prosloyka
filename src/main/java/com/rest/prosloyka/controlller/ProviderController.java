package com.rest.prosloyka.controlller;

import com.rest.prosloyka.service.ProviderService;
import com.rest.prosloyka.view.StudyGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin
public class ProviderController {

    private final ProviderService providerService;

    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }

    @PostMapping("/count-transferred")
    public Long countTransferred() {
        try {
            return providerService.countTransferred();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    @PostMapping("/{from}/move/{to}")
//    public List<StudyGroup> moveStudents(@PathVariable long from, @PathVariable long to){
//        try {
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

}
