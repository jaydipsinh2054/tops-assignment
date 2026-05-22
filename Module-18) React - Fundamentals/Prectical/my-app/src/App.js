//question 1:
// function App() {
//   return (
//     <div>
//       {/*q1. Set up a new React.js project using create-react-app.
// o Create a basic component that displays "Hello, React!" on the web page.
//   */}
//       <h1>Hello, React!</h1>
//     </div>
//   );
// }
// export default App;

//question 2:
// function App() {
//   const message = "JSX allows writing HTML-like code inside JavaScript.";
//   return (
//     <div>
//       {/*q2. Create a React component that renders the following JSX elements:
//  A heading with the text "Welcome to JSX".
//  A paragraph explaining JSX with dynamic data (use curly braces to insert
// variables). */}
//       <h1>Welcome to JSX</h1>
//       <p>{message}</p>
//     </div>
//   );
// }
// export default App;


//question 3:
// import { Component } from "react";
// // Functional Component
// function Greeting(props) {
//   return <h1>Hello, {props.name}!</h1>;
// }
// // Class Component
// class WelcomeMessage extends Component {
//   render() {
//     return <h1>Welcome to React!</h1>;
//   }
// }
// function App() {
//   return (
//     <div>
//       <Greeting name="Rahul" />
//       <WelcomeMessage />
//     </div>
//   );
// }
// export default App;

//question 4:
//import React, { useState } from "react";
//Task 1: UserCard Component
// function UserCard(props) {
//   return (
//     <div
//       style={{
//         border: "1px solid black",
//         padding: "10px",
//         width: "250px",
//         marginBottom: "20px",
//       }}
//     >
//       <h2>{props.name}</h2>
//       <p>Age: {props.age}</p>
//       <p>Location: {props.location}</p>
//     </div>
//   );
// }
//Task 2: Counter Component
// function Counter() {
//   const [count, setCount] = useState(0);
//   return (
//     <div>
//       <h2>Count: {count}</h2>
//       <button onClick={() => setCount(count + 1)}>
//         Increment
//       </button>
//     </div>
//   );
// }
//Main App Component
// function App() {
//   return (
//     <div>
//       <UserCard
//         name="Rahul"
//         age="22"
//         location="Surat"
//       />
//       <Counter />
//     </div>
//   );
// }
// export default App;

//question 5:
// import { useState } from "react";
// function App() {
// // Task 1 State
//   const [text, setText] = useState("Not Clicked");
//   // Task 2 State
//   const [inputValue, setInputValue] = useState("");
//   return (
//     <div style={{ padding: "20px" }}>
//       {/* Task 1 */}
//       <h2>{text}</h2>
//       <button onClick={() => setText("Clicked!")}>
//         Click Me
//       </button>
//       <hr />
//       {/* Task 2 */}
//       <h2>React Form</h2>
//       <input
//         type="text"
//         placeholder="Type something..."
//         value={inputValue}
//         onChange={(e) => setInputValue(e.target.value)}
//       />
//       <p>You typed: {inputValue}</p>
//     </div>
//   );
// }
// export default App;

//queston 6:
// import { useState } from "react";
// function App() {
//   // Task 1: Login Status
//   const [isLoggedIn, setIsLoggedIn] = useState(false);
//   // Task 2: Age
//   const age = 20;
//   return (
//     <div style={{ padding: "20px" }}>
//       {/* Task 1 */}
//       <h2>
//         {isLoggedIn ? "User Logged In" : "User Logged Out"}
//       </h2>
//       <button onClick={() => setIsLoggedIn(!isLoggedIn)}>
//         {isLoggedIn ? "Logout" : "Login"}
//       </button>
//       <hr />
//       {/* Task 2 */}
//       <h2>Voting Eligibility</h2>
//       {
//         age >= 18
//           ? <p>You are eligible to vote.</p>
//           : <p>You are not eligible to vote.</p>
//       }
//     </div>
//   );
// }
// export default App;

//question 7:
// function App() {
//   // Task 1: Fruit List
//   const fruits = ["Apple", "Banana", "Mango", "Orange"];
//   // Task 2: User List
//   const users = [
//     { id: 1, name: "Rahul" },
//     { id: 2, name: "Amit" },
//     { id: 3, name: "Priya" }
//   ];
//   return (
//     <div style={{ padding: "20px" }}>
//       {/* Task 1 */}
//       <h2>Fruit List</h2>
//       <ul>
//         {fruits.map((fruit, index) => (
//           <li key={index}>{fruit}</li>
//         ))}
//       </ul>
//       <hr />
//       {/* Task 2 */}
//       <h2>User List</h2>
//       <ul>
//         {users.map((user) => (
//           <li key={user.id}>
//             {user.name}
//           </li>
//         ))}
//       </ul>
//     </div>
//   );
// }
// export default App;

