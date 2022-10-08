package com.hyx.service.impl;

import com.hyx.domain.po.Race;
import com.hyx.mapper.RaceMapper;
import com.hyx.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Race接口Service实现类.
 *
 * @author hyx
 **/

@Service
public class RaceServiceImpl implements RaceService {
    
    @Autowired
    private RaceMapper raceMapper;
    
    @Override
    public Race getRace(Integer id) {
        return raceMapper.selectRaceById(id);
    }
    
    @Override
    public boolean deleteRace(Integer id) {
        return raceMapper.deleteRace(id);
    }
    
    @Override
    public boolean createRace(Race race) {
        race.setCreateTime(new Date(System.currentTimeMillis()));
        race.setUpdateTime(new Date(System.currentTimeMillis()));
        race.setIsDelete((short) 0);
        return raceMapper.createRace(race);
    }
    
    @Override
    public boolean modifyRace(Race race) {
        return false;
    }
    
}
