package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ISplitViewFactory.ABI.IID
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

@ABIMarker(SplitView.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.SplitView;{97222f31-3844-429e-939c-1673155322a1})")
@WinRTByReference(brClass = SplitView.ByReference::class)
public open class SplitView(
  ptr: JNAPointer? = NULL
) : Control(ptr), ISplitView.WithDefault, ISplitView2.WithDefault, ISplitView3.WithDefault,
    IWinRTObject {
  private val __1861472189_Interface: ISplitView.WithDefault by lazy {
    as_1861472189()
  }


  private val __1871062961_Interface: ISplitView2.WithDefault by lazy {
    as_1871062961()
  }


  private val __1871062960_Interface: ISplitView3.WithDefault by lazy {
    as_1871062960()
  }


  public override val __1861472189_Ptr: JNAPointer? by lazy {
    __1861472189_Interface.__1861472189_Ptr
  }


  public override val __1871062961_Ptr: JNAPointer? by lazy {
    __1871062961_Interface.__1871062961_Ptr
  }


  public override val __1871062960_Ptr: JNAPointer? by lazy {
    __1871062960_Interface.__1871062960_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1861472189_Interface, __1871062961_Interface, __1871062960_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1861472189(): ISplitView.WithDefault {
    if(pointer == NULL) {
      return(ISplitView.ABI.makeISplitView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplitView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplitView.ABI.makeISplitView(ref.value))
  }

  private fun as_1871062961(): ISplitView2.WithDefault {
    if(pointer == NULL) {
      return(ISplitView2.ABI.makeISplitView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplitView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplitView2.ABI.makeISplitView2(ref.value))
  }

  private fun as_1871062960(): ISplitView3.WithDefault {
    if(pointer == NULL) {
      return(ISplitView3.ABI.makeISplitView3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplitView3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplitView3.ABI.makeISplitView3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SplitView> {
    public override fun getValue() = SplitView(pointer.getPointer(0))

    public fun setValue(value: SplitView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SplitView, MemoryAddress> {
    public val ISplitViewStatics2_Instance: ISplitViewStatics2 by lazy {
      createISplitViewStatics2()
    }


    public val ISplitViewStatics_Instance: ISplitViewStatics by lazy {
      createISplitViewStatics()
    }


    public val ISplitViewFactory_Instance: ISplitViewFactory by lazy {
      createISplitViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISplitViewStatics2(): ISplitViewStatics2 {
      val refiid = Guid.REFIID(ISplitViewStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.SplitView".toHandle(),refiid,interfacePtr)
      val result = ISplitViewStatics2.ABI.makeISplitViewStatics2(interfacePtr.value)
      return result
    }

    public fun createISplitViewStatics(): ISplitViewStatics {
      val refiid = Guid.REFIID(ISplitViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.SplitView".toHandle(),refiid,interfacePtr)
      val result = ISplitViewStatics.ABI.makeISplitViewStatics(interfacePtr.value)
      return result
    }

    public fun createISplitViewFactory(): ISplitViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.SplitView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISplitViewFactory.ABI.makeISplitViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISplitViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SplitView {
      val address = segment.toRawLongValue()
      return SplitView(Pointer(address))
    }

    public override fun toNative(obj: SplitView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LightDismissOverlayModeProperty() =
        ABI.ISplitViewStatics2_Instance.get_LightDismissOverlayModeProperty()

    public fun get_ContentProperty() = ABI.ISplitViewStatics_Instance.get_ContentProperty()

    public fun get_PaneProperty() = ABI.ISplitViewStatics_Instance.get_PaneProperty()

    public fun get_IsPaneOpenProperty() = ABI.ISplitViewStatics_Instance.get_IsPaneOpenProperty()

    public fun get_OpenPaneLengthProperty() =
        ABI.ISplitViewStatics_Instance.get_OpenPaneLengthProperty()

    public fun get_CompactPaneLengthProperty() =
        ABI.ISplitViewStatics_Instance.get_CompactPaneLengthProperty()

    public fun get_PanePlacementProperty() =
        ABI.ISplitViewStatics_Instance.get_PanePlacementProperty()

    public fun get_DisplayModeProperty() = ABI.ISplitViewStatics_Instance.get_DisplayModeProperty()

    public fun get_TemplateSettingsProperty() =
        ABI.ISplitViewStatics_Instance.get_TemplateSettingsProperty()

    public fun get_PaneBackgroundProperty() =
        ABI.ISplitViewStatics_Instance.get_PaneBackgroundProperty()
  }
}
