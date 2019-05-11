package cn.saatana.core.role.repository;

import org.springframework.stereotype.Component;

import cn.saatana.core.common.CurdRepository;
import cn.saatana.core.role.entity.Role;

@Component
public interface RoleRepository extends CurdRepository<Role> {

}
