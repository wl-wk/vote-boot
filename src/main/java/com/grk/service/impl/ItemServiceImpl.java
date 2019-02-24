package com.grk.service.impl;

import com.grk.dao.ItemDao;
import com.grk.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;


    @Override
    public boolean addItem(Integer uid, Integer vsId, Integer[] voIds) {
        if (itemDao.selectCountByVoid(uid, vsId) == 0) {
            itemDao.insertItem(uid, vsId, voIds);
            return true;
        }
        return false;
    }
}
