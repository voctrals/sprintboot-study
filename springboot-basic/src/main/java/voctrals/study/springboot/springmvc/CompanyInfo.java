package voctrals.study.springboot.springmvc;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 引用非application.properties中的信息
 *
 * @author voctrals
 */
@Configuration // 一般是一个bean的容器类，不指定value的话，他本身也成为一个bean
@ConfigurationProperties("voctrals.company")
@PropertySource("classpath:company.properties")
public class CompanyInfo {
    private String name;
    private String job;
    private Integer years;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", years=" + years +
                '}';
    }
}
