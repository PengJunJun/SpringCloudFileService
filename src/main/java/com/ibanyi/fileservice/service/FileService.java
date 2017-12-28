package com.ibanyi.fileservice.service;

/**
 * Created by pjj on 2017/12/28.
 * <p>
 * 用于获取图片的完整路径
 */
public interface FileService {

    /**
     * 获取用户头像的图片路径
     *
     * @param fileName
     * @return
     */
    String getAvatarImagePath(String fileName);

}
