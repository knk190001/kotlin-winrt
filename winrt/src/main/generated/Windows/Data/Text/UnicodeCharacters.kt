package Windows.Data.Text

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Char
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UnicodeCharacters.ABI::class)
@WinRTByReference(brClass = UnicodeCharacters.ByReference::class)
public class UnicodeCharacters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UnicodeCharacters> {
    public override fun getValue() = UnicodeCharacters(pointer.getPointer(0))

    public fun setValue(value: UnicodeCharacters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UnicodeCharacters, MemoryAddress> {
    public val IUnicodeCharactersStatics_Instance: IUnicodeCharactersStatics by lazy {
      createIUnicodeCharactersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUnicodeCharactersStatics(): IUnicodeCharactersStatics {
      val refiid = Guid.REFIID(IUnicodeCharactersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.UnicodeCharacters".toHandle(),refiid,interfacePtr)
      val result = IUnicodeCharactersStatics.ABI.makeIUnicodeCharactersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UnicodeCharacters {
      val address = segment.toRawLongValue()
      return UnicodeCharacters(Pointer(address))
    }

    public override fun toNative(obj: UnicodeCharacters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetCodepointFromSurrogatePair(highSurrogate: WinDef.UINT, lowSurrogate: WinDef.UINT)
        = ABI.IUnicodeCharactersStatics_Instance.GetCodepointFromSurrogatePair(highSurrogate,
        lowSurrogate)

    public fun GetSurrogatePairFromCodepoint(
      codepoint: WinDef.UINT,
      highSurrogate: Char,
      lowSurrogate: Char
    ) = ABI.IUnicodeCharactersStatics_Instance.GetSurrogatePairFromCodepoint(codepoint,
        highSurrogate, lowSurrogate)

    public fun IsHighSurrogate(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsHighSurrogate(codepoint)

    public fun IsLowSurrogate(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsLowSurrogate(codepoint)

    public fun IsSupplementary(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsSupplementary(codepoint)

    public fun IsNoncharacter(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsNoncharacter(codepoint)

    public fun IsWhitespace(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsWhitespace(codepoint)

    public fun IsAlphabetic(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsAlphabetic(codepoint)

    public fun IsCased(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsCased(codepoint)

    public fun IsUppercase(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsUppercase(codepoint)

    public fun IsLowercase(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsLowercase(codepoint)

    public fun IsIdStart(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsIdStart(codepoint)

    public fun IsIdContinue(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsIdContinue(codepoint)

    public fun IsGraphemeBase(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsGraphemeBase(codepoint)

    public fun IsGraphemeExtend(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.IsGraphemeExtend(codepoint)

    public fun GetNumericType(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.GetNumericType(codepoint)

    public fun GetGeneralCategory(codepoint: WinDef.UINT) =
        ABI.IUnicodeCharactersStatics_Instance.GetGeneralCategory(codepoint)
  }
}
