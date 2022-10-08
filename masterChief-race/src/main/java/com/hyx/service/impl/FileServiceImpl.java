package com.hyx.service.impl;

import com.hyx.domain.dto.ChunkDTO;
import com.hyx.domain.po.File;
import com.hyx.mapper.FileMapper;
import com.hyx.service.FileService;
import com.hyx.utils.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * File Service的实现类.
 *
 * @author hyx
 **/

@Service
public class FileServiceImpl implements FileService {
    
    @Autowired
    private FileMapper fileMapper;
    
    @Override
    public boolean upload(ChunkDTO chunkDTO, MultipartFile file) {
        Long fileId = chunkDTO.getFileId();
        String md5 = chunkDTO.getMd5();
        File fileById = fileMapper.getFileById(fileId, md5);
        if (fileById == null) {
            throw new RuntimeException("500");
        }
        return true;
    }
    
    @Override
    public Long startUpload(String md5, Integer size) {
        File file = fileMapper.findFileByMd5(md5);
        Long id;
        if (file != null) {
            id = file.getId();
        } else {
            id = IdUtil.generateId();
            fileMapper.startUpload(id, md5, size);
        }
        return id;
    }
    
    @Override
    public boolean merge(String fileId) {
        return false;
    }
}
