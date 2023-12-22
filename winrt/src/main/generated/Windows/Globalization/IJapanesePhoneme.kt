package Windows.Globalization

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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IJapanesePhoneme.ABI::class)
@Signature("{2f6a9300-e85b-43e6-897d-5d82f862df21}")
@Guid("2f6a9300e85b43e6897d5d82f862df21")
@WinRTInterface("2f6a9300e85b43e6897d5d82f862df21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJapanesePhoneme.ByReference::class)
public interface IJapanesePhoneme : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayText(): String?

  @InterfaceMethod(1)
  public fun get_YomiText(): String?

  @InterfaceMethod(2)
  public fun get_IsPhraseStart(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJapanesePhoneme> {
    public override fun getValue() = ABI.makeIJapanesePhoneme(pointer.getPointer(0))

    public fun setValue(value: IJapanesePhoneme_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJapanesePhoneme {
    public val __1368152574_Ptr: Pointer?

    public val _1368152574_VtblPtr: Pointer?
      get() = __1368152574_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayText(): String? {
      val fnPtr = _1368152574_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1368152574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_YomiText(): String? {
      val fnPtr = _1368152574_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1368152574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsPhraseStart(): Boolean {
      val fnPtr = _1368152574_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1368152574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IJapanesePhoneme_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1368152574_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJapanesePhoneme, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f6a9300e85b43e6897d5d82f862df21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJapanesePhoneme(ptr: Pointer?): WithDefault = IJapanesePhoneme_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJapanesePhoneme {
      val address = segment.toRawLongValue()
      return makeIJapanesePhoneme(Pointer(address))
    }

    public override fun toNative(obj: IJapanesePhoneme): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1368152574_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJapanesePhoneme): Array<IJapanesePhoneme?> = (elements as
        Array<IJapanesePhoneme?>).castToImpl<IJapanesePhoneme,IJapanesePhoneme_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJapanesePhoneme?> =
        arrayOfNulls<IJapanesePhoneme_Impl>(size) as Array<IJapanesePhoneme?>
  }
}
