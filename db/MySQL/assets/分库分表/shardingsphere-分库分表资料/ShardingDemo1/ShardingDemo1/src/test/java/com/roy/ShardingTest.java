package com.roy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.roy.entity.Course;
import com.roy.entity.Dict;
import com.roy.entity.User;
import com.roy.mapper.CourseMapper;
import com.roy.mapper.DictMapper;
import com.roy.mapper.UserMapper;
import org.apache.shardingsphere.api.hint.HintManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author roy
 * @date 2022/3/27
 * @desc
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingTest {

    @Resource
    private CourseMapper courseMapper;
    @Resource
    private DictMapper dictMapper;
    @Resource
    private UserMapper userMapper;
    @Test
    public void addCcourse(){
        for(int i = 0; i < 10 ; i++){
            Course c = new Course();
            c.setCname("java");
            c.setUserid(100L);
            c.setCstatus("1");
            courseMapper.insert(c);
        }
    }

    @Test
    public void queryCourse(){

        QueryWrapper wrapper = new QueryWrapper<Course>();
//        wrapper.eq("cid",1508073797789872129L);
//        wrapper.between("cid",1508073797789872129L,1508073803737395201L);
//        wrapper.in("cid",1508073797789872129L,1508073803468959745L);
//        wrapper.between("user_id",99L,101L);

        HintManager hintManager = HintManager.getInstance();
        hintManager.addTableShardingValue("course","1");

        for (Object o : courseMapper.selectList(wrapper)) {
            System.out.println(o);
        }
    }


    @Test
    public void addDict(){
        Dict dict = new Dict();
        dict.setUstatus("1");
        dict.setUvalue("正常");
        dictMapper.insert(dict);

        Dict dict2 = new Dict();
        dict2.setUstatus("2");
        dict2.setUvalue("异常");
        dictMapper.insert(dict2);
    }

    @Test
    public void addUser(){
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setUsername("user");
            u.setUstatus(""+(i%2+1));
            userMapper.insert(u);
        }
    }

    @Test
    public void queryDict(){
        QueryWrapper<Dict> wrapper = new QueryWrapper<Dict>();
//        wrapper.eq("ustatus", "1");
        List<Dict> dicts = dictMapper.selectList(wrapper);
        dicts.forEach(dict -> System.out.println(dict));
    }

    @Test
    public void queryUserStatus(){
        List<User> users = userMapper.queryUserStatus();
        for(User user : users){
            System.out.println(user);
        }
    }

}
