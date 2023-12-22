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

@ABIMarker(GattLocalDescriptor.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattLocalDescriptor;{f48ebe06-789d-4a4b-8652-bd017b5d2fc6})")
@WinRTByReference(brClass = GattLocalDescriptor.ByReference::class)
public class GattLocalDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattLocalDescriptor.WithDefault, IWinRTObject {
  private val __932135137_Interface: IGattLocalDescriptor.WithDefault by lazy {
    as_932135137()
  }


  public override val __932135137_Ptr: JNAPointer? by lazy {
    __932135137_Interface.__932135137_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__932135137_Interface)

  private fun as_932135137(): IGattLocalDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IGattLocalDescriptor.ABI.makeIGattLocalDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattLocalDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattLocalDescriptor.ABI.makeIGattLocalDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattLocalDescriptor> {
    public override fun getValue() = GattLocalDescriptor(pointer.getPointer(0))

    public fun setValue(value: GattLocalDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattLocalDescriptor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattLocalDescriptor {
      val address = segment.toRawLongValue()
      return GattLocalDescriptor(Pointer(address))
    }

    public override fun toNative(obj: GattLocalDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
