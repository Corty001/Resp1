package cn.service.impl;

import cn.dao.IBillDao;
import cn.pojo.Bill;
import cn.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("billServiceimpl")
public class BillServiceimpl implements BillService {

    @Autowired
    private IBillDao iBillDao;

    @Override
    public List<Bill> findAll() {
        return iBillDao.findAll();
    }
}
