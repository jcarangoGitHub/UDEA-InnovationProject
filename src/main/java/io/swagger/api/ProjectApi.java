/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.util.List;

import javax.validation.Valid;

import io.swagger.model.Portfolio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Project;

@Api(value = "project", description = "the project API")
@RequestMapping("/project")
public interface ProjectApi {

    @ApiOperation(value = "registers a project", nickname = "registerProject", notes = "Registers a new project", tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful registration"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing project already exists") })
    @RequestMapping(value = "/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Project> registerProject(@ApiParam(value = "Project to register"  )  @Valid @RequestBody Project project);

    @ApiOperation(value = "unregisters a project", nickname = "unregisterProject", notes = "Unregisters an existent project", tags = {"admins", })
    @ApiResponses(value = {
            @ApiResponse(code = 202, message = "Project marked for disabling"),
            @ApiResponse(code = 204, message = "Project unregistered")})
    @RequestMapping(value = "/{projectId}", produces = {"application/json"}, method = RequestMethod.DELETE)
    ResponseEntity<Void> unregisterProject(@ApiParam(value = "project id to unregister", required = true) @PathVariable("projectId") String projectId);


    @ApiOperation(value = "searches all projects", nickname = "searchAllProjects", notes = "Searches all projects", response = Project.class, responseContainer = "List", tags={ "admins","investors","projectOwners", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all projects", response = Project.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "not projects registered") })
    @RequestMapping(value = "/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Project>> searchAllProjects();


    @ApiOperation(value = "searches project", nickname = "searchProject", notes = "given an ID it searches a project", response = Object.class, tags={ "admins","investors","projectOwners", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Object.class),
        @ApiResponse(code = 400, message = "project not found") })
    @RequestMapping(value = "/{projectId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Project> searchProject(@ApiParam(value = "id project to find",required=true) @PathVariable("projectId") Integer projectId);

    @ApiOperation(value = "search a portfolio given a project", nickname = "getPortfolio", notes = "Given a valid project Id, returns its portfolio", response = Object.class, tags={ "admins","investors","projectOwners", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Return result", response = Object.class),
            @ApiResponse(code = 400, message = "incorrect parameter") })
    @RequestMapping(value = "/{projectId}/portfolio",
            produces = { "application/json" },
            method = RequestMethod.GET)
    @ResponseBody
    Portfolio getPortfolio(@ApiParam(value = "project id search portfolio",required=true) @PathVariable("projectId") Integer projectId);

}
