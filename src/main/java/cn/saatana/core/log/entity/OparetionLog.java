package cn.saatana.core.log.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.saatana.core.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 操作日志
 *
 * @author 向文可
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "oparetion_log")
public class OparetionLog extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private String controller;
	private String controllerName;
	private String method;
	private String methodName;
	private String ip;

	@Override
	public String toString() {
		return "[controller=" + controller + ", controllerName=" + controllerName + ", method=" + method
				+ ", methodName=" + methodName + ", ip=" + ip + "]";
	}
}
