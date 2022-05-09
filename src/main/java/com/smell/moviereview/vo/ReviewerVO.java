package com.smell.moviereview.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter @Setter
public class ReviewerVO {

    @JsonProperty(value="id")
    private String id;

    @JsonProperty(value="name")
    private String name;
}
