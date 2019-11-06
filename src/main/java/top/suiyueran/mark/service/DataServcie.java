package top.suiyueran.mark.service;

import top.suiyueran.mark.entity.UserDO;

public interface DataServcie {
	UserDO getDataById(Integer id);
	UserDO getDataByName(String userName);
}
