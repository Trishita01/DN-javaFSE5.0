import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat", score: 90 },
        { name: "Rohit", score: 65 },
        { name: "Gill", score: 78 },
        { name: "Rahul", score: 45 },
        { name: "Hardik", score: 82 },
        { name: "Jadeja", score: 69 },
        { name: "Surya", score: 88 },
        { name: "Pant", score: 55 },
        { name: "Shami", score: 71 },
        { name: "Bumrah", score: 60 },
        { name: "Siraj", score: 75 }
    ];

    const below70 = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            {players.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}

            <h2>Players with Score Below 70</h2>

            {below70.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}
        </div>
    );
}

export default ListofPlayers;