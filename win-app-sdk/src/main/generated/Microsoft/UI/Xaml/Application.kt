package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.Controls.Primitives.ComponentResourceLocation
import Microsoft.UI.Xaml.IApplicationFactory.ABI.IID
import Windows.Foundation.Uri
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(Application.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Application;{06a8f4e7-1146-55af-820d-ebd55643b021})")
@WinRTByReference(brClass = Application.ByReference::class)
public open class Application(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IApplication.WithDefault, IApplication2.WithDefault,
    IApplicationOverrides.WithDefault, IWinRTObject {
  private val __149214551_Interface: IApplication.WithDefault by lazy {
    as_149214551()
  }


  private val __330683735_Interface: IApplication2.WithDefault by lazy {
    as_330683735()
  }


  private val __1930314110_Interface: IApplicationOverrides.WithDefault by lazy {
    as_1930314110()
  }


  public override val __149214551_Ptr: JNAPointer? by lazy {
    __149214551_Interface.__149214551_Ptr
  }


  public override val __330683735_Ptr: JNAPointer? by lazy {
    __330683735_Interface.__330683735_Ptr
  }


  public override val __1930314110_Ptr: JNAPointer? by lazy {
    __1930314110_Interface.__1930314110_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__149214551_Interface, __330683735_Interface, __1930314110_Interface)

  public constructor() : this(ABI.activate())

  private fun as_149214551(): IApplication.WithDefault {
    if(pointer == NULL) {
      return(IApplication.ABI.makeIApplication(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplication>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplication.ABI.makeIApplication(ref.value))
  }

  private fun as_330683735(): IApplication2.WithDefault {
    if(pointer == NULL) {
      return(IApplication2.ABI.makeIApplication2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplication2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplication2.ABI.makeIApplication2(ref.value))
  }

  private fun as_1930314110(): IApplicationOverrides.WithDefault {
    if(pointer == NULL) {
      return(IApplicationOverrides.ABI.makeIApplicationOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationOverrides.ABI.makeIApplicationOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Application> {
    public override fun getValue() = Application(pointer.getPointer(0))

    public fun setValue(value: Application): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Application, MemoryAddress> {
    public val IApplicationStatics_Instance: IApplicationStatics by lazy {
      createIApplicationStatics()
    }


    public val IApplicationFactory_Instance: IApplicationFactory by lazy {
      createIApplicationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIApplicationStatics(): IApplicationStatics {
      val refiid = Guid.REFIID(IApplicationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Application".toHandle(),refiid,interfacePtr)
      val result = IApplicationStatics.ABI.makeIApplicationStatics(interfacePtr.value)
      return result
    }

    public fun createIApplicationFactory(): IApplicationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Application".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IApplicationFactory.ABI.makeIApplicationFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IApplicationFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Application {
      val address = segment.toRawLongValue()
      return Application(Pointer(address))
    }

    public override fun toNative(obj: Application): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.IApplicationStatics_Instance.get_Current()

    public fun Start(callback: ApplicationInitializationCallback) =
        ABI.IApplicationStatics_Instance.Start(callback)

    public fun LoadComponent(component: IUnknown, resourceLocator: Uri) =
        ABI.IApplicationStatics_Instance.LoadComponent(component, resourceLocator)

    public fun LoadComponent(
      component: IUnknown,
      resourceLocator: Uri,
      componentResourceLocation: ComponentResourceLocation
    ) = ABI.IApplicationStatics_Instance.LoadComponent(component, resourceLocator,
        componentResourceLocation)
  }
}
