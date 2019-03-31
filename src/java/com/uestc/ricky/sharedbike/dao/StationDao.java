package com.uestc.ricky.sharedbike.dao;

import com.uestc.ricky.sharedbike.domain.Station;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationDao {
    List<Station> getAllStations();

}
