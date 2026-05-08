package com.MyProject.Learn_Spring_AOP.MyApplication.Data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {

    public DataService(){

    }

    public int[] retrieveData(){
        return new int[]{11,22,33,44,55};
    }
}

