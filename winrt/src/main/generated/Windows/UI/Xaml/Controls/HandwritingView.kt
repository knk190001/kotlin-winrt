package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IHandwritingViewFactory.ABI.IID
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

@ABIMarker(HandwritingView.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.HandwritingView;{c44204a7-31e0-44bc-a38b-4bee64ecd99f})")
@WinRTByReference(brClass = HandwritingView.ByReference::class)
public open class HandwritingView(
  ptr: JNAPointer? = NULL
) : Control(ptr), IHandwritingView.WithDefault, IHandwritingView2.WithDefault, IWinRTObject {
  private val __1553648074_Interface: IHandwritingView.WithDefault by lazy {
    as_1553648074()
  }


  private val __918449988_Interface: IHandwritingView2.WithDefault by lazy {
    as_918449988()
  }


  public override val __1553648074_Ptr: JNAPointer? by lazy {
    __1553648074_Interface.__1553648074_Ptr
  }


  public override val __918449988_Ptr: JNAPointer? by lazy {
    __918449988_Interface.__918449988_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1553648074_Interface, __918449988_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1553648074(): IHandwritingView.WithDefault {
    if(pointer == NULL) {
      return(IHandwritingView.ABI.makeIHandwritingView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHandwritingView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHandwritingView.ABI.makeIHandwritingView(ref.value))
  }

  private fun as_918449988(): IHandwritingView2.WithDefault {
    if(pointer == NULL) {
      return(IHandwritingView2.ABI.makeIHandwritingView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHandwritingView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHandwritingView2.ABI.makeIHandwritingView2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HandwritingView> {
    public override fun getValue() = HandwritingView(pointer.getPointer(0))

    public fun setValue(value: HandwritingView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HandwritingView, MemoryAddress> {
    public val IHandwritingViewStatics2_Instance: IHandwritingViewStatics2 by lazy {
      createIHandwritingViewStatics2()
    }


    public val IHandwritingViewStatics_Instance: IHandwritingViewStatics by lazy {
      createIHandwritingViewStatics()
    }


    public val IHandwritingViewFactory_Instance: IHandwritingViewFactory by lazy {
      createIHandwritingViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHandwritingViewStatics2(): IHandwritingViewStatics2 {
      val refiid = Guid.REFIID(IHandwritingViewStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.HandwritingView".toHandle(),refiid,interfacePtr)
      val result = IHandwritingViewStatics2.ABI.makeIHandwritingViewStatics2(interfacePtr.value)
      return result
    }

    public fun createIHandwritingViewStatics(): IHandwritingViewStatics {
      val refiid = Guid.REFIID(IHandwritingViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.HandwritingView".toHandle(),refiid,interfacePtr)
      val result = IHandwritingViewStatics.ABI.makeIHandwritingViewStatics(interfacePtr.value)
      return result
    }

    public fun createIHandwritingViewFactory(): IHandwritingViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.HandwritingView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHandwritingViewFactory.ABI.makeIHandwritingViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IHandwritingViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): HandwritingView {
      val address = segment.toRawLongValue()
      return HandwritingView(Pointer(address))
    }

    public override fun toNative(obj: HandwritingView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsSwitchToKeyboardEnabledProperty() =
        ABI.IHandwritingViewStatics2_Instance.get_IsSwitchToKeyboardEnabledProperty()

    public fun get_IsCommandBarOpenProperty() =
        ABI.IHandwritingViewStatics2_Instance.get_IsCommandBarOpenProperty()

    public fun get_PlacementTargetProperty() =
        ABI.IHandwritingViewStatics_Instance.get_PlacementTargetProperty()

    public fun get_PlacementAlignmentProperty() =
        ABI.IHandwritingViewStatics_Instance.get_PlacementAlignmentProperty()

    public fun get_IsOpenProperty() = ABI.IHandwritingViewStatics_Instance.get_IsOpenProperty()

    public fun get_AreCandidatesEnabledProperty() =
        ABI.IHandwritingViewStatics_Instance.get_AreCandidatesEnabledProperty()
  }
}
