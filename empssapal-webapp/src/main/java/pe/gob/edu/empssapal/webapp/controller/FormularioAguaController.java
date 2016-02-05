package pe.gob.edu.empssapal.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.gob.edu.empssapal.core.domain.Camposagua;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;
import pe.gob.edu.empssapal.core.domain.Vereda;



@Controller

public class FormularioAguaController {

	protected Log logger = LogFactory.getLog(getClass());
	
	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

		@RequestMapping(value = "FormularioAgua/Menu", method = RequestMethod.GET)
		public String Menu(Model model, HttpServletRequest request) {
			logger.info("::::::::::::FormularioAgua/Menu:::::::::::::::");
			request.getSession().setAttribute("menuHeader", "FormularioAgua");
			return "FormularioAgua/Menu";
		}
		
		@RequestMapping(value = "FormularioAgua/Reporte", method = RequestMethod.GET)
		public String Reporte(Model model, HttpServletRequest request) {
			logger.info("::::::::::::FormularioAgua/Reporte:::::::::::::::");
			request.getSession().setAttribute("menuHeader", "FormularioAgua");
			return "FormularioAgua/Reporte";
		}
		//cargar los formularios
		@RequestMapping(value = "FormularioAgua/dashboard15", method = RequestMethod.GET)
	public String dashboard15(Model model) {
		logger.info("::::::::::::FormularioAgua/dashboard15:::::::::::::::");
//		request.getSession().setAttribute("menuHeader", "FormularioAgua");
		model.addAttribute("FormularioAgua", new Camposagua());
		model.addAttribute("veredas", empssapalService.findidveredabyidvereda());
		model.addAttribute("pistas", empssapalService.findListartipopistaagua());
		model.addAttribute("empalmeres", empssapalService.Listarempalme());
		return "FormularioAgua/dashboard15";
	}
		
		
	@RequestMapping(value = "FormularioAgua/dashboard20", method = RequestMethod.GET)
	public String dashboard20(Model model) {
		logger.info("::::::::::::FormularioAgua/dashboard20:::::::::::::::");
//		request.getSession().setAttribute("menuHeader", "FormularioAgua");
		model.addAttribute("FormularioAgua", new Camposagua());
		model.addAttribute("veredas", empssapalService.findidveredabyidvereda());
		model.addAttribute("pistas", empssapalService.findListartipopistaagua());
		model.addAttribute("empalmeres", empssapalService.Listarempalme20());
		return "FormularioAgua/dashboard20";
	}
	@RequestMapping(value = "FormularioAgua/dashboard25", method = RequestMethod.GET)
	public String dashboard25(Model model) {
		logger.info("::::::::::::FormularioAgua/dashboard25:::::::::::::::");
//		request.getSession().setAttribute("menuHeader", "FormularioAgua");
		model.addAttribute("FormularioAgua", new Camposagua());
		model.addAttribute("veredas", empssapalService.findidveredabyidvereda());
		model.addAttribute("pistas", empssapalService.findListartipopistaagua());
		model.addAttribute("empalmeres", empssapalService.Listarempalme25());
	
		return "FormularioAgua/dashboard25";
	}
	@RequestMapping(value = "FormularioAgua/dashboard38", method = RequestMethod.GET)
	public String dashboard38(Model model) {
		logger.info("::::::::::::FormularioAgua/dashboard38:::::::::::::::");
//		request.getSession().setAttribute("menuHeader", "FormularioAgua");
		model.addAttribute("FormularioAgua", new Camposagua());
		model.addAttribute("veredas", empssapalService.findidveredabyidvereda());
		model.addAttribute("pistas", empssapalService.findListartipopistaagua());
		model.addAttribute("empalmeres", empssapalService.Listarempalme38());
	
		return "FormularioAgua/dashboard38";
	}
	
	
	//guardar los formularios
	@RequestMapping(value = "FormularioAgua/guardar15", method = RequestMethod.POST)
	public String guardarpresupuestoagua15(
			@ModelAttribute("FormularioAgua") Camposagua FormularioAgua, Model model) {
		empssapalService.Guardarpresupuestoagua(FormularioAgua);
		
		
		// FORMA DE TRABAJO
//		findByIdVeredaCorrecto
		
		logger.info("::::::::::::FormularioAgua/guardar15:::::::::::::::");
		logger.info("::::::::::::FormularioAgua.getVereda().getId()"+FormularioAgua.getVereda().getId());

		
		
		Vereda vereda = empssapalService.findByIdVeredaCorrecto(FormularioAgua.getVereda().getId());
		
//		model.addAttribute("Veredas",empssapalService.findByIdVereda(FormularioAgua.getVereda().getId()));
		model.addAttribute("vereda",vereda);
		model.addAttribute("VeredaPrecioXdistancia",vereda.getCostovere()*FormularioAgua.getDistancia());

		
		
		model.addAttribute("pistas", empssapalService.findByIdPista(FormularioAgua.getPista().getId()));
		model.addAttribute("excavacion", empssapalService.findByIdExcavacion(FormularioAgua.getExcavacion().getId()));
		model.addAttribute("camaapoyo", empssapalService.findByIdCamaapoyo(FormularioAgua.getCamaapoyo().getId()));
		model.addAttribute("tendido", empssapalService.findByIdTendido15(FormularioAgua.getDiametroagua().getId()));
		model.addAttribute("cajamedidor", empssapalService.findByIdCajamedidor15(FormularioAgua.getDiametroagua().getId()));
		model.addAttribute("empalmeared", empssapalService.findByIdEmpalmered(FormularioAgua.getEmpalmered().getId()));
		model.addAttribute("relleno", empssapalService.findByIdRelleno(FormularioAgua.getRelleno().getId()));
		model.addAttribute("eliminacion", empssapalService.findByIdEliminacionexedente(FormularioAgua.getEliminacionexedente().getId()));
		model.addAttribute("prueba", empssapalService.findByIdPruebahidraulica(FormularioAgua.getPruebahidraulica().getId()));
		
		
		
		
		
		
		return "FormularioAgua/Reporte";
	}
	
