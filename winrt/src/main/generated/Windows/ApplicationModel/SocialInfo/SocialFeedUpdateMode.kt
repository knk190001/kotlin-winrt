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

@ABIMarker(SocialFeedUpdateMode.ABI::class)
@Signature("enum(Windows.ApplicationModel.SocialInfo.SocialFeedUpdateMode;i4)")
@WinRTByReference(brClass = SocialFeedUpdateMode.ByReference::class)
public enum class SocialFeedUpdateMode(
  public val value: Int
) : NativeMapped {
  Append(0),
  Replace(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SocialFeedUpdateMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Append
      1 -> Replace
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SocialFeedUpdateMode> {
    public fun setValue(newValue: SocialFeedUpdateMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SocialFeedUpdateMode =
        SocialFeedUpdateMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SocialFeedUpdateMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SocialFeedUpdateMode =
        SocialFeedUpdateMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: SocialFeedUpdateMode): Int = obj.value
  }
}
