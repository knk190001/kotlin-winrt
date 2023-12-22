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

@ABIMarker(HolographicFrameScanoutMonitor.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicFrameScanoutMonitor;{7e83efa9-843c-5401-8095-9bc1b8b08638})")
@WinRTByReference(brClass = HolographicFrameScanoutMonitor.ByReference::class)
public class HolographicFrameScanoutMonitor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicFrameScanoutMonitor.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __1064021317_Interface: IHolographicFrameScanoutMonitor.WithDefault by lazy {
    as_1064021317()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1064021317_Ptr: JNAPointer? by lazy {
    __1064021317_Interface.__1064021317_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1064021317_Interface, __1260617006_Interface)

  private fun as_1064021317(): IHolographicFrameScanoutMonitor.WithDefault {
    if(pointer == NULL) {
      return(IHolographicFrameScanoutMonitor.ABI.makeIHolographicFrameScanoutMonitor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicFrameScanoutMonitor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicFrameScanoutMonitor.ABI.makeIHolographicFrameScanoutMonitor(ref.value))
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
      IByReference<HolographicFrameScanoutMonitor> {
    public override fun getValue() = HolographicFrameScanoutMonitor(pointer.getPointer(0))

    public fun setValue(value: HolographicFrameScanoutMonitor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicFrameScanoutMonitor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicFrameScanoutMonitor {
      val address = segment.toRawLongValue()
      return HolographicFrameScanoutMonitor(Pointer(address))
    }

    public override fun toNative(obj: HolographicFrameScanoutMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
