import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：JDBC框架之queryForObject方法
 * Package(包名): PACKAGE_NAME
 * Class(测试类名): JDBCTemplateTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/23
 * Time(创建时间)： 14:37
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

class JDBCTemplateTest
{

    @org.junit.jupiter.api.Test
    void update()
    {

    }

    @org.junit.jupiter.api.Test
    void queryForObject()
    {
        String sql = "select * from information where no=?";
        Object[] objects = {0};
        Student student = JDBCTemplate.queryForObject(sql, new BeanHandler<>(Student.class), objects);
        System.out.println(student);
    }
}