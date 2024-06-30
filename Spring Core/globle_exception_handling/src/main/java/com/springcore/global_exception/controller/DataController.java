package com.springcore.global_exception.controller;

import com.springcore.global_exception.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/exception")
public class DataController {
    @Autowired
    private RestService restService;

    @GetMapping("/all")
    public String getAll() {
        return restService.getAll();
    }

    @GetMapping("get/{id}")
    public String getById(@PathVariable("id") Integer id) {
        return restService.checkForRuntimeException(id);
    }

    @GetMapping("getN/{id}")
    public String getNullPointerId(@PathVariable("id") Integer id) {
        return restService.getById(id);
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        return restService.delete(id);
    }
}
