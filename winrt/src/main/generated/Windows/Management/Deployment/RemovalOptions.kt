package Windows.Management.Deployment

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

@ABIMarker(RemovalOptions.ABI::class)
@Signature("enum(Windows.Management.Deployment.RemovalOptions;u4)")
@WinRTByReference(brClass = RemovalOptions.ByReference::class)
public enum class RemovalOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  PreserveApplicationData(4096),
  PreserveRoamableApplicationData(128),
  RemoveForAllUsers(524288),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RemovalOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      4096 -> PreserveApplicationData
      128 -> PreserveRoamableApplicationData
      524288 -> RemoveForAllUsers
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RemovalOptions> {
    public fun setValue(newValue: RemovalOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RemovalOptions =
        RemovalOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RemovalOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RemovalOptions =
        RemovalOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: RemovalOptions): Int = obj.value
  }
}
