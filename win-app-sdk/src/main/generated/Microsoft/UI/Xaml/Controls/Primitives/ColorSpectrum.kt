package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Control
import Microsoft.UI.Xaml.Controls.Primitives.IColorSpectrumFactory.ABI.IID
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

@ABIMarker(ColorSpectrum.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ColorSpectrum;{75305916-882d-5667-bfd0-0af72d502d72})")
@WinRTByReference(brClass = ColorSpectrum.ByReference::class)
public open class ColorSpectrum(
  ptr: JNAPointer? = NULL
) : Control(ptr), IColorSpectrum.WithDefault, IWinRTObject {
  private val __1810680925_Interface: IColorSpectrum.WithDefault by lazy {
    as_1810680925()
  }


  public override val __1810680925_Ptr: JNAPointer? by lazy {
    __1810680925_Interface.__1810680925_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1810680925_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1810680925(): IColorSpectrum.WithDefault {
    if(pointer == NULL) {
      return(IColorSpectrum.ABI.makeIColorSpectrum(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorSpectrum>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorSpectrum.ABI.makeIColorSpectrum(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ColorSpectrum>
      {
    public override fun getValue() = ColorSpectrum(pointer.getPointer(0))

    public fun setValue(value: ColorSpectrum): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorSpectrum, MemoryAddress> {
    public val IColorSpectrumStatics_Instance: IColorSpectrumStatics by lazy {
      createIColorSpectrumStatics()
    }


    public val IColorSpectrumFactory_Instance: IColorSpectrumFactory by lazy {
      createIColorSpectrumFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIColorSpectrumStatics(): IColorSpectrumStatics {
      val refiid = Guid.REFIID(IColorSpectrumStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ColorSpectrum".toHandle(),refiid,interfacePtr)
      val result = IColorSpectrumStatics.ABI.makeIColorSpectrumStatics(interfacePtr.value)
      return result
    }

    public fun createIColorSpectrumFactory(): IColorSpectrumFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ColorSpectrum".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IColorSpectrumFactory.ABI.makeIColorSpectrumFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IColorSpectrumFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ColorSpectrum {
      val address = segment.toRawLongValue()
      return ColorSpectrum(Pointer(address))
    }

    public override fun toNative(obj: ColorSpectrum): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ColorProperty() = ABI.IColorSpectrumStatics_Instance.get_ColorProperty()

    public fun get_HsvColorProperty() = ABI.IColorSpectrumStatics_Instance.get_HsvColorProperty()

    public fun get_MinHueProperty() = ABI.IColorSpectrumStatics_Instance.get_MinHueProperty()

    public fun get_MaxHueProperty() = ABI.IColorSpectrumStatics_Instance.get_MaxHueProperty()

    public fun get_MinSaturationProperty() =
        ABI.IColorSpectrumStatics_Instance.get_MinSaturationProperty()

    public fun get_MaxSaturationProperty() =
        ABI.IColorSpectrumStatics_Instance.get_MaxSaturationProperty()

    public fun get_MinValueProperty() = ABI.IColorSpectrumStatics_Instance.get_MinValueProperty()

    public fun get_MaxValueProperty() = ABI.IColorSpectrumStatics_Instance.get_MaxValueProperty()

    public fun get_ShapeProperty() = ABI.IColorSpectrumStatics_Instance.get_ShapeProperty()

    public fun get_ComponentsProperty() =
        ABI.IColorSpectrumStatics_Instance.get_ComponentsProperty()
  }
}
