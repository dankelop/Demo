package com.leave.service;

import com.leave.po.Leave;

import java.io.IOException;
import java.util.List;

//@Service
public interface LeaveService {
    /**
     * 新增请假人
     * @param leave
     * @throws IOException
     */
    public void addLeave(Leave leave) throws IOException;

    /**
     * 查询所有请假人
     * @return
     * @throws IOException
     */
    public List<Leave> queryAll() throws IOException;

    /**
     * 导出请假人
     * @param leaveList
     * @param outPutFileName
     * @throws IOException
     */
    public void leaveOutPut(List<Leave> leaveList, String outPutFileName) throws IOException;

    /**
     * 清空请假人表
     * @throws IOException
     */
    public void deleteLeave() throws IOException;
}
