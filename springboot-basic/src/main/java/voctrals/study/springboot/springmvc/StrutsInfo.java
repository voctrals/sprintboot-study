package voctrals.study.springboot.springmvc;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 引用application.properties中的值
 *
 * @author voctrals
 */
@ConfigurationProperties("struts")
public class StrutsInfo {
    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "StrutsInfo{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
