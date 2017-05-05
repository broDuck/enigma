package com.broduck.enigma.model;

import java.util.Date;

/**
 * Created by broduck on 2017. 4. 26..
 */
public class VotePeriod {
    private Date startDate;
    private Date endDate;
    private Integer count;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
