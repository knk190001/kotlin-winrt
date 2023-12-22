package Windows.UI.Xaml

import Windows.Foundation.Uri
import Windows.UI.Xaml.Controls.Primitives.ComponentResourceLocation
import Windows.UI.Xaml.IApplicationFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Application;{74b861a1-7487-46a9-9a6e-c78b512726c5})")
@WinRTByReference(brClass = Application.ByReference::class)
public open class Application(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IApplication.WithDefault, IApplication2.WithDefault,
    IApplication3.WithDefault, IApplicationOverrides.WithDefault,
    IApplicationOverrides2.WithDefault, IWinRTObject {
  private val __1645774914_Interface: IApplication.WithDefault by lazy {
    as_1645774914()
  }


  private val __520585268_Interface: IApplication2.WithDefault by lazy {
    as_520585268()
  }


  private val __520585269_Interface: IApplication3.WithDefault by lazy {
    as_520585269()
  }


  private val __758195191_Interface: IApplicationOverrides.WithDefault by lazy {
    as_758195191()
  }


  private val __2029214391_Interface: IApplicationOverrides2.WithDefault by lazy {
    as_2029214391()
  }


  public override val __1645774914_Ptr: JNAPointer? by lazy {
    __1645774914_Interface.__1645774914_Ptr
  }


  public override val __520585268_Ptr: JNAPointer? by lazy {
    __520585268_Interface.__520585268_Ptr
  }


  public override val __520585269_Ptr: JNAPointer? by lazy {
    __520585269_Interface.__520585269_Ptr
  }


  public override val __758195191_Ptr: JNAPointer? by lazy {
    __758195191_Interface.__758195191_Ptr
  }


  public override val __2029214391_Ptr: JNAPointer? by lazy {
    __2029214391_Interface.__2029214391_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1645774914_Interface, __520585268_Interface, __520585269_Interface,
        __758195191_Interface, __2029214391_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1645774914(): IApplication.WithDefault {
    if(pointer == NULL) {
      return(IApplication.ABI.makeIApplication(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplication>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplication.ABI.makeIApplication(ref.value))
  }

  private fun as_520585268(): IApplication2.WithDefault {
    if(pointer == NULL) {
      return(IApplication2.ABI.makeIApplication2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplication2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplication2.ABI.makeIApplication2(ref.value))
  }

  private fun as_520585269(): IApplication3.WithDefault {
    if(pointer == NULL) {
      return(IApplication3.ABI.makeIApplication3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplication3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplication3.ABI.makeIApplication3(ref.value))
  }

  private fun as_758195191(): IApplicationOverrides.WithDefault {
    if(pointer == NULL) {
      return(IApplicationOverrides.ABI.makeIApplicationOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationOverrides.ABI.makeIApplicationOverrides(ref.value))
  }

  private fun as_2029214391(): IApplicationOverrides2.WithDefault {
    if(pointer == NULL) {
      return(IApplicationOverrides2.ABI.makeIApplicationOverrides2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationOverrides2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationOverrides2.ABI.makeIApplicationOverrides2(ref.value))
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
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Application".toHandle(),refiid,interfacePtr)
      val result = IApplicationStatics.ABI.makeIApplicationStatics(interfacePtr.value)
      return result
    }

    public fun createIApplicationFactory(): IApplicationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Application".toHandle(),refiid,factoryActivatorPtr)
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
