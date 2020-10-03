package com.ertekin.test.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "member_table", schema = "member_schema")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;

    Integer memberId;
    String name;
    String position;
    String location;
    Long salary;

}
