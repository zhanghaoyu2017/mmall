package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @InterfaceName IFileService
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/3/9-10:39
 * @Version 1.0
 **/
public interface IFileService {
    String upload(MultipartFile file, String path);
}
