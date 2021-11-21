package com.etiya.RentACar.business.abstracts;

import java.util.List;

import com.etiya.RentACar.business.dtos.BrandSearchListDto;
import com.etiya.RentACar.business.requests.brandRequests.CreateBrandRequest;
import com.etiya.RentACar.business.requests.brandRequests.DeleteBrandRequest;
import com.etiya.RentACar.business.requests.brandRequests.UpdateBrandRequest;

public interface BrandService {
	
	//?? DataResult and result
	List<BrandSearchListDto> getBrands();
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(DeleteBrandRequest deleteBrandRequest);

}