package com.example.demo;

import com.google.gson.Gson;
import com.microsoft.azure.servicebus.IMessage;
import com.microsoft.azure.servicebus.IQueueClient;
import com.microsoft.azure.servicebus.ITopicClient;
import com.microsoft.azure.servicebus.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import static java.nio.charset.StandardCharsets.UTF_8;
import java.time.Clock;
import java.util.HashMap;
import java.util.UUID;

@Component
@RestController
class MessageFromWeb {

	private final IQueueClient iQueueClient;
	static final Gson GSON = new Gson();

	MessageFromWeb(IQueueClient iQueueClient) {
		this.iQueueClient = iQueueClient;
	}

	@GetMapping("/message-home")
	public ModelAndView textHome(String msg) {
		ModelAndView modeleView = new ModelAndView("text");
		return modeleView;
	}

	@RequestMapping(value = "/message-info", method = RequestMethod.POST)
	public ModelAndView produce(@RequestParam(name = "msg") String msg) throws Exception {
		Message message = new Message(msg);
		//String messageId = UUID.randomUUID().toString();
		final String messageId = Integer.toString(10);
		message.setContentType("text/plain");
		message.setMessageId(messageId);
		message.setLabel("Text Web");
		this.iQueueClient.send(message);
		return new ModelAndView("msg-success");
	}

	@GetMapping("/product-home")
	public ModelAndView Register(@ModelAttribute("product") Product product, Model model) {
		ModelAndView modeleView = new ModelAndView("products");
		return modeleView;
	}

	@RequestMapping(value = "/product-info", method = RequestMethod.POST)
	public String producer(@ModelAttribute("product") Product product, Model model) throws Exception {
		String messageId = UUID.randomUUID().toString();
		IMessage message = new Message(GSON.toJson(product, Product.class).getBytes(UTF_8));
		message.setContentType("application/json");
		message.setMessageId(messageId);
		message.setLabel("Product Web");
		message.setProperties(new HashMap<String, String>() {
			{
				put("ProductId", product.getProductId());
				put("Name", product.getName());
			}
		});
		iQueueClient.send(message);
		return "Product Details Sent to Azure Service Bus";
	}

}
