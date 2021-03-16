package address.service;

import java.util.List;

import address.dto.AddressDto;

public interface AddressService {
	List<AddressDto> selectAddressList() throws Exception;
	AddressDto selectAddressDetail(int num) throws Exception;
}
