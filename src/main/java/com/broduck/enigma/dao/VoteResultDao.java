package com.broduck.enigma.dao;

import com.broduck.enigma.generate.dao.VoteResultMapper;
import com.broduck.enigma.generate.model.VoteResult;
import com.broduck.enigma.generate.model.VoteResultExample;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * VoteResult Dao
 * Created by ydh0624 on 2017-03-29.
 */
@Component
public class VoteResultDao extends EnigmaDao implements IDataBase<VoteResult> {

    protected VoteResultMapper mapper = null;

    @PostConstruct
    protected void initialize() {
        mapper = sqlSession.getMapper(VoteResultMapper.class);
    }

    @Override
    public boolean insert(VoteResult data) {
        return mapper.insert(data) > 0;
    }

    @Override
    public boolean insertList(List<VoteResult> list) {
        for (VoteResult data : list) {
            if (!insert(data))
                return false;
        }

        return true;
    }

    @Override
    public boolean update(VoteResult data) {
        VoteResultExample example = new VoteResultExample();
        example.createCriteria()
                .andVoteSnEqualTo(data.getVoteSn());

        return mapper.updateByExample(data, example) > 0;
    }

    @Override
    public boolean updateList(List<VoteResult> list) {
        for (VoteResult data : list) {
            if (!update(data))
                return false;
        }

        return true;
    }

    public VoteResult selectData(Integer voteSn, Integer voteItemSn, Integer ageKind, Boolean maleYn) {
        VoteResultExample example = new VoteResultExample();
        example.createCriteria()
                .andVoteSnEqualTo(voteSn)
                .andVoteItemSnEqualTo(voteItemSn)
                .andAgeKindEqualTo(ageKind)
                .andMaleKindEqualTo(maleYn);

        List<VoteResult> list = mapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list))
            return null;

        return list.get(0);
    }
}
