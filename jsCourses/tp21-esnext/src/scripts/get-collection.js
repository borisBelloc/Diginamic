import { HearthstoneApi } from './api.js';

const hearthstoneApi = new HearthstoneApi();


/** Obtenir card avec un set et un nom definis */
export function getCards(setName, className) {
  return Promise.all([
    hearthstoneApi.set(setName),
    hearthstoneApi.classes(className),
  ]).then(([setsCards, classesCards]) => {
    console.log("Toutes les cartes ", setName, " ou ", className, " : ", setsCards, classesCards );
  // code ci-dessous en une ligne :
  // setsCards.filter(setCard => classesCards.find((classCard) => compareCard(setCard, classCard)))
    const monTableauFinnal = setsCards.filter(setCard => {
      const found = classesCards.find((classCard) => {
        const compare = compareCard(setCard, classCard);
        return compare;
      });
      return found;
    });
    return monTableauFinnal;
  });
}
/**
 * Return true if same cardId
 * @param {Card} card1 
 * @param {Card} card2 
 * @returns {boolean} is same id?
 */
function compareCard (card1, card2) {
  return card1.cardId === card2.cardId;
}
