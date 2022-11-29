package products;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "stockClient", url = "http://localhost:8900")
public interface ProductFeignClient {
    @RequestMapping("/stock/{productId}")
    int getProductStocks(@PathVariable("productId") String productId);
}
