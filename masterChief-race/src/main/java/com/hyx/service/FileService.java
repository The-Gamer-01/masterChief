package com.hyx.service;

import com.hyx.domain.dto.ChunkDTO;
import org.springframework.web.multipart.MultipartFile;

/**
 * File接口相关定义.
 *
 * @author hyx
 **/

public interface FileService {
    
    /**
     * 上传文件方法.
     * @param chunkDTO 文件对象相关信息DTO
     * @param multipartFile 具体文件对象
     * @return 是否上传成功.
     */
    boolean upload(ChunkDTO chunkDTO, MultipartFile multipartFile);
    
    /**
     * 获取文件编号.
     * @param md5 文件md5.
     * @param size 文件大小.
     * @return 文件编号
     */
    Long startUpload(String md5, Integer size);
    
    /**
     * 合并文件.
     * @param fileId 文件编号.
     * @return 是否合并成功.
     */
    boolean merge(String fileId);
}
