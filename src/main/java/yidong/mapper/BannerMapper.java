package yidong.mapper;

import yidong.model.Banner;

import java.util.List;

public interface BannerMapper {
    List<Banner> selectAll();
    int delete(String imgAddress);
    int add(List<Banner> list);
}