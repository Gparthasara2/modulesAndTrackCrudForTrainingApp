package com.modules.modulesCRUD.dao;

import java.util.List;

import com.modules.modulesCRUD.model.Module;

public interface ModuleDal {
	public Module create(Module m);

	public Boolean delete(Module m);

	public List<Module> findAll();

	public Module findByCode(String code);
}
