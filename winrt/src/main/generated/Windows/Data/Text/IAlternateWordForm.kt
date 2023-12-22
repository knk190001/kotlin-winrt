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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAlternateWordForm.ABI::class)
@Signature("{47396c1e-51b9-4207-9146-248e636a1d1d}")
@Guid("47396c1e51b942079146248e636a1d1d")
@WinRTInterface("47396c1e51b942079146248e636a1d1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAlternateWordForm.ByReference::class)
public interface IAlternateWordForm : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceTextSegment(): TextSegment?

  @InterfaceMethod(1)
  public fun get_AlternateText(): String?

  @InterfaceMethod(2)
  public fun get_NormalizationFormat(): AlternateNormalizationFormat?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAlternateWordForm> {
    public override fun getValue() = ABI.makeIAlternateWordForm(pointer.getPointer(0))

    public fun setValue(value: IAlternateWordForm_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAlternateWordForm {
    public val __1312537115_Ptr: Pointer?

    public val _1312537115_VtblPtr: Pointer?
      get() = __1312537115_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceTextSegment(): TextSegment? {
      val fnPtr = _1312537115_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextSegment>()
      val hr = fn.invokeHR(arrayOf(__1312537115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextSegment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AlternateText(): String? {
      val fnPtr = _1312537115_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1312537115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NormalizationFormat(): AlternateNormalizationFormat? {
      val fnPtr = _1312537115_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AlternateNormalizationFormat>()
      val hr = fn.invokeHR(arrayOf(__1312537115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AlternateNormalizationFormat>(result.getValue())
      return resultValue
    }
  }

  public class IAlternateWordForm_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1312537115_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAlternateWordForm, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47396c1e51b942079146248e636a1d1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAlternateWordForm(ptr: Pointer?): WithDefault = IAlternateWordForm_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAlternateWordForm {
      val address = segment.toRawLongValue()
      return makeIAlternateWordForm(Pointer(address))
    }

    public override fun toNative(obj: IAlternateWordForm): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1312537115_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAlternateWordForm): Array<IAlternateWordForm?> =
        (elements as
        Array<IAlternateWordForm?>).castToImpl<IAlternateWordForm,IAlternateWordForm_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAlternateWordForm?> =
        arrayOfNulls<IAlternateWordForm_Impl>(size) as Array<IAlternateWordForm?>
  }
}
