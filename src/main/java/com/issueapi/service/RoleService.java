package com.issueapi.service;

import java.util.List;
import com.issueapi.model.Role;


public interface RoleService {
	public List<Role> getAllRoles();
	public Role findRoleById(Integer id);
	public boolean createRole(Role role);
	public boolean removeRoleById(Integer id);
	public boolean updateRoleById(Role role);
}
