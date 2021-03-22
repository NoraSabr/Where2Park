/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package where2park;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nora
 */
public class Model {

    public String areaDesc, areaID, areaManager, endDate, startDate, usageID;

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    public String getAreaID() {
        return areaID;
    }

    public void setAreaID(String areaID) {
        this.areaID = areaID;
    }

    public String getAreaManager() {
        return areaManager;
    }

    public void setAreaManager(String areaManager) {
        this.areaManager = areaManager;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getUsageID() {
        return usageID;
    }

    public void setUsageID(String usageID) {
        this.usageID = usageID;
    }

    public Model(String areadesc, String areaid, String areamanagerid, String enddatearea, String startdatearea, String usageid) {

        areaDesc = areadesc;
        areaID = areaid;
        areaManager = areamanagerid;
        endDate = enddatearea;
        startDate = startdatearea;
        usageID = usageid;

    }
}


