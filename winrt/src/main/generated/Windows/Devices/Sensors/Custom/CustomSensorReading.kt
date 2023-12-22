package Windows.Devices.Sensors.Custom

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

@ABIMarker(CustomSensorReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.Custom.CustomSensorReading;{64004f4d-446a-4366-a87a-5f963268ec53})")
@WinRTByReference(brClass = CustomSensorReading.ByReference::class)
public class CustomSensorReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICustomSensorReading.WithDefault, ICustomSensorReading2.WithDefault,
    IWinRTObject {
  private val __1590878714_Interface: ICustomSensorReading.WithDefault by lazy {
    as_1590878714()
  }


  private val __2072599928_Interface: ICustomSensorReading2.WithDefault by lazy {
    as_2072599928()
  }


  public override val __1590878714_Ptr: JNAPointer? by lazy {
    __1590878714_Interface.__1590878714_Ptr
  }


  public override val __2072599928_Ptr: JNAPointer? by lazy {
    __2072599928_Interface.__2072599928_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1590878714_Interface, __2072599928_Interface)

  private fun as_1590878714(): ICustomSensorReading.WithDefault {
    if(pointer == NULL) {
      return(ICustomSensorReading.ABI.makeICustomSensorReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICustomSensorReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICustomSensorReading.ABI.makeICustomSensorReading(ref.value))
  }

  private fun as_2072599928(): ICustomSensorReading2.WithDefault {
    if(pointer == NULL) {
      return(ICustomSensorReading2.ABI.makeICustomSensorReading2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICustomSensorReading2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICustomSensorReading2.ABI.makeICustomSensorReading2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CustomSensorReading> {
    public override fun getValue() = CustomSensorReading(pointer.getPointer(0))

    public fun setValue(value: CustomSensorReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CustomSensorReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CustomSensorReading {
      val address = segment.toRawLongValue()
      return CustomSensorReading(Pointer(address))
    }

    public override fun toNative(obj: CustomSensorReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
