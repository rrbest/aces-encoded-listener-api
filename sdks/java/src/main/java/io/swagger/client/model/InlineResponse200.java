/*
 * Aces Encoded Listener API
 * API Specification for Encoded Listeners that read data on a blockchain and forward transaction events to registered subscribers. 
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SubscriptionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-28T11:08:32.943-07:00")
public class InlineResponse200 {
  @SerializedName("page_size")
  private Integer pageSize = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("continuation")
  private String continuation = null;

  @SerializedName("items")
  private List<SubscriptionEvent> items = null;

  public InlineResponse200 pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public InlineResponse200 page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public InlineResponse200 continuation(String continuation) {
    this.continuation = continuation;
    return this;
  }

   /**
   * Get continuation
   * @return continuation
  **/
  @ApiModelProperty(value = "")
  public String getContinuation() {
    return continuation;
  }

  public void setContinuation(String continuation) {
    this.continuation = continuation;
  }

  public InlineResponse200 items(List<SubscriptionEvent> items) {
    this.items = items;
    return this;
  }

  public InlineResponse200 addItemsItem(SubscriptionEvent itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<SubscriptionEvent>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<SubscriptionEvent> getItems() {
    return items;
  }

  public void setItems(List<SubscriptionEvent> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.pageSize, inlineResponse200.pageSize) &&
        Objects.equals(this.page, inlineResponse200.page) &&
        Objects.equals(this.continuation, inlineResponse200.continuation) &&
        Objects.equals(this.items, inlineResponse200.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, page, continuation, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    continuation: ").append(toIndentedString(continuation)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

