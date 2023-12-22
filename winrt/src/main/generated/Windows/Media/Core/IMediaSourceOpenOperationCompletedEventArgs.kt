package Windows.Media.Core

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

@ABIMarker(IMediaSourceOpenOperationCompletedEventArgs.ABI::class)
@Signature("{fc682ceb-e281-477c-a8e0-1acd654114c8}")
@Guid("fc682cebe281477ca8e01acd654114c8")
@WinRTInterface("fc682cebe281477ca8e01acd654114c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSourceOpenOperationCompletedEventArgs.ByReference::class)
public interface IMediaSourceOpenOperationCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Error(): MediaSourceError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaSourceOpenOperationCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaSourceOpenOperationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaSourceOpenOperationCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSourceOpenOperationCompletedEventArgs {
    public val __286557921_Ptr: Pointer?

    public val _286557921_VtblPtr: Pointer?
      get() = __286557921_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Error(): MediaSourceError? {
      val fnPtr = _286557921_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSourceError>()
      val hr = fn.invokeHR(arrayOf(__286557921_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSourceError>(result.getValue())
      return resultValue
    }
  }

  public class IMediaSourceOpenOperationCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __286557921_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSourceOpenOperationCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc682cebe281477ca8e01acd654114c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSourceOpenOperationCompletedEventArgs(ptr: Pointer?): WithDefault =
        IMediaSourceOpenOperationCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaSourceOpenOperationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaSourceOpenOperationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaSourceOpenOperationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__286557921_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSourceOpenOperationCompletedEventArgs):
        Array<IMediaSourceOpenOperationCompletedEventArgs?> = (elements as
        Array<IMediaSourceOpenOperationCompletedEventArgs?>).castToImpl<IMediaSourceOpenOperationCompletedEventArgs,IMediaSourceOpenOperationCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSourceOpenOperationCompletedEventArgs?> =
        arrayOfNulls<IMediaSourceOpenOperationCompletedEventArgs_Impl>(size) as
        Array<IMediaSourceOpenOperationCompletedEventArgs?>
  }
}
