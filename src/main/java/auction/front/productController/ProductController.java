package auction.front.productController;

import java.io.IOException;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import auction.common.util.UploadUtil;

@Controller
@RequestMapping(value="/product")
public class ProductController {

	
	@Resource(name="uploadUtil")
	private UploadUtil upload;

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@RequestMapping(value="/product")
	public String product() {
		return "/product/product";
	}
	
	@RequestMapping(value="/addProduct")
	public void addProduct(@RequestParam HashMap<String, Object> data, @RequestParam(value ="product") MultipartFile file, HttpServletResponse response) throws IllegalStateException, IOException {

		upload.fileUpload(file, "doc");
		response.sendRedirect("/");
	}
}
