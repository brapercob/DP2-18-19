
package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import repositories.BrotherhoodRepository;
import security.LoginService;
import security.UserAccount;
import domain.Brotherhood;

public class BrotherhoodService {

	//Managed Repository
	@Autowired
	private BrotherhoodRepository	brotherhoodRepository;


	//CRUD methods

	public Brotherhood create() {
		return new Brotherhood();
	}

	public BrotherhoodService() {
		super();
	}

	public void delete(final Brotherhood brotherhood) {
		Assert.notNull(brotherhood);
		Assert.isTrue(brotherhood.getId() != 0);
		this.brotherhoodRepository.delete(brotherhood);

	}

	public Brotherhood save(final Brotherhood brotherhood) {
		Assert.notNull(brotherhood);
		return this.brotherhoodRepository.save(brotherhood);

	}

	//Other methods

	public Brotherhood findOne(final int id) {
		Assert.isTrue(id != 0);
		Brotherhood res;
		res = this.brotherhoodRepository.findOne(id);
		Assert.notNull(res);
		return res;
	}

	public Collection<Brotherhood> findAll() {
		Collection<Brotherhood> res;
		res = this.brotherhoodRepository.findAll();
		Assert.notNull(res);
		return res;
	}

	public Brotherhood findByPrincipal() {
		UserAccount userAccount;
		Brotherhood brotherhood;
		userAccount = LoginService.getPrincipal();
		Assert.notNull(userAccount, "User Account is null.");
		brotherhood = this.brotherhoodRepository.findByPrincipal(userAccount.getId());
		return brotherhood;
	}

	public Brotherhood findByUsserAccountId(final int id) {
		return this.findByUsserAccountId(id);
	}

}
