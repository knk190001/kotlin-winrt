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

@ABIMarker(RemoteSystemAuthorizationKind.ABI::class)
@Signature("enum(Windows.System.RemoteSystems.RemoteSystemAuthorizationKind;i4)")
@WinRTByReference(brClass = RemoteSystemAuthorizationKind.ByReference::class)
public enum class RemoteSystemAuthorizationKind(
  public val value: Int
) : NativeMapped {
  SameUser(0),
  Anonymous(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RemoteSystemAuthorizationKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SameUser
      1 -> Anonymous
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<RemoteSystemAuthorizationKind> {
    public fun setValue(newValue: RemoteSystemAuthorizationKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RemoteSystemAuthorizationKind =
        RemoteSystemAuthorizationKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RemoteSystemAuthorizationKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RemoteSystemAuthorizationKind =
        RemoteSystemAuthorizationKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: RemoteSystemAuthorizationKind): Int = obj.value
  }
}
