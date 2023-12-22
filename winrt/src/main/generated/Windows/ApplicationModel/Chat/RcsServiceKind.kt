package Windows.ApplicationModel.Chat

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

@ABIMarker(RcsServiceKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.RcsServiceKind;i4)")
@WinRTByReference(brClass = RcsServiceKind.ByReference::class)
public enum class RcsServiceKind(
  public val value: Int
) : NativeMapped {
  Chat(0),
  GroupChat(1),
  FileTransfer(2),
  Capability(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RcsServiceKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Chat
      1 -> GroupChat
      2 -> FileTransfer
      3 -> Capability
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RcsServiceKind> {
    public fun setValue(newValue: RcsServiceKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RcsServiceKind =
        RcsServiceKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RcsServiceKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RcsServiceKind =
        RcsServiceKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: RcsServiceKind): Int = obj.value
  }
}
