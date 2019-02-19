package self.lsl.demo.provider.mapper;

import self.lsl.demo.po.TestPo;

import java.util.List;

/**
 * @Description mybatis集成
 * @Author longshunlin
 * @Date 2019/2/19
 */
public interface TestPoMapper {
    List<TestPo> findAll();
}
