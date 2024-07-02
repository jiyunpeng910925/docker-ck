package com.jyp.template.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyp.template.entity.TbStat;

import java.util.List;

public interface TbStatService extends IService<TbStat> {

    List<TbStat> selectList();
}
