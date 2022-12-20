package myBlog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class studyController {

	@GetMapping("/naverMap")
	public String naverMap() {
		return "naverMap";
	}
}
