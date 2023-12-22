package Windows.Graphics.DirectX.Direct3D11

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

@ABIMarker(Direct3DUsage.ABI::class)
@Signature("enum(Windows.Graphics.DirectX.Direct3D11.Direct3DUsage;i4)")
@WinRTByReference(brClass = Direct3DUsage.ByReference::class)
public enum class Direct3DUsage(
  public val value: Int
) : NativeMapped {
  Default(0),
  Immutable(1),
  Dynamic(2),
  Staging(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Direct3DUsage {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Immutable
      2 -> Dynamic
      3 -> Staging
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Direct3DUsage> {
    public fun setValue(newValue: Direct3DUsage): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Direct3DUsage =
        Direct3DUsage.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Direct3DUsage, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Direct3DUsage =
        Direct3DUsage.values()[0].fromNative(value, null)

    public override fun toNative(obj: Direct3DUsage): Int = obj.value
  }
}
