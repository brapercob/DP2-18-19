
package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import repositories.MemberRepository;
import security.LoginService;
import security.UserAccount;
import domain.Member;

public class MemberService {

	//Managed Repository
	@Autowired
	private MemberRepository	memberRepository;


	//CRUD methods

	public Member create() {
		return new Member();
	}

	public MemberService() {
		super();
	}

	public void delete(final Member member) {
		Assert.notNull(member);
		Assert.isTrue(member.getId() != 0);
		this.memberRepository.delete(member);

	}

	public Member save(final Member member) {
		Assert.notNull(member);
		return this.memberRepository.save(member);

	}

	//Other methods

	public Member findOne(final int id) {
		Assert.isTrue(id != 0);
		Member res;
		res = this.memberRepository.findOne(id);
		Assert.notNull(res);
		return res;
	}

	public Collection<Member> findAll() {
		Collection<Member> res;
		res = this.memberRepository.findAll();
		Assert.notNull(res);
		return res;
	}

	public Member findByPrincipal() {
		UserAccount userAccount;
		Member member;
		userAccount = LoginService.getPrincipal();
		Assert.notNull(userAccount, "User Account is null.");
		member = this.memberRepository.findByPrincipal(userAccount.getId());
		return member;
	}

}
