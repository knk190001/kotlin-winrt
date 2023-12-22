package Windows.Media.Core

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

@ABIMarker(ICodecQuery.ABI::class)
@Signature("{222a953a-af61-4e04-808a-a4634e2f3ac4}")
@Guid("222a953aaf614e04808aa4634e2f3ac4")
@WinRTInterface("222a953aaf614e04808aa4634e2f3ac4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICodecQuery.ByReference::class)
public interface ICodecQuery : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAllAsync(
    kind: CodecKind?,
    category: CodecCategory?,
    subType: String?
  ): IAsyncOperation<IVectorView<CodecInfo?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICodecQuery> {
    public override fun getValue() = ABI.makeICodecQuery(pointer.getPointer(0))

    public fun setValue(value: ICodecQuery_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICodecQuery {
    public val __588134681_Ptr: Pointer?

    public val _588134681_VtblPtr: Pointer?
      get() = __588134681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAllAsync(
      kind: CodecKind?,
      category: CodecCategory?,
      subType: String?
    ): IAsyncOperation<IVectorView<CodecInfo?>?>? {
      val fnPtr = _588134681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<CodecInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__588134681_Ptr, marshalToNative(kind),
          marshalToNative(category), marshalToNative(subType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<CodecInfo?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ICodecQuery_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __588134681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICodecQuery, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("222a953aaf614e04808aa4634e2f3ac4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICodecQuery(ptr: Pointer?): WithDefault = ICodecQuery_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICodecQuery {
      val address = segment.toRawLongValue()
      return makeICodecQuery(Pointer(address))
    }

    public override fun toNative(obj: ICodecQuery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__588134681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICodecQuery): Array<ICodecQuery?> = (elements as
        Array<ICodecQuery?>).castToImpl<ICodecQuery,ICodecQuery_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICodecQuery?> =
        arrayOfNulls<ICodecQuery_Impl>(size) as Array<ICodecQuery?>
  }
}
