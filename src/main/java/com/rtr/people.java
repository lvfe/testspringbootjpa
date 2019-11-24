package com.rtr;

import java.util.Date;

/**
 * Created by lenovo on 21/11/2019.
 */
public class people {
    private String name;
    //@JSONField(format="YYYY/MM/DD")
    private Date mydate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMydate() {
        return mydate;
    }

    public void setMydate(Date mydate) {
        this.mydate = mydate;
    }

    public people(String name, Date mydate) {
        this.name = name;
        this.mydate = mydate;
    }
}
