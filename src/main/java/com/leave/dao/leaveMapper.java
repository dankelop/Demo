package com.leave.dao;

import com.leave.po.Leave;

import java.util.List;

public interface leaveMapper {
    /**
     * 新增请假人
     * @param leave
     */
    void addLeave(Leave leave);

    /**
     * 根据id查询请假人信息
     * @param id
     * @return
     */
    Leave queryLeaveById(Integer id);

    /**
     * 查询所有请假人
     * @return
     */
     List<Leave> queryAll();

    /**
     * 请空请假人表
     */
    void deleteLeave();
}
