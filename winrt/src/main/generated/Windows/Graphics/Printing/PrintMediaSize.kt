package Windows.Graphics.Printing

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(PrintMediaSize.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintMediaSize;i4)")
@WinRTByReference(brClass = PrintMediaSize.ByReference::class)
public enum class PrintMediaSize(
  public val value: Int
) : NativeMapped {
  Default(0),
  NotAvailable(1),
  PrinterCustom(2),
  BusinessCard(3),
  CreditCard(4),
  IsoA0(5),
  IsoA1(6),
  IsoA10(7),
  IsoA2(8),
  IsoA3(9),
  IsoA3Extra(10),
  IsoA3Rotated(11),
  IsoA4(12),
  IsoA4Extra(13),
  IsoA4Rotated(14),
  IsoA5(15),
  IsoA5Extra(16),
  IsoA5Rotated(17),
  IsoA6(18),
  IsoA6Rotated(19),
  IsoA7(20),
  IsoA8(21),
  IsoA9(22),
  IsoB0(23),
  IsoB1(24),
  IsoB10(25),
  IsoB2(26),
  IsoB3(27),
  IsoB4(28),
  IsoB4Envelope(29),
  IsoB5Envelope(30),
  IsoB5Extra(31),
  IsoB7(32),
  IsoB8(33),
  IsoB9(34),
  IsoC0(35),
  IsoC1(36),
  IsoC10(37),
  IsoC2(38),
  IsoC3(39),
  IsoC3Envelope(40),
  IsoC4(41),
  IsoC4Envelope(42),
  IsoC5(43),
  IsoC5Envelope(44),
  IsoC6(45),
  IsoC6C5Envelope(46),
  IsoC6Envelope(47),
  IsoC7(48),
  IsoC8(49),
  IsoC9(50),
  IsoDLEnvelope(51),
  IsoDLEnvelopeRotated(52),
  IsoSRA3(53),
  Japan2LPhoto(54),
  JapanChou3Envelope(55),
  JapanChou3EnvelopeRotated(56),
  JapanChou4Envelope(57),
  JapanChou4EnvelopeRotated(58),
  JapanDoubleHagakiPostcard(59),
  JapanDoubleHagakiPostcardRotated(60),
  JapanHagakiPostcard(61),
  JapanHagakiPostcardRotated(62),
  JapanKaku2Envelope(63),
  JapanKaku2EnvelopeRotated(64),
  JapanKaku3Envelope(65),
  JapanKaku3EnvelopeRotated(66),
  JapanLPhoto(67),
  JapanQuadrupleHagakiPostcard(68),
  JapanYou1Envelope(69),
  JapanYou2Envelope(70),
  JapanYou3Envelope(71),
  JapanYou4Envelope(72),
  JapanYou4EnvelopeRotated(73),
  JapanYou6Envelope(74),
  JapanYou6EnvelopeRotated(75),
  JisB0(76),
  JisB1(77),
  JisB10(78),
  JisB2(79),
  JisB3(80),
  JisB4(81),
  JisB4Rotated(82),
  JisB5(83),
  JisB5Rotated(84),
  JisB6(85),
  JisB6Rotated(86),
  JisB7(87),
  JisB8(88),
  JisB9(89),
  NorthAmerica10x11(90),
  NorthAmerica10x12(91),
  NorthAmerica10x14(92),
  NorthAmerica11x17(93),
  NorthAmerica14x17(94),
  NorthAmerica4x6(95),
  NorthAmerica4x8(96),
  NorthAmerica5x7(97),
  NorthAmerica8x10(98),
  NorthAmerica9x11(99),
  NorthAmericaArchitectureASheet(100),
  NorthAmericaArchitectureBSheet(101),
  NorthAmericaArchitectureCSheet(102),
  NorthAmericaArchitectureDSheet(103),
  NorthAmericaArchitectureESheet(104),
  NorthAmericaCSheet(105),
  NorthAmericaDSheet(106),
  NorthAmericaESheet(107),
  NorthAmericaExecutive(108),
  NorthAmericaGermanLegalFanfold(109),
  NorthAmericaGermanStandardFanfold(110),
  NorthAmericaLegal(111),
  NorthAmericaLegalExtra(112),
  NorthAmericaLetter(113),
  NorthAmericaLetterExtra(114),
  NorthAmericaLetterPlus(115),
  NorthAmericaLetterRotated(116),
  NorthAmericaMonarchEnvelope(117),
  NorthAmericaNote(118),
  NorthAmericaNumber10Envelope(119),
  NorthAmericaNumber10EnvelopeRotated(120),
  NorthAmericaNumber11Envelope(121),
  NorthAmericaNumber12Envelope(122),
  NorthAmericaNumber14Envelope(123),
  NorthAmericaNumber9Envelope(124),
  NorthAmericaPersonalEnvelope(125),
  NorthAmericaQuarto(126),
  NorthAmericaStatement(127),
  NorthAmericaSuperA(128),
  NorthAmericaSuperB(129),
  NorthAmericaTabloid(130),
  NorthAmericaTabloidExtra(131),
  OtherMetricA3Plus(132),
  OtherMetricA4Plus(133),
  OtherMetricFolio(134),
  OtherMetricInviteEnvelope(135),
  OtherMetricItalianEnvelope(136),
  Prc10Envelope(137),
  Prc10EnvelopeRotated(138),
  Prc16K(139),
  Prc16KRotated(140),
  Prc1Envelope(141),
  Prc1EnvelopeRotated(142),
  Prc2Envelope(143),
  Prc2EnvelopeRotated(144),
  Prc32K(145),
  Prc32KBig(146),
  Prc32KRotated(147),
  Prc3Envelope(148),
  Prc3EnvelopeRotated(149),
  Prc4Envelope(150),
  Prc4EnvelopeRotated(151),
  Prc5Envelope(152),
  Prc5EnvelopeRotated(153),
  Prc6Envelope(154),
  Prc6EnvelopeRotated(155),
  Prc7Envelope(156),
  Prc7EnvelopeRotated(157),
  Prc8Envelope(158),
  Prc8EnvelopeRotated(159),
  Prc9Envelope(160),
  Prc9EnvelopeRotated(161),
  Roll04Inch(162),
  Roll06Inch(163),
  Roll08Inch(164),
  Roll12Inch(165),
  Roll15Inch(166),
  Roll18Inch(167),
  Roll22Inch(168),
  Roll24Inch(169),
  Roll30Inch(170),
  Roll36Inch(171),
  Roll54Inch(172),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintMediaSize {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> NotAvailable
      2 -> PrinterCustom
      3 -> BusinessCard
      4 -> CreditCard
      5 -> IsoA0
      6 -> IsoA1
      7 -> IsoA10
      8 -> IsoA2
      9 -> IsoA3
      10 -> IsoA3Extra
      11 -> IsoA3Rotated
      12 -> IsoA4
      13 -> IsoA4Extra
      14 -> IsoA4Rotated
      15 -> IsoA5
      16 -> IsoA5Extra
      17 -> IsoA5Rotated
      18 -> IsoA6
      19 -> IsoA6Rotated
      20 -> IsoA7
      21 -> IsoA8
      22 -> IsoA9
      23 -> IsoB0
      24 -> IsoB1
      25 -> IsoB10
      26 -> IsoB2
      27 -> IsoB3
      28 -> IsoB4
      29 -> IsoB4Envelope
      30 -> IsoB5Envelope
      31 -> IsoB5Extra
      32 -> IsoB7
      33 -> IsoB8
      34 -> IsoB9
      35 -> IsoC0
      36 -> IsoC1
      37 -> IsoC10
      38 -> IsoC2
      39 -> IsoC3
      40 -> IsoC3Envelope
      41 -> IsoC4
      42 -> IsoC4Envelope
      43 -> IsoC5
      44 -> IsoC5Envelope
      45 -> IsoC6
      46 -> IsoC6C5Envelope
      47 -> IsoC6Envelope
      48 -> IsoC7
      49 -> IsoC8
      50 -> IsoC9
      51 -> IsoDLEnvelope
      52 -> IsoDLEnvelopeRotated
      53 -> IsoSRA3
      54 -> Japan2LPhoto
      55 -> JapanChou3Envelope
      56 -> JapanChou3EnvelopeRotated
      57 -> JapanChou4Envelope
      58 -> JapanChou4EnvelopeRotated
      59 -> JapanDoubleHagakiPostcard
      60 -> JapanDoubleHagakiPostcardRotated
      61 -> JapanHagakiPostcard
      62 -> JapanHagakiPostcardRotated
      63 -> JapanKaku2Envelope
      64 -> JapanKaku2EnvelopeRotated
      65 -> JapanKaku3Envelope
      66 -> JapanKaku3EnvelopeRotated
      67 -> JapanLPhoto
      68 -> JapanQuadrupleHagakiPostcard
      69 -> JapanYou1Envelope
      70 -> JapanYou2Envelope
      71 -> JapanYou3Envelope
      72 -> JapanYou4Envelope
      73 -> JapanYou4EnvelopeRotated
      74 -> JapanYou6Envelope
      75 -> JapanYou6EnvelopeRotated
      76 -> JisB0
      77 -> JisB1
      78 -> JisB10
      79 -> JisB2
      80 -> JisB3
      81 -> JisB4
      82 -> JisB4Rotated
      83 -> JisB5
      84 -> JisB5Rotated
      85 -> JisB6
      86 -> JisB6Rotated
      87 -> JisB7
      88 -> JisB8
      89 -> JisB9
      90 -> NorthAmerica10x11
      91 -> NorthAmerica10x12
      92 -> NorthAmerica10x14
      93 -> NorthAmerica11x17
      94 -> NorthAmerica14x17
      95 -> NorthAmerica4x6
      96 -> NorthAmerica4x8
      97 -> NorthAmerica5x7
      98 -> NorthAmerica8x10
      99 -> NorthAmerica9x11
      100 -> NorthAmericaArchitectureASheet
      101 -> NorthAmericaArchitectureBSheet
      102 -> NorthAmericaArchitectureCSheet
      103 -> NorthAmericaArchitectureDSheet
      104 -> NorthAmericaArchitectureESheet
      105 -> NorthAmericaCSheet
      106 -> NorthAmericaDSheet
      107 -> NorthAmericaESheet
      108 -> NorthAmericaExecutive
      109 -> NorthAmericaGermanLegalFanfold
      110 -> NorthAmericaGermanStandardFanfold
      111 -> NorthAmericaLegal
      112 -> NorthAmericaLegalExtra
      113 -> NorthAmericaLetter
      114 -> NorthAmericaLetterExtra
      115 -> NorthAmericaLetterPlus
      116 -> NorthAmericaLetterRotated
      117 -> NorthAmericaMonarchEnvelope
      118 -> NorthAmericaNote
      119 -> NorthAmericaNumber10Envelope
      120 -> NorthAmericaNumber10EnvelopeRotated
      121 -> NorthAmericaNumber11Envelope
      122 -> NorthAmericaNumber12Envelope
      123 -> NorthAmericaNumber14Envelope
      124 -> NorthAmericaNumber9Envelope
      125 -> NorthAmericaPersonalEnvelope
      126 -> NorthAmericaQuarto
      127 -> NorthAmericaStatement
      128 -> NorthAmericaSuperA
      129 -> NorthAmericaSuperB
      130 -> NorthAmericaTabloid
      131 -> NorthAmericaTabloidExtra
      132 -> OtherMetricA3Plus
      133 -> OtherMetricA4Plus
      134 -> OtherMetricFolio
      135 -> OtherMetricInviteEnvelope
      136 -> OtherMetricItalianEnvelope
      137 -> Prc10Envelope
      138 -> Prc10EnvelopeRotated
      139 -> Prc16K
      140 -> Prc16KRotated
      141 -> Prc1Envelope
      142 -> Prc1EnvelopeRotated
      143 -> Prc2Envelope
      144 -> Prc2EnvelopeRotated
      145 -> Prc32K
      146 -> Prc32KBig
      147 -> Prc32KRotated
      148 -> Prc3Envelope
      149 -> Prc3EnvelopeRotated
      150 -> Prc4Envelope
      151 -> Prc4EnvelopeRotated
      152 -> Prc5Envelope
      153 -> Prc5EnvelopeRotated
      154 -> Prc6Envelope
      155 -> Prc6EnvelopeRotated
      156 -> Prc7Envelope
      157 -> Prc7EnvelopeRotated
      158 -> Prc8Envelope
      159 -> Prc8EnvelopeRotated
      160 -> Prc9Envelope
      161 -> Prc9EnvelopeRotated
      162 -> Roll04Inch
      163 -> Roll06Inch
      164 -> Roll08Inch
      165 -> Roll12Inch
      166 -> Roll15Inch
      167 -> Roll18Inch
      168 -> Roll22Inch
      169 -> Roll24Inch
      170 -> Roll30Inch
      171 -> Roll36Inch
      172 -> Roll54Inch
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintMediaSize> {
    public fun setValue(newValue: PrintMediaSize): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintMediaSize =
        PrintMediaSize.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintMediaSize, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintMediaSize =
        PrintMediaSize.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintMediaSize): Int = obj.value
  }
}