//question 8:
// import { useState } from "react";
// function App() {
//   // Form State
//   const [formData, setFormData] = useState({
//     name: "",
//     email: "",
//     password: ""
//   });
//   // Error State
//   const [error, setError] = useState("");
//   // Handle Input Change
//   const handleChange = (e) => {
//     setFormData({
//       ...formData,
//       [e.target.name]: e.target.value
//     });
//   };
//   // Handle Form Submit
//   const handleSubmit = (e) => {
//     e.preventDefault();
//     // Email Validation
//     const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
//     if (!emailPattern.test(formData.email)) {
//       setError("Please enter a valid email address.");
//       return;
//     }
//     setError("");
//     alert(
//       `Name: ${formData.name}
// Email: ${formData.email}
// Password: ${formData.password}`
//     );
//   };
//   return (
//     <div style={{ padding: "20px" }}>
//       <h2>React Form</h2>
//       <form onSubmit={handleSubmit}>
//         <div>
//           <label>Name:</label><br />
//           <input
//             type="text"
//             name="name"
//             value={formData.name}
//             onChange={handleChange}
//           />
//         </div>
//         <br />
//         <div>
//           <label>Email:</label><br />
//           <input
//             type="text"
//             name="email"
//             value={formData.email}
//             onChange={handleChange}
//           />
//         </div>
//         <br />
//         <div>
//           <label>Password:</label><br />
//           <input
//             type="password"
//             name="password"
//             value={formData.password}
//             onChange={handleChange}
//           />
//         </div>
//         <br />
//         {error && <p style={{ color: "red" }}>{error}</p>}
//         <button type="submit">
//           Submit
//         </button>
//       </form>
//     </div>
//   );
// }
// export default App;

//question 9:
// import { Component } from "react";
// // Task 1 & Task 2 Class Component
// class App extends Component {
//   constructor(props) {
//     super(props);
//     this.state = {
//       users: [],
//       count: 0
//     };
//   }
//   // Task 1: Fetch Data
//   componentDidMount() {
//     console.log("Component Mounted");
//     fetch("https://jsonplaceholder.typicode.com/users")
//       .then((response) => response.json())
//       .then((data) => {
//         this.setState({ users: data });
//       });
//   }
//   // Task 2: Component Update
//   componentDidUpdate() {
//     console.log("Component Updated");
//   }
//   // Task 2: Component Unmount
//   componentWillUnmount() {
//     console.log("Component Unmounted");
//   }
//   render() {
//     return (
//       <div style={{ padding: "20px" }}>
//         <h2>User List</h2>
//         <ul>
//           {this.state.users.map((user) => (
//             <li key={user.id}>
//               {user.name}
//             </li>
//           ))}
//         </ul>
//         <hr />
//         <h2>Counter: {this.state.count}</h2>
//         <button
//           onClick={() =>
//             this.setState({ count: this.state.count + 1 })
//           }
//         >
//           Update Count
//         </button>
//       </div>
//     );
//   }
// }
// export default App;

//question 10:
//Task 1: Counter using useState()
// import { useState } from "react";
// function Counter() {
//   const [count, setCount] = useState(0);
//   return (
//     <div>
//       <h2>Count: {count}</h2>
//       <button onClick={() => setCount(count + 1)}>
//         Increment
//       </button>
//       <button onClick={() => setCount(count - 1)}>
//         Decrement
//       </button>
//     </div>
//   );
// }
// export default Counter;

//Task 2: Fetch API Data using useEffect()
// import { useEffect, useState } from "react";
// function FetchData() {
//   const [users, setUsers] = useState([]);
//   useEffect(() => {
//     fetch("https://jsonplaceholder.typicode.com/users")
//       .then((res) => res.json())
//       .then((data) => setUsers(data));
//   }, []);
//   return (
//     <div>
//       <h2>User List</h2>
//       <ul>
//         {users.map((user) => (
//           <li key={user.id}>
//             {user.name}
//           </li>
//         ))}
//       </ul>
//     </div>
//   );
// }
// export default FetchData;

//Task 3: React App using useSelector & useDispatch
// import { useDispatch, useSelector } from "react-redux";
// import { decrement, increment } from "./store";
// function App() {
//   const count = useSelector((state) => state.counter.value);
//   const dispatch = useDispatch();
//   return (
//     <div>
//       <h2>Redux Counter: {count}</h2>
//       <button onClick={() => dispatch(increment())}>
//         Increment
//       </button>
//       <button onClick={() => dispatch(decrement())}>
//         Decrement
//       </button>
//     </div>
//   );
// }
// export default App;

