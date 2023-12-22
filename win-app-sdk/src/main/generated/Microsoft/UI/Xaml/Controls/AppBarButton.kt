package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAppBarButtonFactory.ABI.IID
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

@ABIMarker(AppBarButton.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AppBarButton;{8ab0e278-b6ae-569e-8dcd-d293552fe4d5})")
@WinRTByReference(brClass = AppBarButton.ByReference::class)
public open class AppBarButton(
  ptr: JNAPointer? = NULL
) : Button(ptr), IAppBarButton.WithDefault, ICommandBarElement.WithDefault, IWinRTObject {
  private val __1125763915_Interface: IAppBarButton.WithDefault by lazy {
    as_1125763915()
  }


  private val __814939603_Interface: ICommandBarElement.WithDefault by lazy {
    as_814939603()
  }


  public override val __1125763915_Ptr: JNAPointer? by lazy {
    __1125763915_Interface.__1125763915_Ptr
  }


  public override val __814939603_Ptr: JNAPointer? by lazy {
    __814939603_Interface.__814939603_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1125763915_Interface, __814939603_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1125763915(): IAppBarButton.WithDefault {
    if(pointer == NULL) {
      return(IAppBarButton.ABI.makeIAppBarButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarButton.ABI.makeIAppBarButton(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppBarButton> {
    public override fun getValue() = AppBarButton(pointer.getPointer(0))

    public fun setValue(value: AppBarButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBarButton, MemoryAddress> {
    public val IAppBarButtonStatics_Instance: IAppBarButtonStatics by lazy {
      createIAppBarButtonStatics()
    }


    public val IAppBarButtonFactory_Instance: IAppBarButtonFactory by lazy {
      createIAppBarButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarButtonStatics(): IAppBarButtonStatics {
      val refiid = Guid.REFIID(IAppBarButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AppBarButton".toHandle(),refiid,interfacePtr)
      val result = IAppBarButtonStatics.ABI.makeIAppBarButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIAppBarButtonFactory(): IAppBarButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AppBarButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppBarButtonFactory.ABI.makeIAppBarButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAppBarButtonFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppBarButton {
      val address = segment.toRawLongValue()
      return AppBarButton(Pointer(address))
    }

    public override fun toNative(obj: AppBarButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LabelProperty() = ABI.IAppBarButtonStatics_Instance.get_LabelProperty()

    public fun get_IconProperty() = ABI.IAppBarButtonStatics_Instance.get_IconProperty()

    public fun get_LabelPositionProperty() =
        ABI.IAppBarButtonStatics_Instance.get_LabelPositionProperty()

    public fun get_KeyboardAcceleratorTextOverrideProperty() =
        ABI.IAppBarButtonStatics_Instance.get_KeyboardAcceleratorTextOverrideProperty()

    public fun get_IsCompactProperty() = ABI.IAppBarButtonStatics_Instance.get_IsCompactProperty()

    public fun get_IsInOverflowProperty() =
        ABI.IAppBarButtonStatics_Instance.get_IsInOverflowProperty()

    public fun get_DynamicOverflowOrderProperty() =
        ABI.IAppBarButtonStatics_Instance.get_DynamicOverflowOrderProperty()
  }
}
