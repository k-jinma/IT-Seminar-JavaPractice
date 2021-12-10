package exercises1_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExcercisesServlet2
 */
@WebServlet("/exercises2")
public class ExcercisesServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		String message;	//結果やエラーを表示する文字列

		//直接アクセスがあればフォーム入力のページにリダイレクトする
		String url = "http://localhost:8080/exercises1_2/exercises_page2.html";
		String referer = request.getHeader("Referer");

		if( referer == null || !url.equals(referer)) {
			response.setStatus(HttpServletResponse.SC_FOUND);
			response.setHeader("Location", url);
			return;
		}

		//両方のテキストボックスに値が入っていない場合はエラー
		if( request.getParameter("num1").isEmpty() == true ||
				request.getParameter("num2").isEmpty() == true ) {

			message = "両方のテキストボックスに値を入れて下さい。";

		//エラーがすべてなく正しいとき計算する
		}else {
			//数値でない場合（値が不正）はエラー
			try {
				int num1 = Integer.parseInt( request.getParameter("num1") );
				int num2 = Integer.parseInt( request.getParameter("num2") );
				message = num1 + "足す" + num2 + "は" + (num1+num2) + "です";

			}catch( NumberFormatException e ) {
				message = "値が不正です。数値を入力して下さい。";
			}
		}

		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>計算結果を表示</h1>");
		out.println("<hr>");
		out.println("<p>" +  message + "</p>" );
		out.println("</body></html>");


	}

}
