import { Component, OnInit } from '@angular/core';
import { Subscriber, Observable } from 'rxjs';
import { CardsService } from '../cards.service';
import { CardInterface } from '../interface/card.interface';
import { NgForm } from '@angular/forms';

@Component({
  selector: "app-list",
  templateUrl: "./list.component.html",
  styleUrls: ["./list.component.scss"]
})
export class ListComponent implements OnInit {
  // cards = [
  //   {
  //     cardId: 1,
  //     name: 'card 1'
  //   },
  //   {
  //     cardId: 2,
  //     name: 'card 2'
  //   },
  //   {
  //     cardId: 3,
  //     name: 'card 3'
  //   },

  // ];

  constructor(private cardsService: CardsService) { }

  // N'importe quel type mais en tableau
  cards$: Observable<CardInterface[]>;

  submit(monForm: NgForm) {
    // console.log('Le formulaire : ', monForm.valid);
    console.log('Le formulaire : ', monForm);
  }

  ngOnInit() {
    // affichage en console.log()
    // this.cardsService.getcards('Basic').subscribe(
    //   cards$ => {
    //     console.log(cards$);
    //   });

    this.cards$ = this.cardsService.getcards('Basic');
  }
}



