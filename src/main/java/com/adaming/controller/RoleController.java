package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Role;
import com.adaming.services.interfaces.IRoleService;

@RestController
public class RoleController {
	@Autowired
	IRoleService roleService;
	@RequestMapping(value="roles", method = RequestMethod.GET)
	public List<Role> findAll(){
		return roleService.findAll();
	}
	@RequestMapping(value="roles/{idRole}", method = RequestMethod.GET)
	public Role findOne(@PathVariable("idRole") Long idRole) {
		return roleService.findOne(idRole);
	}
	@RequestMapping(value="roles", method = RequestMethod.POST)
	public Role saveRole(@RequestBody Role role) {
		return roleService.save(role);
	}
	@RequestMapping(value="roles/{idRole}", method = RequestMethod.DELETE)
	public void deleteRole(@PathVariable("idRole") Long idRole) {
		roleService.delete(idRole);
	}
	@RequestMapping(value="roles/{idRole}", method= RequestMethod.PUT)
	public Role updateRole(@PathVariable("idRole") Long idRole,@RequestBody Role role) {
		Role currentRole = roleService.findOne(idRole);
		currentRole.setLibelle(role.getLibelle());
		return roleService.save(currentRole);
		
	}
}
