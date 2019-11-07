package fr.webproject.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class CredentialsFilter
 */
@WebFilter(filterName="/CredentialsFilter", urlPatterns = {"/*"})
public class CredentialsFilter implements Filter {

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String connectedUser = null;
		// Si l'URL a laquelle on essaie d'accéder n'est pas le login
		String requestUri = ((HttpServletRequest) request).getRequestURI();
		if (!requestUri.contains("login")) {
			if (request instanceof HttpServletRequest) {
				connectedUser = (String)((HttpServletRequest) request).getSession().getAttribute("connectedUser");
			}

			// Et si l'utilisateur courant n'est pas connecté, alors on redirige vers la page de login
			if (connectedUser == null) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
				// Ou alors : ((HttpServletResponse) response).sendRedirect("login.jsp");
			}
		}

		// Filtre suivant
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
