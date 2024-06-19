use airplanner;

-- user
delete from board;
delete from plan;
delete from planner;
delete from review;
delete from airplanner.user;
insert into user (user_id, user_password, user_name, user_nickname, user_email, user_tel, user_role) values ("모험가", "모험가", "모험가", "모험가", "모험가", "010-8765-4321", 0);
insert into user (user_id, user_password, user_name, user_nickname, user_email, user_tel, user_role) values ("여행지기", "여행지기", "여행지기", "여행지기", "여행지기", "010-8765-4321", 0);
insert into user (user_id, user_password, user_name, user_nickname, user_email, user_tel, user_role) values ("TravelGuru", "TravelGuru", "TravelGuru", "TravelGuru", "TravelGuru", "010-8765-4321", 0);
insert into user (user_id, user_password, user_name, user_nickname, user_email, user_tel, user_role) values ("JourneyJunkie", "JourneyJunkie", "JourneyJunkie", "JourneyJunkie", "010-8765-4321", "JourneyJunkie", 0);
insert into user (user_id, user_password, user_name, user_nickname, user_email, user_tel, user_role) values ("바람따라", "바람따라", "바람따라", "바람따라", "바람따라", "010-8765-4321", 0);
insert into user (user_id, user_password, user_name, user_nickname, user_email, user_tel, user_role) values ("방랑자", "방랑자", "방랑자", "방랑자", "방랑자", "010-8765-4321", 0);
insert into user (user_id, user_password, user_name, user_nickname, user_email, user_tel, user_role) values ("Dumb", "Dumb", "Dumb", "Dumb", "Dumb", "010-8765-4321", 0);
insert into user (user_id, user_password, user_name, user_nickname, user_email, user_tel, user_role) values ("HelloAir", "HelloAir123!", "HelloAir", "HelloAir", "Air@ssafy.com", "010-1234-5678", 0);
insert into user (user_id, user_password, user_name, user_nickname, user_email, user_tel, user_role) values ("Admin", "Admin", "Admin", "Admin", "Admin@ssafy.com", "010-8765-4321", 1);

