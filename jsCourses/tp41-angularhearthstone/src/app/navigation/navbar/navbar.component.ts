import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss'],
})
export class NavbarComponent implements OnInit {

  isCollapsed = true;
  title: string;
  logo: string;

  @Input()
  navbarDisplay: boolean;

  constructor() {
    this.title = 'bb`';
    this.logo = 'assets/img/favicon-32x32.png';
  }

  ngOnInit() {
  }

}
