package com.principles.interface_segregation.bad;

import java.util.Date;

public interface IProduct {
    String getName();
    int getStock();
    int getNumberOfDisks();
    Date getReleaseDate();
    int getRecommendedAge();
}
