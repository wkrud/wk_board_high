package com.wk.boardHigh.test.mapper;

import com.wk.boardHigh.test.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    List<TestVo> getTest();

}
