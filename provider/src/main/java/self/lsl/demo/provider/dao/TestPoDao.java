package self.lsl.demo.provider.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import self.lsl.demo.po.TestPo;

/**
 * @Description
 * @Author longshunlin
 * @Date 2019/2/15
 */
@Repository
public interface TestPoDao extends JpaRepository<TestPo, String>, JpaSpecificationExecutor<TestPo> {
}
