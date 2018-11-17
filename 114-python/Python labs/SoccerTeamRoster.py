ROSTER = {}
player1 = input("Enter player 1's jersey number: \n")
player1rate = input("Enter player 1's rating: \n")
print()
player2 = input("Enter player 2's jersey number: \n")
player2rate = input("Enter player 2's rating: \n")
print()
player3 = input("Enter player 3's jersey number: \n")
player3rate = input("Enter player 3's rating: \n")
print()
player4 = input("Enter player 4's jersey number: \n")
player4rate = input("Enter player 4's rating: \n")
print()
player5 = input("Enter player 5's jersey number: \n")
player5rate = input("Enter player 5's rating: \n\n")
player_jerseys = []
ROSTER[int(player1)] = player1rate
ROSTER[int(player2)] = player2rate
ROSTER[int(player3)] = player3rate
ROSTER[int(player4)] = player4rate
ROSTER[int(player5)] = player5rate
print("ROSTER")
for players in ROSTER:
    player_jerseys.append(players)
    
player_jerseys.sort()
for players in sorted(player_jerseys):
    print("Jersey number: " + str(players)+',', "Rating: " + str(ROSTER[players]))  
print()
menuOp = ''
while menuOp != 'q':
    
    menu = '''MENU
a - Add player
d - Remove player
u - Update player rating
r - Output players above a rating
o - Output roster
q - Quit
\nChoose an option: '''
    print(menu)
    menuOp = input()
        
    if menuOp == 'o':
        print("\nROSTER")
        for players in sorted(player_jerseys):
            print("Jersey number: " + str(players)+',', "Rating: " + str(ROSTER[players]))
        print()
            
    elif menuOp == 'a':
        jersey_num = input("Enter a new player's jersey number:")
        player_rating = input("Enter the player's rating:")
        ROSTER[int(jersey_num)] = player_rating
        player_jerseys.append(int(jersey_num))
        print()
        
    elif menuOp == 'd':
        delete = int(input("Enter a jersey number:"))
        if delete in ROSTER:
            del ROSTER[delete]
            player_jerseys.remove(delete)
        
    elif menuOp == 'u':
        jersey_num = int(input("Enter a jersey number:"))
        new_rating = int(input("Enter a new rating for player:"))
        for i in ROSTER:
            if i == jersey_num:
                ROSTER[i] = new_rating
                
    elif menuOp == 'r':
        rating = int(input("Enter a rating:\n\n"))
        print("ABOVE", rating)
        for i, x in ROSTER.items():
            if int(x) > rating:
                print("Jersey number: " + str(i) +",", "Rating: " + x)
        print()
        
    
  #for players in sorted(player_jerseys):
   #         print("Jersey number: " + str(players)+',', "Rating: " + str(ROSTER[players]))