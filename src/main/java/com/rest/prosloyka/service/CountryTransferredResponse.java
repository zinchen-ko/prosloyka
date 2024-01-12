package com.rest.prosloyka.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "", propOrder = "transferred"
)
@XmlRootElement(name = "getTranferredResponse")
public class CountryTransferredResponse {
    Long transferred;
}
