package org.example.crud_signok.mapper;

import org.example.crud_signok.Template.TemplateVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateMapper {
    List<TemplateVO> selectTempList();

    TemplateVO selectTempById(Integer templateId);

    int insertTemp(TemplateVO templateVO);

    int updateTemp(TemplateVO templateVO);

    int deleteTempById(Integer templateId);
}