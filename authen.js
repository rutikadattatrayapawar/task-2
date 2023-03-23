const express = require('express');
const router = express.Router();
const { getAllUsers, getUserById, createUser, updateUserById, deleteUserById } = require('./controllers/userController');
const { authenticate } = require('./middleware/authMiddleware');

// GET all users
router.get('/users', authenticate, getAllUsers);

// GET user by ID
router.get('/users/:id', authenticate, getUserById);

// POST create a new user
router.post('/users', createUser);

// PUT update user by ID
router.put('/users/:id', authenticate, updateUserById);

// DELETE user by ID
router.delete('/users/:id', authenticate, deleteUserById);

module.exports = router;
