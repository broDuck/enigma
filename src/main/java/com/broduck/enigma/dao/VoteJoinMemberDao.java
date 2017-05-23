package com.broduck.enigma.dao;

import com.broduck.enigma.generate.dao.VoteJoinMemberMapper;
import com.broduck.enigma.generate.model.VoteJoinMember;
import com.broduck.enigma.generate.model.VoteJoinMemberExample;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * VoteJoinMember Dao
 * Created by ydh0624 on 2017-03-29.
 */
@Component
public class VoteJoinMemberDao extends EnigmaDao implements IDataBase<VoteJoinMember> {

    protected VoteJoinMemberMapper mapper = null;

    @PostConstruct
    protected void initialize() {
        mapper = sqlSession.getMapper(VoteJoinMemberMapper.class);
    }

    @Override
    public boolean insert(VoteJoinMember data) {
        return mapper.insert(data) > 0;
    }

    @Override
    public boolean insertList(List<VoteJoinMember> list) {
        for (VoteJoinMember data : list) {
            if (!insert(data))
                return false;
        }

        return true;
    }

    @Override
    public boolean update(VoteJoinMember data) {
        VoteJoinMemberExample example = new VoteJoinMemberExample();
        example.createCriteria()
                .andVoteJoinSnEqualTo(data.getVoteJoinSn());

        return mapper.updateByExample(data, example) > 0;
    }

    @Override
    public boolean updateList(List<VoteJoinMember> list) {
        for (VoteJoinMember data : list) {
            if (!update(data))
                return false;
        }
        
        return true;
    }

    public boolean isExist(int memberSn, Integer voteSn) {
        VoteJoinMemberExample example = new VoteJoinMemberExample();
        example.createCriteria()
                .andMemberSnEqualTo(memberSn)
                .andVoteSnEqualTo(voteSn);

        return mapper.countByExample(example) > 0;
    }

    public boolean insert(int loginSn, Integer voteSn) {
        VoteJoinMember data = new VoteJoinMember();
        data.setMemberSn(loginSn);
        data.setVoteSn(voteSn);

        return insert(data);
    }
}
