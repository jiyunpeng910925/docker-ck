package com.jyp.template.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jyp.template.entity.TbStat;
import com.jyp.template.mapper.TbStatMapper;
import com.jyp.template.service.TbStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbStatServiceImpl extends ServiceImpl<TbStatMapper, TbStat> implements TbStatService {

    @Autowired
    private TbStatMapper tbStatMapper;
    @Override
    public List<TbStat> selectList() {
        return tbStatMapper.selectList();
    }
}
