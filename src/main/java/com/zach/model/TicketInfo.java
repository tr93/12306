package com.zach.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author : zw35
 */
@Data
@Builder
public class TicketInfo {

    private String from;

    private String to;

    private String date;

    private String trainNumber;

    private Boolean isHighDan;
    private Boolean isStudentDan;

    private String[] level;

    private String[] passenger;

}
