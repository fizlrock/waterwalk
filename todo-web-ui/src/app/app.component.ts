import { Component, inject, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { LoginResponse, OidcSecurityService } from 'angular-auth-oidc-client';

import { MatButtonModule } from '@angular/material/button';
import { ToolbarComponent } from './app/toolbar/toolbar.component';
import { LocationComponent } from './app/location/location.component';
@Component({
  selector: 'app-root',
  imports: [RouterOutlet, MatButtonModule, ToolbarComponent, LocationComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit {

  private readonly oidcSecurityService = inject(OidcSecurityService);


  constructor() {

  }


  ngOnInit() {
    this.oidcSecurityService.checkAuth().subscribe(res => {
      if (!res.isAuthenticated)
        this.oidcSecurityService.authorize();
    });

  }


}
