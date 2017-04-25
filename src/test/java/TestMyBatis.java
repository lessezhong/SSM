import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pojo.StudentInfoMapper;

;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
	private Logger logger = Logger.getLogger(TestMyBatis.class);
	// privateApplicationContext ac = null;
	@Resource
	private StudentInfoMapper studentMapper = null;

	@Test
	public void test1() {
		logger.error("总记录="+studentMapper.getStudentCount());
	}
}