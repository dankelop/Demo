package com.leave.dao;

import com.leave.po.Leave;

import java.io.IOException;
import java.util.List;

public interface LeaveDao {
    /**
     * 新增请假人
     * @param leave
     * @throws IOException
     */
    void addLeave(Leave leave) throws IOException;

    /**
     * 查询所有请假人
     * @return
     * @throws IOException
     */
    List<Leave> queryAll() throws IOException;

    /**
     * 导出请假人
     * @param leaveList
     * @param outPutFileName
     * @throws IOException
     */
    void leaveOutPut(List<Leave> leaveList, String outPutFileName) throws IOException;

    /**
     * 请空请假人表
     * @throws IOException
     */
    void deleteLeave() throws IOException;
}
