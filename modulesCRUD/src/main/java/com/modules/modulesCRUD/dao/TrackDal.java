package com.modules.modulesCRUD.dao;

import java.util.List;

import com.modules.modulesCRUD.model.Track;

public interface TrackDal {
	public Track create(Track m);

	public Boolean delete(Track m);

	public List<Track> findAll();

	public Track findByCode(String code);
}
