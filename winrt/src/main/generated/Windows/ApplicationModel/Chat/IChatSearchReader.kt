package Windows.ApplicationModel.Chat

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatSearchReader.ABI::class)
@Signature("{4665fe49-9020-4752-980d-39612325f589}")
@Guid("4665fe4990204752980d39612325f589")
@WinRTInterface("4665fe4990204752980d39612325f589")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatSearchReader.ByReference::class)
public interface IChatSearchReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadBatchAsync(): IAsyncOperation<IVectorView<IChatItem?>?>?

  @InterfaceMethod(1)
  public fun ReadBatchAsync(count: Int): IAsyncOperation<IVectorView<IChatItem?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatSearchReader> {
    public override fun getValue() = ABI.makeIChatSearchReader(pointer.getPointer(0))

    public fun setValue(value: IChatSearchReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatSearchReader {
    public val __642236534_Ptr: Pointer?

    public val _642236534_VtblPtr: Pointer?
      get() = __642236534_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadBatchAsync(): IAsyncOperation<IVectorView<IChatItem?>?>? {
      val fnPtr = _642236534_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IChatItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__642236534_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IChatItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReadBatchAsync(count: Int): IAsyncOperation<IVectorView<IChatItem?>?>? {
      val fnPtr = _642236534_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IChatItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__642236534_Ptr, count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IChatItem?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatSearchReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __642236534_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatSearchReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4665fe4990204752980d39612325f589")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatSearchReader(ptr: Pointer?): WithDefault = IChatSearchReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatSearchReader {
      val address = segment.toRawLongValue()
      return makeIChatSearchReader(Pointer(address))
    }

    public override fun toNative(obj: IChatSearchReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__642236534_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatSearchReader): Array<IChatSearchReader?> = (elements
        as Array<IChatSearchReader?>).castToImpl<IChatSearchReader,IChatSearchReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatSearchReader?> =
        arrayOfNulls<IChatSearchReader_Impl>(size) as Array<IChatSearchReader?>
  }
}
