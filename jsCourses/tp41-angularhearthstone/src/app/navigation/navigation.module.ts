import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavbarComponent } from './navbar/navbar.component';
import { BtnDisplayNavbarComponent } from './btn-display-navbar/btn-display-navbar.component';
import { DirectiveOneDirective } from './directives/directive-one.directive';
import { UppercasePipe } from './pipes/uppercase.pipe';



@NgModule({
  declarations: [NavbarComponent, BtnDisplayNavbarComponent, DirectiveOneDirective, UppercasePipe],
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
