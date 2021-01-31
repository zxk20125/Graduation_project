package cn.zxk.entity.utilEntity;

import lombok.Data;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Data
public class QueryEntity<T> {

//  @ApiModelProperty(value = "页码")
  private int pageNum;
//  @ApiModelProperty(value = "每页结果条数")
  private int pageSize;
//  @ApiModelProperty(value = "请求参数，VO对象或者String")
  private T query;
//  @ApiModelProperty(value = "范围查询")
  private List<Range> ranges;
//  @ApiModelProperty(value = "排序")
  private List<Order> orders;

  @Data
  public static class Order {
//    @ApiModelProperty(value = "排序字段")
    private String key;
//    @ApiModelProperty(value = "升序（ASC）或降序（DESC）")
    private String order;
  }

//  @ApiModelProperty(hidden = true)


}
