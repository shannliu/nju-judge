package cn.edu.nju.software.judge.controller.contest;

import cn.edu.nju.software.judge.beans.Contest;
import cn.edu.nju.software.judge.beans.ContestWithBLOBs;
import cn.edu.nju.software.judge.beans.Cproblem;
import cn.edu.nju.software.judge.service.contest.ContestService;
import cn.edu.nju.software.judge.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //            佛祖保佑       永不宕机     永无BUG                    //
 * ////////////////////////////////////////////////////////////////////
 */
@RestController
public class ContestController {
    @Resource
    private ContestService contestService;

    /**
     * 获取所有竞赛列表
     * @param request
     * @param response
     * @return
     */
    @GetMapping("getAllContests.do")
    public List<Contest> getAllContests(HttpServletRequest request, HttpServletResponse response){
        return contestService.getAllContests();
    }

    /**
     * 根据竞赛编号获取竞赛详情
     * @param id
     * @return
     */
    @GetMapping("/contests/getContest.do")
    public Result getContest(@RequestParam("id")Integer id){
        ContestWithBLOBs result =  contestService.getContestByContestID(id);
        if (result == null){
            return Result.failure("error");
        }
        return Result.success(result);
    }

    /**
     * 根据竞赛编号获取竞赛的题目
     * @param id
     * @return
     */
    @GetMapping("/contests/getProblems")
    public Result getProblems(@RequestParam("id")Integer id){
        List<Cproblem> result = contestService.getCproblemByContestID(id);
        if (result == null){
            return Result.failure("error");
        }
        return Result.success(result);
    }

}
