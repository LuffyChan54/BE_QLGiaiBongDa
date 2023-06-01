package backend.qlgiaibongda.api.doibong;

import backend.qlgiaibongda.api.input.NewTeamInput;
import backend.qlgiaibongda.api.output.AllTeamOuput;
import backend.qlgiaibongda.api.output.ErrorOutput;
import backend.qlgiaibongda.dto.CauThuDTO;
import backend.qlgiaibongda.dto.TeamDTO;
import backend.qlgiaibongda.service.ICauThuService;
import backend.qlgiaibongda.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/doibong")
public class DoiBongAPI {

    @Autowired
    private ICauThuService cauThuService;

    @Autowired
    private ITeamService teamService;

    @GetMapping
    public AllTeamOuput getAllTeam(@RequestParam("page") int page,
                           @RequestParam("limit") int limit){
        AllTeamOuput result = new AllTeamOuput();
        result.setPage(page);
        page--;
        Pageable pageable = PageRequest.of(page, limit);
        result.setListResult(teamService.findAll(pageable));
        result.setTotalPage((int) Math.ceil((double) teamService.totalItem()/ limit));
        return result;
    }

    @GetMapping("/{id}")
    public TeamDTO getTeam(@PathVariable("id") Long id){
        return teamService.findById(id);
    }

    @PostMapping
    public Object addNewTeam(@RequestBody NewTeamInput teamInput){
        Object result =  teamService.save(teamInput);
        return result;
    }

    //did not exist
    @PostMapping("/cauthu")
    public CauThuDTO addNewPlayer(@RequestBody CauThuDTO cauThuDTO){
        return cauThuService.save(cauThuDTO);
    }

}