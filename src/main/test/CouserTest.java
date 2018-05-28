import com.hpeu.oa.entity.Course;
import com.hpeu.oa.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-mybatis.xml")
public class CouserTest {

    @Autowired
    private CourseService courseService;

    @Test
    public void add(){
        Course course = new Course();
        course.setTitle("aaa");
        course.setAbs("asdasa");
        course.setContent("ccccccccc");
//        course.setPutDate("2018-05-24 09:21:48");
        int x = 0;
        try {
            x = courseService.add(course);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(x);
    }

    @Test
    public void get(){
        Course cou = courseService.getEntity("123");
        System.out.println(cou+"......");
    }
    @Test
    public void del(){
        courseService.del(7);
    }

    @Test
    public void getone(){
        Course course = courseService.getInfo("123");
        System.out.println(course.getTitle()+".................");
    }
}
