package com.uyar.issuemanagement.service;

import com.uyar.issuemanagement.dto.UserDto;
import com.uyar.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto save(UserDto user);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);

}
