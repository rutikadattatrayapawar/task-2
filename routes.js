const express = require('express');
const router = express.Router();
const { getAllUsers, getUserById, createUser, updateUserById, deleteUserById } = require('./controllers/userController');

// GET all users
router.get('/users', getAllUsers);

// GET user by ID
router.get('/users/:id', getUserById);

// POST create a new user
router.post('/users', createUser);

// PUT update user by ID
router.put('/users/:id', updateUserById);

// DELETE user by ID
router.delete('/users/:id', deleteUserById);

module.exports = router;
