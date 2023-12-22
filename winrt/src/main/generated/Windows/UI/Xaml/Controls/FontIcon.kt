package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IFontIconFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Controls.FontIcon;{d4d61391-39ac-4950-9166-3606c264418b})")
@WinRTByReference(brClass = FontIcon.ByReference::class)
public open class FontIcon(
  ptr: JNAPointer? = NULL
) : IconElement(ptr), IFontIcon.WithDefault, IFontIcon2.WithDefault, IFontIcon3.WithDefault,
    IWinRTObject {
  private val __123437692_Interface: IFontIcon.WithDefault by lazy {
    as_123437692()
  }


  private val __468398894_Interface: IFontIcon2.WithDefault by lazy {
    as_468398894()
  }


  private val __468398895_Interface: IFontIcon3.WithDefault by lazy {
    as_468398895()
  }


  public override val __123437692_Ptr: JNAPointer? by lazy {
    __123437692_Interface.__123437692_Ptr
  }


  public override val __468398894_Ptr: JNAPointer? by lazy {
    __468398894_Interface.__468398894_Ptr
  }


  public override val __468398895_Ptr: JNAPointer? by lazy {
    __468398895_Interface.__468398895_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__123437692_Interface, __468398894_Interface, __468398895_Interface)

  public constructor() : this(ABI.activate())

  private fun as_123437692(): IFontIcon.WithDefault {
    if(pointer == NULL) {
      return(IFontIcon.ABI.makeIFontIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFontIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFontIcon.ABI.makeIFontIcon(ref.value))
  }

  private fun as_468398894(): IFontIcon2.WithDefault {
    if(pointer == NULL) {
      return(IFontIcon2.ABI.makeIFontIcon2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFontIcon2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFontIcon2.ABI.makeIFontIcon2(ref.value))
  }

  private fun as_468398895(): IFontIcon3.WithDefault {
    if(pointer == NULL) {
      return(IFontIcon3.ABI.makeIFontIcon3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFontIcon3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFontIcon3.ABI.makeIFontIcon3(ref.value))
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


    public val IFontIconStatics3_Instance: IFontIconStatics3 by lazy {
      createIFontIconStatics3()
    }


    public val IFontIconStatics2_Instance: IFontIconStatics2 by lazy {
      createIFontIconStatics2()
    }


    public val IFontIconFactory_Instance: IFontIconFactory by lazy {
      createIFontIconFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFontIconStatics(): IFontIconStatics {
      val refiid = Guid.REFIID(IFontIconStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.FontIcon".toHandle(),refiid,interfacePtr)
      val result = IFontIconStatics.ABI.makeIFontIconStatics(interfacePtr.value)
      return result
    }

    public fun createIFontIconStatics3(): IFontIconStatics3 {
      val refiid = Guid.REFIID(IFontIconStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.FontIcon".toHandle(),refiid,interfacePtr)
      val result = IFontIconStatics3.ABI.makeIFontIconStatics3(interfacePtr.value)
      return result
    }

    public fun createIFontIconStatics2(): IFontIconStatics2 {
      val refiid = Guid.REFIID(IFontIconStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.FontIcon".toHandle(),refiid,interfacePtr)
      val result = IFontIconStatics2.ABI.makeIFontIconStatics2(interfacePtr.value)
      return result
    }

    public fun createIFontIconFactory(): IFontIconFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.FontIcon".toHandle(),refiid,factoryActivatorPtr)
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

    public fun get_MirroredWhenRightToLeftProperty() =
        ABI.IFontIconStatics3_Instance.get_MirroredWhenRightToLeftProperty()

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.IFontIconStatics2_Instance.get_IsTextScaleFactorEnabledProperty()
  }
}
