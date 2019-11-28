import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {

  cards = [
    {
      cardId: 1,
      name: 'test'
    },
    {
      cardId: 2,
      name: 'test'
    },
    {
      cardId: 3,
      name: 'test'
    },

  ];

  constructor() { }

  ngOnInit() {
  }



}
