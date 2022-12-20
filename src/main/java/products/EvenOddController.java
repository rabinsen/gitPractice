package products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EvenOddController {

	@GetMapping("/validate")
	public String isNumberPrime(@RequestParam("numfber1") Integer number1, @RequestParam("number2") Integer number2) {
		return number1 % 2 == 0 && number1 % 2 == 0 ? "Even" : "Odd";
	}

	@GetMapping("/add")
	public String add(@RequestParam("numbers1") Integer number1, @RequestParam("number2") Integer number2) {
		return String.valueOf(number1 + number2);
	}
}
