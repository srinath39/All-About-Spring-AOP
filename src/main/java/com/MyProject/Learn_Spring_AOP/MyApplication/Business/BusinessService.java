package com.MyProject.Learn_Spring_AOP.MyApplication.Business;

import com.MyProject.Learn_Spring_AOP.Annotations.TrackTime;
import com.MyProject.Learn_Spring_AOP.MyApplication.Data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService {
    private DataService dataService;

    @Autowired
    public BusinessService(DataService dataService){
        this.dataService=dataService;
    }

    @TrackTime
    public int getMaxValue(){
        int[] data=dataService.retrieveData();
//        if(true) {
//            throw new RuntimeException("ss");
//        }
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Arrays.stream(data).max().orElse(0);
    }

}
