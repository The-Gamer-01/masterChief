package com.hyx.controller;

import com.hyx.domain.po.Race;
import com.hyx.domain.vo.CreateRaceVO;
import com.hyx.domain.vo.ModifyRaceVO;
import com.hyx.service.RaceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * RaceController,主要包括测试相关接口.
 *
 * @author hyx
 **/

@RestController
public class RaceController {
    
    @Autowired
    private RaceService raceService;
    
    @GetMapping("/race/{id}")
    public Race getRace(@PathVariable String id) {
        return raceService.getRace(Integer.valueOf(id));
    }
    
    @PostMapping("/race")
    private boolean createRace(@RequestBody CreateRaceVO createRaceVO) {
        Race race = new Race();
        BeanUtils.copyProperties(createRaceVO, race);
        return raceService.createRace(race);
    }
    
    @PutMapping("/race")
    private boolean modifyRace(ModifyRaceVO modifyRaceVO) {
        return false;
    }
    
    @DeleteMapping("/race/{id}")
    private boolean deleteRace(@PathVariable String id) {
        return raceService.deleteRace(Integer.valueOf(id));
    }
    
}
