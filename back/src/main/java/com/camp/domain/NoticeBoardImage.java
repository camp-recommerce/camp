package com.camp.domain;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NoticeBoardImage {

    private String fileName;

    private int ord;

    public void setOrd(int ord){
        this.ord = ord;
    }

}