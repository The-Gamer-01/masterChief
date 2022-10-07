package com.hyx.mapper;

import com.hyx.domain.po.Race;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Race相关Mapper定义与实现.
 *
 * @author hyx
 **/

@Mapper
public interface RaceMapper {
    
    @Select("SELECT * FROM race WHERE id = #{id}")
    Race selectRaceById(Integer id);
    
    @Delete("DELETE FROM race WHERE id = #{id}")
    boolean deleteRace(Integer id);
    
    @Insert("INSERT INTO race(name, type, status, create_time, update_time, is_delete) VALUE("
            + "#{race.name}, #{race.type}, #{race.status},"
            + "#{race.createTime}, #{race.updateTime}, #{race.isDelete});")
    boolean createRace(@Param("race") Race race);
}
