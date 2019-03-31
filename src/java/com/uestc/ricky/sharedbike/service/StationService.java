package com.uestc.ricky.sharedbike.service;

import com.uestc.ricky.sharedbike.dao.StationDao;
import com.uestc.ricky.sharedbike.domain.Station;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StationService {
    @Resource
    private StationDao stationDao;

    public List<Station> getAllStations() {
        return stationDao.getAllStations();
    }
}
