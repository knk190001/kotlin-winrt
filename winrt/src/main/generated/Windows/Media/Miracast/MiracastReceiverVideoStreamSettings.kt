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

@ABIMarker(MiracastReceiverVideoStreamSettings.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastReceiverVideoStreamSettings;{169b5e1b-149d-52d0-b126-6f89744e4f50})")
@WinRTByReference(brClass = MiracastReceiverVideoStreamSettings.ByReference::class)
public class MiracastReceiverVideoStreamSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastReceiverVideoStreamSettings.WithDefault, IWinRTObject {
  private val __1757455803_Interface: IMiracastReceiverVideoStreamSettings.WithDefault by lazy {
    as_1757455803()
  }


  public override val __1757455803_Ptr: JNAPointer? by lazy {
    __1757455803_Interface.__1757455803_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1757455803_Interface)

  private fun as_1757455803(): IMiracastReceiverVideoStreamSettings.WithDefault {
    if(pointer == NULL) {
      return(IMiracastReceiverVideoStreamSettings.ABI.makeIMiracastReceiverVideoStreamSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastReceiverVideoStreamSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastReceiverVideoStreamSettings.ABI.makeIMiracastReceiverVideoStreamSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastReceiverVideoStreamSettings> {
    public override fun getValue() = MiracastReceiverVideoStreamSettings(pointer.getPointer(0))

    public fun setValue(value: MiracastReceiverVideoStreamSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastReceiverVideoStreamSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MiracastReceiverVideoStreamSettings {
      val address = segment.toRawLongValue()
      return MiracastReceiverVideoStreamSettings(Pointer(address))
    }

    public override fun toNative(obj: MiracastReceiverVideoStreamSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
