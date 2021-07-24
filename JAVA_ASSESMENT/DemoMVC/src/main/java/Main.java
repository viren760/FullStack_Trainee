import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
//
//	public static void main(String[] args) {
//		
//	}
	
	@RequestMapping("/index")
	public String homepage() {
		return "index.jsp";
	}
}
