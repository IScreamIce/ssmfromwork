package com.kaige123.daomu.DAO.Mapper;

import com.kaige123.daomu.DAO.Bean.OSconfig;
import com.kaige123.daomu.DAO.Bean.OSconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OSconfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osconfig
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    long countByExample(OSconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osconfig
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int deleteByExample(OSconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osconfig
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int deleteByPrimaryKey(String k);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osconfig
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int insert(OSconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osconfig
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int insertSelective(OSconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osconfig
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    List<OSconfig> selectByExample(OSconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osconfig
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    OSconfig selectByPrimaryKey(String k);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osconfig
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByExampleSelective(@Param("record") OSconfig record, @Param("example") OSconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osconfig
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByExample(@Param("record") OSconfig record, @Param("example") OSconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osconfig
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByPrimaryKeySelective(OSconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table osconfig
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByPrimaryKey(OSconfig record);
}