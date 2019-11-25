import { HearthstoneApi } from "./scripts/api.js";

import { SetType } from "./settype.js";
import { ClassType } from "./classtype.js";

const hearthstoneApi = new HearthstoneApi();

// hearthstoneApi.info().then((allInfo) => {
//     console.log(allInfo.sets);
//     console.log(allInfo.classes);
// });

// console.log(SetType);
let type1 = new SetType("Basic");
console.log("BASIC HERE :", type1);

// console.log(ClassType);
let class1 = new ClassType("Druid");
console.log("DRUID HERE :", class1);

let myTabSet = [];

hearthstoneApi.info().then(allInfo => {
  // w/ forEach
  allInfo.sets.forEach(element => {
    myTabSet.push(new SetType(element));
  });
  console.log("MY TAB SET : ", myTabSet);

    // w/ map
  let myTabClasses = allInfo.classes.map(e => new ClassType(e));
  // console.log("MAP ICI : ", allClasses);
  console.log("MY TAB CLASS : ", myTabClasses);

  // Promesse
  // hearthstoneApi.set("Basic")
  //   .then(allBasic => {
  //     console.log("ALL BASIC : ", allBasic);
  //     return "toto";
  //   })
  //   .then(res => {
  //     console.log("RES :", res);
  //   });



  
});
