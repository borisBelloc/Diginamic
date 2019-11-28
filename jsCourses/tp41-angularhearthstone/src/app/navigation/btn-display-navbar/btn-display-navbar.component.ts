import { Component, OnInit, Output, EventEmitter, Input } from '@angular/core';
import { NavbardisplayService } from '../services/navbardisplay.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-btn-display-navbar',
  templateUrl: './btn-display-navbar.component.html',
  styleUrls: ['./btn-display-navbar.component.scss']
})
export class BtnDisplayNavbarComponent implements OnInit {

  // @Output()
  // navbarDisplayChange: EventEmitter<boolean> = new EventEmitter<boolean>();

  // @Input()
  navbarDisplay: Observable<boolean>;

  // appel du service (injection)
  constructor(private navbardisplayService: NavbardisplayService) { }

  ngOnInit() {
    // permet le changement sur le string
    this.navbarDisplay = this.navbardisplayService.onChangeDisplay();
  }

  toggleDisplay() {
    // this.navbarDisplay = !this.navbarDisplay;
    // this.navbarDisplayChange.emit(this.navbarDisplay);
    this.navbardisplayService.toggleDisplay();
  }
}
