package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAppBarToggleButtonFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.ToggleButton
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

@ABIMarker(AppBarToggleButton.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AppBarToggleButton;{9687c0b1-c390-59be-acdc-4fc48f552823})")
@WinRTByReference(brClass = AppBarToggleButton.ByReference::class)
public open class AppBarToggleButton(
  ptr: JNAPointer? = NULL
) : ToggleButton(ptr), IAppBarToggleButton.WithDefault, ICommandBarElement.WithDefault, IWinRTObject
    {
  private val __1581346047_Interface: IAppBarToggleButton.WithDefault by lazy {
    as_1581346047()
  }


  private val __814939603_Interface: ICommandBarElement.WithDefault by lazy {
    as_814939603()
  }


  public override val __1581346047_Ptr: JNAPointer? by lazy {
    __1581346047_Interface.__1581346047_Ptr
  }


  public override val __814939603_Ptr: JNAPointer? by lazy {
    __814939603_Interface.__814939603_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1581346047_Interface, __814939603_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1581346047(): IAppBarToggleButton.WithDefault {
    if(pointer == NULL) {
      return(IAppBarToggleButton.ABI.makeIAppBarToggleButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarToggleButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarToggleButton.ABI.makeIAppBarToggleButton(ref.value))
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
      IByReference<AppBarToggleButton> {
    public override fun getValue() = AppBarToggleButton(pointer.getPointer(0))

    public fun setValue(value: AppBarToggleButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBarToggleButton, MemoryAddress> {
    public val IAppBarToggleButtonStatics_Instance: IAppBarToggleButtonStatics by lazy {
      createIAppBarToggleButtonStatics()
    }


    public val IAppBarToggleButtonFactory_Instance: IAppBarToggleButtonFactory by lazy {
      createIAppBarToggleButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarToggleButtonStatics(): IAppBarToggleButtonStatics {
      val refiid = Guid.REFIID(IAppBarToggleButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AppBarToggleButton".toHandle(),refiid,interfacePtr)
      val result = IAppBarToggleButtonStatics.ABI.makeIAppBarToggleButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIAppBarToggleButtonFactory(): IAppBarToggleButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AppBarToggleButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppBarToggleButtonFactory.ABI.makeIAppBarToggleButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAppBarToggleButtonFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppBarToggleButton {
      val address = segment.toRawLongValue()
      return AppBarToggleButton(Pointer(address))
    }

    public override fun toNative(obj: AppBarToggleButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LabelProperty() = ABI.IAppBarToggleButtonStatics_Instance.get_LabelProperty()

    public fun get_IconProperty() = ABI.IAppBarToggleButtonStatics_Instance.get_IconProperty()

    public fun get_LabelPositionProperty() =
        ABI.IAppBarToggleButtonStatics_Instance.get_LabelPositionProperty()

    public fun get_KeyboardAcceleratorTextOverrideProperty() =
        ABI.IAppBarToggleButtonStatics_Instance.get_KeyboardAcceleratorTextOverrideProperty()

    public fun get_IsCompactProperty() =
        ABI.IAppBarToggleButtonStatics_Instance.get_IsCompactProperty()

    public fun get_IsInOverflowProperty() =
        ABI.IAppBarToggleButtonStatics_Instance.get_IsInOverflowProperty()

    public fun get_DynamicOverflowOrderProperty() =
        ABI.IAppBarToggleButtonStatics_Instance.get_DynamicOverflowOrderProperty()
  }
}
