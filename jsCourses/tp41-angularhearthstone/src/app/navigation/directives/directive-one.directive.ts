import { Directive, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appDirectiveOne]'
})
export class DirectiveOneDirective {

  // Ajoute une class lorsque boolean == true
  @HostBinding('class.show') show: boolean;

  // surveille le scroll sur la page
  @HostListener('window:scroll', ['$event'])
  onWindowScroll(event) {
    console.log('Scrolling...', event.target.documentElement.scrollTop);
    // console.log('Scrolling...');
    if (event.target.documentElement.scrollTop > 264) {
      this.show = true;
    } else {
      this.show = false;
    }
  }

  constructor() {
    console.log('->Constructor of DirectiveOne');
  }


}
