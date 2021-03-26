/*
 * Scrum Metrics API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.3.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Users
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-26T15:30:04.137Z")
public class Users {
  @SerializedName("loginbody")
  private String loginbody = null;

  @SerializedName("postuserbody")
  private String postuserbody = null;

  @SerializedName("userbody")
  private String userbody = null;

  @SerializedName("nameupdbody")
  private String nameupdbody = null;

  @SerializedName("passupdbody")
  private String passupdbody = null;

  @SerializedName("emailupdbody")
  private String emailupdbody = null;

  @SerializedName("allupdbody")
  private String allupdbody = null;

  @SerializedName("postprojectbody")
  private String postprojectbody = null;

  @SerializedName("lastprojectbody")
  private String lastprojectbody = null;

  @SerializedName("userprojectsbody")
  private BigDecimal userprojectsbody = null;

  @SerializedName("projectinfobody")
  private BigDecimal projectinfobody = null;

  @SerializedName("memberbody")
  private String memberbody = null;

  @SerializedName("projmembody")
  private String projmembody = null;

  @SerializedName("usernamebody")
  private String usernamebody = null;

  @SerializedName("setnewdescbody")
  private String setnewdescbody = null;

  @SerializedName("deletemember")
  private String deletemember = null;

  @SerializedName("updmemrole")
  private String updmemrole = null;

  @SerializedName("setsprint")
  private String setsprint = null;

  @SerializedName("getsprints")
  private String getsprints = null;

  @SerializedName("currsprint")
  private String currsprint = null;

  @SerializedName("getstories")
  private String getstories = null;

  @SerializedName("setstory")
  private String setstory = null;

  @SerializedName("updstorycol")
  private String updstorycol = null;

  @SerializedName("sprintstatus")
  private String sprintstatus = null;

  @SerializedName("endsprint")
  private String endsprint = null;

  @SerializedName("unfinishedstories")
  private String unfinishedstories = null;

  @SerializedName("movestory")
  private String movestory = null;

  @SerializedName("editstory")
  private String editstory = null;

  @SerializedName("nextsprint")
  private String nextsprint = null;

  @SerializedName("deluserbody")
  private String deluserbody = null;

  public Users loginbody(String loginbody) {
    this.loginbody = loginbody;
    return this;
  }

   /**
   * User and password to log in
   * @return loginbody
  **/
  @ApiModelProperty(example = "{\"username\":\"test\",\"password\":\"test\"}", value = "User and password to log in")
  public String getLoginbody() {
    return loginbody;
  }

  public void setLoginbody(String loginbody) {
    this.loginbody = loginbody;
  }

  public Users postuserbody(String postuserbody) {
    this.postuserbody = postuserbody;
    return this;
  }

   /**
   * Create a new user entry in the database
   * @return postuserbody
  **/
  @ApiModelProperty(example = "{\"name\":\"test profile\",\"email\":\"test@test.com\",\"username\":\"test\",\"password\":\"test\"}", value = "Create a new user entry in the database")
  public String getPostuserbody() {
    return postuserbody;
  }

  public void setPostuserbody(String postuserbody) {
    this.postuserbody = postuserbody;
  }

  public Users userbody(String userbody) {
    this.userbody = userbody;
    return this;
  }

   /**
   * Get userbody
   * @return userbody
  **/
  @ApiModelProperty(example = "{\"username\":\"test\"}", value = "")
  public String getUserbody() {
    return userbody;
  }

  public void setUserbody(String userbody) {
    this.userbody = userbody;
  }

  public Users nameupdbody(String nameupdbody) {
    this.nameupdbody = nameupdbody;
    return this;
  }

   /**
   * Get nameupdbody
   * @return nameupdbody
  **/
  @ApiModelProperty(example = "{\"name\":\"new name\",\"username\":\"test\"}", value = "")
  public String getNameupdbody() {
    return nameupdbody;
  }

  public void setNameupdbody(String nameupdbody) {
    this.nameupdbody = nameupdbody;
  }

  public Users passupdbody(String passupdbody) {
    this.passupdbody = passupdbody;
    return this;
  }

   /**
   * Get passupdbody
   * @return passupdbody
  **/
  @ApiModelProperty(example = "{\"newpass\":\"new password\",\"username\":\"test\"}", value = "")
  public String getPassupdbody() {
    return passupdbody;
  }

  public void setPassupdbody(String passupdbody) {
    this.passupdbody = passupdbody;
  }

  public Users emailupdbody(String emailupdbody) {
    this.emailupdbody = emailupdbody;
    return this;
  }

   /**
   * Get emailupdbody
   * @return emailupdbody
  **/
  @ApiModelProperty(example = "{\"email\":\"newemail@test.com\",\"username\":\"test\"}", value = "")
  public String getEmailupdbody() {
    return emailupdbody;
  }

  public void setEmailupdbody(String emailupdbody) {
    this.emailupdbody = emailupdbody;
  }

  public Users allupdbody(String allupdbody) {
    this.allupdbody = allupdbody;
    return this;
  }

   /**
   * Get allupdbody
   * @return allupdbody
  **/
  @ApiModelProperty(example = "{\"name\":\"new name\",\"email\":\"newemail@test.com\",\"username\":\"test\"}", value = "")
  public String getAllupdbody() {
    return allupdbody;
  }

  public void setAllupdbody(String allupdbody) {
    this.allupdbody = allupdbody;
  }

  public Users postprojectbody(String postprojectbody) {
    this.postprojectbody = postprojectbody;
    return this;
  }

   /**
   * Get postprojectbody
   * @return postprojectbody
  **/
  @ApiModelProperty(example = "{\"name\":\"testproject\",\"description\":\"project description\",\"start_date\":\"2019-09-29\",\"end_date\":null,\"image\":null}", value = "")
  public String getPostprojectbody() {
    return postprojectbody;
  }

  public void setPostprojectbody(String postprojectbody) {
    this.postprojectbody = postprojectbody;
  }

  public Users lastprojectbody(String lastprojectbody) {
    this.lastprojectbody = lastprojectbody;
    return this;
  }

   /**
   * Get lastprojectbody
   * @return lastprojectbody
  **/
  @ApiModelProperty(example = "{\"name\":\"projectname\"}", value = "")
  public String getLastprojectbody() {
    return lastprojectbody;
  }

  public void setLastprojectbody(String lastprojectbody) {
    this.lastprojectbody = lastprojectbody;
  }

  public Users userprojectsbody(BigDecimal userprojectsbody) {
    this.userprojectsbody = userprojectsbody;
    return this;
  }

   /**
   * Get userprojectsbody
   * @return userprojectsbody
  **/
  @ApiModelProperty(example = "{\"userid\":1}", value = "")
  public BigDecimal getUserprojectsbody() {
    return userprojectsbody;
  }

  public void setUserprojectsbody(BigDecimal userprojectsbody) {
    this.userprojectsbody = userprojectsbody;
  }

  public Users projectinfobody(BigDecimal projectinfobody) {
    this.projectinfobody = projectinfobody;
    return this;
  }

   /**
   * Get projectinfobody
   * @return projectinfobody
  **/
  @ApiModelProperty(example = "{\"projectid\":1}", value = "")
  public BigDecimal getProjectinfobody() {
    return projectinfobody;
  }

  public void setProjectinfobody(BigDecimal projectinfobody) {
    this.projectinfobody = projectinfobody;
  }

  public Users memberbody(String memberbody) {
    this.memberbody = memberbody;
    return this;
  }

   /**
   * Get memberbody
   * @return memberbody
  **/
  @ApiModelProperty(example = "{\"projid\":1,\"user\":1,\"role\":\"ScrumMaster\"}", value = "")
  public String getMemberbody() {
    return memberbody;
  }

  public void setMemberbody(String memberbody) {
    this.memberbody = memberbody;
  }

  public Users projmembody(String projmembody) {
    this.projmembody = projmembody;
    return this;
  }

   /**
   * Get projmembody
   * @return projmembody
  **/
  @ApiModelProperty(example = "{\"projid\":1}", value = "")
  public String getProjmembody() {
    return projmembody;
  }

  public void setProjmembody(String projmembody) {
    this.projmembody = projmembody;
  }

  public Users usernamebody(String usernamebody) {
    this.usernamebody = usernamebody;
    return this;
  }

   /**
   * Get usernamebody
   * @return usernamebody
  **/
  @ApiModelProperty(example = "{\"userid\":1}", value = "")
  public String getUsernamebody() {
    return usernamebody;
  }

  public void setUsernamebody(String usernamebody) {
    this.usernamebody = usernamebody;
  }

  public Users setnewdescbody(String setnewdescbody) {
    this.setnewdescbody = setnewdescbody;
    return this;
  }

   /**
   * Get setnewdescbody
   * @return setnewdescbody
  **/
  @ApiModelProperty(example = "{\"description\":1,\"projid\":1}", value = "")
  public String getSetnewdescbody() {
    return setnewdescbody;
  }

  public void setSetnewdescbody(String setnewdescbody) {
    this.setnewdescbody = setnewdescbody;
  }

  public Users deletemember(String deletemember) {
    this.deletemember = deletemember;
    return this;
  }

   /**
   * Get deletemember
   * @return deletemember
  **/
  @ApiModelProperty(example = "{\"userid\":1,\"projid\":1}", value = "")
  public String getDeletemember() {
    return deletemember;
  }

  public void setDeletemember(String deletemember) {
    this.deletemember = deletemember;
  }

  public Users updmemrole(String updmemrole) {
    this.updmemrole = updmemrole;
    return this;
  }

   /**
   * Get updmemrole
   * @return updmemrole
  **/
  @ApiModelProperty(example = "{\"role\":\"Team Member\",\"projid\":1,\"userid\":1}", value = "")
  public String getUpdmemrole() {
    return updmemrole;
  }

  public void setUpdmemrole(String updmemrole) {
    this.updmemrole = updmemrole;
  }

  public Users setsprint(String setsprint) {
    this.setsprint = setsprint;
    return this;
  }

   /**
   * Get setsprint
   * @return setsprint
  **/
  @ApiModelProperty(example = "{\"name\":\"Sprint 1\",\"projid\":1}", value = "")
  public String getSetsprint() {
    return setsprint;
  }

  public void setSetsprint(String setsprint) {
    this.setsprint = setsprint;
  }

  public Users getsprints(String getsprints) {
    this.getsprints = getsprints;
    return this;
  }

   /**
   * Get getsprints
   * @return getsprints
  **/
  @ApiModelProperty(example = "{\"projid\":1}", value = "")
  public String getGetsprints() {
    return getsprints;
  }

  public void setGetsprints(String getsprints) {
    this.getsprints = getsprints;
  }

  public Users currsprint(String currsprint) {
    this.currsprint = currsprint;
    return this;
  }

   /**
   * Get currsprint
   * @return currsprint
  **/
  @ApiModelProperty(example = "{\"projid\":1,\"name\":\"Name\"}", value = "")
  public String getCurrsprint() {
    return currsprint;
  }

  public void setCurrsprint(String currsprint) {
    this.currsprint = currsprint;
  }

  public Users getstories(String getstories) {
    this.getstories = getstories;
    return this;
  }

   /**
   * Get getstories
   * @return getstories
  **/
  @ApiModelProperty(example = "{\"projid\":1,\"sprintid\":1}", value = "")
  public String getGetstories() {
    return getstories;
  }

  public void setGetstories(String getstories) {
    this.getstories = getstories;
  }

  public Users setstory(String setstory) {
    this.setstory = setstory;
    return this;
  }

   /**
   * Get setstory
   * @return setstory
  **/
  @ApiModelProperty(example = "{\"description\":\"This is a story\",\"sprintid\":1,\"projid\":1}", value = "")
  public String getSetstory() {
    return setstory;
  }

  public void setSetstory(String setstory) {
    this.setstory = setstory;
  }

  public Users updstorycol(String updstorycol) {
    this.updstorycol = updstorycol;
    return this;
  }

   /**
   * Get updstorycol
   * @return updstorycol
  **/
  @ApiModelProperty(example = "{\"colid\":1,\"storyname\":\"Story name\",\"sprintid\":1,\"projid\":1}", value = "")
  public String getUpdstorycol() {
    return updstorycol;
  }

  public void setUpdstorycol(String updstorycol) {
    this.updstorycol = updstorycol;
  }

  public Users sprintstatus(String sprintstatus) {
    this.sprintstatus = sprintstatus;
    return this;
  }

   /**
   * Get sprintstatus
   * @return sprintstatus
  **/
  @ApiModelProperty(example = "{\"sprintid\":1,\"projid\":1}", value = "")
  public String getSprintstatus() {
    return sprintstatus;
  }

  public void setSprintstatus(String sprintstatus) {
    this.sprintstatus = sprintstatus;
  }

  public Users endsprint(String endsprint) {
    this.endsprint = endsprint;
    return this;
  }

   /**
   * Get endsprint
   * @return endsprint
  **/
  @ApiModelProperty(example = "{\"sprintid\":1,\"projid\":1}", value = "")
  public String getEndsprint() {
    return endsprint;
  }

  public void setEndsprint(String endsprint) {
    this.endsprint = endsprint;
  }

  public Users unfinishedstories(String unfinishedstories) {
    this.unfinishedstories = unfinishedstories;
    return this;
  }

   /**
   * Get unfinishedstories
   * @return unfinishedstories
  **/
  @ApiModelProperty(example = "{\"sprintid\":1,\"projid\":1}", value = "")
  public String getUnfinishedstories() {
    return unfinishedstories;
  }

  public void setUnfinishedstories(String unfinishedstories) {
    this.unfinishedstories = unfinishedstories;
  }

  public Users movestory(String movestory) {
    this.movestory = movestory;
    return this;
  }

   /**
   * Get movestory
   * @return movestory
  **/
  @ApiModelProperty(example = "{\"sprintid\":1,\"projid\":1,\"storyid\":1}", value = "")
  public String getMovestory() {
    return movestory;
  }

  public void setMovestory(String movestory) {
    this.movestory = movestory;
  }

  public Users editstory(String editstory) {
    this.editstory = editstory;
    return this;
  }

   /**
   * Get editstory
   * @return editstory
  **/
  @ApiModelProperty(example = "{\"newstory\":\"This is one new story\",\"sprintid\":1,\"projid\":1,\"oldstory\":\"This is the old story\"}", value = "")
  public String getEditstory() {
    return editstory;
  }

  public void setEditstory(String editstory) {
    this.editstory = editstory;
  }

  public Users nextsprint(String nextsprint) {
    this.nextsprint = nextsprint;
    return this;
  }

   /**
   * Get nextsprint
   * @return nextsprint
  **/
  @ApiModelProperty(example = "{\"projid\":1}", value = "")
  public String getNextsprint() {
    return nextsprint;
  }

  public void setNextsprint(String nextsprint) {
    this.nextsprint = nextsprint;
  }

  public Users deluserbody(String deluserbody) {
    this.deluserbody = deluserbody;
    return this;
  }

   /**
   * Get deluserbody
   * @return deluserbody
  **/
  @ApiModelProperty(example = "{\"userid\":1,\"password\":\"password\"}", value = "")
  public String getDeluserbody() {
    return deluserbody;
  }

  public void setDeluserbody(String deluserbody) {
    this.deluserbody = deluserbody;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Users users = (Users) o;
    return Objects.equals(this.loginbody, users.loginbody) &&
        Objects.equals(this.postuserbody, users.postuserbody) &&
        Objects.equals(this.userbody, users.userbody) &&
        Objects.equals(this.nameupdbody, users.nameupdbody) &&
        Objects.equals(this.passupdbody, users.passupdbody) &&
        Objects.equals(this.emailupdbody, users.emailupdbody) &&
        Objects.equals(this.allupdbody, users.allupdbody) &&
        Objects.equals(this.postprojectbody, users.postprojectbody) &&
        Objects.equals(this.lastprojectbody, users.lastprojectbody) &&
        Objects.equals(this.userprojectsbody, users.userprojectsbody) &&
        Objects.equals(this.projectinfobody, users.projectinfobody) &&
        Objects.equals(this.memberbody, users.memberbody) &&
        Objects.equals(this.projmembody, users.projmembody) &&
        Objects.equals(this.usernamebody, users.usernamebody) &&
        Objects.equals(this.setnewdescbody, users.setnewdescbody) &&
        Objects.equals(this.deletemember, users.deletemember) &&
        Objects.equals(this.updmemrole, users.updmemrole) &&
        Objects.equals(this.setsprint, users.setsprint) &&
        Objects.equals(this.getsprints, users.getsprints) &&
        Objects.equals(this.currsprint, users.currsprint) &&
        Objects.equals(this.getstories, users.getstories) &&
        Objects.equals(this.setstory, users.setstory) &&
        Objects.equals(this.updstorycol, users.updstorycol) &&
        Objects.equals(this.sprintstatus, users.sprintstatus) &&
        Objects.equals(this.endsprint, users.endsprint) &&
        Objects.equals(this.unfinishedstories, users.unfinishedstories) &&
        Objects.equals(this.movestory, users.movestory) &&
        Objects.equals(this.editstory, users.editstory) &&
        Objects.equals(this.nextsprint, users.nextsprint) &&
        Objects.equals(this.deluserbody, users.deluserbody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginbody, postuserbody, userbody, nameupdbody, passupdbody, emailupdbody, allupdbody, postprojectbody, lastprojectbody, userprojectsbody, projectinfobody, memberbody, projmembody, usernamebody, setnewdescbody, deletemember, updmemrole, setsprint, getsprints, currsprint, getstories, setstory, updstorycol, sprintstatus, endsprint, unfinishedstories, movestory, editstory, nextsprint, deluserbody);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Users {\n");
    
    sb.append("    loginbody: ").append(toIndentedString(loginbody)).append("\n");
    sb.append("    postuserbody: ").append(toIndentedString(postuserbody)).append("\n");
    sb.append("    userbody: ").append(toIndentedString(userbody)).append("\n");
    sb.append("    nameupdbody: ").append(toIndentedString(nameupdbody)).append("\n");
    sb.append("    passupdbody: ").append(toIndentedString(passupdbody)).append("\n");
    sb.append("    emailupdbody: ").append(toIndentedString(emailupdbody)).append("\n");
    sb.append("    allupdbody: ").append(toIndentedString(allupdbody)).append("\n");
    sb.append("    postprojectbody: ").append(toIndentedString(postprojectbody)).append("\n");
    sb.append("    lastprojectbody: ").append(toIndentedString(lastprojectbody)).append("\n");
    sb.append("    userprojectsbody: ").append(toIndentedString(userprojectsbody)).append("\n");
    sb.append("    projectinfobody: ").append(toIndentedString(projectinfobody)).append("\n");
    sb.append("    memberbody: ").append(toIndentedString(memberbody)).append("\n");
    sb.append("    projmembody: ").append(toIndentedString(projmembody)).append("\n");
    sb.append("    usernamebody: ").append(toIndentedString(usernamebody)).append("\n");
    sb.append("    setnewdescbody: ").append(toIndentedString(setnewdescbody)).append("\n");
    sb.append("    deletemember: ").append(toIndentedString(deletemember)).append("\n");
    sb.append("    updmemrole: ").append(toIndentedString(updmemrole)).append("\n");
    sb.append("    setsprint: ").append(toIndentedString(setsprint)).append("\n");
    sb.append("    getsprints: ").append(toIndentedString(getsprints)).append("\n");
    sb.append("    currsprint: ").append(toIndentedString(currsprint)).append("\n");
    sb.append("    getstories: ").append(toIndentedString(getstories)).append("\n");
    sb.append("    setstory: ").append(toIndentedString(setstory)).append("\n");
    sb.append("    updstorycol: ").append(toIndentedString(updstorycol)).append("\n");
    sb.append("    sprintstatus: ").append(toIndentedString(sprintstatus)).append("\n");
    sb.append("    endsprint: ").append(toIndentedString(endsprint)).append("\n");
    sb.append("    unfinishedstories: ").append(toIndentedString(unfinishedstories)).append("\n");
    sb.append("    movestory: ").append(toIndentedString(movestory)).append("\n");
    sb.append("    editstory: ").append(toIndentedString(editstory)).append("\n");
    sb.append("    nextsprint: ").append(toIndentedString(nextsprint)).append("\n");
    sb.append("    deluserbody: ").append(toIndentedString(deluserbody)).append("\n");
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
