package com.example.springbootdemo.dao;

import com.example.springbootdemo.bean.Goods;
import com.example.springbootdemo.bean.GoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface GoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    long countByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    int deleteByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @Delete({
        "delete from goods",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @Insert({
        "insert into goods (id, gname, ",
        "gprice, gnumber, ",
        "guser, gphoto)",
        "values (#{id,jdbcType=INTEGER}, #{gname,jdbcType=VARCHAR}, ",
        "#{gprice,jdbcType=VARCHAR}, #{gnumber,jdbcType=VARCHAR}, ",
        "#{guser,jdbcType=VARCHAR}, #{gphoto,jdbcType=VARCHAR})"
    })
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    int insertSelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    List<Goods> selectByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, gname, gprice, gnumber, guser, gphoto",
        "from goods",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.example.springbootdemo.dao.GoodsMapper.BaseResultMap")
    Goods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @Update({
        "update goods",
        "set gname = #{gname,jdbcType=VARCHAR},",
          "gprice = #{gprice,jdbcType=VARCHAR},",
          "gnumber = #{gnumber,jdbcType=VARCHAR},",
          "guser = #{guser,jdbcType=VARCHAR},",
          "gphoto = #{gphoto,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Goods record);
}