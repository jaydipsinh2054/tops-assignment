import {
    configureStore,
    createSlice
} from "@reduxjs/toolkit";

const userSlice = createSlice({

  name: "users",

  initialState: [],

  reducers: {

    addUser: (state, action) => {
      state.push(action.payload);
    },

    deleteUser: (state, action) => {
      return state.filter(
        (user) => user.id !== action.payload
      );
    },

    updateUser: (state, action) => {

      const user = state.find(
        (u) => u.id === action.payload.id
      );

      if (user) {
        user.name = action.payload.name;
      }
    }

  }
});

export const {
  addUser,
  deleteUser,
  updateUser
} = userSlice.actions;

const userStore = configureStore({
  reducer: {
    users: userSlice.reducer
  }
});

export default userStore;