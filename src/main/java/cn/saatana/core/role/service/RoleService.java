package cn.saatana.core.role.service;

import org.springframework.stereotype.Service;

import cn.saatana.core.common.CommonService;
import cn.saatana.core.role.entity.Role;
import cn.saatana.core.role.mapper.RoleMapper;

@Service
public class RoleService extends CommonService<RoleMapper, Role> {

}
