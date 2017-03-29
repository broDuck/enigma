package com.broduck.enigma.generate.dao;

import com.broduck.enigma.generate.model.Vote;
import com.broduck.enigma.generate.model.VoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    long countByExample(VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    int deleteByExample(VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer voteSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    int insert(Vote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    int insertSelective(Vote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    List<Vote> selectByExampleWithBLOBsWithRowbounds(VoteExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    List<Vote> selectByExampleWithBLOBs(VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    List<Vote> selectByExampleWithRowbounds(VoteExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    List<Vote> selectByExample(VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    Vote selectByPrimaryKey(Integer voteSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Vote record, @Param("example") VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Vote record, @Param("example") VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Vote record, @Param("example") VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Vote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Vote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vote
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Vote record);
}