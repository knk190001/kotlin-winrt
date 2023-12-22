package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkToolbarFactory.ABI.IID
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

@ABIMarker(InkToolbar.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbar;{3ddd0cca-51f0-486f-a03e-4ee13dc12bcb})")
@WinRTByReference(brClass = InkToolbar.ByReference::class)
public open class InkToolbar(
  ptr: JNAPointer? = NULL
) : Control(ptr), IInkToolbar.WithDefault, IInkToolbar2.WithDefault, IInkToolbar3.WithDefault,
    IWinRTObject {
  private val __388490705_Interface: IInkToolbar.WithDefault by lazy {
    as_388490705()
  }


  private val __841689983_Interface: IInkToolbar2.WithDefault by lazy {
    as_841689983()
  }


  private val __841689982_Interface: IInkToolbar3.WithDefault by lazy {
    as_841689982()
  }


  public override val __388490705_Ptr: JNAPointer? by lazy {
    __388490705_Interface.__388490705_Ptr
  }


  public override val __841689983_Ptr: JNAPointer? by lazy {
    __841689983_Interface.__841689983_Ptr
  }


  public override val __841689982_Ptr: JNAPointer? by lazy {
    __841689982_Interface.__841689982_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__388490705_Interface, __841689983_Interface, __841689982_Interface)

  public constructor() : this(ABI.activate())

  private fun as_388490705(): IInkToolbar.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbar.ABI.makeIInkToolbar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbar.ABI.makeIInkToolbar(ref.value))
  }

  private fun as_841689983(): IInkToolbar2.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbar2.ABI.makeIInkToolbar2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbar2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbar2.ABI.makeIInkToolbar2(ref.value))
  }

  private fun as_841689982(): IInkToolbar3.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbar3.ABI.makeIInkToolbar3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbar3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbar3.ABI.makeIInkToolbar3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InkToolbar> {
    public override fun getValue() = InkToolbar(pointer.getPointer(0))

    public fun setValue(value: InkToolbar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbar, MemoryAddress> {
    public val IInkToolbarStatics_Instance: IInkToolbarStatics by lazy {
      createIInkToolbarStatics()
    }


    public val IInkToolbarStatics2_Instance: IInkToolbarStatics2 by lazy {
      createIInkToolbarStatics2()
    }


    public val IInkToolbarStatics3_Instance: IInkToolbarStatics3 by lazy {
      createIInkToolbarStatics3()
    }


    public val IInkToolbarFactory_Instance: IInkToolbarFactory by lazy {
      createIInkToolbarFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarStatics(): IInkToolbarStatics {
      val refiid = Guid.REFIID(IInkToolbarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbar".toHandle(),refiid,interfacePtr)
      val result = IInkToolbarStatics.ABI.makeIInkToolbarStatics(interfacePtr.value)
      return result
    }

    public fun createIInkToolbarStatics2(): IInkToolbarStatics2 {
      val refiid = Guid.REFIID(IInkToolbarStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbar".toHandle(),refiid,interfacePtr)
      val result = IInkToolbarStatics2.ABI.makeIInkToolbarStatics2(interfacePtr.value)
      return result
    }

    public fun createIInkToolbarStatics3(): IInkToolbarStatics3 {
      val refiid = Guid.REFIID(IInkToolbarStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbar".toHandle(),refiid,interfacePtr)
      val result = IInkToolbarStatics3.ABI.makeIInkToolbarStatics3(interfacePtr.value)
      return result
    }

    public fun createIInkToolbarFactory(): IInkToolbarFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkToolbarFactory.ABI.makeIInkToolbarFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IInkToolbarFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkToolbar {
      val address = segment.toRawLongValue()
      return InkToolbar(Pointer(address))
    }

    public override fun toNative(obj: InkToolbar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_InitialControlsProperty() =
        ABI.IInkToolbarStatics_Instance.get_InitialControlsProperty()

    public fun get_ChildrenProperty() = ABI.IInkToolbarStatics_Instance.get_ChildrenProperty()

    public fun get_ActiveToolProperty() = ABI.IInkToolbarStatics_Instance.get_ActiveToolProperty()

    public fun get_InkDrawingAttributesProperty() =
        ABI.IInkToolbarStatics_Instance.get_InkDrawingAttributesProperty()

    public fun get_IsRulerButtonCheckedProperty() =
        ABI.IInkToolbarStatics_Instance.get_IsRulerButtonCheckedProperty()

    public fun get_TargetInkCanvasProperty() =
        ABI.IInkToolbarStatics_Instance.get_TargetInkCanvasProperty()

    public fun get_IsStencilButtonCheckedProperty() =
        ABI.IInkToolbarStatics2_Instance.get_IsStencilButtonCheckedProperty()

    public fun get_ButtonFlyoutPlacementProperty() =
        ABI.IInkToolbarStatics2_Instance.get_ButtonFlyoutPlacementProperty()

    public fun get_OrientationProperty() =
        ABI.IInkToolbarStatics2_Instance.get_OrientationProperty()

    public fun get_TargetInkPresenterProperty() =
        ABI.IInkToolbarStatics3_Instance.get_TargetInkPresenterProperty()
  }
}
