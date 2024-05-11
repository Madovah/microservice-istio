package com.mrizzi.microservice.invoicing.web;

import com.mrizzi.microservice.invoicing.poller.InvoicePoller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PollController {

	private InvoicePoller poller;

	public PollController(InvoicePoller poller) {
		this.poller = poller;
	}

	@PostMapping("/poll")
	public String poll() {
		poller.poll();
		return "success";
	}

}
