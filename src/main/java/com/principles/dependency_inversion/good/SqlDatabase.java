package com.principles.dependency_inversion.good;

public class SqlDatabase implements IPersistence {

    @Override
    public void save(Shopping shopping){
// Saves data in SQL database
    }
}
