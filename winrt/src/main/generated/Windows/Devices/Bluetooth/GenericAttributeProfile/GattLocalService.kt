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

@ABIMarker(GattLocalService.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattLocalService;{f513e258-f7f7-4902-b803-57fcc7d6fe83})")
@WinRTByReference(brClass = GattLocalService.ByReference::class)
public class GattLocalService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattLocalService.WithDefault, IWinRTObject {
  private val __255260933_Interface: IGattLocalService.WithDefault by lazy {
    as_255260933()
  }


  public override val __255260933_Ptr: JNAPointer? by lazy {
    __255260933_Interface.__255260933_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__255260933_Interface)

  private fun as_255260933(): IGattLocalService.WithDefault {
    if(pointer == NULL) {
      return(IGattLocalService.ABI.makeIGattLocalService(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattLocalService>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattLocalService.ABI.makeIGattLocalService(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattLocalService> {
    public override fun getValue() = GattLocalService(pointer.getPointer(0))

    public fun setValue(value: GattLocalService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattLocalService, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattLocalService {
      val address = segment.toRawLongValue()
      return GattLocalService(Pointer(address))
    }

    public override fun toNative(obj: GattLocalService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
