package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.Controls.Control
import Microsoft.UI.Xaml.IVisualStateManagerFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.VisualStateManager;{342c8d32-ad61-5925-93d1-0c704df2a7d1})")
@WinRTByReference(brClass = VisualStateManager.ByReference::class)
public open class VisualStateManager(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IVisualStateManager.WithDefault,
    IVisualStateManagerProtected.WithDefault, IVisualStateManagerOverrides.WithDefault, IWinRTObject
    {
  private val __996056515_Interface: IVisualStateManager.WithDefault by lazy {
    as_996056515()
  }


  private val __534755627_Interface: IVisualStateManagerProtected.WithDefault by lazy {
    as_534755627()
  }


  private val __393325476_Interface: IVisualStateManagerOverrides.WithDefault by lazy {
    as_393325476()
  }


  public override val __996056515_Ptr: JNAPointer? by lazy {
    __996056515_Interface.__996056515_Ptr
  }


  public override val __534755627_Ptr: JNAPointer? by lazy {
    __534755627_Interface.__534755627_Ptr
  }


  public override val __393325476_Ptr: JNAPointer? by lazy {
    __393325476_Interface.__393325476_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__996056515_Interface, __534755627_Interface, __393325476_Interface)

  public constructor() : this(ABI.activate())

  private fun as_996056515(): IVisualStateManager.WithDefault {
    if(pointer == NULL) {
      return(IVisualStateManager.ABI.makeIVisualStateManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualStateManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualStateManager.ABI.makeIVisualStateManager(ref.value))
  }

  private fun as_534755627(): IVisualStateManagerProtected.WithDefault {
    if(pointer == NULL) {
      return(IVisualStateManagerProtected.ABI.makeIVisualStateManagerProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualStateManagerProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualStateManagerProtected.ABI.makeIVisualStateManagerProtected(ref.value))
  }

  private fun as_393325476(): IVisualStateManagerOverrides.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.VisualStateManager".toHandle(),refiid,interfacePtr)
      val result = IVisualStateManagerStatics.ABI.makeIVisualStateManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIVisualStateManagerFactory(): IVisualStateManagerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.VisualStateManager".toHandle(),refiid,factoryActivatorPtr)
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
