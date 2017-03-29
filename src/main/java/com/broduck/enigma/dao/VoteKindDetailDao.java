package com.broduck.enigma.dao;

import com.broduck.enigma.generate.dao.VoteKindDetailMapper;
import com.broduck.enigma.generate.model.VoteKindDetail;
import com.broduck.enigma.generate.model.VoteKindDetailExample;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * VoteKindDetail Dao
 * Created by ydh0624 on 2017-03-29.
 */
@Component
public class VoteKindDetailDao extends EnigmaDao implements IDataBase<VoteKindDetail> {

    protected VoteKindDetailMapper mapper = null;

    @PostConstruct
    protected void initialize() {
        mapper = sqlSession.getMapper(VoteKindDetailMapper.class);
    }

    @Override
    public boolean insert(VoteKindDetail data) {
        return mapper.insert(data) > 0;
    }

    @Override
    public boolean insertList(List<VoteKindDetail> list) {
        for (VoteKindDetail data : list) {
            if (!insert(data))
                return false;
        }

        return true;
    }

    @Override
    public boolean update(VoteKindDetail data) {
        VoteKindDetailExample example = new VoteKindDetailExample();
        example.createCriteria()
                .andVoteKindDetailSnEqualTo(data.getVoteKindDetailSn());

        return mapper.updateByExample(data, example) > 0;
    }

    @Override
    public boolean updateList(List<VoteKindDetail> list) {
        for (VoteKindDetail data : list) {
            if (!update(data))
                return false;
        }
        
        return true;
    }
}
