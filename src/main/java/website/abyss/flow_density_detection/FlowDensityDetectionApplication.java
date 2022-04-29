package website.abyss.flow_density_detection;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("website.abyss.flow_density_detection.mapper")
public class FlowDensityDetectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowDensityDetectionApplication.class, args);
    }

}
