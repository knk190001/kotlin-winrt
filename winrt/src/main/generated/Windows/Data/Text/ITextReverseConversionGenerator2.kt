package Windows.Data.Text

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ITextReverseConversionGenerator2.ABI::class)
@Signature("{1aafd2ec-85d6-46fd-828a-3a4830fa6e18}")
@Guid("1aafd2ec85d646fd828a3a4830fa6e18")
@WinRTInterface("1aafd2ec85d646fd828a3a4830fa6e18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextReverseConversionGenerator2.ByReference::class)
public interface ITextReverseConversionGenerator2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPhonemesAsync(input: String?): IAsyncOperation<IVectorView<TextPhoneme?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextReverseConversionGenerator2> {
    public override fun getValue() = ABI.makeITextReverseConversionGenerator2(pointer.getPointer(0))

    public fun setValue(value: ITextReverseConversionGenerator2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextReverseConversionGenerator2 {
    public val __1683902553_Ptr: Pointer?

    public val _1683902553_VtblPtr: Pointer?
      get() = __1683902553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPhonemesAsync(input: String?):
        IAsyncOperation<IVectorView<TextPhoneme?>?>? {
      val fnPtr = _1683902553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<TextPhoneme?>?>>()
      val hr = fn.invokeHR(arrayOf(__1683902553_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<TextPhoneme?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ITextReverseConversionGenerator2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1683902553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextReverseConversionGenerator2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1aafd2ec85d646fd828a3a4830fa6e18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextReverseConversionGenerator2(ptr: Pointer?): WithDefault =
        ITextReverseConversionGenerator2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextReverseConversionGenerator2 {
      val address = segment.toRawLongValue()
      return makeITextReverseConversionGenerator2(Pointer(address))
    }

    public override fun toNative(obj: ITextReverseConversionGenerator2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1683902553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextReverseConversionGenerator2):
        Array<ITextReverseConversionGenerator2?> = (elements as
        Array<ITextReverseConversionGenerator2?>).castToImpl<ITextReverseConversionGenerator2,ITextReverseConversionGenerator2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextReverseConversionGenerator2?> =
        arrayOfNulls<ITextReverseConversionGenerator2_Impl>(size) as
        Array<ITextReverseConversionGenerator2?>
  }
}
