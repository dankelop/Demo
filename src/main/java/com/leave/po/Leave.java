package com.leave.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName Leave
 * @Description
 * @Author martind
 * @Date 2018/8/25 16:45
 **/
public class Leave {
    /**
     * 请假人id，主键
     */
    private Long id;

    /**
     * 请假人姓名
     */
    private String leaveName;

    /**
     * 请假原因
     */
    private String leaveText;

    /**
     *创建请假时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    /**
     * 请假开始时间
     */
    private String beginTime;

    /**
     * 请假结束时间
     */
    private String endTime;
    public Leave() {
    }

    public Leave(String leaveName, String leaveText, Date createTime, String beginTime, String endTime) {
        this.leaveName = leaveName;
        this.leaveText = leaveText;
        this.createTime = createTime;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public String getLeaveText() {
        return leaveText;
    }

    public void setLeaveText(String leaveText) {
        this.leaveText = leaveText;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "id=" + id +
                ", leaveName='" + leaveName + '\'' +
                ", leaveText='" + leaveText + '\'' +
                ", createTime=" + createTime +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                '}';
    }
}
