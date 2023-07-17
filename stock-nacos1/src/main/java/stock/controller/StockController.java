package stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/reduct")
    public String reduct() throws InterruptedException {
        System.out.println("扣减库存2");
        return "扣减库存:"+port;
    }


    @RequestMapping("/reduct2")
    public String reduct2() {
        int a=1/0;
        System.out.println("扣减库存");
        return "扣减库存:"+port;
    }

}
