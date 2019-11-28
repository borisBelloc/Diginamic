import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavbarComponent } from './navbar/navbar.component';
import { BtnDisplayNavbarComponent } from './btn-display-navbar/btn-display-navbar.component';
import { DirectiveOneDirective } from './directives/directive-one.directive';



@NgModule({
  declarations: [NavbarComponent, BtnDisplayNavbarComponent, DirectiveOneDirective],
  exports : [
    NavbarComponent,
    BtnDisplayNavbarComponent,
    DirectiveOneDirective
  ],
  imports: [
    CommonModule
  ]
})
export class NavigationModule { }
