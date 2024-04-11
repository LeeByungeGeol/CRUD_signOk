package org.example.crud_signok.model.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionManager;
import org.example.crud_signok.mapper.TemplateMapper;
import org.example.crud_signok.Template.TemplateVO;
import org.example.crud_signok.model.service.TemplateService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TemplateServiceImpl implements TemplateService {

    private final SqlSessionTemplate sqlSessionTemplate;

    public List<TemplateVO> selectTempList() {
        TemplateMapper tm = sqlSessionTemplate.getMapper(TemplateMapper.class);
        System.out.println(tm.selectTempList());
        return tm.selectTempList();
    }

    public TemplateVO selectTempById(Integer templateId) {
        TemplateMapper tm = sqlSessionTemplate.getMapper(TemplateMapper.class);
        return tm.selectTempById(templateId);
    }

    public int insertTemp(TemplateVO templateVO) {
        TemplateMapper tm = sqlSessionTemplate.getMapper(TemplateMapper.class);
        return tm.insertTemp(templateVO);
    }

    public int updateTemp(TemplateVO templateVO) {
        TemplateMapper tm = sqlSessionTemplate.getMapper(TemplateMapper.class);
        return tm.updateTemp(templateVO);
    }

    public int deleteTempById(Integer templateId) {
        TemplateMapper tm = sqlSessionTemplate.getMapper(TemplateMapper.class);
        return tm.deleteTempById(templateId);
    }
}