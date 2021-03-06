package ps.nier.core.domain.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
@MappedSuperclass 
public class BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(name="create_time")
	private Date 		createTime;
	@Column(name="modify_time")
	private Date 		modifyTime;
	@Column(name="create_user")
	private String 		createUser;
	@Column(name="modify_user")
	private String 		modifyUser;
	@Column(name="version")
	private int 		version;
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getModifyUser() {
		return modifyUser;
	}
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
}
