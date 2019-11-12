package com.modules.modulesCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.modules.modulesCRUD.dao.ModuleDal;
import com.modules.modulesCRUD.dao.TrackDal;
import com.modules.modulesCRUD.model.Module;
import com.modules.modulesCRUD.model.Track;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class IndexController {
	
	@Autowired
	private ModuleDal mDal;
	
	@Autowired
	private TrackDal tDal;
	
	@RequestMapping(value = "/tracks", method = RequestMethod.GET, produces = "application/json")
	public List<Track> firstPageTracks() {
		return tDal.findAll();
	}

	@RequestMapping(value = "/modules", method = RequestMethod.GET, produces = "application/json")
	public List<Module> firstPageModules() {
		return mDal.findAll();
	}
	
	@DeleteMapping(path = { "/tracks/{code}" })
	public Track deleteTrack(@PathVariable("code") String code) {
		System.out.println("code " + code);
		Track deletedM = tDal.findByCode(code);
		System.out.println(deletedM);
		if (tDal.delete(deletedM))
			return deletedM;
		else
			return null;
	}

	@DeleteMapping(path = { "/modules/{code}" })
	public Module deleteModule(@PathVariable("code") String code) {
		System.out.println("code " + code);
		Module deletedM = mDal.findByCode(code);
		System.out.println(deletedM);
		if (mDal.delete(deletedM))
			return deletedM;
		else
			return null;
	}

	@PostMapping("/modules")
	public Module createModule(@RequestBody Module m) {
		mDal.create(m);
		System.out.println(m + " insert");
		return m;
	}
	
	@PostMapping("/tracks")
	public Track createTrack(@RequestBody Track t) {
		tDal.create(t);
		System.out.println(t + " insert");
		return t;
	}
}
