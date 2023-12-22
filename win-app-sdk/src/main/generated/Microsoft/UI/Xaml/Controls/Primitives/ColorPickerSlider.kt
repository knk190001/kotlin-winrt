package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.IColorPickerSliderFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Slider
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

@ABIMarker(ColorPickerSlider.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ColorPickerSlider;{456231bb-5a4c-564b-9b3d-2f157061a0f8})")
@WinRTByReference(brClass = ColorPickerSlider.ByReference::class)
public open class ColorPickerSlider(
  ptr: JNAPointer? = NULL
) : Slider(ptr), IColorPickerSlider.WithDefault, IWinRTObject {
  private val __1784819169_Interface: IColorPickerSlider.WithDefault by lazy {
    as_1784819169()
  }


  public override val __1784819169_Ptr: JNAPointer? by lazy {
    __1784819169_Interface.__1784819169_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1784819169_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1784819169(): IColorPickerSlider.WithDefault {
    if(pointer == NULL) {
      return(IColorPickerSlider.ABI.makeIColorPickerSlider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorPickerSlider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorPickerSlider.ABI.makeIColorPickerSlider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ColorPickerSlider> {
    public override fun getValue() = ColorPickerSlider(pointer.getPointer(0))

    public fun setValue(value: ColorPickerSlider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorPickerSlider, MemoryAddress> {
    public val IColorPickerSliderStatics_Instance: IColorPickerSliderStatics by lazy {
      createIColorPickerSliderStatics()
    }


    public val IColorPickerSliderFactory_Instance: IColorPickerSliderFactory by lazy {
      createIColorPickerSliderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIColorPickerSliderStatics(): IColorPickerSliderStatics {
      val refiid = Guid.REFIID(IColorPickerSliderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ColorPickerSlider".toHandle(),refiid,interfacePtr)
      val result = IColorPickerSliderStatics.ABI.makeIColorPickerSliderStatics(interfacePtr.value)
      return result
    }

    public fun createIColorPickerSliderFactory(): IColorPickerSliderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ColorPickerSlider".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IColorPickerSliderFactory.ABI.makeIColorPickerSliderFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IColorPickerSliderFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ColorPickerSlider {
      val address = segment.toRawLongValue()
      return ColorPickerSlider(Pointer(address))
    }

    public override fun toNative(obj: ColorPickerSlider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ColorChannelProperty() =
        ABI.IColorPickerSliderStatics_Instance.get_ColorChannelProperty()
  }
}
