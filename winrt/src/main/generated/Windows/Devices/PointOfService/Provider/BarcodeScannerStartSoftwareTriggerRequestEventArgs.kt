package Windows.Devices.PointOfService.Provider

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

@ABIMarker(BarcodeScannerStartSoftwareTriggerRequestEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerStartSoftwareTriggerRequestEventArgs;{2305d843-c88f-4f3b-8c3b-d3df071051ec})")
@WinRTByReference(brClass = BarcodeScannerStartSoftwareTriggerRequestEventArgs.ByReference::class)
public class BarcodeScannerStartSoftwareTriggerRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerStartSoftwareTriggerRequestEventArgs.WithDefault, IWinRTObject
    {
  private val __154832841_Interface: IBarcodeScannerStartSoftwareTriggerRequestEventArgs.WithDefault
      by lazy {
    as_154832841()
  }


  public override val __154832841_Ptr: JNAPointer? by lazy {
    __154832841_Interface.__154832841_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__154832841_Interface)

  private fun as_154832841(): IBarcodeScannerStartSoftwareTriggerRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerStartSoftwareTriggerRequestEventArgs.ABI.makeIBarcodeScannerStartSoftwareTriggerRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerStartSoftwareTriggerRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerStartSoftwareTriggerRequestEventArgs.ABI.makeIBarcodeScannerStartSoftwareTriggerRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerStartSoftwareTriggerRequestEventArgs> {
    public override fun getValue() =
        BarcodeScannerStartSoftwareTriggerRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerStartSoftwareTriggerRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerStartSoftwareTriggerRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerStartSoftwareTriggerRequestEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerStartSoftwareTriggerRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerStartSoftwareTriggerRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
