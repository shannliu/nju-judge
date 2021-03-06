package cn.edu.nju.software.judge.dao;

import cn.edu.nju.software.judge.beans.Submission;
import cn.edu.nju.software.judge.beans.SubmissionExample;
import java.util.List;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface SubmissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Fri Jan 04 10:02:07 CST 2019
     */
    long countByExample(SubmissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Fri Jan 04 10:02:07 CST 2019
     */
    int deleteByExample(SubmissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Fri Jan 04 10:02:07 CST 2019
     */
    int deleteByPrimaryKey(Integer submissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Fri Jan 04 10:02:07 CST 2019
     */
    int insert(Submission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Fri Jan 04 10:02:07 CST 2019
     */
    int insertSelective(Submission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Fri Jan 04 10:02:07 CST 2019
     */
    List<Submission> selectByExample(SubmissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Fri Jan 04 10:02:07 CST 2019
     */
    Submission selectByPrimaryKey(Integer submissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Fri Jan 04 10:02:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") Submission record, @Param("example") SubmissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Fri Jan 04 10:02:07 CST 2019
     */
    int updateByExample(@Param("record") Submission record, @Param("example") SubmissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Fri Jan 04 10:02:07 CST 2019
     */
    int updateByPrimaryKeySelective(Submission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Fri Jan 04 10:02:07 CST 2019
     */
    int updateByPrimaryKey(Submission record);

    /**
     * 根据条件查询列表
     * @param record
     * @return
     */
    List<Submission> selectBySelective(Submission record);

}