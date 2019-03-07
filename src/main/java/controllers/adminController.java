
package controllers;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import services.AdminService;
import domain.Admin;

@Controller
@RequestMapping("/admin")
public class adminController extends AbstractController {

	@Autowired
	private AdminService	adminService;


	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {

		ModelAndView res;
		Collection<Admin> admins;

		admins = this.adminService.findAll();

		res = new ModelAndView("admin/list");
		res.addObject("admins", admins);
		res.addObject("requestURI", "admin/list.do");
		return res;
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView create() {
		ModelAndView res;
		Admin admin;

		admin = this.adminService.create();
		res = this.createEditModelAndView(admin);

		return res;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView edit(@RequestParam final int id) {
		ModelAndView res;
		Admin admin;

		admin = this.adminService.findOne(id);
		res = this.createEditModelAndView(admin);

		return res;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView save(@Valid final Admin admin, final BindingResult binding) {
		ModelAndView res;

		if (binding.hasErrors())
			res = this.createEditModelAndView(admin);
		else
			try {
				this.adminService.save(admin);
				res = new ModelAndView("redirect:list.do");
			} catch (final Throwable oops) {
				res = this.createEditModelAndView(admin, "admin.commit.error");
			}
		return res;
	}

	public ModelAndView delete(@Valid final Admin admin, final BindingResult binding) {
		ModelAndView res;

		try {
			this.adminService.delete(admin);
			res = new ModelAndView("redirect:list.do");
		} catch (final Throwable oops) {
			res = this.createEditModelAndView(admin, "admin.commit.error");
		}
		return res;
	}

	protected ModelAndView createEditModelAndView(final Admin admin) {
		return this.createEditModelAndView(admin, null);
	}

	protected ModelAndView createEditModelAndView(final Admin admin, final String msg) {
		ModelAndView result;
		result = new ModelAndView("administrator/edit");
		result.addObject("admin", admin);
		result.addObject("message", msg);
		return result;
	}

}
