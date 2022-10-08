package com.hyx.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * File Po.
 *
 * @author hyx
 **/

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class File {
    
    /**
     * 主键.
     */
    private Long id;
    
    /**
     * 文件路径.
     */
    private String filePath;
    
    /**
     * 是否上传完毕.
     */
    private Short isReady;
    
    /**
     * 文件md5.
     */
    private String md5;
    
    /**
     * 文件大小.
     */
    private Integer size;
}
