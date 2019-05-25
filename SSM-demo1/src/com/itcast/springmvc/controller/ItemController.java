package com.itcast.springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.itcast.service.ScoresService;
import com.itcast.ssm.po.QueryVo;
import com.itcast.ssm.po.Scores;

//@RequestMapping("/deleteScores" method = {RequestMethod.GET,RequestMethod.POST})
//限制此类下的所有方法请求url必须以请求前缀开头
//请求转发
//request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request, response);
//重定向 
//response.sendRedirect("/springmvc-web2/itemEdit.action");
//response.getWriter().print("{\"abc\":123}");
//return "forward: /itemEdit.action";  	请求转发
//return "redirect:/scoreslist.action" ;  重定向 
@Controller
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
public class ItemController {

	@Resource(name = "ScoresServiceImpl")
	private ScoresService scoresService;

	/*
	 * @RequestMapping(value ="/scoreslist.action") public ModelAndView
	 * registerUser() { List<Scores> list = this.scoresService.queryScoresist();
	 * ModelAndView modelAndView = new ModelAndView();
	 * modelAndView.addObject("Scoreslist", list); // 设置视图jsp，需要设置视图的物理地址
	 * modelAndView.setViewName("scoreslist"); return modelAndView; }
	 */

	// 返回字符串为视图地址，即setViewName
	@RequestMapping(value = "/scoreslist.action")
	public String registerUser(Model model) {
		List<Scores> list = this.scoresService.queryScoresist();
		model.addAttribute("Scoreslist", list);
		// 设置视图jsp，需要设置视图的物理地址
		return "scoreslist";
	}

	// 修改页面
	/*
	 * @RequestMapping(value ="/scoresEdit.action") //public String
	 * queryItemById(@RequestParam(value = "itemId", required = true, defaultValue =
	 * "1") Integer id,) public String queryItemById(int id, Model model) { Scores
	 * scores = this.scoresService.queryScoresById(id); model.addAttribute("Scores",
	 * scores); // 设置视图jsp，需要设置视图的物理地址 return "scoresEdit"; }
	 */

	// 修改页面优化
	@RequestMapping(value = "/scoresEdit/{id}.action")
	public String queryItemById(@PathVariable Integer id, Model model) {
		Scores scores = this.scoresService.queryScoresById(id);
		model.addAttribute("Scores", scores);
		// 设置视图jsp，需要设置视图的物理地址
		return "scoresEdit";
	}

	// 调用服务更新商品
	@RequestMapping("/updatescores")
	public String updateItem(QueryVo queryVo) {
		System.out.println(queryVo.getScores());
		this.scoresService.updateScores(queryVo.getScores());
		// 返回逻辑视图
		return "redirect:/scoreslist.action";
	}

	@RequestMapping("/deleteScores")
	public String deleteScores(QueryVo queryVo, MultipartFile picFile) throws IllegalStateException, IOException {
		System.out.println(queryVo.getIntegers());
		// this.scoresService.deleteScores(queryVo.getIntegers());
		// 图片上传
		// 设置图片名称，不能重复，可以使用uuid
		String picName = UUID.randomUUID().toString();
		// 获取文件名
		String oriName = picFile.getOriginalFilename();
		// 获取图片后缀
		String extName = oriName.substring(oriName.lastIndexOf("."));
		// 开始上传
		picFile.transferTo(new File("E:\\C盘\\\\tomcatImg\\" + picName + extName));

		return "redirect:/scoreslist.action";
	}

	// json交互
	@RequestMapping("/json.action")
	public @ResponseBody Scores testJson(@RequestBody Scores scores) {
		System.out.println(scores);
		return scores;
	}

	@RequestMapping(value = "/login.action")
	public void login(HttpServletResponse response,HttpServletRequest request) throws IOException {
		// 设置视图jsp，需要设置视图的物理地址
		response.sendRedirect(request.getContextPath()+"/html/login.html");
	}
	
	@RequestMapping("/userlogin.action")
		public @ResponseBody Map<String, String> userlogin(String usname,String password,HttpServletRequest request) {
			if(usname.equals("aaa")&&password.equals("123")) {
				HttpSession session = request.getSession();
				Map<String, String> LOGIN_USER = new HashMap<String, String>();
				LOGIN_USER.put("usname", usname);
				LOGIN_USER.put("password", password);
				session.setAttribute("LOGIN_USER", LOGIN_USER);
				System.out.println("登陆成功");
				Map<String, String> ret = new HashMap<String, String>();
				ret.put("a", "true");
				return ret ;
		}
		
		System.out.println("进来了"+usname+password);
			return null ;
	}
	
	@RequestMapping("/getUser.action")
	public @ResponseBody Map<String, String> getUser(HttpServletRequest request,HttpServletResponse response) {
		HttpSession session = request.getSession();
		Map<String, String> LOGIN_USER = (Map<String, String>) session.getAttribute("LOGIN_USER");
		return LOGIN_USER;
	}
	
	
	@RequestMapping("/signoutLogin.action")
	public void  signoutLogin(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("LOGIN_USER");
		response.sendRedirect(request.getContextPath()+"/html/login.html");
	}
	
	
	@RequestMapping("/text")
	public void text(HttpServletResponse response) {
		// 返回逻辑视图
		  try { response.getWriter().print("{\"abc\":123}"); } catch (IOException e) {
		// TODO 自动生成的 catch 块 e.printStackTrace(); 
			  }
		//int a = 1 / 0;
	}

}
