package cn.edu.henu.personnelManager.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity(name="tb_reckoning_info")
public class ReckoningInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Reckoning reckoning;
	private AccountItem accountItem;
	private int money;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	public Reckoning getReckoning() {
		return reckoning;
	}
	public void setReckoning(Reckoning reckoning) {
		this.reckoning = reckoning;
	}
	@ManyToOne
	public AccountItem getAccountItem() {
		return accountItem;
	}
	public void setAccountItem(AccountItem accountItem) {
		this.accountItem = accountItem;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
