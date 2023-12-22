package Windows.UI.Notifications

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

@ABIMarker(TileTemplateType.ABI::class)
@Signature("enum(Windows.UI.Notifications.TileTemplateType;i4)")
@WinRTByReference(brClass = TileTemplateType.ByReference::class)
public enum class TileTemplateType(
  public val value: Int
) : NativeMapped {
  TileSquareImage(0),
  TileSquareBlock(1),
  TileSquareText01(2),
  TileSquareText02(3),
  TileSquareText03(4),
  TileSquareText04(5),
  TileSquarePeekImageAndText01(6),
  TileSquarePeekImageAndText02(7),
  TileSquarePeekImageAndText03(8),
  TileSquarePeekImageAndText04(9),
  TileWideImage(10),
  TileWideImageCollection(11),
  TileWideImageAndText01(12),
  TileWideImageAndText02(13),
  TileWideBlockAndText01(14),
  TileWideBlockAndText02(15),
  TileWidePeekImageCollection01(16),
  TileWidePeekImageCollection02(17),
  TileWidePeekImageCollection03(18),
  TileWidePeekImageCollection04(19),
  TileWidePeekImageCollection05(20),
  TileWidePeekImageCollection06(21),
  TileWidePeekImageAndText01(22),
  TileWidePeekImageAndText02(23),
  TileWidePeekImage01(24),
  TileWidePeekImage02(25),
  TileWidePeekImage03(26),
  TileWidePeekImage04(27),
  TileWidePeekImage05(28),
  TileWidePeekImage06(29),
  TileWideSmallImageAndText01(30),
  TileWideSmallImageAndText02(31),
  TileWideSmallImageAndText03(32),
  TileWideSmallImageAndText04(33),
  TileWideSmallImageAndText05(34),
  TileWideText01(35),
  TileWideText02(36),
  TileWideText03(37),
  TileWideText04(38),
  TileWideText05(39),
  TileWideText06(40),
  TileWideText07(41),
  TileWideText08(42),
  TileWideText09(43),
  TileWideText10(44),
  TileWideText11(45),
  TileSquare150x150Image(0),
  TileSquare150x150Block(1),
  TileSquare150x150Text01(2),
  TileSquare150x150Text02(3),
  TileSquare150x150Text03(4),
  TileSquare150x150Text04(5),
  TileSquare150x150PeekImageAndText01(6),
  TileSquare150x150PeekImageAndText02(7),
  TileSquare150x150PeekImageAndText03(8),
  TileSquare150x150PeekImageAndText04(9),
  TileWide310x150Image(10),
  TileWide310x150ImageCollection(11),
  TileWide310x150ImageAndText01(12),
  TileWide310x150ImageAndText02(13),
  TileWide310x150BlockAndText01(14),
  TileWide310x150BlockAndText02(15),
  TileWide310x150PeekImageCollection01(16),
  TileWide310x150PeekImageCollection02(17),
  TileWide310x150PeekImageCollection03(18),
  TileWide310x150PeekImageCollection04(19),
  TileWide310x150PeekImageCollection05(20),
  TileWide310x150PeekImageCollection06(21),
  TileWide310x150PeekImageAndText01(22),
  TileWide310x150PeekImageAndText02(23),
  TileWide310x150PeekImage01(24),
  TileWide310x150PeekImage02(25),
  TileWide310x150PeekImage03(26),
  TileWide310x150PeekImage04(27),
  TileWide310x150PeekImage05(28),
  TileWide310x150PeekImage06(29),
  TileWide310x150SmallImageAndText01(30),
  TileWide310x150SmallImageAndText02(31),
  TileWide310x150SmallImageAndText03(32),
  TileWide310x150SmallImageAndText04(33),
  TileWide310x150SmallImageAndText05(34),
  TileWide310x150Text01(35),
  TileWide310x150Text02(36),
  TileWide310x150Text03(37),
  TileWide310x150Text04(38),
  TileWide310x150Text05(39),
  TileWide310x150Text06(40),
  TileWide310x150Text07(41),
  TileWide310x150Text08(42),
  TileWide310x150Text09(43),
  TileWide310x150Text10(44),
  TileWide310x150Text11(45),
  TileSquare310x310BlockAndText01(46),
  TileSquare310x310BlockAndText02(47),
  TileSquare310x310Image(48),
  TileSquare310x310ImageAndText01(49),
  TileSquare310x310ImageAndText02(50),
  TileSquare310x310ImageAndTextOverlay01(51),
  TileSquare310x310ImageAndTextOverlay02(52),
  TileSquare310x310ImageAndTextOverlay03(53),
  TileSquare310x310ImageCollectionAndText01(54),
  TileSquare310x310ImageCollectionAndText02(55),
  TileSquare310x310ImageCollection(56),
  TileSquare310x310SmallImagesAndTextList01(57),
  TileSquare310x310SmallImagesAndTextList02(58),
  TileSquare310x310SmallImagesAndTextList03(59),
  TileSquare310x310SmallImagesAndTextList04(60),
  TileSquare310x310Text01(61),
  TileSquare310x310Text02(62),
  TileSquare310x310Text03(63),
  TileSquare310x310Text04(64),
  TileSquare310x310Text05(65),
  TileSquare310x310Text06(66),
  TileSquare310x310Text07(67),
  TileSquare310x310Text08(68),
  TileSquare310x310TextList01(69),
  TileSquare310x310TextList02(70),
  TileSquare310x310TextList03(71),
  TileSquare310x310SmallImageAndText01(72),
  TileSquare310x310SmallImagesAndTextList05(73),
  TileSquare310x310Text09(74),
  TileSquare71x71IconWithBadge(75),
  TileSquare150x150IconWithBadge(76),
  TileWide310x150IconWithBadgeAndText(77),
  TileSquare71x71Image(78),
  TileTall150x310Image(79),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TileTemplateType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> TileSquareImage
      1 -> TileSquareBlock
      2 -> TileSquareText01
      3 -> TileSquareText02
      4 -> TileSquareText03
      5 -> TileSquareText04
      6 -> TileSquarePeekImageAndText01
      7 -> TileSquarePeekImageAndText02
      8 -> TileSquarePeekImageAndText03
      9 -> TileSquarePeekImageAndText04
      10 -> TileWideImage
      11 -> TileWideImageCollection
      12 -> TileWideImageAndText01
      13 -> TileWideImageAndText02
      14 -> TileWideBlockAndText01
      15 -> TileWideBlockAndText02
      16 -> TileWidePeekImageCollection01
      17 -> TileWidePeekImageCollection02
      18 -> TileWidePeekImageCollection03
      19 -> TileWidePeekImageCollection04
      20 -> TileWidePeekImageCollection05
      21 -> TileWidePeekImageCollection06
      22 -> TileWidePeekImageAndText01
      23 -> TileWidePeekImageAndText02
      24 -> TileWidePeekImage01
      25 -> TileWidePeekImage02
      26 -> TileWidePeekImage03
      27 -> TileWidePeekImage04
      28 -> TileWidePeekImage05
      29 -> TileWidePeekImage06
      30 -> TileWideSmallImageAndText01
      31 -> TileWideSmallImageAndText02
      32 -> TileWideSmallImageAndText03
      33 -> TileWideSmallImageAndText04
      34 -> TileWideSmallImageAndText05
      35 -> TileWideText01
      36 -> TileWideText02
      37 -> TileWideText03
      38 -> TileWideText04
      39 -> TileWideText05
      40 -> TileWideText06
      41 -> TileWideText07
      42 -> TileWideText08
      43 -> TileWideText09
      44 -> TileWideText10
      45 -> TileWideText11
      0 -> TileSquare150x150Image
      1 -> TileSquare150x150Block
      2 -> TileSquare150x150Text01
      3 -> TileSquare150x150Text02
      4 -> TileSquare150x150Text03
      5 -> TileSquare150x150Text04
      6 -> TileSquare150x150PeekImageAndText01
      7 -> TileSquare150x150PeekImageAndText02
      8 -> TileSquare150x150PeekImageAndText03
      9 -> TileSquare150x150PeekImageAndText04
      10 -> TileWide310x150Image
      11 -> TileWide310x150ImageCollection
      12 -> TileWide310x150ImageAndText01
      13 -> TileWide310x150ImageAndText02
      14 -> TileWide310x150BlockAndText01
      15 -> TileWide310x150BlockAndText02
      16 -> TileWide310x150PeekImageCollection01
      17 -> TileWide310x150PeekImageCollection02
      18 -> TileWide310x150PeekImageCollection03
      19 -> TileWide310x150PeekImageCollection04
      20 -> TileWide310x150PeekImageCollection05
      21 -> TileWide310x150PeekImageCollection06
      22 -> TileWide310x150PeekImageAndText01
      23 -> TileWide310x150PeekImageAndText02
      24 -> TileWide310x150PeekImage01
      25 -> TileWide310x150PeekImage02
      26 -> TileWide310x150PeekImage03
      27 -> TileWide310x150PeekImage04
      28 -> TileWide310x150PeekImage05
      29 -> TileWide310x150PeekImage06
      30 -> TileWide310x150SmallImageAndText01
      31 -> TileWide310x150SmallImageAndText02
      32 -> TileWide310x150SmallImageAndText03
      33 -> TileWide310x150SmallImageAndText04
      34 -> TileWide310x150SmallImageAndText05
      35 -> TileWide310x150Text01
      36 -> TileWide310x150Text02
      37 -> TileWide310x150Text03
      38 -> TileWide310x150Text04
      39 -> TileWide310x150Text05
      40 -> TileWide310x150Text06
      41 -> TileWide310x150Text07
      42 -> TileWide310x150Text08
      43 -> TileWide310x150Text09
      44 -> TileWide310x150Text10
      45 -> TileWide310x150Text11
      46 -> TileSquare310x310BlockAndText01
      47 -> TileSquare310x310BlockAndText02
      48 -> TileSquare310x310Image
      49 -> TileSquare310x310ImageAndText01
      50 -> TileSquare310x310ImageAndText02
      51 -> TileSquare310x310ImageAndTextOverlay01
      52 -> TileSquare310x310ImageAndTextOverlay02
      53 -> TileSquare310x310ImageAndTextOverlay03
      54 -> TileSquare310x310ImageCollectionAndText01
      55 -> TileSquare310x310ImageCollectionAndText02
      56 -> TileSquare310x310ImageCollection
      57 -> TileSquare310x310SmallImagesAndTextList01
      58 -> TileSquare310x310SmallImagesAndTextList02
      59 -> TileSquare310x310SmallImagesAndTextList03
      60 -> TileSquare310x310SmallImagesAndTextList04
      61 -> TileSquare310x310Text01
      62 -> TileSquare310x310Text02
      63 -> TileSquare310x310Text03
      64 -> TileSquare310x310Text04
      65 -> TileSquare310x310Text05
      66 -> TileSquare310x310Text06
      67 -> TileSquare310x310Text07
      68 -> TileSquare310x310Text08
      69 -> TileSquare310x310TextList01
      70 -> TileSquare310x310TextList02
      71 -> TileSquare310x310TextList03
      72 -> TileSquare310x310SmallImageAndText01
      73 -> TileSquare310x310SmallImagesAndTextList05
      74 -> TileSquare310x310Text09
      75 -> TileSquare71x71IconWithBadge
      76 -> TileSquare150x150IconWithBadge
      77 -> TileWide310x150IconWithBadgeAndText
      78 -> TileSquare71x71Image
      79 -> TileTall150x310Image
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TileTemplateType> {
    public fun setValue(newValue: TileTemplateType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TileTemplateType =
        TileTemplateType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TileTemplateType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TileTemplateType =
        TileTemplateType.values()[0].fromNative(value, null)

    public override fun toNative(obj: TileTemplateType): Int = obj.value
  }
}
