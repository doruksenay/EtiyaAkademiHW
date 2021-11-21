package com.etiya.RentACar.business.abstracts;

import java.util.List;

import com.etiya.RentACar.business.dtos.CarSearchListDto;
import com.etiya.RentACar.business.requests.brandRequests.DeleteBrandRequest;
import com.etiya.RentACar.business.requests.carRequests.CreateCarRequest;
import com.etiya.RentACar.business.requests.carRequests.DeleteCarRequest;
import com.etiya.RentACar.business.requests.carRequests.UpdateCarRequest;

public interface CarService {
	
	List<CarSearchListDto> getCars();
	void add(CreateCarRequest createCarRequest);
	void update(UpdateCarRequest updateCarRequest);
	void delete(DeleteCarRequest deleteCarRequest);

}