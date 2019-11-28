import { Component, OnInit, Input } from '@angular/core';
import { NavbardisplayService } from '../services/navbardisplay.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss'],
})
export class NavbarComponent implements OnInit {

  isCollapsed = true;
  title: string;
  logo: string;

  navbarDisplay: Observable<boolean>;

  // @Input()
  // navbarDisplay: boolean;

  // appel du service (injection)
  constructor(private navbardisplayService: NavbardisplayService) {
    this.title = 'bb`';
    this.logo = 'assets/img/favicon-32x32.png';
  }

  ngOnInit() {
    this.navbarDisplay = this.navbardisplayService.onChangeDisplay();
  }

}
