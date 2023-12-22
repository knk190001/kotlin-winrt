package Windows.Networking.Sockets

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

@ABIMarker(ISocketErrorStatics.ABI::class)
@Signature("{828337f4-7d56-4d8e-b7b4-a07dd7c1bca9}")
@Guid("828337f47d564d8eb7b4a07dd7c1bca9")
@WinRTInterface("828337f47d564d8eb7b4a07dd7c1bca9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocketErrorStatics.ByReference::class)
public interface ISocketErrorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStatus(hresult: Int): SocketErrorStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocketErrorStatics> {
    public override fun getValue() = ABI.makeISocketErrorStatics(pointer.getPointer(0))

    public fun setValue(value: ISocketErrorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocketErrorStatics {
    public val __1654958184_Ptr: Pointer?

    public val _1654958184_VtblPtr: Pointer?
      get() = __1654958184_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStatus(hresult: Int): SocketErrorStatus? {
      val fnPtr = _1654958184_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__1654958184_Ptr, hresult, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketErrorStatus>(result.getValue())
      return resultValue
    }
  }

  public class ISocketErrorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1654958184_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocketErrorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("828337f47d564d8eb7b4a07dd7c1bca9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocketErrorStatics(ptr: Pointer?): WithDefault = ISocketErrorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocketErrorStatics {
      val address = segment.toRawLongValue()
      return makeISocketErrorStatics(Pointer(address))
    }

    public override fun toNative(obj: ISocketErrorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1654958184_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocketErrorStatics): Array<ISocketErrorStatics?> =
        (elements as
        Array<ISocketErrorStatics?>).castToImpl<ISocketErrorStatics,ISocketErrorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocketErrorStatics?> =
        arrayOfNulls<ISocketErrorStatics_Impl>(size) as Array<ISocketErrorStatics?>
  }
}
