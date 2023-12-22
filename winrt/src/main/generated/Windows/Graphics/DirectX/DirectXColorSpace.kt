package Windows.Graphics.DirectX

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

@ABIMarker(DirectXColorSpace.ABI::class)
@Signature("enum(Windows.Graphics.DirectX.DirectXColorSpace;i4)")
@WinRTByReference(brClass = DirectXColorSpace.ByReference::class)
public enum class DirectXColorSpace(
  public val value: Int
) : NativeMapped {
  RgbFullG22NoneP709(0),
  RgbFullG10NoneP709(1),
  RgbStudioG22NoneP709(2),
  RgbStudioG22NoneP2020(3),
  Reserved(4),
  YccFullG22NoneP709X601(5),
  YccStudioG22LeftP601(6),
  YccFullG22LeftP601(7),
  YccStudioG22LeftP709(8),
  YccFullG22LeftP709(9),
  YccStudioG22LeftP2020(10),
  YccFullG22LeftP2020(11),
  RgbFullG2084NoneP2020(12),
  YccStudioG2084LeftP2020(13),
  RgbStudioG2084NoneP2020(14),
  YccStudioG22TopLeftP2020(15),
  YccStudioG2084TopLeftP2020(16),
  RgbFullG22NoneP2020(17),
  YccStudioGHlgTopLeftP2020(18),
  YccFullGHlgTopLeftP2020(19),
  RgbStudioG24NoneP709(20),
  RgbStudioG24NoneP2020(21),
  YccStudioG24LeftP709(22),
  YccStudioG24LeftP2020(23),
  YccStudioG24TopLeftP2020(24),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DirectXColorSpace {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> RgbFullG22NoneP709
      1 -> RgbFullG10NoneP709
      2 -> RgbStudioG22NoneP709
      3 -> RgbStudioG22NoneP2020
      4 -> Reserved
      5 -> YccFullG22NoneP709X601
      6 -> YccStudioG22LeftP601
      7 -> YccFullG22LeftP601
      8 -> YccStudioG22LeftP709
      9 -> YccFullG22LeftP709
      10 -> YccStudioG22LeftP2020
      11 -> YccFullG22LeftP2020
      12 -> RgbFullG2084NoneP2020
      13 -> YccStudioG2084LeftP2020
      14 -> RgbStudioG2084NoneP2020
      15 -> YccStudioG22TopLeftP2020
      16 -> YccStudioG2084TopLeftP2020
      17 -> RgbFullG22NoneP2020
      18 -> YccStudioGHlgTopLeftP2020
      19 -> YccFullGHlgTopLeftP2020
      20 -> RgbStudioG24NoneP709
      21 -> RgbStudioG24NoneP2020
      22 -> YccStudioG24LeftP709
      23 -> YccStudioG24LeftP2020
      24 -> YccStudioG24TopLeftP2020
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DirectXColorSpace> {
    public fun setValue(newValue: DirectXColorSpace): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DirectXColorSpace =
        DirectXColorSpace.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DirectXColorSpace, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DirectXColorSpace =
        DirectXColorSpace.values()[0].fromNative(value, null)

    public override fun toNative(obj: DirectXColorSpace): Int = obj.value
  }
}
