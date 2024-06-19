package com.ssafy.attraction.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.attraction.dto.Attraction;
import com.ssafy.attraction.dto.AttractionSearchRequestDto;
import com.ssafy.attraction.dto.AttractionSearchResponseDto;
import com.ssafy.attraction.mapper.AttractionMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AttractionServiceImpl implements AttractionService {
	private final AttractionMapper attractionMapper;

	@Override
	public List<AttractionSearchResponseDto> searchByConditions(AttractionSearchRequestDto attractionSearchRequest)
			throws Exception {
		List<AttractionSearchResponseDto> result = null;
		result = attractionMapper.searchByConditions(attractionSearchRequest);
		return result;
	}

	@Override
	public Attraction selectAttractionByContentId(int contentId) throws Exception {
		return attractionMapper.selectAttractionByContentId(contentId);
	}

	@Override
	public Map<Integer, List<Attraction>> getHotLocal() throws Exception {
		Map<Integer, List<Attraction>> hotLocal = new HashMap<>();

		hotLocal.put(0, new ArrayList<>());
		for (Attraction local : attractionMapper.getMaxScoreAvgRankFive()) {
			hotLocal.get(0).add(local);
		}

		for (Attraction local : attractionMapper.getHotLocal()) {
			if (!hotLocal.containsKey(local.getSidoCode())) {
				hotLocal.put(local.getSidoCode(), new ArrayList<>());
			}
			hotLocal.get(local.getSidoCode()).add(local);
		}
		return hotLocal;
	}
}