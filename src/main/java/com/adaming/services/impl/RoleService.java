package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Role;
import com.adaming.repositories.RoleRepository;
import com.adaming.services.interfaces.IRoleService;

@Service
public class RoleService implements IRoleService {
	@Autowired
	RoleRepository roleRepository;

	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Role findOne(Long idRole) {
		return roleRepository.findOne(idRole);
	}

	@Override
	public Role save(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public void delete(Long idRole) {
		roleRepository.delete(idRole);
	}

}
