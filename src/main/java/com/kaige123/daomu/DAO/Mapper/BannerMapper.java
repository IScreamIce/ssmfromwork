package com.kaige123.daomu.DAO.Mapper;

import com.kaige123.daomu.DAO.Bean.Banner;
import com.kaige123.daomu.DAO.Bean.BannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    long countByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int deleteByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int deleteByPrimaryKey(Long bid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int insert(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int insertSelective(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    List<Banner> selectByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    Banner selectByPrimaryKey(Long bid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByExampleSelective(@Param("record") Banner record, @Param("example") BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByExample(@Param("record") Banner record, @Param("example") BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByPrimaryKeySelective(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    int updateByPrimaryKey(Banner record);
}