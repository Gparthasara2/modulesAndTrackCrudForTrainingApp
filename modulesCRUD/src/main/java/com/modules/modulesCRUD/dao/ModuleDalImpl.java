package com.modules.modulesCRUD.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.modules.modulesCRUD.model.Module;

@Repository
public class ModuleDalImpl implements ModuleDal {

	@Autowired
	private MongoTemplate mongo;

	@Override
	public Module create(Module m) {
		// TODO Auto-generated method stub
		return mongo.save(m);
	}

	@Override
	public Boolean delete(Module m) {
		// TODO Auto-generated method stub
		return mongo.remove(m).wasAcknowledged();
	}

	@Override
	public List<Module> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Module.class);
	}

	@Override
	public Module findByCode(String code) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("code").is(code)), Module.class);
	}

}