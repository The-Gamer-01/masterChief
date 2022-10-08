package com.hyx.service;

import com.hyx.domain.po.Race;

/**
 * Race接口相关Service定义.
 *
 * @author hyx
 **/

public interface RaceService {
    
    /**
     * 根据race编号获取race对象.
     * @param id race自增编号
     * @return race对象
     */
    Race getRace(Integer id);
    
    /**
     * 根据race编号删除编号.
     * @param id race自增编号
     * @return 是否删除成功.
     */
    boolean deleteRace(Integer id);
    
    /**
     * 创建race.
     * @param race race对象.
     * @return 是否创建成功.
     */
    boolean createRace(Race race);
    
    /**
     * 更新race.
     * @param race 更新后的race对象.
     * @return 是否更新成功.
     */
    boolean modifyRace(Race race);
}
