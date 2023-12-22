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

@ABIMarker(SocialFeedKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.SocialInfo.SocialFeedKind;i4)")
@WinRTByReference(brClass = SocialFeedKind.ByReference::class)
public enum class SocialFeedKind(
  public val value: Int
) : NativeMapped {
  HomeFeed(0),
  ContactFeed(1),
  Dashboard(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SocialFeedKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> HomeFeed
      1 -> ContactFeed
      2 -> Dashboard
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SocialFeedKind> {
    public fun setValue(newValue: SocialFeedKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SocialFeedKind =
        SocialFeedKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SocialFeedKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SocialFeedKind =
        SocialFeedKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: SocialFeedKind): Int = obj.value
  }
}
