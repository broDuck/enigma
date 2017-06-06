package com.broduck.enigma.dao;

import com.broduck.enigma.generate.dao.VoteItemMapper;
import com.broduck.enigma.generate.model.VoteItem;
import com.broduck.enigma.generate.model.VoteItemExample;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * VoteItem Dao
 * Created by ydh0624 on 2017-03-29.
 */
@Component
public class VoteItemDao extends EnigmaDao implements IDataBase<VoteItem> {

    protected VoteItemMapper mapper = null;

    @PostConstruct
    protected void initialize() {
        mapper = sqlSession.getMapper(VoteItemMapper.class);
    }

    @Override
    public boolean insert(VoteItem data) {
        return mapper.insert(data) > 0;
    }

    @Override
    public boolean insertList(List<VoteItem> list) {
        for (VoteItem data : list) {
            if (!insert(data))
                return false;
        }

        return true;
    }

    @Override
    public boolean update(VoteItem data) {
        VoteItemExample example = new VoteItemExample();
        example.createCriteria()
                .andVoteItemSnEqualTo(data.getVoteItemSn());

        return mapper.updateByExample(data, example) > 0;
    }

    @Override
    public boolean updateList(List<VoteItem> list) {
        for (VoteItem data : list) {
            if (!update(data))
                return false;
        }
        
        return true;
    }

    public VoteItem select(Integer voteSn, Integer voteItemSn) {
        VoteItemExample example = new VoteItemExample();
        example.createCriteria()
                .andVoteSnEqualTo(voteSn)
                .andVoteItemSnEqualTo(voteItemSn);

        List<VoteItem> list = mapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list))
            return null;

        return list.get(0);
    }

    public List<VoteItem> selectByVoteSn(Integer voteSn) {
        VoteItemExample example = new VoteItemExample();
        example.createCriteria().andVoteSnEqualTo(voteSn);

        return mapper.selectByExample(example);
    }
}
