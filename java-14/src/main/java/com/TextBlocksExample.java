package com;

public class TextBlocksExample {
    public static void main(String[] args) {
        String json = """
                {
                    "name": "John Doe",
                    "age": 30,
                    "email": "john.doe@example.com"
                }
                """;
        System.out.println(json);
        String html = """
                <html>
                    <body>
                        <h1>Hello, World!</h1>
                    </body>
                </html>
                """;
        System.out.println(html);
        String sql = """
                SELECT id, name, email
                FROM users
                WHERE age > 30
                ORDER BY name;
                """;
        System.out.println(sql);
    }
}
