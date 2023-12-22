package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ISliderFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.RangeBase
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

@ABIMarker(Slider.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Slider;{89572027-4c48-4700-8076-497ba73d9c18})")
@WinRTByReference(brClass = Slider.ByReference::class)
public open class Slider(
  ptr: JNAPointer? = NULL
) : RangeBase(ptr), ISlider.WithDefault, ISlider2.WithDefault, IWinRTObject {
  private val __735596541_Interface: ISlider.WithDefault by lazy {
    as_735596541()
  }


  private val __1328656341_Interface: ISlider2.WithDefault by lazy {
    as_1328656341()
  }


  public override val __735596541_Ptr: JNAPointer? by lazy {
    __735596541_Interface.__735596541_Ptr
  }


  public override val __1328656341_Ptr: JNAPointer? by lazy {
    __1328656341_Interface.__1328656341_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__735596541_Interface, __1328656341_Interface)

  public constructor() : this(ABI.activate())

  private fun as_735596541(): ISlider.WithDefault {
    if(pointer == NULL) {
      return(ISlider.ABI.makeISlider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISlider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISlider.ABI.makeISlider(ref.value))
  }

  private fun as_1328656341(): ISlider2.WithDefault {
    if(pointer == NULL) {
      return(ISlider2.ABI.makeISlider2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISlider2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISlider2.ABI.makeISlider2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Slider> {
    public override fun getValue() = Slider(pointer.getPointer(0))

    public fun setValue(value: Slider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Slider, MemoryAddress> {
    public val ISliderStatics2_Instance: ISliderStatics2 by lazy {
      createISliderStatics2()
    }


    public val ISliderStatics_Instance: ISliderStatics by lazy {
      createISliderStatics()
    }


    public val ISliderFactory_Instance: ISliderFactory by lazy {
      createISliderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISliderStatics2(): ISliderStatics2 {
      val refiid = Guid.REFIID(ISliderStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Slider".toHandle(),refiid,interfacePtr)
      val result = ISliderStatics2.ABI.makeISliderStatics2(interfacePtr.value)
      return result
    }

    public fun createISliderStatics(): ISliderStatics {
      val refiid = Guid.REFIID(ISliderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Slider".toHandle(),refiid,interfacePtr)
      val result = ISliderStatics.ABI.makeISliderStatics(interfacePtr.value)
      return result
    }

    public fun createISliderFactory(): ISliderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Slider".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISliderFactory.ABI.makeISliderFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISliderFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Slider {
      val address = segment.toRawLongValue()
      return Slider(Pointer(address))
    }

    public override fun toNative(obj: Slider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeaderProperty() = ABI.ISliderStatics2_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.ISliderStatics2_Instance.get_HeaderTemplateProperty()

    public fun get_IntermediateValueProperty() =
        ABI.ISliderStatics_Instance.get_IntermediateValueProperty()

    public fun get_StepFrequencyProperty() = ABI.ISliderStatics_Instance.get_StepFrequencyProperty()

    public fun get_SnapsToProperty() = ABI.ISliderStatics_Instance.get_SnapsToProperty()

    public fun get_TickFrequencyProperty() = ABI.ISliderStatics_Instance.get_TickFrequencyProperty()

    public fun get_TickPlacementProperty() = ABI.ISliderStatics_Instance.get_TickPlacementProperty()

    public fun get_OrientationProperty() = ABI.ISliderStatics_Instance.get_OrientationProperty()

    public fun get_IsDirectionReversedProperty() =
        ABI.ISliderStatics_Instance.get_IsDirectionReversedProperty()

    public fun get_IsThumbToolTipEnabledProperty() =
        ABI.ISliderStatics_Instance.get_IsThumbToolTipEnabledProperty()

    public fun get_ThumbToolTipValueConverterProperty() =
        ABI.ISliderStatics_Instance.get_ThumbToolTipValueConverterProperty()
  }
}
