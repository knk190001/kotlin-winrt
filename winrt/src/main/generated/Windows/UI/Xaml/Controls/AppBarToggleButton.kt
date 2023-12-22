package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IAppBarToggleButtonFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.ToggleButton
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
@Signature("rc(Windows.UI.Xaml.Controls.AppBarToggleButton;{2e914438-fd53-4b8d-858b-3644269f8e4d})")
@WinRTByReference(brClass = AppBarToggleButton.ByReference::class)
public open class AppBarToggleButton(
  ptr: JNAPointer? = NULL
) : ToggleButton(ptr), IAppBarToggleButton.WithDefault, IAppBarToggleButton3.WithDefault,
    IAppBarToggleButton4.WithDefault, IAppBarToggleButton5.WithDefault,
    ICommandBarElement.WithDefault, ICommandBarElement2.WithDefault, IWinRTObject {
  private val __1564282860_Interface: IAppBarToggleButton.WithDefault by lazy {
    as_1564282860()
  }


  private val __1248128353_Interface: IAppBarToggleButton3.WithDefault by lazy {
    as_1248128353()
  }


  private val __1248128352_Interface: IAppBarToggleButton4.WithDefault by lazy {
    as_1248128352()
  }


  private val __1248128351_Interface: IAppBarToggleButton5.WithDefault by lazy {
    as_1248128351()
  }


  private val __1747695496_Interface: ICommandBarElement.WithDefault by lazy {
    as_1747695496()
  }


  private val __1656014522_Interface: ICommandBarElement2.WithDefault by lazy {
    as_1656014522()
  }


  public override val __1564282860_Ptr: JNAPointer? by lazy {
    __1564282860_Interface.__1564282860_Ptr
  }


  public override val __1248128353_Ptr: JNAPointer? by lazy {
    __1248128353_Interface.__1248128353_Ptr
  }


  public override val __1248128352_Ptr: JNAPointer? by lazy {
    __1248128352_Interface.__1248128352_Ptr
  }


  public override val __1248128351_Ptr: JNAPointer? by lazy {
    __1248128351_Interface.__1248128351_Ptr
  }


  public override val __1747695496_Ptr: JNAPointer? by lazy {
    __1747695496_Interface.__1747695496_Ptr
  }


  public override val __1656014522_Ptr: JNAPointer? by lazy {
    __1656014522_Interface.__1656014522_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1564282860_Interface, __1248128353_Interface, __1248128352_Interface,
        __1248128351_Interface, __1747695496_Interface, __1656014522_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1564282860(): IAppBarToggleButton.WithDefault {
    if(pointer == NULL) {
      return(IAppBarToggleButton.ABI.makeIAppBarToggleButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarToggleButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarToggleButton.ABI.makeIAppBarToggleButton(ref.value))
  }

  private fun as_1248128353(): IAppBarToggleButton3.WithDefault {
    if(pointer == NULL) {
      return(IAppBarToggleButton3.ABI.makeIAppBarToggleButton3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarToggleButton3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarToggleButton3.ABI.makeIAppBarToggleButton3(ref.value))
  }

  private fun as_1248128352(): IAppBarToggleButton4.WithDefault {
    if(pointer == NULL) {
      return(IAppBarToggleButton4.ABI.makeIAppBarToggleButton4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarToggleButton4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarToggleButton4.ABI.makeIAppBarToggleButton4(ref.value))
  }

  private fun as_1248128351(): IAppBarToggleButton5.WithDefault {
    if(pointer == NULL) {
      return(IAppBarToggleButton5.ABI.makeIAppBarToggleButton5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarToggleButton5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarToggleButton5.ABI.makeIAppBarToggleButton5(ref.value))
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


    public val IAppBarToggleButtonStatics4_Instance: IAppBarToggleButtonStatics4 by lazy {
      createIAppBarToggleButtonStatics4()
    }


    public val IAppBarToggleButtonStatics3_Instance: IAppBarToggleButtonStatics3 by lazy {
      createIAppBarToggleButtonStatics3()
    }


    public val IAppBarToggleButtonFactory_Instance: IAppBarToggleButtonFactory by lazy {
      createIAppBarToggleButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarToggleButtonStatics(): IAppBarToggleButtonStatics {
      val refiid = Guid.REFIID(IAppBarToggleButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarToggleButton".toHandle(),refiid,interfacePtr)
      val result = IAppBarToggleButtonStatics.ABI.makeIAppBarToggleButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIAppBarToggleButtonStatics4(): IAppBarToggleButtonStatics4 {
      val refiid = Guid.REFIID(IAppBarToggleButtonStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarToggleButton".toHandle(),refiid,interfacePtr)
      val result =
          IAppBarToggleButtonStatics4.ABI.makeIAppBarToggleButtonStatics4(interfacePtr.value)
      return result
    }

    public fun createIAppBarToggleButtonStatics3(): IAppBarToggleButtonStatics3 {
      val refiid = Guid.REFIID(IAppBarToggleButtonStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarToggleButton".toHandle(),refiid,interfacePtr)
      val result =
          IAppBarToggleButtonStatics3.ABI.makeIAppBarToggleButtonStatics3(interfacePtr.value)
      return result
    }

    public fun createIAppBarToggleButtonFactory(): IAppBarToggleButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarToggleButton".toHandle(),refiid,factoryActivatorPtr)
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

    public fun get_IsCompactProperty() =
        ABI.IAppBarToggleButtonStatics_Instance.get_IsCompactProperty()

    public fun get_KeyboardAcceleratorTextOverrideProperty() =
        ABI.IAppBarToggleButtonStatics4_Instance.get_KeyboardAcceleratorTextOverrideProperty()

    public fun get_LabelPositionProperty() =
        ABI.IAppBarToggleButtonStatics3_Instance.get_LabelPositionProperty()

    public fun get_IsInOverflowProperty() =
        ABI.IAppBarToggleButtonStatics3_Instance.get_IsInOverflowProperty()

    public fun get_DynamicOverflowOrderProperty() =
        ABI.IAppBarToggleButtonStatics3_Instance.get_DynamicOverflowOrderProperty()
  }
}
