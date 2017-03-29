package com.broduck.enigma.dao;

import com.broduck.enigma.generate.dao.VoteKindMapper;
import com.broduck.enigma.generate.model.VoteKind;
import com.broduck.enigma.generate.model.VoteKindExample;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * VoteKind Dao
 * Created by ydh0624 on 2017-03-29.
 */
@Component
public class VoteKindDao extends EnigmaDao implements IDataBase<VoteKind> {

    protected VoteKindMapper mapper = null;

    @PostConstruct
    protected void initialize() {
        mapper = sqlSession.getMapper(VoteKindMapper.class);
    }

    @Override
    public boolean insert(VoteKind data) {
        return mapper.insert(data) > 0;
    }

    @Override
    public boolean insertList(List<VoteKind> list) {
        for (VoteKind data : list) {
            if (!insert(data))
                return false;
        }

        return true;
    }

    @Override
    public boolean update(VoteKind data) {
        VoteKindExample example = new VoteKindExample();
        example.createCriteria()
                .andVoteKindSnEqualTo(data.getVoteKindSn());

        return mapper.updateByExample(data, example) > 0;
    }

    @Override
    public boolean updateList(List<VoteKind> list) {
        for (VoteKind data : list) {
            if (!update(data))
                return false;
        }
        
        return true;
    }
}
