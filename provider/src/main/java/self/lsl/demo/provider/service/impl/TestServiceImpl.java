package self.lsl.demo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import self.lsl.demo.po.TestPo;
import self.lsl.demo.provider.dao.TestPoDao;
import self.lsl.demo.provider.mapper.TestPoMapper;
import self.lsl.demo.service.TestService;

import java.util.List;

/**
 * @Description
 * @Author longshunlin
 * @Date 2019/2/19
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestPoDao testPoDao;
    @Autowired
    private TestPoMapper testPoMapper;

    @Override
    public List<TestPo> testFindByJpa() {
        return testPoDao.findAll();
    }

    @Override
    public List<TestPo> testFindByMybatis() {
        return testPoMapper.findAll();
    }

}
