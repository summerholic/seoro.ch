package com.softpower.seoro.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

import com.softpower.seoro.common.StringUtil;
import com.softpower.seoro.model.SP_SeoroHome_VO;
import com.softpower.seoro.service.SP_SeoroHome_Service;

@Controller
@RequestMapping(value="/")
public class SP_SeoroHome_Ctr {
	@Autowired
	private SP_SeoroHome_Service spSeoroHomeService;

	public void setSpSeoroHomeService(SP_SeoroHome_Service spSeoroHomeService) {
		this.spSeoroHomeService = spSeoroHomeService;
	}
	
	@RequestMapping(value="/board01", method=RequestMethod.GET)	
	public String home(Locale locale, Model model) {
		return "/board01";
	}
	
	@RequestMapping(value="/getBoardList", method=RequestMethod.GET)
	@ResponseBody
	public Object getBoardList() {
		List<SP_SeoroHome_VO> boardList = null;
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			boardList = spSeoroHomeService.getBoardList();
			resultMap.put("select_boardList", StringUtil.mkJsonResult(boardList));
		} catch(SQLException e) 
		{
			e.getMessage();
		}
		
		return resultMap;
	}
}
