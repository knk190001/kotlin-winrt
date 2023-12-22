package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IAppBarButtonFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Controls.AppBarButton;{4459a451-69e8-440c-9896-4bb4f5f642d1})")
@WinRTByReference(brClass = AppBarButton.ByReference::class)
public open class AppBarButton(
  ptr: JNAPointer? = NULL
) : Button(ptr), IAppBarButton.WithDefault, IAppBarButton3.WithDefault, IAppBarButton4.WithDefault,
    IAppBarButton5.WithDefault, ICommandBarElement.WithDefault, ICommandBarElement2.WithDefault,
    IWinRTObject {
  private val __613645792_Interface: IAppBarButton.WithDefault by lazy {
    as_613645792()
  }


  private val __1843150317_Interface: IAppBarButton3.WithDefault by lazy {
    as_1843150317()
  }


  private val __1843150316_Interface: IAppBarButton4.WithDefault by lazy {
    as_1843150316()
  }


  private val __1843150315_Interface: IAppBarButton5.WithDefault by lazy {
    as_1843150315()
  }


  private val __1747695496_Interface: ICommandBarElement.WithDefault by lazy {
    as_1747695496()
  }


  private val __1656014522_Interface: ICommandBarElement2.WithDefault by lazy {
    as_1656014522()
  }


  public override val __613645792_Ptr: JNAPointer? by lazy {
    __613645792_Interface.__613645792_Ptr
  }


  public override val __1843150317_Ptr: JNAPointer? by lazy {
    __1843150317_Interface.__1843150317_Ptr
  }


  public override val __1843150316_Ptr: JNAPointer? by lazy {
    __1843150316_Interface.__1843150316_Ptr
  }


  public override val __1843150315_Ptr: JNAPointer? by lazy {
    __1843150315_Interface.__1843150315_Ptr
  }


  public override val __1747695496_Ptr: JNAPointer? by lazy {
    __1747695496_Interface.__1747695496_Ptr
  }


  public override val __1656014522_Ptr: JNAPointer? by lazy {
    __1656014522_Interface.__1656014522_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__613645792_Interface, __1843150317_Interface, __1843150316_Interface,
        __1843150315_Interface, __1747695496_Interface, __1656014522_Interface)

  public constructor() : this(ABI.activate())

  private fun as_613645792(): IAppBarButton.WithDefault {
    if(pointer == NULL) {
      return(IAppBarButton.ABI.makeIAppBarButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarButton.ABI.makeIAppBarButton(ref.value))
  }

  private fun as_1843150317(): IAppBarButton3.WithDefault {
    if(pointer == NULL) {
      return(IAppBarButton3.ABI.makeIAppBarButton3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarButton3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarButton3.ABI.makeIAppBarButton3(ref.value))
  }

  private fun as_1843150316(): IAppBarButton4.WithDefault {
    if(pointer == NULL) {
      return(IAppBarButton4.ABI.makeIAppBarButton4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarButton4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarButton4.ABI.makeIAppBarButton4(ref.value))
  }

  private fun as_1843150315(): IAppBarButton5.WithDefault {
    if(pointer == NULL) {
      return(IAppBarButton5.ABI.makeIAppBarButton5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarButton5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarButton5.ABI.makeIAppBarButton5(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppBarButton> {
    public override fun getValue() = AppBarButton(pointer.getPointer(0))

    public fun setValue(value: AppBarButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBarButton, MemoryAddress> {
    public val IAppBarButtonStatics4_Instance: IAppBarButtonStatics4 by lazy {
      createIAppBarButtonStatics4()
    }


    public val IAppBarButtonStatics3_Instance: IAppBarButtonStatics3 by lazy {
      createIAppBarButtonStatics3()
    }


    public val IAppBarButtonStatics_Instance: IAppBarButtonStatics by lazy {
      createIAppBarButtonStatics()
    }


    public val IAppBarButtonFactory_Instance: IAppBarButtonFactory by lazy {
      createIAppBarButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarButtonStatics4(): IAppBarButtonStatics4 {
      val refiid = Guid.REFIID(IAppBarButtonStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarButton".toHandle(),refiid,interfacePtr)
      val result = IAppBarButtonStatics4.ABI.makeIAppBarButtonStatics4(interfacePtr.value)
      return result
    }

    public fun createIAppBarButtonStatics3(): IAppBarButtonStatics3 {
      val refiid = Guid.REFIID(IAppBarButtonStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarButton".toHandle(),refiid,interfacePtr)
      val result = IAppBarButtonStatics3.ABI.makeIAppBarButtonStatics3(interfacePtr.value)
      return result
    }

    public fun createIAppBarButtonStatics(): IAppBarButtonStatics {
      val refiid = Guid.REFIID(IAppBarButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarButton".toHandle(),refiid,interfacePtr)
      val result = IAppBarButtonStatics.ABI.makeIAppBarButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIAppBarButtonFactory(): IAppBarButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarButton".toHandle(),refiid,factoryActivatorPtr)
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
    public fun get_KeyboardAcceleratorTextOverrideProperty() =
        ABI.IAppBarButtonStatics4_Instance.get_KeyboardAcceleratorTextOverrideProperty()

    public fun get_LabelPositionProperty() =
        ABI.IAppBarButtonStatics3_Instance.get_LabelPositionProperty()

    public fun get_IsInOverflowProperty() =
        ABI.IAppBarButtonStatics3_Instance.get_IsInOverflowProperty()

    public fun get_DynamicOverflowOrderProperty() =
        ABI.IAppBarButtonStatics3_Instance.get_DynamicOverflowOrderProperty()

    public fun get_LabelProperty() = ABI.IAppBarButtonStatics_Instance.get_LabelProperty()

    public fun get_IconProperty() = ABI.IAppBarButtonStatics_Instance.get_IconProperty()

    public fun get_IsCompactProperty() = ABI.IAppBarButtonStatics_Instance.get_IsCompactProperty()
  }
}
