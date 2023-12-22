package Windows.Media.Devices

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

@ABIMarker(DigitalWindowControl.ABI::class)
@Signature("rc(Windows.Media.Devices.DigitalWindowControl;{23b69eff-65d2-53ea-8780-de582b48b544})")
@WinRTByReference(brClass = DigitalWindowControl.ByReference::class)
public class DigitalWindowControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDigitalWindowControl.WithDefault, IWinRTObject {
  private val __2001605302_Interface: IDigitalWindowControl.WithDefault by lazy {
    as_2001605302()
  }


  public override val __2001605302_Ptr: JNAPointer? by lazy {
    __2001605302_Interface.__2001605302_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2001605302_Interface)

  private fun as_2001605302(): IDigitalWindowControl.WithDefault {
    if(pointer == NULL) {
      return(IDigitalWindowControl.ABI.makeIDigitalWindowControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDigitalWindowControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDigitalWindowControl.ABI.makeIDigitalWindowControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DigitalWindowControl> {
    public override fun getValue() = DigitalWindowControl(pointer.getPointer(0))

    public fun setValue(value: DigitalWindowControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DigitalWindowControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DigitalWindowControl {
      val address = segment.toRawLongValue()
      return DigitalWindowControl(Pointer(address))
    }

    public override fun toNative(obj: DigitalWindowControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
