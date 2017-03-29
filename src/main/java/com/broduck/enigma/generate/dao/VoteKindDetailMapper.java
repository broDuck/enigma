package com.broduck.enigma.generate.dao;

import com.broduck.enigma.generate.model.VoteKindDetail;
import com.broduck.enigma.generate.model.VoteKindDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VoteKindDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    long countByExample(VoteKindDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    int deleteByExample(VoteKindDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer voteKindDetailSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    int insert(VoteKindDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    int insertSelective(VoteKindDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    List<VoteKindDetail> selectByExampleWithRowbounds(VoteKindDetailExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    List<VoteKindDetail> selectByExample(VoteKindDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    VoteKindDetail selectByPrimaryKey(Integer voteKindDetailSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") VoteKindDetail record, @Param("example") VoteKindDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") VoteKindDetail record, @Param("example") VoteKindDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(VoteKindDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekinddetail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(VoteKindDetail record);
}