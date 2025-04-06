import { Component, inject, OnInit } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { OidcSecurityService, UserDataResult } from 'angular-auth-oidc-client';

import { MatIconModule } from '@angular/material/icon';


@Component({
  selector: 'app-toolbar',
  imports: [MatButtonModule, MatIconModule],
  templateUrl: './toolbar.component.html',
  styleUrl: './toolbar.component.scss'
})
export class ToolbarComponent implements OnInit {

  private readonly oidcSecurityService = inject(OidcSecurityService);

  protected username: string = "none";

  ngOnInit(): void {
    let userdata = this.oidcSecurityService.userData().userData
    this.username = userdata.preferred_username;
  }




  logout() {
    this.oidcSecurityService.logoff().subscribe((result) => console.log(result));
  }


}
