package com.demo.enrollment.model.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetGradeRequest {

    private Long studentId;

    private SupportedGrade grade;
}
