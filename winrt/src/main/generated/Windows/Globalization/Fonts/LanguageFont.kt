package Windows.Globalization.Fonts

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

@ABIMarker(LanguageFont.ABI::class)
@Signature("rc(Windows.Globalization.Fonts.LanguageFont;{b12e5c3a-b76d-459b-beeb-901151cd77d1})")
@WinRTByReference(brClass = LanguageFont.ByReference::class)
public class LanguageFont(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILanguageFont.WithDefault, IWinRTObject {
  private val __1418304836_Interface: ILanguageFont.WithDefault by lazy {
    as_1418304836()
  }


  public override val __1418304836_Ptr: JNAPointer? by lazy {
    __1418304836_Interface.__1418304836_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1418304836_Interface)

  private fun as_1418304836(): ILanguageFont.WithDefault {
    if(pointer == NULL) {
      return(ILanguageFont.ABI.makeILanguageFont(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILanguageFont>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILanguageFont.ABI.makeILanguageFont(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LanguageFont> {
    public override fun getValue() = LanguageFont(pointer.getPointer(0))

    public fun setValue(value: LanguageFont): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LanguageFont, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LanguageFont {
      val address = segment.toRawLongValue()
      return LanguageFont(Pointer(address))
    }

    public override fun toNative(obj: LanguageFont): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
