/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.viki3d.spring.rest.api.documenting.api;

import com.viki3d.spring.rest.api.documenting.model.Car;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-28T12:22:48.707Z[GMT]")
@Validated
public interface CarsApi {

    @Operation(summary = "Add new car to database", description = "", tags={ "cars-rest-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))) })
    @RequestMapping(value = "/api/v1/cars",
        produces = { "*/*" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> add(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Car body);


    @Operation(summary = "Delete car by id", description = "", tags={ "cars-rest-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))) })
    @RequestMapping(value = "/api/v1/cars/{id}",
        produces = { "*/*" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "Get a car by id", description = "", tags={ "cars-rest-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success - the car was found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Car.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid id supplied"),
        
        @ApiResponse(responseCode = "404", description = "Car not found") })
    @RequestMapping(value = "/api/v1/cars/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Car> get(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "Get all cars", description = "", tags={ "cars-rest-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Car.class)))),
       
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))) })
    @RequestMapping(value = "/api/v1/cars",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Car>> list();


    @Operation(summary = "Replace car by id", description = "", tags={ "cars-rest-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))) })
    @RequestMapping(value = "/api/v1/cars/{id}",
        produces = { "*/*" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> replace(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Car body);


    @Operation(summary = "Update car by id", description = "", tags={ "cars-rest-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))) })
    @RequestMapping(value = "/api/v1/cars/{id}",
        produces = { "*/*" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Void> update(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Car body);

}

