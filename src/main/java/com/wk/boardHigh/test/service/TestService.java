package com.wk.boardHigh.test.service;

import com.wk.boardHigh.test.mapper.TestMapper;
import com.wk.boardHigh.test.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<TestVo> getTest() {
        return testMapper.getTest();
    }

}
