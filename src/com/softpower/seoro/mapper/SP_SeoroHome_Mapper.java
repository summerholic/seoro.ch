package com.softpower.seoro.mapper;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softpower.seoro.model.SP_SeoroHome_VO;;

@Repository("SP_SeoroHome_Mapper")
public interface SP_SeoroHome_Mapper {
	public List<SP_SeoroHome_VO> getBoardList() throws SQLException;
}
