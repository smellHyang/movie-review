package com.smell.moviereview.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReviewerVO {

    @JsonProperty
    private String id;

    @JsonProperty
    private String name;
}
