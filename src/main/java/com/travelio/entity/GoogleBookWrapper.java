package com.travelio.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GoogleBookWrapper {
    private int totalItems;
    private GoogleBookItemsWrapper[] items;

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public GoogleBookItemsWrapper[] getItems() {
        return items;
    }

    public void setItems(GoogleBookItemsWrapper[] items) {
        this.items = items;
    }
}