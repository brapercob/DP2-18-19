
package services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.EnrolmentRepository;
import domain.Brotherhood;
import domain.Enrolment;
import domain.Member;
import domain.Position;

@Service
@Transactional
public class EnrolmentService {

	@Autowired
	private EnrolmentRepository	enrolmentRepository;

	@Autowired
	private MemberService		memberService;


	public EnrolmentService() {
		super();
	}

	//CREATE
	public Enrolment create(final Member member) {
		final Enrolment res = new Enrolment();
		final Date finishDate = new Date();
		final Date startDate = new Date();
		final Collection<Brotherhood> brotherhood = new ArrayList<Brotherhood>();
		final Collection<Position> position = new ArrayList<Position>();
		res.setFinishDate(finishDate);
		res.setStartDate(startDate);
		res.setBrotherhood(brotherhood);
		res.setPosition(position);
		return res;
	}

	//SAVE
	public Enrolment save(final Enrolment enrolment) {
		Assert.notNull(enrolment);
		return this.enrolmentRepository.save(enrolment);
	}

	//FINDONE
	public Enrolment findOne(final int id) {
		Enrolment res;
		res = this.enrolmentRepository.findOne(id);
		Assert.notNull(res);
		return res;
	}

	//FINDALL
	public Collection<Enrolment> findAll() {
		Collection<Enrolment> res;
		res = this.enrolmentRepository.findAll();
		Assert.notNull(res);
		return res;
	}

	public void delete(final Enrolment e) {
		Assert.notNull(e);
		final Collection<Member> member = this.memberService.findAll();
		for (final Member m : member)
			if (m.getEnrolments().contains(e)) {
				final Collection<Enrolment> mem = m.getEnrolments();
				mem.remove(e);
				m.setEnrolments(mem);
				this.memberService.save(m);
			}
		this.enrolmentRepository.delete(e);
	}
}
