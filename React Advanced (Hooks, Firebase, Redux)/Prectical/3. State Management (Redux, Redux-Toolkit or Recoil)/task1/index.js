import React from "react";
import ReactDOM from "react-dom/client";

import { Provider } from "react-redux";

import counterStore from "./redux/counterStore";

import CounterApp from "./components/CounterApp";

const root = ReactDOM.createRoot(
  document.getElementById("root")
);

root.render(
  <Provider store={counterStore}>
    <CounterApp />
  </Provider>
);