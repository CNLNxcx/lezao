package User.service.Serviceimpl;

import User.Mapper.templatesMapper;
import User.entity.templates;
import User.service.templatesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class templatesServiceImpl implements templatesService {
    @Resource
    templatesMapper templatesmapper;


    @Override
    public List<templates> getCount(String name,String type,String state) {
        return templatesmapper.getCount(name,type,state);
    }

    @Override
    public boolean save(templates t) {
        templatesmapper.update(t);
        return true;
    }

    @Override
    public boolean update(templates t) {
        return   templatesmapper.update(t);
    }


    @Override
    public boolean delete(Integer num) {

        return templatesmapper.deleteAllTemplatesbynum(num);

    }


    @Override
    public List<templates> getAll() {
        return   templatesmapper.getAllTemplates();

    }


    @Override
    public List<templates> getTemplatesbybname(String name) {
        return  templatesmapper.getAllTemplatesByNamelike(name);
    }

    @Override
    public List<templates> getTemplatesbytype(String type) {
        return   templatesmapper.getAllTemplatesByType(type);
    }

    @Override
    public List<templates> getTemplatesbystate(String state) {
        return   templatesmapper.getAllTemplatesByState(state);
    }


    @Override
    public boolean insert( templates t) {

        templatesmapper.insert(t);
        return true;
    }

    @Override
    public List<templates> findByPage(Integer pageBegin, Integer pageSize) {
        return templatesmapper.findByPage(pageBegin, pageSize);
    }

    @Override
    public List<templates> getTemplatesByOrder(String name, String type, String state) {
        return  templatesmapper.getAllTemplatesByOrder(name, type, state);
    }

}
