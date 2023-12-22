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

@ABIMarker(PosPrinterStatusUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.PosPrinterStatusUpdatedEventArgs;{2edb87df-13a6-428d-ba81-b0e7c3e5a3cd})")
@WinRTByReference(brClass = PosPrinterStatusUpdatedEventArgs.ByReference::class)
public class PosPrinterStatusUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPosPrinterStatusUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __1484919277_Interface: IPosPrinterStatusUpdatedEventArgs.WithDefault by lazy {
    as_1484919277()
  }


  public override val __1484919277_Ptr: JNAPointer? by lazy {
    __1484919277_Interface.__1484919277_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1484919277_Interface)

  private fun as_1484919277(): IPosPrinterStatusUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPosPrinterStatusUpdatedEventArgs.ABI.makeIPosPrinterStatusUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPosPrinterStatusUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPosPrinterStatusUpdatedEventArgs.ABI.makeIPosPrinterStatusUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PosPrinterStatusUpdatedEventArgs> {
    public override fun getValue() = PosPrinterStatusUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PosPrinterStatusUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PosPrinterStatusUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PosPrinterStatusUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return PosPrinterStatusUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PosPrinterStatusUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
