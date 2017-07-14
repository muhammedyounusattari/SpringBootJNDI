package younus.attari.web.impl;

import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import younus.attari.web.BaseController;

@RestController
public class BaseControllerImpl implements BaseController {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public ModelAndView firstRequest(@PathParam("first") String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "some text information...");
		mv.setViewName("first");
		System.out.println("this is from first view"+jdbcTemplate);
		System.out.println("....."+jdbcTemplate+".....");
		List<Map<String,Object>> list = jdbcTemplate.queryForList("select count(*) from person_vw where emplid='00001022333'");
		for(Map<String,Object> map:list){
			System.out.println(map);
		}
		
		
		return mv;
//		return "Welcome..."+name;
	}

}
