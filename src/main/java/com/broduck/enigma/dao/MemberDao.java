package com.broduck.enigma.dao;

import com.broduck.enigma.generate.dao.MemberMapper;
import com.broduck.enigma.generate.model.Member;
import com.broduck.enigma.generate.model.MemberExample;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Member Dao
 * Created by ydh0624 on 2017-03-29.
 */
@Component
public class MemberDao extends EnigmaDao implements IDataBase<Member> {

    protected MemberMapper mapper = null;

    @PostConstruct
    protected void initialize() {
        mapper = sqlSession.getMapper(MemberMapper.class);
    }

    @Override
    public boolean insert(Member data) {
        return mapper.insert(data) > 0;
    }

    @Override
    public boolean insertList(List<Member> list) {
        for (Member data : list) {
            if (!insert(data))
                return false;
        }

        return true;
    }

    @Override
    public boolean update(Member data) {
        MemberExample example = new MemberExample();
        example.createCriteria()
                .andMemberSnEqualTo(data.getMemberSn());

        return mapper.updateByExample(data, example) > 0;
    }

    @Override
    public boolean updateList(List<Member> list) {
        for (Member data : list) {
            if (!update(data))
                return false;
        }
        
        return true;
    }

    public boolean isExist(String email, String password) {
        MemberExample example = new MemberExample();
        example.createCriteria()
                .andEmailEqualTo(email)
                .andPasswordEqualTo(password);

        return mapper.countByExample(example) > 0;
    }

    public boolean isExist(String email) {
        MemberExample example = new MemberExample();
        example.createCriteria()
                .andEmailEqualTo(email);

        return mapper.countByExample(example) > 0;
    }

    public Member selectByEmail(String email) {
        MemberExample example = new MemberExample();
        example.createCriteria().andEmailEqualTo(email);

        return mapper.selectByExample(example).get(0);
    }
}
