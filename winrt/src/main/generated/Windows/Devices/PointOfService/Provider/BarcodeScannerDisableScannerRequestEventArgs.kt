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

@ABIMarker(BarcodeScannerDisableScannerRequestEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerDisableScannerRequestEventArgs;{7006e142-e802-46f5-b604-352a15ce9232})")
@WinRTByReference(brClass = BarcodeScannerDisableScannerRequestEventArgs.ByReference::class)
public class BarcodeScannerDisableScannerRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerDisableScannerRequestEventArgs.WithDefault, IWinRTObject {
  private val __1185499152_Interface: IBarcodeScannerDisableScannerRequestEventArgs.WithDefault by
      lazy {
    as_1185499152()
  }


  public override val __1185499152_Ptr: JNAPointer? by lazy {
    __1185499152_Interface.__1185499152_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1185499152_Interface)

  private fun as_1185499152(): IBarcodeScannerDisableScannerRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerDisableScannerRequestEventArgs.ABI.makeIBarcodeScannerDisableScannerRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerDisableScannerRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerDisableScannerRequestEventArgs.ABI.makeIBarcodeScannerDisableScannerRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerDisableScannerRequestEventArgs> {
    public override fun getValue() =
        BarcodeScannerDisableScannerRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerDisableScannerRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerDisableScannerRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerDisableScannerRequestEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerDisableScannerRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerDisableScannerRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
