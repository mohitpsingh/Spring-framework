package com.springcore.global_exception.service;

import org.springframework.stereotype.Service;

@Service
public class RestService {

    public String getAll() {
        return "Getting all the Data";
    }

    public String getById(Integer id) {
      return "Get by Id";
    }

    public String delete(Integer id) {
        if (id == 5) {
            throw new IllegalArgumentException();
        }
        return "deleting the record by id";
    }

    public String update() {
        return "Update the Data";
    }

    public String save() {
        return "save the Data";
    }

    public String checkForRuntimeException(Integer id) {
        if (id == 1) {
            throw new RuntimeException();
        } else {
            return "checking global exception handling for Runtime exception";
        }
    }
}
