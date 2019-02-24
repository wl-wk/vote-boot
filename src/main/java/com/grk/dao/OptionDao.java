package com.grk.dao;

import com.grk.entity.Option;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OptionDao {

    int insertOption(@Param("options") List<Option> options);

    void updateOption(Option option);

}
