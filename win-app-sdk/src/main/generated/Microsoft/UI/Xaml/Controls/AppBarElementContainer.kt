package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAppBarElementContainerFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.Controls.AppBarElementContainer;{55d90715-70bc-5b2b-bd12-a940297f935f})")
@WinRTByReference(brClass = AppBarElementContainer.ByReference::class)
public open class AppBarElementContainer(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IAppBarElementContainer.WithDefault, ICommandBarElement.WithDefault,
    IWinRTObject {
  private val __1850573246_Interface: IAppBarElementContainer.WithDefault by lazy {
    as_1850573246()
  }


  private val __814939603_Interface: ICommandBarElement.WithDefault by lazy {
    as_814939603()
  }


  public override val __1850573246_Ptr: JNAPointer? by lazy {
    __1850573246_Interface.__1850573246_Ptr
  }


  public override val __814939603_Ptr: JNAPointer? by lazy {
    __814939603_Interface.__814939603_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1850573246_Interface, __814939603_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1850573246(): IAppBarElementContainer.WithDefault {
    if(pointer == NULL) {
      return(IAppBarElementContainer.ABI.makeIAppBarElementContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarElementContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarElementContainer.ABI.makeIAppBarElementContainer(ref.value))
  }

  private fun as_814939603(): ICommandBarElement.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarElement.ABI.makeICommandBarElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarElement.ABI.makeICommandBarElement(ref.value))
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AppBarElementContainer".toHandle(),refiid,interfacePtr)
      val result =
          IAppBarElementContainerStatics.ABI.makeIAppBarElementContainerStatics(interfacePtr.value)
      return result
    }

    public fun createIAppBarElementContainerFactory(): IAppBarElementContainerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AppBarElementContainer".toHandle(),refiid,factoryActivatorPtr)
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
