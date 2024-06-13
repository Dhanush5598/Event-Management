package com.Amaze.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Amaze.entity.Form;
import com.Amaze.repository.FormRepo;
import com.Amaze.serviceInterface.FormService;

@Service
public class FormImplementation implements FormService {
    @Autowired
    FormRepo repo;

    @Override
    public int save(Form form) {
        return repo.save(form).getId();
    }

   

}
