package org.example.crud_signok.model.service;

import org.example.crud_signok.Template.TemplateVO;

import java.util.List;

public interface TemplateService {
    List<TemplateVO> selectTempList();

    TemplateVO selectTempById(Integer templateId);

    int insertTemp(TemplateVO templateVO);

    int updateTemp(TemplateVO templateVO);

    int deleteTempById(Integer templateId);
}