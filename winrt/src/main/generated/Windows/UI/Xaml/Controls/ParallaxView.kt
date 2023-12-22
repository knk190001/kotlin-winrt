package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IParallaxViewFactory.ABI.IID
import Windows.UI.Xaml.FrameworkElement
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

@ABIMarker(ParallaxView.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ParallaxView;{6b84fcd4-4083-5b4b-bc40-d9204e19b41a})")
@WinRTByReference(brClass = ParallaxView.ByReference::class)
public open class ParallaxView(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IParallaxView.WithDefault, IWinRTObject {
  private val __527086856_Interface: IParallaxView.WithDefault by lazy {
    as_527086856()
  }


  public override val __527086856_Ptr: JNAPointer? by lazy {
    __527086856_Interface.__527086856_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__527086856_Interface)

  public constructor() : this(ABI.activate())

  private fun as_527086856(): IParallaxView.WithDefault {
    if(pointer == NULL) {
      return(IParallaxView.ABI.makeIParallaxView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IParallaxView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IParallaxView.ABI.makeIParallaxView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ParallaxView> {
    public override fun getValue() = ParallaxView(pointer.getPointer(0))

    public fun setValue(value: ParallaxView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ParallaxView, MemoryAddress> {
    public val IParallaxViewStatics_Instance: IParallaxViewStatics by lazy {
      createIParallaxViewStatics()
    }


    public val IParallaxViewFactory_Instance: IParallaxViewFactory by lazy {
      createIParallaxViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIParallaxViewStatics(): IParallaxViewStatics {
      val refiid = Guid.REFIID(IParallaxViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ParallaxView".toHandle(),refiid,interfacePtr)
      val result = IParallaxViewStatics.ABI.makeIParallaxViewStatics(interfacePtr.value)
      return result
    }

    public fun createIParallaxViewFactory(): IParallaxViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ParallaxView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IParallaxViewFactory.ABI.makeIParallaxViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IParallaxViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ParallaxView {
      val address = segment.toRawLongValue()
      return ParallaxView(Pointer(address))
    }

    public override fun toNative(obj: ParallaxView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ChildProperty() = ABI.IParallaxViewStatics_Instance.get_ChildProperty()

    public fun get_HorizontalSourceEndOffsetProperty() =
        ABI.IParallaxViewStatics_Instance.get_HorizontalSourceEndOffsetProperty()

    public fun get_HorizontalSourceOffsetKindProperty() =
        ABI.IParallaxViewStatics_Instance.get_HorizontalSourceOffsetKindProperty()

    public fun get_HorizontalSourceStartOffsetProperty() =
        ABI.IParallaxViewStatics_Instance.get_HorizontalSourceStartOffsetProperty()

    public fun get_MaxHorizontalShiftRatioProperty() =
        ABI.IParallaxViewStatics_Instance.get_MaxHorizontalShiftRatioProperty()

    public fun get_HorizontalShiftProperty() =
        ABI.IParallaxViewStatics_Instance.get_HorizontalShiftProperty()

    public fun get_IsHorizontalShiftClampedProperty() =
        ABI.IParallaxViewStatics_Instance.get_IsHorizontalShiftClampedProperty()

    public fun get_IsVerticalShiftClampedProperty() =
        ABI.IParallaxViewStatics_Instance.get_IsVerticalShiftClampedProperty()

    public fun get_SourceProperty() = ABI.IParallaxViewStatics_Instance.get_SourceProperty()

    public fun get_VerticalSourceEndOffsetProperty() =
        ABI.IParallaxViewStatics_Instance.get_VerticalSourceEndOffsetProperty()

    public fun get_VerticalSourceOffsetKindProperty() =
        ABI.IParallaxViewStatics_Instance.get_VerticalSourceOffsetKindProperty()

    public fun get_VerticalSourceStartOffsetProperty() =
        ABI.IParallaxViewStatics_Instance.get_VerticalSourceStartOffsetProperty()

    public fun get_MaxVerticalShiftRatioProperty() =
        ABI.IParallaxViewStatics_Instance.get_MaxVerticalShiftRatioProperty()

    public fun get_VerticalShiftProperty() =
        ABI.IParallaxViewStatics_Instance.get_VerticalShiftProperty()
  }
}
