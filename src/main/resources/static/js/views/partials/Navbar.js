export default function Navbar(props) {
    return `
        <nav>
            <a href="/static" data-link>Home</a>
            <a href="/posts" data-link>Posts</a>
            <a href="/about" data-link>About</a>
            <a href="/login" data-link>Login</a>
            <a href="/register" data-link>Register</a>
            <a href="/me" data-link>About Me</a>
        </nav>
    `;
}