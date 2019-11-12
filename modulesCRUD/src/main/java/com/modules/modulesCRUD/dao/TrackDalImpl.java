package com.modules.modulesCRUD.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.modules.modulesCRUD.model.Track;

@Repository
public class TrackDalImpl implements TrackDal {

	@Autowired
	private MongoTemplate mongo;

	@Override
	public Track create(Track t) {
		// TODO Auto-generated method stub
		return mongo.save(t);
	}

	@Override
	public Boolean delete(Track t) {
		// TODO Auto-generated method stub
		return mongo.remove(t).wasAcknowledged();
	}

	@Override
	public List<Track> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Track.class);
	}

	@Override
	public Track findByCode(String code) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("code").is(code)), Track.class);
	}

}