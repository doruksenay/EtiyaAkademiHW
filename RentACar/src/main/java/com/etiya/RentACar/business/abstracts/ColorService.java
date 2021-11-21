package com.etiya.RentACar.business.abstracts;

import java.util.List;

import com.etiya.RentACar.business.dtos.ColorSearchListDto;
import com.etiya.RentACar.business.requests.brandRequests.DeleteBrandRequest;
import com.etiya.RentACar.business.requests.colorRequests.CreateColorRequest;
import com.etiya.RentACar.business.requests.colorRequests.DeleteColorRequest;
import com.etiya.RentACar.business.requests.colorRequests.UpdateColorRequest;

public interface ColorService {
	
	List<ColorSearchListDto> getColors();
	void add(CreateColorRequest createColorRequest);
	void update(UpdateColorRequest updateColorRequest);
	void delete(DeleteColorRequest deleteColorRequest);

}