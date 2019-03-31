package com.uestc.ricky.sharedbike.controller;

import com.uestc.ricky.sharedbike.domain.Bike;
import com.uestc.ricky.sharedbike.service.StationService;
import com.uestc.ricky.sharedbike.utils.ResponseBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/")
public class MainController {
    @RequestMapping(method = RequestMethod.GET, value = {"", "/", "index"})
    public String index(HttpSession session) {
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "bikes")
    @ResponseBody
    public Bike bikes(HttpSession session) {
        Bike b = new Bike();
        b.setId("id");
        b.setName("name");
        return b;
    }

    @Resource
    private StationService stationService;

    @RequestMapping(method = RequestMethod.GET, value = "station/list")
    @ResponseBody
    public ResponseBean getAllStations() {
        return ResponseBean.buildSuccess(stationService.getAllStations());
    }
}
