package Windows.Graphics.Holographic

import Windows.Foundation.IClosable
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

@ABIMarker(HolographicFramePresentationMonitor.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicFramePresentationMonitor;{ca87256c-6fae-428e-bb83-25dfee51136b})")
@WinRTByReference(brClass = HolographicFramePresentationMonitor.ByReference::class)
public class HolographicFramePresentationMonitor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicFramePresentationMonitor.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __2137106994_Interface: IHolographicFramePresentationMonitor.WithDefault by lazy {
    as_2137106994()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2137106994_Ptr: JNAPointer? by lazy {
    __2137106994_Interface.__2137106994_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2137106994_Interface, __1260617006_Interface)

  private fun as_2137106994(): IHolographicFramePresentationMonitor.WithDefault {
    if(pointer == NULL) {
      return(IHolographicFramePresentationMonitor.ABI.makeIHolographicFramePresentationMonitor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicFramePresentationMonitor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicFramePresentationMonitor.ABI.makeIHolographicFramePresentationMonitor(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicFramePresentationMonitor> {
    public override fun getValue() = HolographicFramePresentationMonitor(pointer.getPointer(0))

    public fun setValue(value: HolographicFramePresentationMonitor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicFramePresentationMonitor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicFramePresentationMonitor {
      val address = segment.toRawLongValue()
      return HolographicFramePresentationMonitor(Pointer(address))
    }

    public override fun toNative(obj: HolographicFramePresentationMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
