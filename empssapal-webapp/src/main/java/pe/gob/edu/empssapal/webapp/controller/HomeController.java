package pe.gob.edu.empssapal.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.gob.edu.empssapal.core.domain.Camposalcantarillado;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;

@Controller
public class HomeController {

	@Autowired
	 private CamposaguaServiceImpl empssapalService;
	 
	protected Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "home/dashboard", method = RequestMethod.GET)
	public String dashboard(Model model, HttpServletRequest request) {
		
		model.addAttribute("Cajamedidor", empssapalService.ListCajamedidorlist());
		model.addAttribute("CajaRegistradora", empssapalService.Cajaregistradoralist());
		model.addAttribute("Camaapoyo", empssapalService.Camaapoyolist());
		model.addAttribute("Eliminacionmaterialexedente", empssapalService.Eliminacionexedentelist());
		model.addAttribute("Empalmealared", empssapalService.Empalmeredlist());
		model.addAttribute("listexcavacion", empssapalService.listarexcavacion());
		model.addAttribute("Pruebahidrahulica", empssapalService.PruebaHidraulicalist());
		model.addAttribute("Relleno", empssapalService.Rellenolist());
		model.addAttribute("Reposicion", empssapalService.Reposicionlist());
		model.addAttribute("Rotura", empssapalService.Roturalist());
		model.addAttribute("Tendido", empssapalService.Tendidolist());
		model.addAttribute("Vereda", empssapalService.Veredalist());
		request.getSession().setAttribute("menuHeader", "home");
		
		return "home/dashboard";
	}
	
}
