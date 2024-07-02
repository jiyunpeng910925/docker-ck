package com.jyp.template.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyp.template.entity.TbStat;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbStatMapper extends BaseMapper<TbStat> {

    List<TbStat> selectList();
}
