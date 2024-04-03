package com.book.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class ForUserNameDto {

    private int id;
    private String name;
    private double price;
    private String year;
}
