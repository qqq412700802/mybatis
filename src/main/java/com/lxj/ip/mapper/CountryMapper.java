package com.lxj.ip.mapper;

import com.lxj.ip.domain.Country;
import java.util.List;

public interface CountryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Sun May 12 20:03:41 CST 2019
     */
    int insert(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Sun May 12 20:03:41 CST 2019
     */
    List<Country> selectAll();
}