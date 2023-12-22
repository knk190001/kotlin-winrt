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

@ABIMarker(ITextPhoneme.ABI::class)
@Signature("{9362a40a-9b7a-4569-94cf-d84f2f38cf9b}")
@Guid("9362a40a9b7a456994cfd84f2f38cf9b")
@WinRTInterface("9362a40a9b7a456994cfd84f2f38cf9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextPhoneme.ByReference::class)
public interface ITextPhoneme : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayText(): String?

  @InterfaceMethod(1)
  public fun get_ReadingText(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextPhoneme> {
    public override fun getValue() = ABI.makeITextPhoneme(pointer.getPointer(0))

    public fun setValue(value: ITextPhoneme_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextPhoneme {
    public val __298913718_Ptr: Pointer?

    public val _298913718_VtblPtr: Pointer?
      get() = __298913718_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayText(): String? {
      val fnPtr = _298913718_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__298913718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ReadingText(): String? {
      val fnPtr = _298913718_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__298913718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ITextPhoneme_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __298913718_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextPhoneme, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9362a40a9b7a456994cfd84f2f38cf9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextPhoneme(ptr: Pointer?): WithDefault = ITextPhoneme_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextPhoneme {
      val address = segment.toRawLongValue()
      return makeITextPhoneme(Pointer(address))
    }

    public override fun toNative(obj: ITextPhoneme): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__298913718_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextPhoneme): Array<ITextPhoneme?> = (elements as
        Array<ITextPhoneme?>).castToImpl<ITextPhoneme,ITextPhoneme_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextPhoneme?> =
        arrayOfNulls<ITextPhoneme_Impl>(size) as Array<ITextPhoneme?>
  }
}
