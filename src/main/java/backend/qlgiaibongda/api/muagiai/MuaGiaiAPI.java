package backend.qlgiaibongda.api.muagiai;

import backend.qlgiaibongda.dto.DangKyThamGiaGiaiDTO;
import backend.qlgiaibongda.dto.MuaGiaiDTO;
import backend.qlgiaibongda.dto.ResponeObject;
import backend.qlgiaibongda.service.iplm.MuaGiaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/muagiai")
public class MuaGiaiAPI {
    @Autowired
    private MuaGiaiService muaGiaiService;

    @PostMapping("/taogiaidau")
    public ResponseEntity<ResponeObject> createLeague(@RequestBody MuaGiaiDTO muaGiaiDTO)
    {
        if(muaGiaiDTO.checkValidInfo_CreateLeague() == false)
        {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(new ResponeObject("FAIL", "Invalid Info", ""));
        }
        return muaGiaiService.createLeague(muaGiaiDTO);
    }
    @GetMapping("")
    public ResponseEntity<ResponeObject> getAllLeague(
            @RequestParam(value = "keyword",required = false) String keyword,
            @RequestParam(value = "trangthai", required = false) Integer trangThai
    )
    {
        // nếu các param là null all thì get all
        if(keyword == null && trangThai == null)
        {
            return muaGiaiService.getAllLeague();
        }
        else{
            return muaGiaiService.getLeagueOnRequest(keyword,trangThai);
        }
    }
//    @GetMapping("")
//    public String getLeague(@RequestParam("keyword") String keyword)
//    {
//        return "haha";
//    }
    @GetMapping("/chitiet")
    public ResponseEntity<ResponeObject> getLeagueById(@RequestParam("id") Long id)
    {
        return muaGiaiService.getLeagueById(id);
    }
    @PutMapping("/capnhat")
    public ResponseEntity<ResponeObject> updateLeague(@RequestBody MuaGiaiDTO muaGiaiDTO)
    {
        if(muaGiaiDTO.checkValidInfo_UpdateLeague() == false)
        {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(new ResponeObject("FAIL", "Invalid Info", ""));
        }
        return muaGiaiService.updateLeague(muaGiaiDTO);
    }
    @PostMapping("/thamgiagiai")
    public ResponseEntity<ResponeObject> resgisterJoinLeague(@RequestBody DangKyThamGiaGiaiDTO dangKyThamGiaGiaiDTO)
    {
        if(dangKyThamGiaGiaiDTO.checkValidInfo() == false)
        {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(new ResponeObject("FAIL", "Invalid Info", ""));
        }
        return muaGiaiService.registerJoinLeague(dangKyThamGiaGiaiDTO);
    }


}
