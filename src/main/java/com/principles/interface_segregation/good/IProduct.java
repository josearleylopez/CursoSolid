package com.principles.interface_segregation.good;

import java.util.Date;

public interface IProduct {
    String getName();
    int getStock();
    int getNumberOfDisks();
    Date getReleaseDate();
}
