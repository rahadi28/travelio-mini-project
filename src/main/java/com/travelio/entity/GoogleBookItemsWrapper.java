package com.travelio.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GoogleBookItemsWrapper {
    private GBVolumeInfoWrapper volumeInfo;

    public GBVolumeInfoWrapper getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(GBVolumeInfoWrapper volumeInfo) {
        this.volumeInfo = volumeInfo;
    }
}