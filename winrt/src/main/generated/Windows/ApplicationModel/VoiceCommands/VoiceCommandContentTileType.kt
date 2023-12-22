package Windows.ApplicationModel.VoiceCommands

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

@ABIMarker(VoiceCommandContentTileType.ABI::class)
@Signature("enum(Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType;i4)")
@WinRTByReference(brClass = VoiceCommandContentTileType.ByReference::class)
public enum class VoiceCommandContentTileType(
  public val value: Int
) : NativeMapped {
  TitleOnly(0),
  TitleWithText(1),
  TitleWith68x68Icon(2),
  TitleWith68x68IconAndText(3),
  TitleWith68x92Icon(4),
  TitleWith68x92IconAndText(5),
  TitleWith280x140Icon(6),
  TitleWith280x140IconAndText(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VoiceCommandContentTileType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> TitleOnly
      1 -> TitleWithText
      2 -> TitleWith68x68Icon
      3 -> TitleWith68x68IconAndText
      4 -> TitleWith68x92Icon
      5 -> TitleWith68x92IconAndText
      6 -> TitleWith280x140Icon
      7 -> TitleWith280x140IconAndText
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<VoiceCommandContentTileType> {
    public fun setValue(newValue: VoiceCommandContentTileType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VoiceCommandContentTileType =
        VoiceCommandContentTileType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VoiceCommandContentTileType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VoiceCommandContentTileType =
        VoiceCommandContentTileType.values()[0].fromNative(value, null)

    public override fun toNative(obj: VoiceCommandContentTileType): Int = obj.value
  }
}
