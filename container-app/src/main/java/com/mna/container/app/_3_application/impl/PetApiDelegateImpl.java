package com.mna.container.app._3_application.impl;

import java.util.List;
import java.util.Optional;

import org.apache.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.mna.container.app._3_application.PetApiDelegate;
import com.mna.container.app._4_domain.api.model.ModelApiResponse;
import com.mna.container.app._4_domain.api.model.Pet;

public class PetApiDelegateImpl implements PetApiDelegate {

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return PetApiDelegate.super.getRequest();
	}

	@Override
	public ResponseEntity<Pet> addPet(Pet pet) {
		// TODO Auto-generated method stub
		return PetApiDelegate.super.addPet(pet);
	}

	@Override
	public ResponseEntity<Void> deletePet(Long petId) {
		// TODO Auto-generated method stub
		return PetApiDelegate.super.deletePet(petId);
	}

	@Override
	public ResponseEntity<List<Pet>> findPetsByStatus(String status) {
		// TODO Auto-generated method stub
		return PetApiDelegate.super.findPetsByStatus(status);
	}

	@Override
	public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
		// TODO Auto-generated method stub
		return PetApiDelegate.super.findPetsByTags(tags);
	}

	@Override
	public ResponseEntity<Pet> getPetById(Long petId) {
		System.out.println("Inside...");
		Pet pet = new Pet();
		return new ResponseEntity<Pet>(pet, HttpStatusCode.valueOf(HttpStatus.SC_OK));
	}

	@Override
	public ResponseEntity<Pet> updatePet(Pet pet) {
		// TODO Auto-generated method stub
		return PetApiDelegate.super.updatePet(pet);
	}

	@Override
	public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
		// TODO Auto-generated method stub
		return PetApiDelegate.super.updatePetWithForm(petId, name, status);
	}

	@Override
	public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, MultipartFile body) {
		// TODO Auto-generated method stub
		return PetApiDelegate.super.uploadFile(petId, additionalMetadata, body);
	}

}
