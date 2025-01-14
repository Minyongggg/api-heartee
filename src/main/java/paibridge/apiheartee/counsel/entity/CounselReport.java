package paibridge.apiheartee.counsel.entity;

import static javax.persistence.InheritanceType.JOINED;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import paibridge.apiheartee.common.entity.BaseEntity;

@Entity
@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Inheritance(strategy = JOINED)
@DiscriminatorColumn(name = "dtype")
public abstract class CounselReport extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "counsel_report_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "counsel_request_id")
    private CounselRequest counselRequest;

    private String summary;
    private String solution;

    @Column(name = "willingness")
    private Integer willingness;

    @Column(name = "self_openness")
    private Integer selfOpenness;

    @Column(name = "voice_over")
    private Integer voiceOver;

    @Column(name = "positive_language")
    private Integer positiveLanguage;

    @Column(name = "frequency")
    private Integer frequency;

    @Column(name = "explanation")
    private String explanation;

    @Column(insertable = false, updatable = false) //자동 생성 컬럼인 dtype의 충돌 방지 + Getter 사용
    private String dtype;

    public CounselReport(CounselRequest counselRequest, String summary,
        String solution, Integer willingness, Integer selfOpenness, Integer voiceOver, Integer positiveLanguage, Integer frequency, String explanation) {
        this.counselRequest = counselRequest;
        this.summary = summary;
        this.solution = solution;
        this.willingness = willingness;
        this.selfOpenness = selfOpenness;
        this.voiceOver = voiceOver;
        this.positiveLanguage = positiveLanguage;
        this.frequency = frequency;
        this.explanation = explanation;
    }
}
