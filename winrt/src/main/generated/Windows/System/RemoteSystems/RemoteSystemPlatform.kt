package Windows.System.RemoteSystems

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

@ABIMarker(RemoteSystemPlatform.ABI::class)
@Signature("enum(Windows.System.RemoteSystems.RemoteSystemPlatform;i4)")
@WinRTByReference(brClass = RemoteSystemPlatform.ByReference::class)
public enum class RemoteSystemPlatform(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Windows(1),
  Android(2),
  Ios(3),
  Linux(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RemoteSystemPlatform {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Windows
      2 -> Android
      3 -> Ios
      4 -> Linux
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RemoteSystemPlatform> {
    public fun setValue(newValue: RemoteSystemPlatform): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RemoteSystemPlatform =
        RemoteSystemPlatform.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RemoteSystemPlatform, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RemoteSystemPlatform =
        RemoteSystemPlatform.values()[0].fromNative(value, null)

    public override fun toNative(obj: RemoteSystemPlatform): Int = obj.value
  }
}
