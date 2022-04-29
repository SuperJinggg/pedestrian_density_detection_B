package website.abyss.flow_density_detection.mapper;

import org.apache.ibatis.annotations.Mapper;
import website.abyss.flow_density_detection.entities.Data;

import java.util.List;

@Mapper
public interface DataMapper {

    Data getData(Data data);

    List<Data> getDataList();

    void updateData(Data data);

    void insertData(Data data);
}