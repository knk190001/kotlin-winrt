package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(GattReadClientCharacteristicConfigurationDescriptorResult.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadClientCharacteristicConfigurationDescriptorResult;{63a66f09-1aea-4c4c-a50f-97bae474b348})")
@WinRTByReference(brClass =
    GattReadClientCharacteristicConfigurationDescriptorResult.ByReference::class)
public class GattReadClientCharacteristicConfigurationDescriptorResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattReadClientCharacteristicConfigurationDescriptorResult.WithDefault,
    IGattReadClientCharacteristicConfigurationDescriptorResult2.WithDefault, IWinRTObject {
  private val __349117429_Interface:
      IGattReadClientCharacteristicConfigurationDescriptorResult.WithDefault by lazy {
    as_349117429()
  }


  private val __2062261639_Interface:
      IGattReadClientCharacteristicConfigurationDescriptorResult2.WithDefault by lazy {
    as_2062261639()
  }


  public override val __349117429_Ptr: JNAPointer? by lazy {
    __349117429_Interface.__349117429_Ptr
  }


  public override val __2062261639_Ptr: JNAPointer? by lazy {
    __2062261639_Interface.__2062261639_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__349117429_Interface, __2062261639_Interface)

  private fun as_349117429():
      IGattReadClientCharacteristicConfigurationDescriptorResult.WithDefault {
    if(pointer == NULL) {
      return(IGattReadClientCharacteristicConfigurationDescriptorResult.ABI.makeIGattReadClientCharacteristicConfigurationDescriptorResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattReadClientCharacteristicConfigurationDescriptorResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattReadClientCharacteristicConfigurationDescriptorResult.ABI.makeIGattReadClientCharacteristicConfigurationDescriptorResult(ref.value))
  }

  private fun as_2062261639():
      IGattReadClientCharacteristicConfigurationDescriptorResult2.WithDefault {
    if(pointer == NULL) {
      return(IGattReadClientCharacteristicConfigurationDescriptorResult2.ABI.makeIGattReadClientCharacteristicConfigurationDescriptorResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattReadClientCharacteristicConfigurationDescriptorResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattReadClientCharacteristicConfigurationDescriptorResult2.ABI.makeIGattReadClientCharacteristicConfigurationDescriptorResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattReadClientCharacteristicConfigurationDescriptorResult> {
    public override fun getValue() =
        GattReadClientCharacteristicConfigurationDescriptorResult(pointer.getPointer(0))

    public fun setValue(value: GattReadClientCharacteristicConfigurationDescriptorResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattReadClientCharacteristicConfigurationDescriptorResult, MemoryAddress>
      {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        GattReadClientCharacteristicConfigurationDescriptorResult {
      val address = segment.toRawLongValue()
      return GattReadClientCharacteristicConfigurationDescriptorResult(Pointer(address))
    }

    public override fun toNative(obj: GattReadClientCharacteristicConfigurationDescriptorResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
