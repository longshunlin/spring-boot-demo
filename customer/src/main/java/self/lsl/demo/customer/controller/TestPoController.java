package self.lsl.demo.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import self.lsl.demo.service.TestService;

/**
 * @Description
 * @Author longshunlin
 * @Date 2019/2/19
 */
@RestController
public class TestPoController {
    @Reference
    private TestService testService;

    @GetMapping("test1")
    public Object test1() {
        return testService.testFindByJpa();
    }

    @GetMapping("test2")
    public Object test2() {
        return testService.testFindByMybatis();
    }
}
