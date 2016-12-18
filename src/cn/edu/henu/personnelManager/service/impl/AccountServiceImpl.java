package cn.edu.henu.personnelManager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.AccountDao;
import cn.edu.henu.personnelManager.model.AccountItem;
import cn.edu.henu.personnelManager.service.abs.AccountService;

@Component("accountService")
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	
	public AccountDao getAccountDao() {
		return accountDao;
	}
	@Resource
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public boolean addAccount(AccountItem item) {
		return accountDao.addAccount(item);
	}

	@Override
	public boolean deleteAccount(AccountItem item) {
		return accountDao.deleteAccount(item);
	}

	@Override
	public boolean deleteAccount(int id) {
		return accountDao.deleteAccount(id);
	}

	@Override
	public AccountItem getAccount(int id) {
		return accountDao.getAccount(id);
	}

	@Override
	public List<AccountItem> getAllAccount() {
		return accountDao.getAllAccount();
	}

}
