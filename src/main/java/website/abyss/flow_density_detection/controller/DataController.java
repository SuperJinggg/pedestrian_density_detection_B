package website.abyss.flow_density_detection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import website.abyss.flow_density_detection.entities.Data;
import website.abyss.flow_density_detection.service.DataService;
import website.abyss.flow_density_detection.utils.Result;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {
    private DataService dataService;

    private Result result = new Result();

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    /**
     * 通过经纬度查询位置的人数情况
     * @param data
     * @return
     */
    @RequestMapping("/getData")
    public Result getData(@RequestBody Data data){
        Data data1 = dataService.getData(data);
        if(data1!=null){
            result.setSuccess("查询成功",data1);
        }else result.setInfo("信息缺失",null);
        return result;
    }

    /**
     * 查询所有位置的人数列表
     * @return
     */
    @RequestMapping("/getDataList")
    public Result getDataList(){
        List<Data> dataList = dataService.getDataList();
        if(dataList.size()>0){
            result.setSuccess("查询成功",dataList);
        }else result.setInfo("信息缺失",null);
        return result;
    }

    /**
     * 更新对应位置的人数情况
     * @param dataList
     * @return
     */
    @RequestMapping("/setDataList")
    public Result setDataList(@RequestBody List<Data> dataList){
        for(Data data:dataList){
            Data data1 = dataService.getData(data);
            if(data1!=null){
                dataService.updateData(data);
            }else dataService.insertData(data);
        }
        result.setSuccess("数据更新成功",null);
        return result;
    }
}
