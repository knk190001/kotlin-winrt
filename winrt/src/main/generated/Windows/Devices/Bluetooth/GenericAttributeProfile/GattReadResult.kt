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

@ABIMarker(GattReadResult.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadResult;{63a66f08-1aea-4c4c-a50f-97bae474b348})")
@WinRTByReference(brClass = GattReadResult.ByReference::class)
public class GattReadResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattReadResult.WithDefault, IGattReadResult2.WithDefault, IWinRTObject {
  private val __1293782962_Interface: IGattReadResult.WithDefault by lazy {
    as_1293782962()
  }


  private val __1452566108_Interface: IGattReadResult2.WithDefault by lazy {
    as_1452566108()
  }


  public override val __1293782962_Ptr: JNAPointer? by lazy {
    __1293782962_Interface.__1293782962_Ptr
  }


  public override val __1452566108_Ptr: JNAPointer? by lazy {
    __1452566108_Interface.__1452566108_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1293782962_Interface, __1452566108_Interface)

  private fun as_1293782962(): IGattReadResult.WithDefault {
    if(pointer == NULL) {
      return(IGattReadResult.ABI.makeIGattReadResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattReadResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattReadResult.ABI.makeIGattReadResult(ref.value))
  }

  private fun as_1452566108(): IGattReadResult2.WithDefault {
    if(pointer == NULL) {
      return(IGattReadResult2.ABI.makeIGattReadResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattReadResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattReadResult2.ABI.makeIGattReadResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GattReadResult>
      {
    public override fun getValue() = GattReadResult(pointer.getPointer(0))

    public fun setValue(value: GattReadResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattReadResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattReadResult {
      val address = segment.toRawLongValue()
      return GattReadResult(Pointer(address))
    }

    public override fun toNative(obj: GattReadResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
