package Windows.Media.Core

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

@ABIMarker(MseReadyState.ABI::class)
@Signature("enum(Windows.Media.Core.MseReadyState;i4)")
@WinRTByReference(brClass = MseReadyState.ByReference::class)
public enum class MseReadyState(
  public val value: Int
) : NativeMapped {
  Closed(0),
  Open(1),
  Ended(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MseReadyState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Closed
      1 -> Open
      2 -> Ended
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MseReadyState> {
    public fun setValue(newValue: MseReadyState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MseReadyState =
        MseReadyState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MseReadyState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MseReadyState =
        MseReadyState.values()[0].fromNative(value, null)

    public override fun toNative(obj: MseReadyState): Int = obj.value
  }
}
