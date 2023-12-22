package Windows.Foundation

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

@ABIMarker(AsyncStatus.ABI::class)
@Signature("enum(Windows.Foundation.AsyncStatus;i4)")
@WinRTByReference(brClass = AsyncStatus.ByReference::class)
public enum class AsyncStatus(
  public val value: Int
) : NativeMapped {
  Canceled(2),
  Completed(1),
  Error(3),
  Started(0),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AsyncStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      2 -> Canceled
      1 -> Completed
      3 -> Error
      0 -> Started
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AsyncStatus> {
    public fun setValue(newValue: AsyncStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AsyncStatus =
        AsyncStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AsyncStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AsyncStatus =
        AsyncStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AsyncStatus): Int = obj.value
  }
}
