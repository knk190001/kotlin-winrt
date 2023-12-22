package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IFontIconFactory.ABI.IID
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

@ABIMarker(FontIcon.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.FontIcon;{6eba5ed9-d233-5f5e-91a8-f5134292658a})")
@WinRTByReference(brClass = FontIcon.ByReference::class)
public open class FontIcon(
  ptr: JNAPointer? = NULL
) : IconElement(ptr), IFontIcon.WithDefault, IWinRTObject {
  private val __69407791_Interface: IFontIcon.WithDefault by lazy {
    as_69407791()
  }


  public override val __69407791_Ptr: JNAPointer? by lazy {
    __69407791_Interface.__69407791_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__69407791_Interface)

  public constructor() : this(ABI.activate())

  private fun as_69407791(): IFontIcon.WithDefault {
    if(pointer == NULL) {
      return(IFontIcon.ABI.makeIFontIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFontIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFontIcon.ABI.makeIFontIcon(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FontIcon> {
    public override fun getValue() = FontIcon(pointer.getPointer(0))

    public fun setValue(value: FontIcon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FontIcon, MemoryAddress> {
    public val IFontIconStatics_Instance: IFontIconStatics by lazy {
      createIFontIconStatics()
    }


    public val IFontIconFactory_Instance: IFontIconFactory by lazy {
      createIFontIconFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFontIconStatics(): IFontIconStatics {
      val refiid = Guid.REFIID(IFontIconStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.FontIcon".toHandle(),refiid,interfacePtr)
      val result = IFontIconStatics.ABI.makeIFontIconStatics(interfacePtr.value)
      return result
    }

    public fun createIFontIconFactory(): IFontIconFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.FontIcon".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFontIconFactory.ABI.makeIFontIconFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFontIconFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FontIcon {
      val address = segment.toRawLongValue()
      return FontIcon(Pointer(address))
    }

    public override fun toNative(obj: FontIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_GlyphProperty() = ABI.IFontIconStatics_Instance.get_GlyphProperty()

    public fun get_FontSizeProperty() = ABI.IFontIconStatics_Instance.get_FontSizeProperty()

    public fun get_FontFamilyProperty() = ABI.IFontIconStatics_Instance.get_FontFamilyProperty()

    public fun get_FontWeightProperty() = ABI.IFontIconStatics_Instance.get_FontWeightProperty()

    public fun get_FontStyleProperty() = ABI.IFontIconStatics_Instance.get_FontStyleProperty()

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.IFontIconStatics_Instance.get_IsTextScaleFactorEnabledProperty()

    public fun get_MirroredWhenRightToLeftProperty() =
        ABI.IFontIconStatics_Instance.get_MirroredWhenRightToLeftProperty()
  }
}
