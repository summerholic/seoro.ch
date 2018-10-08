package com.softpower.seoro.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softpower.seoro.mapper.SP_SeoroHome_Mapper;
import com.softpower.seoro.model.SP_SeoroHome_VO;

@Service("SP_SeoroHome_Service")
public class SP_SeoroHome_Service {
	@Autowired
	private SP_SeoroHome_Mapper spSeoroHomeMapper;

	public void setSpSeoroHomeMapper(SP_SeoroHome_Mapper spSeoroHomeMapper) {
		this.spSeoroHomeMapper = spSeoroHomeMapper;
	}
	
	public List<SP_SeoroHome_VO> getBoardList() throws SQLException {
		return this.spSeoroHomeMapper.getBoardList();
	}
}
