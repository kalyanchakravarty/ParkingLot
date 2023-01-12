package com.scaler.parkinglot.models;

//It is a good practise to add all common attributes to a common class called BaseModel
//since this is a persistent app, we need to store all the models in the repository. So all models need to have
//id field. Also any audit field should be present - like create date, create time etc.

public class BaseModel {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
