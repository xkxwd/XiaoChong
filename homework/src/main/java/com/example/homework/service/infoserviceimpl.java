package com.example.homework.service;

import com.example.homework.entity.info;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
//import java.util.List;

//@Repository
@Service
public class infoserviceimpl implements infoservice{

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public int saveInfo() {
        String sql="insert into zkxl(deviceid,devicemodel,type) values(?,?,?);";
        String deviceid="223303286";
        String devicemodel="zkxltech";
        String type="card";

        int row=jdbcTemplate.update(sql,deviceid,devicemodel,type);

        return row;
    }

    @Override
    public String queryallinfo() {
        String sql="select deviceid,devicemodel,type from zkxl  where id=?";
        String res="";
        int id=1;
        RowMapper<info> rowMapper=new BeanPropertyRowMapper<>(info.class);
        info inf=jdbcTemplate.queryForObject(sql, rowMapper,id);
        res="INSERT INTO \"public\".\"t_access_device\"\n" +
                "(\"device_id\", \"device_model\", \"type\", \"scenes_tag_json\", \"extend_config_json\", \"remark_json\", \"serial_number\")\n" +
                "VALUES"+"('"+inf.getDeviceid()+"','"+inf.getdeviceModel()+"','"+inf.getType()+"', '[\"attendance\"]', '{\"position\": \"校门\"}', '{}', '');";
        System.out.println(inf);
        return res;
    }
}
