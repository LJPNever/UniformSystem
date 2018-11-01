package yidong.mapper;

import yidong.model.Banner;

public interface BannerMapper {
    int deleteByPrimaryKey(String imgaddress);

    int insert(Banner record);

    int insertSelective(Banner record);
}