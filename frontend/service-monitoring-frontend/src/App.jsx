import './App.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Navbar from './components/Navbar'
import Home from './pages/Home'
import Monitor from './pages/Monitor'
import Registration from './pages/Registration'

function App() {
  return (
    <>
      <div>
          <Navbar />
          <Routes>
             <Route path="/" element={<Home />} />
             <Route path="/monitoring" element={<Monitor />} />
             <Route path="/registration" element={<Registration />} />
          </Routes>
      </div>

    </>
  )
}

export default App
