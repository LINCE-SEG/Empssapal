package pe.gob.edu.empssapal.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.gob.edu.empssapal.core.domain.Cajamedidor;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;


@Controller
public class CajaMedidorController {
	protected Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

	@RequestMapping(value = "Cajamedidor/dashboard", method = RequestMethod.GET)
	public String dashboard(Model model, HttpServletRequest request) {
		logger.info("::::::::::::Cajamedidor/dashboard:::::::::::::::" + empssapalService);
		model.addAttribute("Cajamedidor", empssapalService.ListCajamedidorlist());
		request.getSession().setAttribute("menuHeader", "Cajamedidor");
		return "Cajamedidor/dashboard";
	}
	
	@RequestMapping(value = "Cajamedidor/{IdCajaMedidor}", method = RequestMethod.GET)
	public String getFormulario(@PathVariable String IdCajaMedidor, Model model) {
		model.addAttribute("Cajamedidor", empssapalService.FindIdCajamedidor(Integer.parseInt(IdCajaMedidor)));
		return "Cajamedidor/form";
	}
	
	@RequestMapping(value = "Cajamedidor/actualizar", method = RequestMethod.POST)
	public String guardar(@ModelAttribute("Cajamedidor") Cajamedidor cajamedidor,
			Model model) {	empssapalService.updateCajamedidor(cajamedidor);
		return "redirect:/Cajamedidor/dashboard";
	}
}