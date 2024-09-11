package edu.allinone.sugang.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Builder
public class EnrollmentResDTO {
    private Integer studentId;
    private Integer lectureId;
}