//Task 4: Avoid Re-renders using useRef()
// import { useRef, useState } from "react";
// function App() {
//   const renderCount = useRef(0);
//   const [count, setCount] = useState(0);
//   renderCount.current++;
//   return (
//     <div>
//       <h2>Counter: {count}</h2>
//       <button onClick={() => setCount(count + 1)}>
//         Increment
//       </button>
//       <h3>Render Count: {renderCount.current}</h3>
//     </div>
//   );
// }
// export default App;

// question 11:
// import {
//   BrowserRouter,
//   Link,
//   Route,
//   Routes
// } from "react-router-dom";
// // Home Component
// function Home() {
//   return <h2>Home Page</h2>;
// }
// // About Component
// function About() {
//   return <h2>About Page</h2>;
// }
// // Contact Component
// function Contact() {
//   return <h2>Contact Page</h2>;
// }
// function App() {
//   return (
//     <BrowserRouter>
//       {/* Navigation Bar */}
//       <nav style={{ marginBottom: "20px" }}>
//         <Link to="/">Home</Link> |{" "}
//         <Link to="/about">About</Link> |{" "}
//         <Link to="/contact">Contact</Link>
//       </nav>
//       {/* Routes */}
//       <Routes>
//         <Route path="/" element={<Home />} />
//         <Route path="/about" element={<About />} />
//         <Route path="/contact" element={<Contact />} />
//       </Routes>
//     </BrowserRouter>
//   );
// }
// export default App;

// question 12:
// task 1:
// import { useEffect, useState } from "react";
// function App() {
//   const [users, setUsers] = useState([]);
//   const [loading, setLoading] = useState(true);
//   const [error, setError] = useState("");
//   useEffect(() => {
//     fetch("https://jsonplaceholder.typicode.com/users")
//       .then((res) => {
//         if (!res.ok) {
//           throw new Error("Failed to fetch data");
//         }
//         return res.json();
//       })
//       .then((data) => {
//         setUsers(data);
//         setLoading(false);
//       })
//       .catch((err) => {
//         setError(err.message);
//         setLoading(false);
//       });
//   }, []);
//   // Loading State
//   if (loading) {
//     return <h2>Loading...</h2>;
//   }
//   // Error State
//   if (error) {
//     return <h2>{error}</h2>;
//   }
//   return (
//     <div style={{ padding: "20px" }}>
//       <h2>User Table</h2>
//       <table border="1" cellPadding="10">
//         <thead>
//           <tr>
//             <th>ID</th>
//             <th>Name</th>
//             <th>Email</th>
//           </tr>
//         </thead>
//         <tbody>
//           {users.map((user) => (
//             <tr key={user.id}>
//               <td>{user.id}</td>
//               <td>{user.name}</td>
//               <td>{user.email}</td>
//             </tr>
//           ))}
//         </tbody>
//       </table>
//     </div>
//   );
// }
// export default App;

//task 2:
//start json server
// import { useEffect, useState } from "react";
// function App() {
//   const [users, setUsers] = useState([]);
//   const [name, setName] = useState("");
//   // READ (GET)
//   const fetchUsers = () => {
//     fetch("http://localhost:3001/users")
//       .then((res) => res.json())
//       .then((data) => setUsers(data));
//   };
//   useEffect(() => {
//     fetchUsers();
//   }, []);
//   // CREATE (POST)
//   const addUser = () => {
//     fetch("http://localhost:3001/users", {
//       method: "POST",
//       headers: {
//         "Content-Type": "application/json",
//       },
//       body: JSON.stringify({
//         name: name,
//       }),
//     })
//       .then((res) => res.json())
//       .then(() => {
//         fetchUsers();
//         setName("");
//       });
//   };
//   // UPDATE (PUT)
//   const updateUser = (id) => {
//     fetch(`http://localhost:3001/users/${id}`, {
//       method: "PUT",
//       headers: {
//         "Content-Type": "application/json",
//       },
//       body: JSON.stringify({
//         id: id,
//         name: "Updated User",
//       }),
//     })
//       .then((res) => res.json())
//       .then(() => fetchUsers());
//   };
//   // DELETE
//   const deleteUser = (id) => {
//     fetch(`http://localhost:3001/users/${id}`, {
//       method: "DELETE",
//     })
//       .then(() => fetchUsers());
//   };
//   return (
//     <div style={{ padding: "20px" }}>
//       <h2>CRUD Operations</h2>
//       {/* Input */}
//       <input
//         type="text"
//         placeholder="Enter Name"
//         value={name}
//         onChange={(e) => setName(e.target.value)}
//       />
//       <button onClick={addUser}>
//         Add User
//       </button>
//       <hr />
//       {/* User List */}
//       <ul>
//         {users.map((user) => (
//           <li key={user.id}>
//             {user.name}
//             <button onClick={() => updateUser(user.id)}>
//               Update
//             </button>
//             <button onClick={() => deleteUser(user.id)}>
//               Delete
//             </button>
//           </li>
//         ))}
//       </ul>
//     </div>
//   );
// }
// export default App;

