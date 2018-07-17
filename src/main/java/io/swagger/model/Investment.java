package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Investment
 */
@Validated

public class Investment   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("idProject")
  private Integer idProject = null;

  @JsonProperty("amountInvestment")
  private Integer amountInvestment = null;

  @JsonProperty("porcentageToReturn")
  private BigDecimal porcentageToReturn = null;

  @JsonProperty("timeToReturnInvestment")
  private Integer timeToReturnInvestment = null;

  public Investment id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Investment idProject(Integer idProject) {
    this.idProject = idProject;
    return this;
  }

  /**
   * Get idProject
   * @return idProject
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull


  public Integer getIdProject() {
    return idProject;
  }

  public void setIdProject(Integer idProject) {
    this.idProject = idProject;
  }

  public Investment amountInvestment(Integer amountInvestment) {
    this.amountInvestment = amountInvestment;
    return this;
  }

  /**
   * Get amountInvestment
   * @return amountInvestment
  **/
  @ApiModelProperty(example = "2000000", required = true, value = "")
  @NotNull


  public Integer getAmountInvestment() {
    return amountInvestment;
  }

  public void setAmountInvestment(Integer amountInvestment) {
    this.amountInvestment = amountInvestment;
  }

  public Investment porcentageToReturn(BigDecimal porcentageToReturn) {
    this.porcentageToReturn = porcentageToReturn;
    return this;
  }

  /**
   * Get porcentageToReturn
   * @return porcentageToReturn
  **/
  @ApiModelProperty(example = "10.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getPorcentageToReturn() {
    return porcentageToReturn;
  }

  public void setPorcentageToReturn(BigDecimal porcentageToReturn) {
    this.porcentageToReturn = porcentageToReturn;
  }

  public Investment timeToReturnInvestment(Integer timeToReturnInvestment) {
    this.timeToReturnInvestment = timeToReturnInvestment;
    return this;
  }

  /**
   * Get timeToReturnInvestment
   * @return timeToReturnInvestment
  **/
  @ApiModelProperty(example = "5", required = true, value = "")
  @NotNull


  public Integer getTimeToReturnInvestment() {
    return timeToReturnInvestment;
  }

  public void setTimeToReturnInvestment(Integer timeToReturnInvestment) {
    this.timeToReturnInvestment = timeToReturnInvestment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Investment investment = (Investment) o;
    return Objects.equals(this.id, investment.id) &&
        Objects.equals(this.idProject, investment.idProject) &&
        Objects.equals(this.amountInvestment, investment.amountInvestment) &&
        Objects.equals(this.porcentageToReturn, investment.porcentageToReturn) &&
        Objects.equals(this.timeToReturnInvestment, investment.timeToReturnInvestment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idProject, amountInvestment, porcentageToReturn, timeToReturnInvestment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Investment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idProject: ").append(toIndentedString(idProject)).append("\n");
    sb.append("    amountInvestment: ").append(toIndentedString(amountInvestment)).append("\n");
    sb.append("    porcentageToReturn: ").append(toIndentedString(porcentageToReturn)).append("\n");
    sb.append("    timeToReturnInvestment: ").append(toIndentedString(timeToReturnInvestment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

