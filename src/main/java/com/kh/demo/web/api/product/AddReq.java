package com.kh.demo.web.api.product;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class AddReq {
  @NotBlank
  private String pname;   //상품명
  @NotNull
  @NotNull @Positive(message = "수량은 양수값이어야 합니다.")
  private Long count;  //수량
  @NotNull
  @NotNull @Positive(message = "단가는 양수값이어야 합니다.")
  private Long price;     //단가
}