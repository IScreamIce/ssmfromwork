package com.kaige123.daomu.DAO.Mapper;

import com.kaige123.daomu.DAO.Bean.OSaidlog;
import com.kaige123.daomu.DAO.Bean.OSaidlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OSaidlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    long countByExample(OSaidlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int deleteByExample(OSaidlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int deleteByPrimaryKey(Long alid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int insert(OSaidlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int insertSelective(OSaidlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    List<OSaidlog> selectByExample(OSaidlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    OSaidlog selectByPrimaryKey(Long alid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByExampleSelective(@Param("record") OSaidlog record, @Param("example") OSaidlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByExample(@Param("record") OSaidlog record, @Param("example") OSaidlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByPrimaryKeySelective(OSaidlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osaidlog
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByPrimaryKey(OSaidlog record);
}