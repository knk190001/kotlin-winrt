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

@ABIMarker(BarcodeScannerProviderTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerProviderTriggerDetails;{50856d82-24e3-48ce-99c7-70aac1cbc9f7})")
@WinRTByReference(brClass = BarcodeScannerProviderTriggerDetails.ByReference::class)
public class BarcodeScannerProviderTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerProviderTriggerDetails.WithDefault, IWinRTObject {
  private val __1783238451_Interface: IBarcodeScannerProviderTriggerDetails.WithDefault by lazy {
    as_1783238451()
  }


  public override val __1783238451_Ptr: JNAPointer? by lazy {
    __1783238451_Interface.__1783238451_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1783238451_Interface)

  private fun as_1783238451(): IBarcodeScannerProviderTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerProviderTriggerDetails.ABI.makeIBarcodeScannerProviderTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerProviderTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerProviderTriggerDetails.ABI.makeIBarcodeScannerProviderTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerProviderTriggerDetails> {
    public override fun getValue() = BarcodeScannerProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerProviderTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerProviderTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BarcodeScannerProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return BarcodeScannerProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
