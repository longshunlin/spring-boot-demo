package self.lsl.demo.po;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description
 * @Author longshunlin
 * @Date 2019/2/19
 */
@Entity
@Table(name = "test_po")
public class TestPo implements Serializable {

    @Id
    @GenericGenerator(name = "test_po", strategy = "uuid")
    @GeneratedValue(generator = "test_po")
    @Column(length = 50)
    @ApiModelProperty("ID")
    private String id;

    @ApiModelProperty("名称")
    @Column(columnDefinition = (" varchar(50) comment '名称'"))
    private String name;

    @ApiModelProperty("年龄")
    @Column(columnDefinition = (" int(11) comment '年龄'"))
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
