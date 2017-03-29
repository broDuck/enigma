package com.broduck.enigma.dao;

import com.broduck.enigma.generate.dao.VoteItemDetailMapper;
import com.broduck.enigma.generate.model.VoteItemDetail;
import com.broduck.enigma.generate.model.VoteItemDetailExample;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * VoteItemDetail Dao
 * Created by ydh0624 on 2017-03-29.
 */
@Component
public class VoteItemDetailDao extends EnigmaDao implements IDataBase<VoteItemDetail> {

    protected VoteItemDetailMapper mapper = null;

    @PostConstruct
    protected void initialize() {
        mapper = sqlSession.getMapper(VoteItemDetailMapper.class);
    }

    @Override
    public boolean insert(VoteItemDetail data) {
        return mapper.insert(data) > 0;
    }

    @Override
    public boolean insertList(List<VoteItemDetail> list) {
        for (VoteItemDetail data : list) {
            if (!insert(data))
                return false;
        }

        return true;
    }

    @Override
    public boolean update(VoteItemDetail data) {
        VoteItemDetailExample example = new VoteItemDetailExample();
        example.createCriteria()
                .andVoteItemDetailSnEqualTo(data.getVoteItemDetailSn());

        return mapper.updateByExample(data, example) > 0;
    }

    @Override
    public boolean updateList(List<VoteItemDetail> list) {
        for (VoteItemDetail data : list) {
            if (!update(data))
                return false;
        }
        
        return true;
    }
}
