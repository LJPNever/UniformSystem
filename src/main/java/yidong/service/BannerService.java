package yidong.service;

import yidong.model.Banner;

import java.util.List;

public interface BannerService {
    List<Banner> selectAll();
    int delete(String imgAddress);
    int add(List<Banner> list);
}
