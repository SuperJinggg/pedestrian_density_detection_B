package website.abyss.flow_density_detection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import website.abyss.flow_density_detection.entities.Data;
import website.abyss.flow_density_detection.mapper.DataMapper;

import java.util.List;

@Service
@Transactional
public class DataService {
    private DataMapper dataMapper;

    @Autowired
    public DataService(DataMapper dataMapper) {
        this.dataMapper = dataMapper;
    }

    public Data getData(Data data) {
        return dataMapper.getData(data);
    }

    public List<Data> getDataList() {
        return dataMapper.getDataList();
    }

    public void updateData(Data data) {
        dataMapper.updateData(data);
    }

    public void insertData(Data data) {
        dataMapper.insertData(data);
    }
}
