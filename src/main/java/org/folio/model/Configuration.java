package org.folio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Configuration {
    private String okapiUrl;
    private String tenant;
    private String centralTenant;
    private String username;
    private String password;
}