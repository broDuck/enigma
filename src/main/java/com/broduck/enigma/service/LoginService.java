package com.broduck.enigma.service;

import com.broduck.enigma.common.MessageException;
import com.broduck.enigma.dao.MemberDao;
import com.broduck.enigma.generate.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 로그인 서비스
 * Created by broduck on 2017. 4. 6..
 */

@Service
public class LoginService {
    @Autowired
    private MemberDao memberDao;

    public boolean signin(String email, String password) throws MessageException {
        boolean isSuccess = memberDao.isExist(email, password);
        if (!isSuccess)
            throw new MessageException("이메일 혹은 비밀번호를 확인해주세요.");

        return true;
    }

    public boolean signup(String email, String password, String nickName, Integer age, Boolean maleYn) throws MessageException {
        if (memberDao.isExist(email))
            throw new MessageException("이메일 중복입니다.");

        Member member = new Member();
        member.setEmail(email);
        member.setPassword(password);
        member.setNickname(nickName);
        member.setAge(age);
        member.setMaleYn(maleYn);

        return memberDao.insert(member);
    }
}
