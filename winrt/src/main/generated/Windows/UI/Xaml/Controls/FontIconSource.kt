package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IFontIconSourceFactory.ABI.IID
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

@ABIMarker(FontIconSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.FontIconSource;{2211ac9a-74e3-43ed-b61c-21afc7df4d10})")
@WinRTByReference(brClass = FontIconSource.ByReference::class)
public open class FontIconSource(
  ptr: JNAPointer? = NULL
) : IconSource(ptr), IFontIconSource.WithDefault, IWinRTObject {
  private val __859741887_Interface: IFontIconSource.WithDefault by lazy {
    as_859741887()
  }


  public override val __859741887_Ptr: JNAPointer? by lazy {
    __859741887_Interface.__859741887_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__859741887_Interface)

  public constructor() : this(ABI.activate())

  private fun as_859741887(): IFontIconSource.WithDefault {
    if(pointer == NULL) {
      return(IFontIconSource.ABI.makeIFontIconSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFontIconSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFontIconSource.ABI.makeIFontIconSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FontIconSource>
      {
    public override fun getValue() = FontIconSource(pointer.getPointer(0))

    public fun setValue(value: FontIconSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FontIconSource, MemoryAddress> {
    public val IFontIconSourceStatics_Instance: IFontIconSourceStatics by lazy {
      createIFontIconSourceStatics()
    }


    public val IFontIconSourceFactory_Instance: IFontIconSourceFactory by lazy {
      createIFontIconSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFontIconSourceStatics(): IFontIconSourceStatics {
      val refiid = Guid.REFIID(IFontIconSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.FontIconSource".toHandle(),refiid,interfacePtr)
      val result = IFontIconSourceStatics.ABI.makeIFontIconSourceStatics(interfacePtr.value)
      return result
    }

    public fun createIFontIconSourceFactory(): IFontIconSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.FontIconSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFontIconSourceFactory.ABI.makeIFontIconSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFontIconSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FontIconSource {
      val address = segment.toRawLongValue()
      return FontIconSource(Pointer(address))
    }

    public override fun toNative(obj: FontIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_GlyphProperty() = ABI.IFontIconSourceStatics_Instance.get_GlyphProperty()

    public fun get_FontSizeProperty() = ABI.IFontIconSourceStatics_Instance.get_FontSizeProperty()

    public fun get_FontFamilyProperty() =
        ABI.IFontIconSourceStatics_Instance.get_FontFamilyProperty()

    public fun get_FontWeightProperty() =
        ABI.IFontIconSourceStatics_Instance.get_FontWeightProperty()

    public fun get_FontStyleProperty() = ABI.IFontIconSourceStatics_Instance.get_FontStyleProperty()

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.IFontIconSourceStatics_Instance.get_IsTextScaleFactorEnabledProperty()

    public fun get_MirroredWhenRightToLeftProperty() =
        ABI.IFontIconSourceStatics_Instance.get_MirroredWhenRightToLeftProperty()
  }
}
