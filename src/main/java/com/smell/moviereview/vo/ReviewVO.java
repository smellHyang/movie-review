package com.smell.moviereview.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@ToString
@Getter @Setter
public class ReviewVO {


    @NonNull
    private int id;
    private int rating;
    private Date date;
    private String title;
    private String director;
    private String actor;
    private String contents;

    @JsonProperty(value="reviewer_id")
    private String reviewer_id;


}
