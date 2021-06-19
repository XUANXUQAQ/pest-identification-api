package com.rjgc.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author zhaoyunjie
 * @date 2021-04-08 13:06
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Genus {

    @TableId(type = IdType.AUTO)
    private int id;

    @JSONField(name = "name")
    private String name;

    @JSONField(name = "code")
    private String code;

    @JSONField(name = "update_time")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Timestamp updateTime;
}