//task 3:
// import { useEffect, useState } from "react";
// function App() {
//   // State Variables
//   const [users, setUsers] = useState([]);
//   const [loading, setLoading] = useState(true);
//   const [error, setError] = useState("");
//   // Fetch API Data
//   useEffect(() => {
//     fetch("https://jsonplaceholder.typicode.com/users")
//       .then((response) => {
//         // Check for errors
//         if (!response.ok) {
//           throw new Error("Failed to fetch data");
//         }
//         return response.json();
//       })
//       .then((data) => {
//         // Store data
//         setUsers(data);
//         // Stop loading
//         setLoading(false);
//       })
//       .catch((err) => {
//         // Store error message
//         setError(err.message);
//         // Stop loading
//         setLoading(false);
//       });
//   }, []);
//   // Loading State
//   if (loading) {
//     return (
//       <div style={{ padding: "20px" }}>
//         <h2>Loading...</h2>
//       </div>
//     );
//   }
//   // Error State
//   if (error) {
//     return (
//       <div style={{ padding: "20px" }}>
//         <h2>{error}</h2>
//       </div>
//     );
//   }
//   // Display Data
//   return (
//     <div style={{ padding: "20px" }}>
//       <h2>User List</h2>
//       <table border="1" cellPadding="10">
//         <thead>
//           <tr>
//             <th>ID</th>
//             <th>Name</th>
//             <th>Email</th>
//           </tr>
//         </thead>
//         <tbody>
//           {users.map((user) => (
//             <tr key={user.id}>
//               <td>{user.id}</td>
//               <td>{user.name}</td>
//               <td>{user.email}</td>
//             </tr>
//           ))}
//         </tbody>
//       </table>
//     </div>
//   );
// }
// export default App;


//question 13:
// import {
//   createContext,
//   useContext,
//   useState
// } from "react";
// // Create Context
// const AppContext = createContext();
// // Theme Component
// function ThemeComponent() {
//   const { theme, toggleTheme } = useContext(AppContext);
//   return (
//     <div
//       style={{
//         backgroundColor:
//           theme === "light" ? "white" : "black",
//         color:
//           theme === "light" ? "black" : "white",
//         padding: "20px",
//         marginBottom: "20px"
//       }}
//     >
//       <h2>{theme.toUpperCase()} MODE</h2>
//       <button onClick={toggleTheme}>
//         Toggle Theme
//       </button>
//     </div>
//   );
// }
// // Authentication Component
// function AuthComponent() {
//   const { isLoggedIn, login, logout } =
//     useContext(AppContext);
//   return (
//     <div>
//       {
//         isLoggedIn
//           ? <h2>Welcome User!</h2>
//           : <h2>Please Login</h2>
//       }
//       {
//         isLoggedIn
//           ? (
//             <button onClick={logout}>
//               Logout
//             </button>
//           )
//           : (
//             <button onClick={login}>
//               Login
//             </button>
//           )
//       }
//     </div>
//   );
// }
// // Main App Component
// function App() {
//   // Theme State
//   const [theme, setTheme] = useState("light");
//   // Authentication State
//   const [isLoggedIn, setIsLoggedIn] =
//     useState(false);
//   // Toggle Theme Function
//   const toggleTheme = () => {
//     setTheme(
//       theme === "light"
//         ? "dark"
//         : "light"
//     );
//   };
//   // Login Function
//   const login = () => {
//     setIsLoggedIn(true);
//   };
//   // Logout Function
//   const logout = () => {
//     setIsLoggedIn(false);
//   };
//   return (
//     <AppContext.Provider
//       value={{
//         theme,
//         toggleTheme,
//         isLoggedIn,
//         login,
//         logout
//       }}
//     >
//       <div style={{ padding: "20px" }}>
//         <ThemeComponent />
//         <hr />
//         <AuthComponent />
//       </div>
//     </AppContext.Provider>
//   );
// }
// export default App;

//question 14: task 2
