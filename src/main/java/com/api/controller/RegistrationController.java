package com.api.controller;

import com.api.entity.Registration;
import com.api.payload.RegistrationDto;
import com.api.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //this annotation makes a api layer
@RequestMapping("/api/v1/registration") //use to map the HTTP request to handlers of MVC and REST controllers
public class RegistrationController {

    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping //use for read data from database
    public ResponseEntity<List<RegistrationDto>> getAllRegistration(){
        List<RegistrationDto> dtos = registrationService.getRegistration();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }
    @PostMapping //this annotation use for saving data in database
    public ResponseEntity<?> createRegistration(
           @Valid @RequestBody RegistrationDto registrationDto,
           BindingResult result
    ){
        if(result.hasErrors()){
            return new ResponseEntity<>(result.getFieldError().getDefaultMessage(),HttpStatus.CREATED);
        }
        RegistrationDto regDto = registrationService.createRegistration(registrationDto);
        return new ResponseEntity<>(regDto,HttpStatus.CREATED);
    }

    @DeleteMapping //use for delete data from database
    public ResponseEntity<String> deleteRegistration(
       @RequestParam long id
    ){
         registrationService.deleteRegistration(id);
         return new ResponseEntity<>("Deleted",HttpStatus.OK);
    }

    @PutMapping("/{id}") //use for update data in database
    public ResponseEntity<Registration> updateRegistration(
          @PathVariable long id,
          @RequestBody Registration registration
    ){
          Registration updateReg=registrationService.updateRegistration(id,registration);
          return new ResponseEntity<>(updateReg,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistrationDto> getRegistrationById(@PathVariable long id){
        RegistrationDto dto=registrationService.getRegistrationById(id);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

}