-- board
ALTER TABLE board AUTO_INCREMENT = 1;
insert into board (board_title, board_content, board_category, board_admin_id) values ("Planner Service 업데이트 안내", "Planner UI를 일부 변경했습니다.", "notice", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("개인정보 처리방침 안내", "개인정보 처리방침 안내 공지사항 입니다.", "notice", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("Planner 정보처리 정책 안내", "Planner 정보처리 정책 안내 공지사항 입니다.", "notice", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("AirPlanner 운영정책 안내", "운영정책 안내 공지사항 입니다.", "notice", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("개인정보 처리방침 안내", "개인정보 처리방침 안내 공지사항 입니다.", "notice", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("개인정보 처리방침 안내", "개인정보 처리방침 안내 공지사항 입니다.", "notice", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("AirPlanner 운영정책 안내", "운영정책 안내 공지사항 입니다.", "notice", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("ChatGPT 활용 제목 추천 서비스 추가 안내", 
'안녕하세요. AirPlanner 관리자입니다. 
Planner 제목을 정하기 어려우신 사용자분들을 위해 ChatGPT를 활용한 제목 추천 서비스를 추가하였습니다. 

Planner의 제목을 짓기 힘든 경우 Planner board 상단의 "플래너 제목 추천!" 버튼을 클릭하면 다양한 제목을 추천받을 수 있습니다. 

만약 추천받은 제목이 마음에 들지 않는 경우, "다시 만들어봐.." 버튼을 클릭하면 다른 제목을 제시합니다. 
마음에 드는 제목을 발견한 경우 "맘에 든다!" 버튼을 클릭하면 자동으로 제목에 내용이 담깁니다. 

감사합니다.', "notice", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("ChatGPT 활용 동선 추천 서비스 추가 안내", "운영정책 안내 공지사항 입니다.", "notice", "Admin");

insert into board (board_title, board_content, board_category, board_admin_id) values ("개인정보 수정을 어떻게 할 수 있나요?", "question 입니다.", "question", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("제가 작성한 리뷰는 어떻게 확인할 수 있나요?", "question 입니다.", "question", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("제가 작성한 리뷰는 어떻게 삭제할 수 있나요?", "question 입니다.", "question", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("Main page HotLocal 기준이 무엇인가요?", "question 입니다.", "question", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("Main page HotPlanner 기준이 무엇인가요?", "question 입니다.", "question", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("Main page HotPlace 기준이 무엇인가요?", "question 입니다.", "question", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("Planner 경로 추천이 무엇인가요?", "question 입니다.", "question", "Admin");

insert into board (board_title, board_content, board_category, board_admin_id) values ("AirPlanner 이용방법 안내 (Main)", "이용방법 안내 입니다.", "how-to-use", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("AirPlanner 이용방법 안내 (Map)", "이용방법 안내 입니다.", "how-to-use", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("AirPlanner 이용방법 안내 (Planner)", "이용방법 안내 입니다.", "how-to-use", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("AirPlanner 이용방법 안내 (Service)", "이용방법 안내 입니다.", "how-to-use", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("AirPlanner 이용방법 안내 (MyPage)", "이용방법 안내 입니다.", "how-to-use", "Admin");
insert into board (board_title, board_content, board_category, board_admin_id) values ("AirPlanner 이용방법 안내 (OpenAI(charGPT))", "이용방법 안내 입니다.", "how-to-use", "Admin");

-- reset score_avg
update attraction_info set score_avg = 0;

-- review
ALTER TABLE review AUTO_INCREMENT = 1;
insert into review (content_id, review_text, user_id, attraction_score) values (130373, "그냥 무난했습니다.", "모험가", 3);
insert into review (content_id, review_text, user_id, attraction_score) values (125266, "너무 좋았어요!", "모험가", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (125405, "좋은 추억 쌓았습니다.", "여행지기", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (125407, "재미있는 여행이었습니다.", "여행지기", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (125266, "흙이 너무 많았어요.", "여행지기", 1);
insert into review (content_id, review_text, user_id, attraction_score) values (125409, "즐거웠지만은 않았네요...", "여행지기", 2);
insert into review (content_id, review_text, user_id, attraction_score) values (130304, "그냥 심심풀이로 좋았어요.", "방랑자", 3);
insert into review (content_id, review_text, user_id, attraction_score) values (125405, "걷기엔 좋네요.", "방랑자", 3);
insert into review (content_id, review_text, user_id, attraction_score) values (125407, "좋은 추억 쌓았습니다.", "방랑자", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (125266, "그냥 무난했습니다.", "JourneyJunkie", 3);
insert into review (content_id, review_text, user_id, attraction_score) values (125409, "좋았어요!", "JourneyJunkie", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (125405, "전반적으로 좋았습니다.", "JourneyJunkie", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (130304, "책이 많아서 좋아요!", "JourneyJunkie", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (125407, "너무 힘들었어요..", "TravelGuru", 1);
insert into review (content_id, review_text, user_id, attraction_score) values (130373, "전반적으로 좋았습니다.", "TravelGuru", 4);

insert into review (content_id, review_text, user_id, attraction_score) values (125266, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (125501, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (125502, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (125503, "너무 좋았어요!", "Dumb", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (125504, "너무 좋았어요!", "Dumb", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (125505, "너무 좋았어요!", "Dumb", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (130373, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (125511, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (125512, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (2758334, "너무 좋았어요!", "Dumb", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (2757265, "너무 좋았어요!", "Dumb", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (2758282, "너무 좋았어요!", "Dumb", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (2758252, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (2758246, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (125412, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (125416, "너무 좋았어요!", "Dumb", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (125417, "너무 좋았어요!", "Dumb", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (125418, "너무 좋았어요!", "Dumb", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (125419, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (129499, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (129500, "너무 좋았어요!", "Dumb", 5);
insert into review (content_id, review_text, user_id, attraction_score) values (129501, "너무 좋았어요!", "Dumb", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (129502, "너무 좋았어요!", "Dumb", 4);
insert into review (content_id, review_text, user_id, attraction_score) values (125468, "너무 좋았어요!", "Dumb", 4);


-- planner & plan
ALTER TABLE planner AUTO_INCREMENT = 1;
insert into planner (planner_title, planner_s_date, planner_e_date, user_id, planner_visible) values ("관리자가 추천하는 역사 하루 여행", "2024-05-20", "2024-05-20", "Admin", true);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (1, 0, 0, 126512);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (1, 0, 1, 2689427);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (1, 0, 2, 2668319);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (1, 0, 3, 513291);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (1, 0, 4, 2544573);

insert into planner (planner_title, planner_s_date, planner_e_date, user_id, planner_visible) values ("여행지기의 1박2일 미지 한국투어", "2024-05-17", "2024-05-18", "여행지기", true);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (2, 0, 0, 125405);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (2, 0, 1, 125406);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (2, 0, 2, 125407);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (2, 1, 0, 125408);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (2, 1, 1, 125409);

insert into planner (planner_title, planner_s_date, planner_e_date, user_id, planner_visible) values ("JourneyJunkie 추천 여행 플랜", "2024-05-23", "2024-05-25", "JourneyJunkie", true);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (3, 0, 0, 125405);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (3, 0, 0, 125406);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (3, 1, 1, 125407);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (3, 1, 0, 125408);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (3, 2, 1, 125409);

insert into planner (planner_title, planner_s_date, planner_e_date, user_id, planner_visible) values ("당일치기로 놀아보자", "2024-05-25", "2024-05-25", "바람따라", true);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (4, 0, 0, 125405);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (4, 0, 1, 125406);

insert into planner (planner_title, planner_s_date, planner_e_date, user_id, planner_visible) values ("TravelGuru 슬렁슬렁 여행", "2024-05-23", "2024-05-27", "모험가", true);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (5, 0, 0, 125405);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (5, 1, 0, 125406);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (5, 2, 0, 125407);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (5, 3, 0, 125408);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (5, 4, 0, 125409);

insert into planner (planner_title, planner_s_date, planner_e_date, user_id, planner_visible) values ("나의 1박2일 여행 일정", "2024-05-22", "2024-05-23", "모험가", true);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (6, 0, 0, 125405);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (6, 0, 1, 125406);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (6, 1, 0, 125407);

insert into planner (planner_title, planner_s_date, planner_e_date, user_id, planner_visible) values ("2박3일 여행을 가자", "2024-05-20", "2024-05-22", "모험가", true);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (7, 0, 0, 125405);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (7, 1, 0, 125406);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (7, 2, 0, 125407);

insert into planner (planner_title, planner_s_date, planner_e_date, user_id, planner_visible) values ("여유롭게 떠나는 한국 여행", "2024-05-12", "2024-05-14", "모험가", true);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (8, 0, 0, 125405);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (8, 0, 1, 125406);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (8, 1, 0, 125407);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (8, 1, 1, 125407);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (8, 2, 0, 125407);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (8, 2, 1, 125407);

insert into planner (planner_title, planner_s_date, planner_e_date, user_id, planner_visible) values ("모험가의 당일치기 한국유람기", "2024-05-16", "2024-05-16", "모험가", true);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (9, 0, 0, 125405);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (9, 0, 1, 125406);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (9, 0, 2, 125407);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (9, 0, 3, 125408);
insert into plan (planner_id, plan_date, attraction_order, attraction_content_id) values (9, 0, 4, 125409);
