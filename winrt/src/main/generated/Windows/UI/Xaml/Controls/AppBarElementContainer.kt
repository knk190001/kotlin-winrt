package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IAppBarElementContainerFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppBarElementContainer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.AppBarElementContainer;{1d5ba067-a990-5dab-a9c3-e6be56642a1a})")
@WinRTByReference(brClass = AppBarElementContainer.ByReference::class)
public open class AppBarElementContainer(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IAppBarElementContainer.WithDefault, ICommandBarElement.WithDefault,
    ICommandBarElement2.WithDefault, IWinRTObject {
  private val __1048743341_Interface: IAppBarElementContainer.WithDefault by lazy {
    as_1048743341()
  }


  private val __1747695496_Interface: ICommandBarElement.WithDefault by lazy {
    as_1747695496()
  }


  private val __1656014522_Interface: ICommandBarElement2.WithDefault by lazy {
    as_1656014522()
  }


  public override val __1048743341_Ptr: JNAPointer? by lazy {
    __1048743341_Interface.__1048743341_Ptr
  }


  public override val __1747695496_Ptr: JNAPointer? by lazy {
    __1747695496_Interface.__1747695496_Ptr
  }


  public override val __1656014522_Ptr: JNAPointer? by lazy {
    __1656014522_Interface.__1656014522_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1048743341_Interface, __1747695496_Interface, __1656014522_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1048743341(): IAppBarElementContainer.WithDefault {
    if(pointer == NULL) {
      return(IAppBarElementContainer.ABI.makeIAppBarElementContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarElementContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarElementContainer.ABI.makeIAppBarElementContainer(ref.value))
  }

  private fun as_1747695496(): ICommandBarElement.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarElement.ABI.makeICommandBarElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarElement.ABI.makeICommandBarElement(ref.value))
  }

  private fun as_1656014522(): ICommandBarElement2.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarElement2.ABI.makeICommandBarElement2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarElement2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarElement2.ABI.makeICommandBarElement2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBarElementContainer> {
    public override fun getValue() = AppBarElementContainer(pointer.getPointer(0))

    public fun setValue(value: AppBarElementContainer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBarElementContainer, MemoryAddress> {
    public val IAppBarElementContainerStatics_Instance: IAppBarElementContainerStatics by lazy {
      createIAppBarElementContainerStatics()
    }


    public val IAppBarElementContainerFactory_Instance: IAppBarElementContainerFactory by lazy {
      createIAppBarElementContainerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarElementContainerStatics(): IAppBarElementContainerStatics {
      val refiid = Guid.REFIID(IAppBarElementContainerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarElementContainer".toHandle(),refiid,interfacePtr)
      val result =
          IAppBarElementContainerStatics.ABI.makeIAppBarElementContainerStatics(interfacePtr.value)
      return result
    }

    public fun createIAppBarElementContainerFactory(): IAppBarElementContainerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarElementContainer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppBarElementContainerFactory.ABI.makeIAppBarElementContainerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IAppBarElementContainerFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppBarElementContainer {
      val address = segment.toRawLongValue()
      return AppBarElementContainer(Pointer(address))
    }

    public override fun toNative(obj: AppBarElementContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsCompactProperty() =
        ABI.IAppBarElementContainerStatics_Instance.get_IsCompactProperty()

    public fun get_IsInOverflowProperty() =
        ABI.IAppBarElementContainerStatics_Instance.get_IsInOverflowProperty()

    public fun get_DynamicOverflowOrderProperty() =
        ABI.IAppBarElementContainerStatics_Instance.get_DynamicOverflowOrderProperty()
  }
}
