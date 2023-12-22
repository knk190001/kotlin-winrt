package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IColorPickerFactory.ABI.IID
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

@ABIMarker(ColorPicker.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ColorPicker;{ae72b24b-f93f-5a19-8ce4-a18b73c3356d})")
@WinRTByReference(brClass = ColorPicker.ByReference::class)
public open class ColorPicker(
  ptr: JNAPointer? = NULL
) : Control(ptr), IColorPicker.WithDefault, IColorPicker2.WithDefault, IWinRTObject {
  private val __676827734_Interface: IColorPicker.WithDefault by lazy {
    as_676827734()
  }


  private val __493176776_Interface: IColorPicker2.WithDefault by lazy {
    as_493176776()
  }


  public override val __676827734_Ptr: JNAPointer? by lazy {
    __676827734_Interface.__676827734_Ptr
  }


  public override val __493176776_Ptr: JNAPointer? by lazy {
    __493176776_Interface.__493176776_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__676827734_Interface, __493176776_Interface)

  public constructor() : this(ABI.activate())

  private fun as_676827734(): IColorPicker.WithDefault {
    if(pointer == NULL) {
      return(IColorPicker.ABI.makeIColorPicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorPicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorPicker.ABI.makeIColorPicker(ref.value))
  }

  private fun as_493176776(): IColorPicker2.WithDefault {
    if(pointer == NULL) {
      return(IColorPicker2.ABI.makeIColorPicker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorPicker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorPicker2.ABI.makeIColorPicker2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ColorPicker> {
    public override fun getValue() = ColorPicker(pointer.getPointer(0))

    public fun setValue(value: ColorPicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorPicker, MemoryAddress> {
    public val IColorPickerStatics_Instance: IColorPickerStatics by lazy {
      createIColorPickerStatics()
    }


    public val IColorPickerStatics2_Instance: IColorPickerStatics2 by lazy {
      createIColorPickerStatics2()
    }


    public val IColorPickerFactory_Instance: IColorPickerFactory by lazy {
      createIColorPickerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIColorPickerStatics(): IColorPickerStatics {
      val refiid = Guid.REFIID(IColorPickerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ColorPicker".toHandle(),refiid,interfacePtr)
      val result = IColorPickerStatics.ABI.makeIColorPickerStatics(interfacePtr.value)
      return result
    }

    public fun createIColorPickerStatics2(): IColorPickerStatics2 {
      val refiid = Guid.REFIID(IColorPickerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ColorPicker".toHandle(),refiid,interfacePtr)
      val result = IColorPickerStatics2.ABI.makeIColorPickerStatics2(interfacePtr.value)
      return result
    }

    public fun createIColorPickerFactory(): IColorPickerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ColorPicker".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IColorPickerFactory.ABI.makeIColorPickerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IColorPickerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ColorPicker {
      val address = segment.toRawLongValue()
      return ColorPicker(Pointer(address))
    }

    public override fun toNative(obj: ColorPicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ColorProperty() = ABI.IColorPickerStatics_Instance.get_ColorProperty()

    public fun get_PreviousColorProperty() =
        ABI.IColorPickerStatics_Instance.get_PreviousColorProperty()

    public fun get_IsAlphaEnabledProperty() =
        ABI.IColorPickerStatics_Instance.get_IsAlphaEnabledProperty()

    public fun get_IsColorSpectrumVisibleProperty() =
        ABI.IColorPickerStatics_Instance.get_IsColorSpectrumVisibleProperty()

    public fun get_IsColorPreviewVisibleProperty() =
        ABI.IColorPickerStatics_Instance.get_IsColorPreviewVisibleProperty()

    public fun get_IsColorSliderVisibleProperty() =
        ABI.IColorPickerStatics_Instance.get_IsColorSliderVisibleProperty()

    public fun get_IsAlphaSliderVisibleProperty() =
        ABI.IColorPickerStatics_Instance.get_IsAlphaSliderVisibleProperty()

    public fun get_IsMoreButtonVisibleProperty() =
        ABI.IColorPickerStatics_Instance.get_IsMoreButtonVisibleProperty()

    public fun get_IsColorChannelTextInputVisibleProperty() =
        ABI.IColorPickerStatics_Instance.get_IsColorChannelTextInputVisibleProperty()

    public fun get_IsAlphaTextInputVisibleProperty() =
        ABI.IColorPickerStatics_Instance.get_IsAlphaTextInputVisibleProperty()

    public fun get_IsHexInputVisibleProperty() =
        ABI.IColorPickerStatics_Instance.get_IsHexInputVisibleProperty()

    public fun get_MinHueProperty() = ABI.IColorPickerStatics_Instance.get_MinHueProperty()

    public fun get_MaxHueProperty() = ABI.IColorPickerStatics_Instance.get_MaxHueProperty()

    public fun get_MinSaturationProperty() =
        ABI.IColorPickerStatics_Instance.get_MinSaturationProperty()

    public fun get_MaxSaturationProperty() =
        ABI.IColorPickerStatics_Instance.get_MaxSaturationProperty()

    public fun get_MinValueProperty() = ABI.IColorPickerStatics_Instance.get_MinValueProperty()

    public fun get_MaxValueProperty() = ABI.IColorPickerStatics_Instance.get_MaxValueProperty()

    public fun get_ColorSpectrumShapeProperty() =
        ABI.IColorPickerStatics_Instance.get_ColorSpectrumShapeProperty()

    public fun get_ColorSpectrumComponentsProperty() =
        ABI.IColorPickerStatics_Instance.get_ColorSpectrumComponentsProperty()

    public fun get_OrientationProperty() =
        ABI.IColorPickerStatics2_Instance.get_OrientationProperty()
  }
}
