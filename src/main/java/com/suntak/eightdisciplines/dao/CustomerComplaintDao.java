package com.suntak.eightdisciplines.dao;

import com.suntak.eightdisciplines.entity.CustomerComplaint;

import java.util.List;

public interface CustomerComplaintDao {

    /**
     * 通过car号获取相关的客诉信息
     * @param leasts
     * @return
     */
    List<CustomerComplaint> getComplaintsByCar(String leasts);

    /**
     * 通过base_uid获取客诉信息
     * @param base_uid
     * @return
     */
    CustomerComplaint getComplaintByBaseUid(String base_uid);

    /**
     * 更新相关的客诉
     * @param complaint
     * @return
     */
    void updateComplaint(CustomerComplaint complaint);

    /**
     * 根据car号删除客诉
     * @param base_uid
     * @return
     */
    void deleteComplaint(String base_uid);


    /**
     * 通过编码获取含义
     * @param code
     * @param code_type
     * @return
     */
    String getMeaningByCode(String code,String code_type);
}