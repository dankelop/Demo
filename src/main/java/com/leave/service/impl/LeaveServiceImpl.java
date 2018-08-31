package com.leave.service.impl;

import com.leave.dao.LeaveDao;
import com.leave.po.Leave;
import com.leave.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName LeaveServiceImpl
 * @Description
 * @Author martind
 * @Date 2018/8/25 16:55
 **/
@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    private LeaveDao leaveDao;

    /**
     * 新增请假人
     * @param leave
     * @throws IOException
     */
    @Override
    public void addLeave(Leave leave) throws IOException {
        leaveDao.addLeave(leave);

    }

    /**
     * 查询所有请假人
     * @return
     * @throws IOException
     */
    @Override
    public List<Leave> queryAll() throws IOException {
        return leaveDao.queryAll();
    }

    /**
     * 导出请假人
     * @param leaveList
     * @param outPutFileName
     * @throws IOException
     */
    @Override
    public void leaveOutPut(List<Leave> leaveList, String outPutFileName) throws IOException {
        leaveDao.leaveOutPut(leaveList,outPutFileName);
    }

    /**
     * 请空请假人表
     * @throws IOException
     */
    @Override
    public void deleteLeave() throws IOException {
        leaveDao.deleteLeave();
    }
}
