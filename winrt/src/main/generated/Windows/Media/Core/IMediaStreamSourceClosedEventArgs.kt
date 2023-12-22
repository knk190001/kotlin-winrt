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

@ABIMarker(IMediaStreamSourceClosedEventArgs.ABI::class)
@Signature("{cd8c7eb2-4816-4e24-88f0-491ef7386406}")
@Guid("cd8c7eb248164e2488f0491ef7386406")
@WinRTInterface("cd8c7eb248164e2488f0491ef7386406")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSourceClosedEventArgs.ByReference::class)
public interface IMediaStreamSourceClosedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): MediaStreamSourceClosedRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSourceClosedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaStreamSourceClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSourceClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSourceClosedEventArgs {
    public val __235256415_Ptr: Pointer?

    public val _235256415_VtblPtr: Pointer?
      get() = __235256415_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): MediaStreamSourceClosedRequest? {
      val fnPtr = _235256415_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSourceClosedRequest>()
      val hr = fn.invokeHR(arrayOf(__235256415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSourceClosedRequest>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamSourceClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __235256415_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSourceClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd8c7eb248164e2488f0491ef7386406")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSourceClosedEventArgs(ptr: Pointer?): WithDefault =
        IMediaStreamSourceClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSourceClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSourceClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSourceClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__235256415_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSourceClosedEventArgs):
        Array<IMediaStreamSourceClosedEventArgs?> = (elements as
        Array<IMediaStreamSourceClosedEventArgs?>).castToImpl<IMediaStreamSourceClosedEventArgs,IMediaStreamSourceClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSourceClosedEventArgs?> =
        arrayOfNulls<IMediaStreamSourceClosedEventArgs_Impl>(size) as
        Array<IMediaStreamSourceClosedEventArgs?>
  }
}
