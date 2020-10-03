package com.ertekin.test.controller;

import com.ertekin.test.entity.MemberEntity;
import com.ertekin.test.model.Member;
import com.ertekin.test.repository.MemberRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestServiceController {

    @Autowired
    MemberRepository repository;

    @Autowired
    ObjectMapper mapper;

    @GetMapping(value = "/get/{memberId}")
    public List<MemberEntity> getMember(@PathVariable Integer memberId) {

        return repository.findMemberByMemberId(memberId);

    }

    @PostMapping(value = "/save/")
    public String saveMember(@ApiParam(value = "Member member", required = true)
                             @RequestBody Member member) throws JsonProcessingException {

        System.out.println("Member------> " + member);
        MemberEntity memberEntity = getMemberEntity(member);

        repository.save(memberEntity);

        return "Saved:\n" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(member);
    }

    private MemberEntity getMemberEntity(Member member) {
        return mapper.convertValue(member, MemberEntity.class);
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String healthCheck() {

        return "Service is Running";

    }
}
