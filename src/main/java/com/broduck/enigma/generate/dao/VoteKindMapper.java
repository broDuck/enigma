package com.broduck.enigma.generate.dao;

import com.broduck.enigma.generate.model.VoteKind;
import com.broduck.enigma.generate.model.VoteKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VoteKindMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    long countByExample(VoteKindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    int deleteByExample(VoteKindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer voteKindSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    int insert(VoteKind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    int insertSelective(VoteKind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    List<VoteKind> selectByExampleWithRowbounds(VoteKindExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    List<VoteKind> selectByExample(VoteKindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    VoteKind selectByPrimaryKey(Integer voteKindSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") VoteKind record, @Param("example") VoteKindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") VoteKind record, @Param("example") VoteKindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(VoteKind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votekind
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(VoteKind record);
}