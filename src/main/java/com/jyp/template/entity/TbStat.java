package com.jyp.template.entity;

import lombok.Getter;
import lombok.Setter;
//import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
//@Table("tb_stat")
public class TbStat {

    private String id;
    private String region;
    private String group;
    private Integer yesterday;
    private Integer today;
    private Date stat_date;
}
