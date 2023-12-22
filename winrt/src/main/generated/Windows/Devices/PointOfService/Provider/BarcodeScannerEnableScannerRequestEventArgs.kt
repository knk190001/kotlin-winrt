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

@ABIMarker(BarcodeScannerEnableScannerRequestEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerEnableScannerRequestEventArgs;{956c9419-7b4e-4451-8c41-8e10cfbc5b41})")
@WinRTByReference(brClass = BarcodeScannerEnableScannerRequestEventArgs.ByReference::class)
public class BarcodeScannerEnableScannerRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerEnableScannerRequestEventArgs.WithDefault, IWinRTObject {
  private val __2016799377_Interface: IBarcodeScannerEnableScannerRequestEventArgs.WithDefault by
      lazy {
    as_2016799377()
  }


  public override val __2016799377_Ptr: JNAPointer? by lazy {
    __2016799377_Interface.__2016799377_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2016799377_Interface)

  private fun as_2016799377(): IBarcodeScannerEnableScannerRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerEnableScannerRequestEventArgs.ABI.makeIBarcodeScannerEnableScannerRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerEnableScannerRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerEnableScannerRequestEventArgs.ABI.makeIBarcodeScannerEnableScannerRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerEnableScannerRequestEventArgs> {
    public override fun getValue() =
        BarcodeScannerEnableScannerRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerEnableScannerRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerEnableScannerRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerEnableScannerRequestEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerEnableScannerRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerEnableScannerRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
