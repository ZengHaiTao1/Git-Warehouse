package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;

import dao.UserDao;
import impl.UserDaoImpl;
import impl.UserDaoImpl2;

/**
 * Servlet implementation class myservlet
 */
@SuppressWarnings("serial")
public class myservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String method = request.getParameter("method");
		if ("register".equals(method)) {
			try {
				register(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if ("login".equals(method)) {
			login(request, response);
		} else if ("session".equals(method)){
			session(request, response);
		}

	}

	private void session(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		JSONArray json = (JSONArray) session.getAttribute("login");
		if(json==null) {
			PrintWriter out = response.getWriter();
			out.println("NO");
			return;
		}
		PrintWriter out = response.getWriter();
		out.println(json);
	}

	private void login(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, IOException {
		String id = request.getParameter("id");// 通过参数名获取对应的值
		String password = request.getParameter("password");// 通过参数名获取对应的值
		UserDao dao = new UserDaoImpl2();
		JSONArray json = dao.login(id, password);
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		session.setAttribute("login", json);
		session.setMaxInactiveInterval(60 * 60 * 24);
		out.println(json);
	}
	// 输出数据

	private void register(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, IOException, SQLException {
		Enumeration<String> paramNames = request.getParameterNames();// 获取所有的参数名
		String[] valueArr = new String[5];
		int i = 0;
		while (paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();// 得到参数名
			String value = request.getParameter(name);// 通过参数名获取对应的值
			valueArr[i] = value;
			i++;
		}
		UserDao dao = new UserDaoImpl2();
		boolean tr = dao.register(valueArr[0], valueArr[1], valueArr[2], valueArr[3]);
		PrintWriter out = response.getWriter();
		out.print(tr);
		try {
			request.getRequestDispatcher("login.html").forward(request, response);
		} catch (ServletException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
