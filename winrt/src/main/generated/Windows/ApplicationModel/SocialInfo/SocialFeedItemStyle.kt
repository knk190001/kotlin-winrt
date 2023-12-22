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

@ABIMarker(SocialFeedItemStyle.ABI::class)
@Signature("enum(Windows.ApplicationModel.SocialInfo.SocialFeedItemStyle;i4)")
@WinRTByReference(brClass = SocialFeedItemStyle.ByReference::class)
public enum class SocialFeedItemStyle(
  public val value: Int
) : NativeMapped {
  Default(0),
  Photo(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SocialFeedItemStyle {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Photo
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SocialFeedItemStyle> {
    public fun setValue(newValue: SocialFeedItemStyle): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SocialFeedItemStyle =
        SocialFeedItemStyle.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SocialFeedItemStyle, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SocialFeedItemStyle =
        SocialFeedItemStyle.values()[0].fromNative(value, null)

    public override fun toNative(obj: SocialFeedItemStyle): Int = obj.value
  }
}
