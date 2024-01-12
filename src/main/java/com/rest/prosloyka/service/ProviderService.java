package com.rest.prosloyka.service;

import com.rest.prosloyka.view.StudyGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {
    private final CountryClient countryClient;

    public ProviderService(CountryClient countryClient) {
        this.countryClient = countryClient;
    }

    public Long countTransferred() {
        return countryClient.getCountry().transferred;
    }

//    private List<StudyGroup> moveStudents(long from, long to) {
//        return ;
//    }
}
