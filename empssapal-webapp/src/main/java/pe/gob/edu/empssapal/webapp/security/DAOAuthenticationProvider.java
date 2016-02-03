package pe.gob.edu.empssapal.webapp.security;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import pe.gob.edu.empssapal.core.security.User;
import pe.gob.edu.empssapal.service.services.CamposaguaServiceImpl;
import pe.gob.edu.empssapal.webapp.security.SessionDetail;



public class DAOAuthenticationProvider implements AuthenticationProvider {

	protected final Log logger = LogFactory.getLog(getClass());

	 @Autowired
	 private CamposaguaServiceImpl empssapalService;

	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		UsernamePasswordAuthenticationToken successToken = null;

		if(SessionDetail.getUserDetails()==null){
			String username=null;
			String password=null;
			try {
				username = authentication.getPrincipal().toString();
				password = authentication.getCredentials().toString();
			} catch (Exception e) {
				logger.info(e.getMessage(), e);
				throw new BadCredentialsException("Username or Password is empty: " + username);
			}

			if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
				throw new BadCredentialsException("Username or Password is empty: " + username);
			}
			System.out.println("username: " + username);

			User user = null;


			if (username.equals("admin") && password.equals("admin")) {
				user = new User();
				String[] roles = { "ROLE_ADMIN" };
				user.setRoles(roles);
				user.setUserName("Administrador");
				user.setUserId(1L);
			}


  			System.out.println(empssapalService+"  :::::user::::: " + user);
			if (user == null) {
				throw new BadCredentialsException("DAO: User's Information need to be updated, user " + username);
			}


			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			for (String rol : user.getRoles()) {
				System.out.println("rol " + rol);
				authorities.add(new SimpleGrantedAuthority(rol));
			}
			System.out.println("authorities: " + authorities);
			successToken = new UsernamePasswordAuthenticationToken(authentication.getPrincipal().toString(),
					authentication.getCredentials().toString(), authorities);
			successToken.setDetails(user);
			System.out.println(
					"USER authenticated>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:" + username + ":<<<<<<<<<<<<<<<<<<<<<<<<");
		} else {
			successToken = (UsernamePasswordAuthenticationToken) SessionDetail.getAuthentication();
			
		}
		return successToken;
	}

	public boolean supports(Class<? extends Object> authentication) {
		return true;
	}
}
