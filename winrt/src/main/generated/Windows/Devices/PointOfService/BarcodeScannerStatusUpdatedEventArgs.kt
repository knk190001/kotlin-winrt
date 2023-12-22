package Windows.Devices.PointOfService

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

@ABIMarker(BarcodeScannerStatusUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.BarcodeScannerStatusUpdatedEventArgs;{355d8586-9c43-462b-a91a-816dc97f452c})")
@WinRTByReference(brClass = BarcodeScannerStatusUpdatedEventArgs.ByReference::class)
public class BarcodeScannerStatusUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerStatusUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __328320309_Interface: IBarcodeScannerStatusUpdatedEventArgs.WithDefault by lazy {
    as_328320309()
  }


  public override val __328320309_Ptr: JNAPointer? by lazy {
    __328320309_Interface.__328320309_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__328320309_Interface)

  private fun as_328320309(): IBarcodeScannerStatusUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerStatusUpdatedEventArgs.ABI.makeIBarcodeScannerStatusUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerStatusUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerStatusUpdatedEventArgs.ABI.makeIBarcodeScannerStatusUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerStatusUpdatedEventArgs> {
    public override fun getValue() = BarcodeScannerStatusUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerStatusUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerStatusUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BarcodeScannerStatusUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerStatusUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerStatusUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
