//question 1:
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

// question 2:
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

//question 14: task 2
