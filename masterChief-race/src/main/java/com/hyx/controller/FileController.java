package com.hyx.controller;

import com.hyx.domain.dto.ChunkDTO;
import com.hyx.domain.vo.StartUploadVO;
import com.hyx.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件相关接口.
 *
 * @author hyx
 **/

@Slf4j
@RestController
@RequestMapping("/file")
public class FileController {
    
    @Autowired
    private FileService fileService;
    
    /**
     * 开始上传接口.
     * @param startUploadVO 开始上传PO.
     * @return 文件编号.
     */
    @PostMapping("/start")
    public Long startUpload(@RequestBody StartUploadVO startUploadVO) {
        String md5 = startUploadVO.getMd5();
        Integer size = startUploadVO.getSize();
        return fileService.startUpload(md5, size);
    }
    
    /**
     * 上传块文件.
     */
    @PostMapping("/chunk")
    public boolean upload(ChunkDTO chunkDTO, MultipartFile file) {
        return fileService.upload(chunkDTO, file);
    }
    
    @PostMapping("/merge/{fileId}")
    public boolean merge(@PathVariable String fileId) {
        return fileService.merge(fileId);
    }
    
    /**
     * 检查文件上传进度.
     */
    @GetMapping("/chunk")
    public void checkChunk() {
    
    }
    
    /**
     * 检查文件MD5,用于秒传.
     * @return 文件是否已存在.
     */
    @GetMapping("/check")
    public boolean checkFileMd5() {
        return false;
    }
    
}
