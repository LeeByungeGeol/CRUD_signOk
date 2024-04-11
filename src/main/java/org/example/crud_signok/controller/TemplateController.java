package org.example.crud_signok.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.crud_signok.Template.TemplateVO;
import org.example.crud_signok.model.service.TemplateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/temp")
@RestController
@RequiredArgsConstructor
public class TemplateController {

    private final TemplateService templateService;

    @PostMapping("templateList")
    public ResponseEntity<List<TemplateVO>> selectTemplateList() {
        List<TemplateVO> resultList = templateService.selectTempList();
        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }

    @PutMapping("selectTempById")
    public ResponseEntity<TemplateVO> selectTemplateById(@RequestBody TemplateVO templateVO) {
        TemplateVO result = templateService.selectTempById(templateVO.getTemplateId());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("insertTemplate")
    public ResponseEntity<Integer> insertTemplate(@RequestBody TemplateVO templateVO) {
        Integer result = templateService.insertTemp(templateVO);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("updateTemplate")
    public ResponseEntity<Integer> updateTemplate(@RequestBody TemplateVO templateVO) {
        Integer result = templateService.updateTemp(templateVO);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping("deleteTemplate")
    public ResponseEntity<Integer> deleteTemplate(@RequestBody TemplateVO templateVO) {
        Integer result = templateService.deleteTempById(templateVO.getTemplateId());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}