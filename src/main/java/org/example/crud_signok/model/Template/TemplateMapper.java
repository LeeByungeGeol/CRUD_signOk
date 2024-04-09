package org.example.crud_signok.model.Template;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * - 해당 파일은 xml 파일과 1:1 매핑되는 인터페이스 입니다. (환경파일 내에서 지정함)
 * - 해당 Mapper 폴더는 @Repository 어노테이션을 필수적으로 사용합니다.
 * [ 참고 ]
 * - xml 파일이 아닌 해당 파일 내에서 처리하려면 @Mapper 어노테이션을 사용하길 권장합니다.
 */
@Repository
public interface TemplateMapper {
    List<TemplateVO> selectTempList();

    TemplateVO selectTempById(Integer templateId);

    int insertTemp(TemplateVO templateVO);

    int updateTemp(TemplateVO templateVO);

    int deleteTempById(Integer templateId);
}