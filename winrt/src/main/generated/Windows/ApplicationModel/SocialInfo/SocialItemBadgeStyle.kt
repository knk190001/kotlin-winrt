package Windows.ApplicationModel.SocialInfo

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

@ABIMarker(SocialItemBadgeStyle.ABI::class)
@Signature("enum(Windows.ApplicationModel.SocialInfo.SocialItemBadgeStyle;i4)")
@WinRTByReference(brClass = SocialItemBadgeStyle.ByReference::class)
public enum class SocialItemBadgeStyle(
  public val value: Int
) : NativeMapped {
  Hidden(0),
  Visible(1),
  VisibleWithCount(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SocialItemBadgeStyle {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Hidden
      1 -> Visible
      2 -> VisibleWithCount
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SocialItemBadgeStyle> {
    public fun setValue(newValue: SocialItemBadgeStyle): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SocialItemBadgeStyle =
        SocialItemBadgeStyle.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SocialItemBadgeStyle, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SocialItemBadgeStyle =
        SocialItemBadgeStyle.values()[0].fromNative(value, null)

    public override fun toNative(obj: SocialItemBadgeStyle): Int = obj.value
  }
}
