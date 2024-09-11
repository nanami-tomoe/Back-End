package edu.allinone.sugang.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@JsonDeserialize(builder = EnrollmentDTO.EnrollmentDTOBuilder.class)
public class EnrollmentDTO {
    private final Integer studentId;
    private final Integer lectureId;
}
