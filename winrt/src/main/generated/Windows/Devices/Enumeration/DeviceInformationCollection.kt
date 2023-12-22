package Windows.Devices.Enumeration

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(DeviceInformationCollection.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceInformationCollection;pinterface({bbe1fa4c-b0e3-4583-baef-1f1b2e483e56};rc(Windows.Devices.Enumeration.DeviceInformation;{aba0fb95-4398-489d-8e44-e6130927011f})))")
@WinRTByReference(brClass = DeviceInformationCollection.ByReference::class)
public class DeviceInformationCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVectorView<DeviceInformation?>, IIterable<DeviceInformation?>, IWinRTObject {
  private val __970637876_Interface: IVectorView<DeviceInformation?> by lazy {
    as_970637876()
  }


  private val __1449643190_Interface: IIterable<DeviceInformation?> by lazy {
    as_1449643190()
  }


  public override val __970637876_Type: KType = typeOf<IVectorView<DeviceInformation?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<DeviceInformation?>>()

  public override val __970637876_Ptr: JNAPointer? by lazy {
    __970637876_Interface.__970637876_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__970637876_Interface, __1449643190_Interface)

  private fun as_970637876(): IVectorView<DeviceInformation?> {
    if(pointer == NULL) {
      return(IVectorView.ABI.makeIVectorView<DeviceInformation?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVectorView<DeviceInformation?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVectorView.ABI.makeIVectorView<DeviceInformation?>(ref.value))
  }

  private fun as_1449643190(): IIterable<DeviceInformation?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<DeviceInformation?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<DeviceInformation?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<DeviceInformation?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceInformationCollection> {
    public override fun getValue() = DeviceInformationCollection(pointer.getPointer(0))

    public fun setValue(value: DeviceInformationCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceInformationCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceInformationCollection {
      val address = segment.toRawLongValue()
      return DeviceInformationCollection(Pointer(address))
    }

    public override fun toNative(obj: DeviceInformationCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
