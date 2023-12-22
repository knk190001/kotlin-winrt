package Windows.UI.Xaml

import Windows.UI.Xaml.Controls.Control
import Windows.UI.Xaml.IVisualStateManagerFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(VisualStateManager.ABI::class)
@Signature("rc(Windows.UI.Xaml.VisualStateManager;{6fda9f9a-6fab-4112-9258-1006a3c3476e})")
@WinRTByReference(brClass = VisualStateManager.ByReference::class)
public open class VisualStateManager(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IVisualStateManager.WithDefault,
    IVisualStateManagerProtected.WithDefault, IVisualStateManagerOverrides.WithDefault, IWinRTObject
    {
  private val __687186162_Interface: IVisualStateManager.WithDefault by lazy {
    as_687186162()
  }


  private val __1684094016_Interface: IVisualStateManagerProtected.WithDefault by lazy {
    as_1684094016()
  }


  private val __1542663865_Interface: IVisualStateManagerOverrides.WithDefault by lazy {
    as_1542663865()
  }


  public override val __687186162_Ptr: JNAPointer? by lazy {
    __687186162_Interface.__687186162_Ptr
  }


  public override val __1684094016_Ptr: JNAPointer? by lazy {
    __1684094016_Interface.__1684094016_Ptr
  }


  public override val __1542663865_Ptr: JNAPointer? by lazy {
    __1542663865_Interface.__1542663865_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__687186162_Interface, __1684094016_Interface, __1542663865_Interface)

  public constructor() : this(ABI.activate())

  private fun as_687186162(): IVisualStateManager.WithDefault {
    if(pointer == NULL) {
      return(IVisualStateManager.ABI.makeIVisualStateManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualStateManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualStateManager.ABI.makeIVisualStateManager(ref.value))
  }

  private fun as_1684094016(): IVisualStateManagerProtected.WithDefault {
    if(pointer == NULL) {
      return(IVisualStateManagerProtected.ABI.makeIVisualStateManagerProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualStateManagerProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualStateManagerProtected.ABI.makeIVisualStateManagerProtected(ref.value))
  }

  private fun as_1542663865(): IVisualStateManagerOverrides.WithDefault {
    if(pointer == NULL) {
      return(IVisualStateManagerOverrides.ABI.makeIVisualStateManagerOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualStateManagerOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualStateManagerOverrides.ABI.makeIVisualStateManagerOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VisualStateManager> {
    public override fun getValue() = VisualStateManager(pointer.getPointer(0))

    public fun setValue(value: VisualStateManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualStateManager, MemoryAddress> {
    public val IVisualStateManagerStatics_Instance: IVisualStateManagerStatics by lazy {
      createIVisualStateManagerStatics()
    }


    public val IVisualStateManagerFactory_Instance: IVisualStateManagerFactory by lazy {
      createIVisualStateManagerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVisualStateManagerStatics(): IVisualStateManagerStatics {
      val refiid = Guid.REFIID(IVisualStateManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.VisualStateManager".toHandle(),refiid,interfacePtr)
      val result = IVisualStateManagerStatics.ABI.makeIVisualStateManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIVisualStateManagerFactory(): IVisualStateManagerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.VisualStateManager".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVisualStateManagerFactory.ABI.makeIVisualStateManagerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IVisualStateManagerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): VisualStateManager {
      val address = segment.toRawLongValue()
      return VisualStateManager(Pointer(address))
    }

    public override fun toNative(obj: VisualStateManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetVisualStateGroups(obj: FrameworkElement) =
        ABI.IVisualStateManagerStatics_Instance.GetVisualStateGroups(obj)

    public fun get_CustomVisualStateManagerProperty() =
        ABI.IVisualStateManagerStatics_Instance.get_CustomVisualStateManagerProperty()

    public fun GetCustomVisualStateManager(obj: FrameworkElement) =
        ABI.IVisualStateManagerStatics_Instance.GetCustomVisualStateManager(obj)

    public fun SetCustomVisualStateManager(obj: FrameworkElement, value: VisualStateManager) =
        ABI.IVisualStateManagerStatics_Instance.SetCustomVisualStateManager(obj, value)

    public fun GoToState(
      control: Control,
      stateName: String,
      useTransitions: Boolean
    ) = ABI.IVisualStateManagerStatics_Instance.GoToState(control, stateName, useTransitions)
  }
}
