package com.broduck.enigma.dao;

import com.broduck.enigma.generate.dao.VoteMapper;
import com.broduck.enigma.generate.model.Vote;
import com.broduck.enigma.generate.model.VoteExample;
import com.broduck.enigma.model.VoteVo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Vote Dao
 * Created by ydh0624 on 2017-03-29.
 */
@Component
public class VoteDao extends EnigmaDao implements IDataBase<Vote> {

    protected VoteMapper mapper = null;

    @PostConstruct
    protected void initialize() {
        mapper = sqlSession.getMapper(VoteMapper.class);
    }

    @Override
    public boolean insert(Vote data) {
        return mapper.insert(data) > 0;
    }

    @Override
    public boolean insertList(List<Vote> list) {
        for (Vote data : list) {
            if (!insert(data))
                return false;
        }

        return true;
    }

    @Override
    public boolean update(Vote data) {
        VoteExample example = new VoteExample();
        example.createCriteria()
                .andVoteSnEqualTo(data.getVoteSn());

        return mapper.updateByExample(data, example) > 0;
    }

    @Override
    public boolean updateList(List<Vote> list) {
        for (Vote data : list) {
            if (!update(data))
                return false;
        }

        return true;
    }

    public List<VoteVo> selectVoteList() {
        return sqlSession.selectList("vote.selectVoteList");
    }

    public Vote select(Integer voteSn) {
        VoteExample example = new VoteExample();
        example.createCriteria()
                .andVoteSnEqualTo(voteSn);

        List<Vote> list = mapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list))
            return null;

        return list.get(0);
    }
}
