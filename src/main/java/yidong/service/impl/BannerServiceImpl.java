package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.BannerMapper;
import yidong.model.Banner;
import yidong.service.BannerService;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService{
   @Autowired
   private BannerMapper bannerMapper;
    @Override
    public List<Banner> selectAll() {
        return bannerMapper.selectAll();
    }

    @Override
    public int delete(String imgAddress) {
        return bannerMapper.delete(imgAddress);
    }

    @Override
    public int add(List<Banner> list) {
        return bannerMapper.add(list);
    }
}
