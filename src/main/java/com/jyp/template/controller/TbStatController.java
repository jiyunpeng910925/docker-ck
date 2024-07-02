package com.jyp.template.controller;

import com.jyp.template.entity.TbStat;
import com.jyp.template.service.TbStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tb_stat")
public class TbStatController {

    @Autowired
    private TbStatService tbStatService;

    @RequestMapping("list")
    public List<TbStat> selectList() {
        return tbStatService.selectList();
    }
}
