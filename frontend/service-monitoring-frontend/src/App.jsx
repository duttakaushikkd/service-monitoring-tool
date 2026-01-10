import './App.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Navbar from './components/Navbar'
import Home from './pages/Home'
import Monitor from './pages/Monitor'

function App() {
  return (
    <>
      <div>
        <BrowserRouter>
          <Navbar />
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/status" element={<Monitor />} />
          </Routes>
        </BrowserRouter>
      </div>

    </>
  )
}

export default App
