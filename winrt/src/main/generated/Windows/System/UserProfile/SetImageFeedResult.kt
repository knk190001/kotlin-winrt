package Windows.System.UserProfile

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

@ABIMarker(SetImageFeedResult.ABI::class)
@Signature("enum(Windows.System.UserProfile.SetImageFeedResult;i4)")
@WinRTByReference(brClass = SetImageFeedResult.ByReference::class)
public enum class SetImageFeedResult(
  public val value: Int
) : NativeMapped {
  Success(0),
  ChangeDisabled(1),
  UserCanceled(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SetImageFeedResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> ChangeDisabled
      2 -> UserCanceled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SetImageFeedResult> {
    public fun setValue(newValue: SetImageFeedResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SetImageFeedResult =
        SetImageFeedResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SetImageFeedResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SetImageFeedResult =
        SetImageFeedResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: SetImageFeedResult): Int = obj.value
  }
}
