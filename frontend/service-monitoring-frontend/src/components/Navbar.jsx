import { NavLink } from "react-router-dom";

function Navbar() {
  return (
    <nav style={styles.nav}>
      <NavLink to="/" style={styles.link}>
        Home
      </NavLink>
      <NavLink to="/monitoring" style={styles.link}>
        Monitoring
      </NavLink>
    </nav>
  );
}

const styles = {
  nav: {
    display: "flex",
    gap: "20px",
    padding: "16px",
    backgroundColor: "#f5f5f5"
  },
  link: {
    textDecoration: "none",
    color: "#333",
    fontWeight: "500"
  }
};

export default Navbar;
