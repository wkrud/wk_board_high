package com.wk.boardHigh.mapper;

import com.wk.boardHigh.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    List<TestVo> getTest();

}
