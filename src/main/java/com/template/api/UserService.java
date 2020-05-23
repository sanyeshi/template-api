package com.template.api;

import com.template.api.dto.UserDTO;

public interface UserService {
	UserDTO getUser(Long id);
}
