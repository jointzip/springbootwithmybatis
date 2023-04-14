package com.athome.springbootwithmybatis.common;

import java.awt.*;

// ImageStore的使用举例
public interface ImageStore {
  public String upload(Image image, String bucketName);

  public Image download(String url);
}