package User.service;


import User.entity.templates;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;


public interface templatesService {



    public List<templates> getCount(String name,String type,String state);


    public boolean save(templates t);

    /**
     * 修改
     * @param
     * @return
     */
    public boolean update(templates t);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);




    /**
     * 查询全部
     * @return
     */
    public List<templates> getAll();

    /**
     * 条件查询
     * @return
     */
//
    /**
     * 按业务流程模板名称查询
     * @return
     */
    public List<templates> getTemplatesbybname(String name);

    /**
     * 按照类型查询
     */

    public List<templates> getTemplatesbytype(String type);

    /**
     * 按照状态查询
     */
    public List<templates> getTemplatesbystate(String state);

    /**插入数据
     *
     */
    public  boolean insert(templates t);

    public  List<templates> findByPage(Integer pageBegin,Integer pageSize);

    List<templates> getTemplatesByOrder(String name, String type, String state);
}
