package self.lsl.demo.service;

import self.lsl.demo.po.TestPo;

import java.util.List;

/**
 * @Description
 * @Author longshunlin
 * @Date 2019/2/19
 */
public interface TestService {
    List<TestPo> testFindByJpa();

    List<TestPo> testFindByMybatis();
}
