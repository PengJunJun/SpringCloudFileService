package com.ibanyi.fileservice.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by pjj on 2017/12/28.
 * <p>
 * 保存文件或者获取文件完整路径
 */
public interface FileService {

    /**
     * 获取用户头像的图片路径
     *
     * @param fileName
     * @return
     */
    String getAvatarImagePath(String fileName);

    /**
     * 保存用户头像
     *
     * @param avatar
     * @return 返回保存的路径
     */
    String saveAvatarImage(MultipartFile avatar);
}
