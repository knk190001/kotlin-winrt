package Windows.ApplicationModel.UserActivities

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

@ABIMarker(UserActivityState.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserActivities.UserActivityState;i4)")
@WinRTByReference(brClass = UserActivityState.ByReference::class)
public enum class UserActivityState(
  public val value: Int
) : NativeMapped {
  New(0),
  Published(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserActivityState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> New
      1 -> Published
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UserActivityState> {
    public fun setValue(newValue: UserActivityState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserActivityState =
        UserActivityState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserActivityState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserActivityState =
        UserActivityState.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserActivityState): Int = obj.value
  }
}
