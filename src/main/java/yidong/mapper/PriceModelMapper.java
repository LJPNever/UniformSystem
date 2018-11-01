package yidong.mapper;

import yidong.model.PriceModel;

import java.util.List;

public interface PriceModelMapper {
    int insert(PriceModel record);

    int insertSelective(PriceModel record);

    int addModle(List<PriceModel> list);

    List selectBySmall(int smallModelId);
}