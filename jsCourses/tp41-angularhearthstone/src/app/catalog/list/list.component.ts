import { Component, OnInit } from '@angular/core';
import { Subscriber } from 'rxjs';
import { CardsService } from '../cards.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {

  cards = [
    {
      cardId: 1,
      name: 'card 1'
    },
    {
      cardId: 2,
      name: 'card 2'
    },
    {
      cardId: 3,
      name: 'card 3'
    },

  ];

  constructor(private cardsService: CardsService) { }

  ngOnInit() {
    this.cardsService.getcards('Basic').subscribe(
      cards => {
        console.log(cards);
      });
  }
}



