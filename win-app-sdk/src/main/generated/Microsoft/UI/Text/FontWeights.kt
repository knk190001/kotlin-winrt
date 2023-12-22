package Microsoft.UI.Text

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FontWeights.ABI::class)
@Signature("rc(Microsoft.UI.Text.FontWeights;{386cd040-5404-5a8d-8bc7-2ca989f5c065})")
@WinRTByReference(brClass = FontWeights.ByReference::class)
public class FontWeights(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFontWeights.WithDefault, IWinRTObject {
  private val __1463035498_Interface: IFontWeights.WithDefault by lazy {
    as_1463035498()
  }


  public override val __1463035498_Ptr: JNAPointer? by lazy {
    __1463035498_Interface.__1463035498_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1463035498_Interface)

  private fun as_1463035498(): IFontWeights.WithDefault {
    if(pointer == NULL) {
      return(IFontWeights.ABI.makeIFontWeights(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFontWeights>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFontWeights.ABI.makeIFontWeights(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FontWeights> {
    public override fun getValue() = FontWeights(pointer.getPointer(0))

    public fun setValue(value: FontWeights): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FontWeights, MemoryAddress> {
    public val IFontWeightsStatics_Instance: IFontWeightsStatics by lazy {
      createIFontWeightsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFontWeightsStatics(): IFontWeightsStatics {
      val refiid = Guid.REFIID(IFontWeightsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Text.FontWeights".toHandle(),refiid,interfacePtr)
      val result = IFontWeightsStatics.ABI.makeIFontWeightsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FontWeights {
      val address = segment.toRawLongValue()
      return FontWeights(Pointer(address))
    }

    public override fun toNative(obj: FontWeights): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Black() = ABI.IFontWeightsStatics_Instance.get_Black()

    public fun get_Bold() = ABI.IFontWeightsStatics_Instance.get_Bold()

    public fun get_ExtraBlack() = ABI.IFontWeightsStatics_Instance.get_ExtraBlack()

    public fun get_ExtraBold() = ABI.IFontWeightsStatics_Instance.get_ExtraBold()

    public fun get_ExtraLight() = ABI.IFontWeightsStatics_Instance.get_ExtraLight()

    public fun get_Light() = ABI.IFontWeightsStatics_Instance.get_Light()

    public fun get_Medium() = ABI.IFontWeightsStatics_Instance.get_Medium()

    public fun get_Normal() = ABI.IFontWeightsStatics_Instance.get_Normal()

    public fun get_SemiBold() = ABI.IFontWeightsStatics_Instance.get_SemiBold()

    public fun get_SemiLight() = ABI.IFontWeightsStatics_Instance.get_SemiLight()

    public fun get_Thin() = ABI.IFontWeightsStatics_Instance.get_Thin()
  }
}
