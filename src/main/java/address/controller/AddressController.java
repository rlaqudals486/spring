package address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import address.dto.AddressDto;
import address.service.AddressService;

@Controller
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping("/address/openAddressList.do")
	public ModelAndView openAddress() throws Exception {
		ModelAndView mv = new ModelAndView("/address/AddressList");
		
		List<AddressDto> list = addressService.selectAddressList();
		mv.addObject("data", list);
		
		return mv;
	}
	
	@RequestMapping("/address/openAddressDetail.do")
	public ModelAndView openAddressDetail(@RequestParam int num) throws Exception {
		ModelAndView mv = new ModelAndView("/address/AddressDetail");
		
		AddressDto addr = addressService.selectAddressDetail(num);
		mv.addObject("board", addr);
		
		return mv;
	}
}


