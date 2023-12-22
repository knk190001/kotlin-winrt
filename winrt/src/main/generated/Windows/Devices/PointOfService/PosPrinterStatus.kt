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

@ABIMarker(PosPrinterStatus.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.PosPrinterStatus;{d1f0c730-da40-4328-bf76-5156fa33b747})")
@WinRTByReference(brClass = PosPrinterStatus.ByReference::class)
public class PosPrinterStatus(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPosPrinterStatus.WithDefault, IWinRTObject {
  private val __516062167_Interface: IPosPrinterStatus.WithDefault by lazy {
    as_516062167()
  }


  public override val __516062167_Ptr: JNAPointer? by lazy {
    __516062167_Interface.__516062167_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__516062167_Interface)

  private fun as_516062167(): IPosPrinterStatus.WithDefault {
    if(pointer == NULL) {
      return(IPosPrinterStatus.ABI.makeIPosPrinterStatus(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPosPrinterStatus>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPosPrinterStatus.ABI.makeIPosPrinterStatus(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PosPrinterStatus> {
    public override fun getValue() = PosPrinterStatus(pointer.getPointer(0))

    public fun setValue(value: PosPrinterStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PosPrinterStatus, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PosPrinterStatus {
      val address = segment.toRawLongValue()
      return PosPrinterStatus(Pointer(address))
    }

    public override fun toNative(obj: PosPrinterStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
