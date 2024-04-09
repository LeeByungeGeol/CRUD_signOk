package org.example.crud_signok.controller;

import org.example.crud_signok.model.service.firstService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class firstController {

    private final firstService firstService;

    @GetMapping("/first")
    public Map<String, String> firstController() {
        return firstService.getFirstData();
    }
}