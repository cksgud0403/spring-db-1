package com.example.jdbc.repository;

import com.example.jdbc.domain.Member;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class MemberRepositoryV0Test {

    MemberRepositoryV0 repository = new MemberRepositoryV0();


    @Test
    void crud() throws SQLException {
        //save
        Member member = new Member("memberV0", 10000);
        repository.save(member);
    }
}
