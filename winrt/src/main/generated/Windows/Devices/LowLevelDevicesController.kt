package Windows.Devices

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(LowLevelDevicesController.ABI::class)
@Signature("rc(Windows.Devices.LowLevelDevicesController;{2ec23dd4-179b-45de-9b39-3ae02527de52})")
@WinRTByReference(brClass = LowLevelDevicesController.ByReference::class)
public class LowLevelDevicesController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILowLevelDevicesController.WithDefault, IWinRTObject {
  private val __93911278_Interface: ILowLevelDevicesController.WithDefault by lazy {
    as_93911278()
  }


  public override val __93911278_Ptr: JNAPointer? by lazy {
    __93911278_Interface.__93911278_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__93911278_Interface)

  private fun as_93911278(): ILowLevelDevicesController.WithDefault {
    if(pointer == NULL) {
      return(ILowLevelDevicesController.ABI.makeILowLevelDevicesController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILowLevelDevicesController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILowLevelDevicesController.ABI.makeILowLevelDevicesController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LowLevelDevicesController> {
    public override fun getValue() = LowLevelDevicesController(pointer.getPointer(0))

    public fun setValue(value: LowLevelDevicesController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LowLevelDevicesController, MemoryAddress> {
    public val ILowLevelDevicesControllerStatics_Instance: ILowLevelDevicesControllerStatics by
        lazy {
      createILowLevelDevicesControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILowLevelDevicesControllerStatics(): ILowLevelDevicesControllerStatics {
      val refiid = Guid.REFIID(ILowLevelDevicesControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.LowLevelDevicesController".toHandle(),refiid,interfacePtr)
      val result =
          ILowLevelDevicesControllerStatics.ABI.makeILowLevelDevicesControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LowLevelDevicesController {
      val address = segment.toRawLongValue()
      return LowLevelDevicesController(Pointer(address))
    }

    public override fun toNative(obj: LowLevelDevicesController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DefaultProvider() =
        ABI.ILowLevelDevicesControllerStatics_Instance.get_DefaultProvider()

    public fun put_DefaultProvider(value: ILowLevelDevicesAggregateProvider) =
        ABI.ILowLevelDevicesControllerStatics_Instance.put_DefaultProvider(value)
  }
}
