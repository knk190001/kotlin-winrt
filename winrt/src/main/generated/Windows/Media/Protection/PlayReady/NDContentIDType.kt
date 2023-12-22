package Windows.Media.Protection.PlayReady

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

@ABIMarker(NDContentIDType.ABI::class)
@Signature("enum(Windows.Media.Protection.PlayReady.NDContentIDType;i4)")
@WinRTByReference(brClass = NDContentIDType.ByReference::class)
public enum class NDContentIDType(
  public val value: Int
) : NativeMapped {
  KeyID(1),
  PlayReadyObject(2),
  Custom(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NDContentIDType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> KeyID
      2 -> PlayReadyObject
      3 -> Custom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NDContentIDType> {
    public fun setValue(newValue: NDContentIDType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NDContentIDType =
        NDContentIDType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NDContentIDType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NDContentIDType =
        NDContentIDType.values()[0].fromNative(value, null)

    public override fun toNative(obj: NDContentIDType): Int = obj.value
  }
}
