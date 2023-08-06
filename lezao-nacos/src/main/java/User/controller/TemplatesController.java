package User.controller;

import User.Mapper.templatesMapper;
import User.entity.templates;
import User.service.templatesService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/lezao")
public class TemplatesController {
    /**
     *  严格解析时间格式
     * @param request
     * @param binder
     */
    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd hh:mm:ss" );
        dateFormat.setLenient(false); //是否严格解析时间 false则严格解析 true宽松解析
        binder.registerCustomEditor( Date.class, new CustomDateEditor(dateFormat, false));
    }


    @Autowired
    templatesService service;

    /**
     * 条件查询
     * @param name
     * @param type
     * @param state
     * @return
     */
    @PostMapping("/get")
    public List<templates> get(@Param("name") String name,@Param("type" ) String type,@Param("state") String  state  ){
         List<templates> templatesList= service.getCount(name,type,state);
         return templatesList;
    }


//
//    //按照条件获取
//    @GetMapping("/getByOrder")
//    public List<templates> getByOrder(@Param("name") String name,@Param("type") String type, @Param("state") String state){
//        List<templates> templatesList =service.getTemplatesByOrder(name,type,state);
//        return templatesList;
//    }


    //获取全部
    @PostMapping("/getall")
    public List<templates> getall(){
        List<templates> templatesList = service.getAll();

        return templatesList;
    }
    //新增
    @PostMapping("/insert")
    public void Insert(@RequestBody   templates t){

        service.insert(t);
    }

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/findByPage")
    public List<templates> findByPage( Integer page, Integer pageSize){
        Integer pageBegin = (page-1) * pageSize;
        return service.findByPage(pageBegin, pageSize);
    }

    /**
     * 更新
     *
     * @param t
     */

    //更新
    @PostMapping("/update")
    public void Update(@RequestBody  templates t){
        service.update(t);
    }
    //查询
    @PostMapping("/findbyname/{name}")
    public List<templates> FindByName(@PathVariable String name){
        List<templates> templatesbybname = service.getTemplatesbybname(name);
        return templatesbybname;
    }
    @PostMapping("/findbytype/{type}")
    public List<templates> FindBytype(@PathVariable String type){
        List<templates> templatesbytype = service.getTemplatesbytype(type);
        return templatesbytype;
    }
    @PostMapping("/findbystate/{state}")
    public List<templates> FindBystate(@PathVariable String state){
        List<templates> templatesbystate = service.getTemplatesbystate(state);
        return templatesbystate;
    }




    /**
     * 删除
     * @param number
     */
    @DeleteMapping("/del")
    public void delete(@PathVariable Integer number){
        service.delete(number);
    }







}
