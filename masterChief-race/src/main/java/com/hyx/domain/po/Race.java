package com.hyx.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * 对应数据库实体race.
 *
 * @author hyx
 **/

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Race {
    
    /**
     * 自增主键.
     */
    private Integer id;
    
    /**
     * 竞赛名称.
     */
    private String name;
    
    /**
     * 竞赛类型.
     */
    private Short type;
    
    /**
     * 竞赛状态.
     */
    private Short status;
    
    /**
     * 创建时间.
     */
    private Date createTime;
    
    /**
     * 更新时间.
     */
    private Date updateTime;
    
    /**
     * 逻辑删除.
     */
    private Short isDelete;
}
