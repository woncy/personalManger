package cn.edu.henu.personnelManager.service.abs;

import java.util.List;

import cn.edu.henu.personnelManager.model.AccountItem;



public interface AccountService {
	
	public boolean addAccount(AccountItem item);
	public boolean deleteAccount(AccountItem item);
	public boolean deleteAccount(int id);
	public AccountItem getAccount(int id);
	public List<AccountItem> getAllAccount();

}
