package com.project_management.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDTO<T> {
    private Integer code;
    private String message;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;
}
