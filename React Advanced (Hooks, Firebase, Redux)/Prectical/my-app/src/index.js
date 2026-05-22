// import ReactDOM from "react-dom/client";
// import App from "./App";

// import { Provider } from "react-redux";
// import store from "./store";

// const root = ReactDOM.createRoot(
//   document.getElementById("root")
// );

// root.render(
//   <Provider store={store}>
//     <App />
//   </Provider>
// );

//task 1 question 14
// import ReactDOM from "react-dom/client";
// import { Provider } from "react-redux";
// import counterStore from "./counterStore";
// import CounterApp from "./CounterApp";

// const root = ReactDOM.createRoot(
//   document.getElementById("root")
// );

// root.render(
//   <Provider store={counterStore}>
//     <CounterApp />
//   </Provider>
// );

//task3 question 14:
import ReactDOM from "react-dom/client";
import { Provider } from "react-redux";
import CrudApp from "./CrudApp";
import userStore from "./userStore";
const root = ReactDOM.createRoot(
  document.getElementById("root")
);
root.render(
  <Provider store={userStore}>
    <CrudApp />
  </Provider>
);


// import { RecoilRoot } from "recoil";

// import TodoApp from "./TodoApp";

// function App() {

//   return (
//     <RecoilRoot>
//       <TodoApp />
//     </RecoilRoot>
//   );
// }

// export default App;