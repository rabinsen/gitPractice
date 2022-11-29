package products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductFeignClient productFeignClient;

	@RequestMapping("/product/{productId}")
	public Product getProduct(@PathVariable("productId") String productId) {


		return new Product("1122342dqwsd344322", "Hffdqdwfat", "Faseeehion", "Adidas", productFeignClient.getProductStocks(productId));
	}
}
