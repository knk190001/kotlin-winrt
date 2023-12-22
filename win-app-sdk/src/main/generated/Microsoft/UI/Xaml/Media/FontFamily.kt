package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.Media.IFontFamilyFactory.ABI.IID
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FontFamily.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.FontFamily;{18fa5bc1-7294-527c-bb02-b213e0b3a2a3})")
@WinRTByReference(brClass = FontFamily.ByReference::class)
public open class FontFamily(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFontFamily.WithDefault, IWinRTObject {
  private val __1416443004_Interface: IFontFamily.WithDefault by lazy {
    as_1416443004()
  }


  public override val __1416443004_Ptr: JNAPointer? by lazy {
    __1416443004_Interface.__1416443004_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1416443004_Interface)

  public constructor(familyName: String) : this(ABI.activate(familyName))

  private fun as_1416443004(): IFontFamily.WithDefault {
    if(pointer == NULL) {
      return(IFontFamily.ABI.makeIFontFamily(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFontFamily>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFontFamily.ABI.makeIFontFamily(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FontFamily> {
    public override fun getValue() = FontFamily(pointer.getPointer(0))

    public fun setValue(value: FontFamily): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FontFamily, MemoryAddress> {
    public val IFontFamilyStatics_Instance: IFontFamilyStatics by lazy {
      createIFontFamilyStatics()
    }


    public val IFontFamilyFactory_Instance: IFontFamilyFactory by lazy {
      createIFontFamilyFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFontFamilyStatics(): IFontFamilyStatics {
      val refiid = Guid.REFIID(IFontFamilyStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.FontFamily".toHandle(),refiid,interfacePtr)
      val result = IFontFamilyStatics.ABI.makeIFontFamilyStatics(interfacePtr.value)
      return result
    }

    public fun createIFontFamilyFactory(): IFontFamilyFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.FontFamily".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFontFamilyFactory.ABI.makeIFontFamilyFactory(factoryActivatorPtr.value))
    }

    public fun activate(familyName: String): JNAPointer? =
        IFontFamilyFactory_Instance.CreateInstanceWithName(familyName, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FontFamily {
      val address = segment.toRawLongValue()
      return FontFamily(Pointer(address))
    }

    public override fun toNative(obj: FontFamily): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_XamlAutoFontFamily() = ABI.IFontFamilyStatics_Instance.get_XamlAutoFontFamily()
  }
}
