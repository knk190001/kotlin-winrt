package Windows.ApplicationModel.Store.Preview

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

@ABIMarker(DeliveryOptimizationSettings.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.DeliveryOptimizationSettings;{1810fda0-e853-565e-b874-7a8a7b9a0e0f})")
@WinRTByReference(brClass = DeliveryOptimizationSettings.ByReference::class)
public class DeliveryOptimizationSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeliveryOptimizationSettings.WithDefault, IWinRTObject {
  private val __1075894724_Interface: IDeliveryOptimizationSettings.WithDefault by lazy {
    as_1075894724()
  }


  public override val __1075894724_Ptr: JNAPointer? by lazy {
    __1075894724_Interface.__1075894724_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1075894724_Interface)

  private fun as_1075894724(): IDeliveryOptimizationSettings.WithDefault {
    if(pointer == NULL) {
      return(IDeliveryOptimizationSettings.ABI.makeIDeliveryOptimizationSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeliveryOptimizationSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeliveryOptimizationSettings.ABI.makeIDeliveryOptimizationSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeliveryOptimizationSettings> {
    public override fun getValue() = DeliveryOptimizationSettings(pointer.getPointer(0))

    public fun setValue(value: DeliveryOptimizationSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeliveryOptimizationSettings, MemoryAddress> {
    public val IDeliveryOptimizationSettingsStatics_Instance: IDeliveryOptimizationSettingsStatics
        by lazy {
      createIDeliveryOptimizationSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDeliveryOptimizationSettingsStatics(): IDeliveryOptimizationSettingsStatics {
      val refiid = Guid.REFIID(IDeliveryOptimizationSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.Preview.DeliveryOptimizationSettings".toHandle(),refiid,interfacePtr)
      val result =
          IDeliveryOptimizationSettingsStatics.ABI.makeIDeliveryOptimizationSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DeliveryOptimizationSettings {
      val address = segment.toRawLongValue()
      return DeliveryOptimizationSettings(Pointer(address))
    }

    public override fun toNative(obj: DeliveryOptimizationSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetCurrentSettings() =
        ABI.IDeliveryOptimizationSettingsStatics_Instance.GetCurrentSettings()
  }
}
