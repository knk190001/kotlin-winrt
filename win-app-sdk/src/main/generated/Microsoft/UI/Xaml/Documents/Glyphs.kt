package Microsoft.UI.Xaml.Documents

import Microsoft.UI.Xaml.FrameworkElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(Glyphs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Documents.Glyphs;{0fbf8cfe-18e7-5e45-9fa3-d2d0927958f4})")
@WinRTByReference(brClass = Glyphs.ByReference::class)
public class Glyphs(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IGlyphs.WithDefault, IWinRTObject {
  private val __1770071268_Interface: IGlyphs.WithDefault by lazy {
    as_1770071268()
  }


  public override val __1770071268_Ptr: JNAPointer? by lazy {
    __1770071268_Interface.__1770071268_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1770071268_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1770071268(): IGlyphs.WithDefault {
    if(pointer == NULL) {
      return(IGlyphs.ABI.makeIGlyphs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGlyphs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGlyphs.ABI.makeIGlyphs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Glyphs> {
    public override fun getValue() = Glyphs(pointer.getPointer(0))

    public fun setValue(value: Glyphs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Glyphs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IGlyphsStatics_Instance: IGlyphsStatics by lazy {
      createIGlyphsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Documents.Glyphs".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIGlyphsStatics(): IGlyphsStatics {
      val refiid = Guid.REFIID(IGlyphsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Documents.Glyphs".toHandle(),refiid,interfacePtr)
      val result = IGlyphsStatics.ABI.makeIGlyphsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Glyphs {
      val address = segment.toRawLongValue()
      return Glyphs(Pointer(address))
    }

    public override fun toNative(obj: Glyphs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_UnicodeStringProperty() = ABI.IGlyphsStatics_Instance.get_UnicodeStringProperty()

    public fun get_IndicesProperty() = ABI.IGlyphsStatics_Instance.get_IndicesProperty()

    public fun get_FontUriProperty() = ABI.IGlyphsStatics_Instance.get_FontUriProperty()

    public fun get_StyleSimulationsProperty() =
        ABI.IGlyphsStatics_Instance.get_StyleSimulationsProperty()

    public fun get_FontRenderingEmSizeProperty() =
        ABI.IGlyphsStatics_Instance.get_FontRenderingEmSizeProperty()

    public fun get_OriginXProperty() = ABI.IGlyphsStatics_Instance.get_OriginXProperty()

    public fun get_OriginYProperty() = ABI.IGlyphsStatics_Instance.get_OriginYProperty()

    public fun get_FillProperty() = ABI.IGlyphsStatics_Instance.get_FillProperty()

    public fun get_IsColorFontEnabledProperty() =
        ABI.IGlyphsStatics_Instance.get_IsColorFontEnabledProperty()

    public fun get_ColorFontPaletteIndexProperty() =
        ABI.IGlyphsStatics_Instance.get_ColorFontPaletteIndexProperty()
  }
}
