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

@ABIMarker(GattLocalCharacteristic.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattLocalCharacteristic;{aede376d-5412-4d74-92a8-8deb8526829c})")
@WinRTByReference(brClass = GattLocalCharacteristic.ByReference::class)
public class GattLocalCharacteristic(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattLocalCharacteristic.WithDefault, IWinRTObject {
  private val __2036066997_Interface: IGattLocalCharacteristic.WithDefault by lazy {
    as_2036066997()
  }


  public override val __2036066997_Ptr: JNAPointer? by lazy {
    __2036066997_Interface.__2036066997_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2036066997_Interface)

  private fun as_2036066997(): IGattLocalCharacteristic.WithDefault {
    if(pointer == NULL) {
      return(IGattLocalCharacteristic.ABI.makeIGattLocalCharacteristic(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattLocalCharacteristic>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattLocalCharacteristic.ABI.makeIGattLocalCharacteristic(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattLocalCharacteristic> {
    public override fun getValue() = GattLocalCharacteristic(pointer.getPointer(0))

    public fun setValue(value: GattLocalCharacteristic): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattLocalCharacteristic, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattLocalCharacteristic {
      val address = segment.toRawLongValue()
      return GattLocalCharacteristic(Pointer(address))
    }

    public override fun toNative(obj: GattLocalCharacteristic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
