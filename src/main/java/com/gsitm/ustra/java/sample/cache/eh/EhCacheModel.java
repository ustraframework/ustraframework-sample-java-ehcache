package com.gsitm.ustra.java.sample.cache.eh;

import java.io.Serializable;

import com.gsitm.ustra.java.management.models.base.UstraManagementBaseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class EhCacheModel extends UstraManagementBaseModel implements Serializable {

  /**
   * 그룹코드
   */
  private String grpCd;
  
  /**
   * 상세코드
   */
  private String dtlCd;

  /**
   * 코드명
   */
  private String cdNm;

  @Data
  public static class Criteria implements Serializable {
    /**
     * 사용여부
     */
    private String useYn;
  }
}
