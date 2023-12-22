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

@ABIMarker(DigitalWindowCapability.ABI::class)
@Signature("rc(Windows.Media.Devices.DigitalWindowCapability;{d78bad2c-f721-5244-a196-b56ccbec606c})")
@WinRTByReference(brClass = DigitalWindowCapability.ByReference::class)
public class DigitalWindowCapability(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDigitalWindowCapability.WithDefault, IWinRTObject {
  private val __1371589919_Interface: IDigitalWindowCapability.WithDefault by lazy {
    as_1371589919()
  }


  public override val __1371589919_Ptr: JNAPointer? by lazy {
    __1371589919_Interface.__1371589919_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1371589919_Interface)

  private fun as_1371589919(): IDigitalWindowCapability.WithDefault {
    if(pointer == NULL) {
      return(IDigitalWindowCapability.ABI.makeIDigitalWindowCapability(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDigitalWindowCapability>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDigitalWindowCapability.ABI.makeIDigitalWindowCapability(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DigitalWindowCapability> {
    public override fun getValue() = DigitalWindowCapability(pointer.getPointer(0))

    public fun setValue(value: DigitalWindowCapability): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DigitalWindowCapability, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DigitalWindowCapability {
      val address = segment.toRawLongValue()
      return DigitalWindowCapability(Pointer(address))
    }

    public override fun toNative(obj: DigitalWindowCapability): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
