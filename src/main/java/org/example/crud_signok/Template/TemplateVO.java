package org.example.crud_signok.Template;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data   // getter / setter / toString() 사용
@NoArgsConstructor  // 생성자를 사용하지 않도록 선언
public class TemplateVO {
    private Integer templateId;
    private String templateName;
    private String templateEtc;
}