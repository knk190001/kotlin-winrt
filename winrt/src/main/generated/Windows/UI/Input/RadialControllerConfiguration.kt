package Windows.UI.Input

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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RadialControllerConfiguration.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerConfiguration;{a6b79ecb-6a52-4430-910c-56370a9d6b42})")
@WinRTByReference(brClass = RadialControllerConfiguration.ByReference::class)
public class RadialControllerConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerConfiguration.WithDefault,
    IRadialControllerConfiguration2.WithDefault, IWinRTObject {
  private val __956594291_Interface: IRadialControllerConfiguration.WithDefault by lazy {
    as_956594291()
  }


  private val __410348101_Interface: IRadialControllerConfiguration2.WithDefault by lazy {
    as_410348101()
  }


  public override val __956594291_Ptr: JNAPointer? by lazy {
    __956594291_Interface.__956594291_Ptr
  }


  public override val __410348101_Ptr: JNAPointer? by lazy {
    __410348101_Interface.__410348101_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__956594291_Interface, __410348101_Interface)

  private fun as_956594291(): IRadialControllerConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerConfiguration.ABI.makeIRadialControllerConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerConfiguration.ABI.makeIRadialControllerConfiguration(ref.value))
  }

  private fun as_410348101(): IRadialControllerConfiguration2.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerConfiguration2.ABI.makeIRadialControllerConfiguration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerConfiguration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerConfiguration2.ABI.makeIRadialControllerConfiguration2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerConfiguration> {
    public override fun getValue() = RadialControllerConfiguration(pointer.getPointer(0))

    public fun setValue(value: RadialControllerConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerConfiguration, MemoryAddress> {
    public val IRadialControllerConfigurationStatics2_Instance:
        IRadialControllerConfigurationStatics2 by lazy {
      createIRadialControllerConfigurationStatics2()
    }


    public val IRadialControllerConfigurationStatics_Instance: IRadialControllerConfigurationStatics
        by lazy {
      createIRadialControllerConfigurationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRadialControllerConfigurationStatics2():
        IRadialControllerConfigurationStatics2 {
      val refiid = Guid.REFIID(IRadialControllerConfigurationStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.RadialControllerConfiguration".toHandle(),refiid,interfacePtr)
      val result =
          IRadialControllerConfigurationStatics2.ABI.makeIRadialControllerConfigurationStatics2(interfacePtr.value)
      return result
    }

    public fun createIRadialControllerConfigurationStatics():
        IRadialControllerConfigurationStatics {
      val refiid = Guid.REFIID(IRadialControllerConfigurationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.RadialControllerConfiguration".toHandle(),refiid,interfacePtr)
      val result =
          IRadialControllerConfigurationStatics.ABI.makeIRadialControllerConfigurationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RadialControllerConfiguration {
      val address = segment.toRawLongValue()
      return RadialControllerConfiguration(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun put_AppController(value: RadialController) =
        ABI.IRadialControllerConfigurationStatics2_Instance.put_AppController(value)

    public fun get_AppController() =
        ABI.IRadialControllerConfigurationStatics2_Instance.get_AppController()

    public fun put_IsAppControllerEnabled(value: Boolean) =
        ABI.IRadialControllerConfigurationStatics2_Instance.put_IsAppControllerEnabled(value)

    public fun get_IsAppControllerEnabled() =
        ABI.IRadialControllerConfigurationStatics2_Instance.get_IsAppControllerEnabled()

    public fun GetForCurrentView() =
        ABI.IRadialControllerConfigurationStatics_Instance.GetForCurrentView()
  }
}
