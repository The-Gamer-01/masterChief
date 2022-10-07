package com.hyx.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * CreateRaceVO.
 *
 * @author hyx
 **/

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CreateRaceVO {
    
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
    
}
