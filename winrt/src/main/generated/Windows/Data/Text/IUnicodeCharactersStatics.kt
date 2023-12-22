package Windows.Data.Text

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Char
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUnicodeCharactersStatics.ABI::class)
@Signature("{97909e87-9291-4f91-b6c8-b6e359d7a7fb}")
@Guid("97909e8792914f91b6c8b6e359d7a7fb")
@WinRTInterface("97909e8792914f91b6c8b6e359d7a7fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUnicodeCharactersStatics.ByReference::class)
public interface IUnicodeCharactersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCodepointFromSurrogatePair(highSurrogate: WinDef.UINT, lowSurrogate: WinDef.UINT):
      WinDef.UINT

  @InterfaceMethod(1)
  public fun GetSurrogatePairFromCodepoint(
    codepoint: WinDef.UINT,
    highSurrogate: Char,
    lowSurrogate: Char
  ): Unit

  @InterfaceMethod(2)
  public fun IsHighSurrogate(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(3)
  public fun IsLowSurrogate(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(4)
  public fun IsSupplementary(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(5)
  public fun IsNoncharacter(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(6)
  public fun IsWhitespace(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(7)
  public fun IsAlphabetic(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(8)
  public fun IsCased(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(9)
  public fun IsUppercase(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(10)
  public fun IsLowercase(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(11)
  public fun IsIdStart(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(12)
  public fun IsIdContinue(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(13)
  public fun IsGraphemeBase(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(14)
  public fun IsGraphemeExtend(codepoint: WinDef.UINT): Boolean

  @InterfaceMethod(15)
  public fun GetNumericType(codepoint: WinDef.UINT): UnicodeNumericType?

  @InterfaceMethod(16)
  public fun GetGeneralCategory(codepoint: WinDef.UINT): UnicodeGeneralCategory?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUnicodeCharactersStatics> {
    public override fun getValue() = ABI.makeIUnicodeCharactersStatics(pointer.getPointer(0))

    public fun setValue(value: IUnicodeCharactersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUnicodeCharactersStatics {
    public val __215301727_Ptr: Pointer?

    public val _215301727_VtblPtr: Pointer?
      get() = __215301727_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCodepointFromSurrogatePair(highSurrogate: WinDef.UINT,
        lowSurrogate: WinDef.UINT): WinDef.UINT {
      val fnPtr = _215301727_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, highSurrogate, lowSurrogate, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetSurrogatePairFromCodepoint(
      codepoint: WinDef.UINT,
      highSurrogate: Char,
      lowSurrogate: Char
    ): Unit {
      val fnPtr = _215301727_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, highSurrogate, lowSurrogate,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun IsHighSurrogate(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun IsLowSurrogate(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun IsSupplementary(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun IsNoncharacter(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun IsWhitespace(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun IsAlphabetic(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun IsCased(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun IsUppercase(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun IsLowercase(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun IsIdStart(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun IsIdContinue(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun IsGraphemeBase(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun IsGraphemeExtend(codepoint: WinDef.UINT): Boolean {
      val fnPtr = _215301727_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun GetNumericType(codepoint: WinDef.UINT): UnicodeNumericType? {
      val fnPtr = _215301727_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnicodeNumericType>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnicodeNumericType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetGeneralCategory(codepoint: WinDef.UINT): UnicodeGeneralCategory? {
      val fnPtr = _215301727_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnicodeGeneralCategory>()
      val hr = fn.invokeHR(arrayOf(__215301727_Ptr, codepoint, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnicodeGeneralCategory>(result.getValue())
      return resultValue
    }
  }

  public class IUnicodeCharactersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __215301727_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUnicodeCharactersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97909e8792914f91b6c8b6e359d7a7fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUnicodeCharactersStatics(ptr: Pointer?): WithDefault =
        IUnicodeCharactersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUnicodeCharactersStatics {
      val address = segment.toRawLongValue()
      return makeIUnicodeCharactersStatics(Pointer(address))
    }

    public override fun toNative(obj: IUnicodeCharactersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__215301727_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUnicodeCharactersStatics):
        Array<IUnicodeCharactersStatics?> = (elements as
        Array<IUnicodeCharactersStatics?>).castToImpl<IUnicodeCharactersStatics,IUnicodeCharactersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUnicodeCharactersStatics?> =
        arrayOfNulls<IUnicodeCharactersStatics_Impl>(size) as Array<IUnicodeCharactersStatics?>
  }
}