	@RequestMapping(value = "FormularioAgua/guardar20", method = RequestMethod.POST)
	public String guardarpresupuestoagua20(
			@ModelAttribute("FormularioAgua") Camposagua FormularioAgua, Model model) {
		empssapalService.Guardarpresupuestoagua(FormularioAgua);
		
		model.addAttribute("Veredas",empssapalService.findByIdVereda(FormularioAgua.getVereda().getId()));
		model.addAttribute("pistas", empssapalService.findByIdPista(FormularioAgua.getPista().getId()));
		model.addAttribute("excavacion", empssapalService.findByIdExcavacion(FormularioAgua.getExcavacion().getId()));
		model.addAttribute("camaapoyo", empssapalService.findByIdCamaapoyo(FormularioAgua.getCamaapoyo().getId()));
		model.addAttribute("tendido", empssapalService.findByIdTendido20(FormularioAgua.getDiametroagua().getId()));
		model.addAttribute("cajamedidor", empssapalService.findByIdCajamedidor20(FormularioAgua.getDiametroagua().getId()));
		model.addAttribute("empalmeared", empssapalService.findByIdEmpalmered(FormularioAgua.getEmpalmered().getId()));
		model.addAttribute("relleno", empssapalService.findByIdRelleno(FormularioAgua.getRelleno().getId()));
		model.addAttribute("eliminacion", empssapalService.findByIdEliminacionexedente(FormularioAgua.getEliminacionexedente().getId()));
		model.addAttribute("prueba", empssapalService.findByIdPruebahidraulica(FormularioAgua.getPruebahidraulica().getId()));
		return "FormularioAgua/Reporte";
	}
	@RequestMapping(value = "FormularioAgua/guardar25", method = RequestMethod.POST)
	public String guardarpresupuestoagua25(
			@ModelAttribute("FormularioAgua") Camposagua FormularioAgua, Model model) {
		empssapalService.Guardarpresupuestoagua(FormularioAgua);
		model.addAttribute("Veredas",empssapalService.findByIdVereda(FormularioAgua.getVereda().getId()));
		model.addAttribute("pistas", empssapalService.findByIdPista(FormularioAgua.getPista().getId()));
		model.addAttribute("excavacion", empssapalService.findByIdExcavacion(FormularioAgua.getExcavacion().getId()));
		model.addAttribute("camaapoyo", empssapalService.findByIdCamaapoyo(FormularioAgua.getCamaapoyo().getId()));
		model.addAttribute("tendido", empssapalService.findByIdTendido25(FormularioAgua.getDiametroagua().getId()));
		model.addAttribute("cajamedidor", empssapalService.findByIdCajamedidor25(FormularioAgua.getDiametroagua().getId()));
		model.addAttribute("empalmeared", empssapalService.findByIdEmpalmered(FormularioAgua.getEmpalmered().getId()));
		model.addAttribute("relleno", empssapalService.findByIdRelleno(FormularioAgua.getRelleno().getId()));
		model.addAttribute("eliminacion", empssapalService.findByIdEliminacionexedente(FormularioAgua.getEliminacionexedente().getId()));
		model.addAttribute("prueba", empssapalService.findByIdPruebahidraulica(FormularioAgua.getPruebahidraulica().getId()));
		return "FormularioAgua/Reporte";
	}
	@RequestMapping(value = "FormularioAgua/guardar38", method = RequestMethod.POST)
	public String guardarpresupuestoagua38(
			@ModelAttribute("FormularioAgua") Camposagua FormularioAgua, Model model) {
		empssapalService.Guardarpresupuestoagua(FormularioAgua);
		model.addAttribute("Veredas",empssapalService.findByIdVereda(FormularioAgua.getVereda().getId()));
		model.addAttribute("pistas", empssapalService.findByIdPista(FormularioAgua.getPista().getId()));
		model.addAttribute("excavacion", empssapalService.findByIdExcavacion(FormularioAgua.getExcavacion().getId()));
		model.addAttribute("camaapoyo", empssapalService.findByIdCamaapoyo(FormularioAgua.getCamaapoyo().getId()));
		model.addAttribute("tendido", empssapalService.findByIdTendido38(FormularioAgua.getDiametroagua().getId()));
		model.addAttribute("cajamedidor", empssapalService.findByIdCajamedidor38(FormularioAgua.getDiametroagua().getId()));
		model.addAttribute("empalmeared", empssapalService.findByIdEmpalmered(FormularioAgua.getEmpalmered().getId()));
		model.addAttribute("relleno", empssapalService.findByIdRelleno(FormularioAgua.getRelleno().getId()));
		model.addAttribute("eliminacion", empssapalService.findByIdEliminacionexedente(FormularioAgua.getEliminacionexedente().getId()));
		model.addAttribute("prueba", empssapalService.findByIdPruebahidraulica(FormularioAgua.getPruebahidraulica().getId()));
		return "FormularioAgua/Reporte";
	}

	
	
	
	
	
	
	
	
	
	
	
	}
