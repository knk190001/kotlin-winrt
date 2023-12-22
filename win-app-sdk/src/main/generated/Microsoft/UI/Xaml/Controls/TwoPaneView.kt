package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ITwoPaneViewFactory.ABI.IID
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

@ABIMarker(TwoPaneView.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TwoPaneView;{8d2e56d9-c333-5f15-81d1-b8b27e076522})")
@WinRTByReference(brClass = TwoPaneView.ByReference::class)
public open class TwoPaneView(
  ptr: JNAPointer? = NULL
) : Control(ptr), ITwoPaneView.WithDefault, IWinRTObject {
  private val __894818418_Interface: ITwoPaneView.WithDefault by lazy {
    as_894818418()
  }


  public override val __894818418_Ptr: JNAPointer? by lazy {
    __894818418_Interface.__894818418_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__894818418_Interface)

  public constructor() : this(ABI.activate())

  private fun as_894818418(): ITwoPaneView.WithDefault {
    if(pointer == NULL) {
      return(ITwoPaneView.ABI.makeITwoPaneView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITwoPaneView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITwoPaneView.ABI.makeITwoPaneView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TwoPaneView> {
    public override fun getValue() = TwoPaneView(pointer.getPointer(0))

    public fun setValue(value: TwoPaneView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TwoPaneView, MemoryAddress> {
    public val ITwoPaneViewStatics_Instance: ITwoPaneViewStatics by lazy {
      createITwoPaneViewStatics()
    }


    public val ITwoPaneViewFactory_Instance: ITwoPaneViewFactory by lazy {
      createITwoPaneViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITwoPaneViewStatics(): ITwoPaneViewStatics {
      val refiid = Guid.REFIID(ITwoPaneViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TwoPaneView".toHandle(),refiid,interfacePtr)
      val result = ITwoPaneViewStatics.ABI.makeITwoPaneViewStatics(interfacePtr.value)
      return result
    }

    public fun createITwoPaneViewFactory(): ITwoPaneViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TwoPaneView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITwoPaneViewFactory.ABI.makeITwoPaneViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITwoPaneViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TwoPaneView {
      val address = segment.toRawLongValue()
      return TwoPaneView(Pointer(address))
    }

    public override fun toNative(obj: TwoPaneView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Pane1Property() = ABI.ITwoPaneViewStatics_Instance.get_Pane1Property()

    public fun get_Pane2Property() = ABI.ITwoPaneViewStatics_Instance.get_Pane2Property()

    public fun get_Pane1LengthProperty() =
        ABI.ITwoPaneViewStatics_Instance.get_Pane1LengthProperty()

    public fun get_Pane2LengthProperty() =
        ABI.ITwoPaneViewStatics_Instance.get_Pane2LengthProperty()

    public fun get_PanePriorityProperty() =
        ABI.ITwoPaneViewStatics_Instance.get_PanePriorityProperty()

    public fun get_ModeProperty() = ABI.ITwoPaneViewStatics_Instance.get_ModeProperty()

    public fun get_WideModeConfigurationProperty() =
        ABI.ITwoPaneViewStatics_Instance.get_WideModeConfigurationProperty()

    public fun get_TallModeConfigurationProperty() =
        ABI.ITwoPaneViewStatics_Instance.get_TallModeConfigurationProperty()

    public fun get_MinWideModeWidthProperty() =
        ABI.ITwoPaneViewStatics_Instance.get_MinWideModeWidthProperty()

    public fun get_MinTallModeHeightProperty() =
        ABI.ITwoPaneViewStatics_Instance.get_MinTallModeHeightProperty()
  }
}
