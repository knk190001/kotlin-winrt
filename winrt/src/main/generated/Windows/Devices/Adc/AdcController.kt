package Windows.Devices.Adc

import Windows.Devices.Adc.Provider.IAdcProvider
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(AdcController.ABI::class)
@Signature("rc(Windows.Devices.Adc.AdcController;{2a76e4b0-a896-4219-86b6-ea8cdce98f56})")
@WinRTByReference(brClass = AdcController.ByReference::class)
public class AdcController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdcController.WithDefault, IWinRTObject {
  private val __836924503_Interface: IAdcController.WithDefault by lazy {
    as_836924503()
  }


  public override val __836924503_Ptr: JNAPointer? by lazy {
    __836924503_Interface.__836924503_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__836924503_Interface)

  private fun as_836924503(): IAdcController.WithDefault {
    if(pointer == NULL) {
      return(IAdcController.ABI.makeIAdcController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdcController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdcController.ABI.makeIAdcController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AdcController>
      {
    public override fun getValue() = AdcController(pointer.getPointer(0))

    public fun setValue(value: AdcController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdcController, MemoryAddress> {
    public val IAdcControllerStatics2_Instance: IAdcControllerStatics2 by lazy {
      createIAdcControllerStatics2()
    }


    public val IAdcControllerStatics_Instance: IAdcControllerStatics by lazy {
      createIAdcControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAdcControllerStatics2(): IAdcControllerStatics2 {
      val refiid = Guid.REFIID(IAdcControllerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Adc.AdcController".toHandle(),refiid,interfacePtr)
      val result = IAdcControllerStatics2.ABI.makeIAdcControllerStatics2(interfacePtr.value)
      return result
    }

    public fun createIAdcControllerStatics(): IAdcControllerStatics {
      val refiid = Guid.REFIID(IAdcControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Adc.AdcController".toHandle(),refiid,interfacePtr)
      val result = IAdcControllerStatics.ABI.makeIAdcControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AdcController {
      val address = segment.toRawLongValue()
      return AdcController(Pointer(address))
    }

    public override fun toNative(obj: AdcController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefaultAsync() = ABI.IAdcControllerStatics2_Instance.GetDefaultAsync()

    public fun GetControllersAsync(provider: IAdcProvider) =
        ABI.IAdcControllerStatics_Instance.GetControllersAsync(provider)
  }
}
