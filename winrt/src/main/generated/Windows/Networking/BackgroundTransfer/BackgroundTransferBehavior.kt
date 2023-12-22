package Windows.Networking.BackgroundTransfer

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

@ABIMarker(BackgroundTransferBehavior.ABI::class)
@Signature("enum(Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior;i4)")
@WinRTByReference(brClass = BackgroundTransferBehavior.ByReference::class)
public enum class BackgroundTransferBehavior(
  public val value: Int
) : NativeMapped {
  Parallel(0),
  Serialized(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BackgroundTransferBehavior {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Parallel
      1 -> Serialized
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BackgroundTransferBehavior> {
    public fun setValue(newValue: BackgroundTransferBehavior): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BackgroundTransferBehavior =
        BackgroundTransferBehavior.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BackgroundTransferBehavior, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BackgroundTransferBehavior =
        BackgroundTransferBehavior.values()[0].fromNative(value, null)

    public override fun toNative(obj: BackgroundTransferBehavior): Int = obj.value
  }
}
