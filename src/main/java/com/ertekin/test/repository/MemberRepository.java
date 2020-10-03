package com.ertekin.test.repository;

import com.ertekin.test.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<MemberEntity, Integer>,
        JpaSpecificationExecutor<MemberEntity> {

    List<MemberEntity> findMemberByMemberId(Integer memberId);

}
