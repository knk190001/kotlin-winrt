package Windows.Media.Miracast

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MiracastReceiverCursorImageChannelSettings.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastReceiverCursorImageChannelSettings;{ccdbedff-bd00-5b9c-8e4c-00cacf86b634})")
@WinRTByReference(brClass = MiracastReceiverCursorImageChannelSettings.ByReference::class)
public class MiracastReceiverCursorImageChannelSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastReceiverCursorImageChannelSettings.WithDefault, IWinRTObject {
  private val __1809075036_Interface: IMiracastReceiverCursorImageChannelSettings.WithDefault by
      lazy {
    as_1809075036()
  }


  public override val __1809075036_Ptr: JNAPointer? by lazy {
    __1809075036_Interface.__1809075036_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1809075036_Interface)

  private fun as_1809075036(): IMiracastReceiverCursorImageChannelSettings.WithDefault {
    if(pointer == NULL) {
      return(IMiracastReceiverCursorImageChannelSettings.ABI.makeIMiracastReceiverCursorImageChannelSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastReceiverCursorImageChannelSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastReceiverCursorImageChannelSettings.ABI.makeIMiracastReceiverCursorImageChannelSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastReceiverCursorImageChannelSettings> {
    public override fun getValue() =
        MiracastReceiverCursorImageChannelSettings(pointer.getPointer(0))

    public fun setValue(value: MiracastReceiverCursorImageChannelSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastReceiverCursorImageChannelSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MiracastReceiverCursorImageChannelSettings {
      val address = segment.toRawLongValue()
      return MiracastReceiverCursorImageChannelSettings(Pointer(address))
    }

    public override fun toNative(obj: MiracastReceiverCursorImageChannelSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
