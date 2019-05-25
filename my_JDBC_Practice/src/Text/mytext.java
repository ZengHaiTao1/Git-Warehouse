package Text;

import org.junit.Test;



import dao.UserDao;
import dao.students;
import impl.UserDaoImpl;

public class mytext {

	@Test
	public void mytest() {
		try {
			
			UserDao dao =new UserDaoImpl();
			
			students stu =	dao.login("1", "12");
			System.out.print(stu.getName()+stu.getBanji());
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} 
	}

}
