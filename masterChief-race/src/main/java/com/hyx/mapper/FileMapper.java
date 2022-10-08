package com.hyx.mapper;

import com.hyx.domain.po.File;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * File Mapper.
 *
 * @author hyx
 **/

@Mapper
public interface FileMapper {
    
    @Select("SELECT * FROM file WHERE id = #{id} AND md5 = #{md5}")
    File getFileById(Long fileId, String md5);
    
    @Select("INSERT INTO file(id, md5, is_ready, size, file_path) VALUES(#{id}, #{md5}, 0, #{size}, '')")
    Long startUpload(@Param("id") Long id, @Param("md5") String md5, @Param("size") Integer size);
    
    @Select("SELECT * FROM file WHERE md5 = #{md5}")
    File findFileByMd5(String md5);
}
