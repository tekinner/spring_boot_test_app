package com.ertekin.test.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Member {

    @ApiModelProperty(position = 0)
    Integer memberId;

    @ApiModelProperty(position = 1)
    String name;

    @ApiModelProperty(position = 2)
    String position;

    @ApiModelProperty(position = 3)
    String location;

    @ApiModelProperty(position = 4)
    Long salary;

}
