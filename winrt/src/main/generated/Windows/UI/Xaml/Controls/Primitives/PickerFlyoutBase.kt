package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.Primitives.IPickerFlyoutBaseFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PickerFlyoutBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.PickerFlyoutBase;{e33574ea-1076-44d1-9383-dc24ac5cff2a})")
@WinRTByReference(brClass = PickerFlyoutBase.ByReference::class)
public open class PickerFlyoutBase(
  ptr: JNAPointer? = NULL
) : FlyoutBase(ptr), IPickerFlyoutBase.WithDefault, IPickerFlyoutBaseOverrides.WithDefault,
    IWinRTObject {
  private val __1211003530_Interface: IPickerFlyoutBase.WithDefault by lazy {
    as_1211003530()
  }


  private val __617237167_Interface: IPickerFlyoutBaseOverrides.WithDefault by lazy {
    as_617237167()
  }


  public override val __1211003530_Ptr: JNAPointer? by lazy {
    __1211003530_Interface.__1211003530_Ptr
  }


  public override val __617237167_Ptr: JNAPointer? by lazy {
    __617237167_Interface.__617237167_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1211003530_Interface, __617237167_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1211003530(): IPickerFlyoutBase.WithDefault {
    if(pointer == NULL) {
      return(IPickerFlyoutBase.ABI.makeIPickerFlyoutBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPickerFlyoutBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPickerFlyoutBase.ABI.makeIPickerFlyoutBase(ref.value))
  }

  private fun as_617237167(): IPickerFlyoutBaseOverrides.WithDefault {
    if(pointer == NULL) {
      return(IPickerFlyoutBaseOverrides.ABI.makeIPickerFlyoutBaseOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPickerFlyoutBaseOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPickerFlyoutBaseOverrides.ABI.makeIPickerFlyoutBaseOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PickerFlyoutBase> {
    public override fun getValue() = PickerFlyoutBase(pointer.getPointer(0))

    public fun setValue(value: PickerFlyoutBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PickerFlyoutBase, MemoryAddress> {
    public val IPickerFlyoutBaseStatics_Instance: IPickerFlyoutBaseStatics by lazy {
      createIPickerFlyoutBaseStatics()
    }


    public val IPickerFlyoutBaseFactory_Instance: IPickerFlyoutBaseFactory by lazy {
      createIPickerFlyoutBaseFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPickerFlyoutBaseStatics(): IPickerFlyoutBaseStatics {
      val refiid = Guid.REFIID(IPickerFlyoutBaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.PickerFlyoutBase".toHandle(),refiid,interfacePtr)
      val result = IPickerFlyoutBaseStatics.ABI.makeIPickerFlyoutBaseStatics(interfacePtr.value)
      return result
    }

    public fun createIPickerFlyoutBaseFactory(): IPickerFlyoutBaseFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.PickerFlyoutBase".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPickerFlyoutBaseFactory.ABI.makeIPickerFlyoutBaseFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPickerFlyoutBaseFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PickerFlyoutBase {
      val address = segment.toRawLongValue()
      return PickerFlyoutBase(Pointer(address))
    }

    public override fun toNative(obj: PickerFlyoutBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TitleProperty() = ABI.IPickerFlyoutBaseStatics_Instance.get_TitleProperty()

    public fun GetTitle(element: DependencyObject) =
        ABI.IPickerFlyoutBaseStatics_Instance.GetTitle(element)

    public fun SetTitle(element: DependencyObject, value: String) =
        ABI.IPickerFlyoutBaseStatics_Instance.SetTitle(element, value)
  }
}
