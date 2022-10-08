package com.hyx.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 文件上传块DTO.
 *
 * @author hyx
 **/

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ChunkDTO {
    
    private Integer chunkIndex;
    
    private Integer chunkSize;
    
    private Long fileId;
    
    private String fileName;
    
    private String md5;
}
