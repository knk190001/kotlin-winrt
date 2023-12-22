package Windows.Security.Isolation

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

@ABIMarker(IIsolatedWindowsHostMessengerStatics2.ABI::class)
@Signature("{55ef9ebc-0444-42ad-832d-1b89c089d1ca}")
@Guid("55ef9ebc044442ad832d1b89c089d1ca")
@WinRTInterface("55ef9ebc044442ad832d1b89c089d1ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsHostMessengerStatics2.ByReference::class)
public interface IIsolatedWindowsHostMessengerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RegisterHostMessageReceiver(receiverId: com.sun.jna.platform.win32.Guid.GUID?,
      hostMessageReceivedCallback: HostMessageReceivedCallback?): Unit

  @InterfaceMethod(1)
  public fun UnregisterHostMessageReceiver(receiverId: com.sun.jna.platform.win32.Guid.GUID?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsHostMessengerStatics2> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsHostMessengerStatics2(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsHostMessengerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsHostMessengerStatics2 {
    public val __238225620_Ptr: Pointer?

    public val _238225620_VtblPtr: Pointer?
      get() = __238225620_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun RegisterHostMessageReceiver(receiverId: com.sun.jna.platform.win32.Guid.GUID?,
        hostMessageReceivedCallback: HostMessageReceivedCallback?): Unit {
      val fnPtr = _238225620_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__238225620_Ptr, marshalToNative(receiverId),
          marshalToNative(hostMessageReceivedCallback),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override
        fun UnregisterHostMessageReceiver(receiverId: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _238225620_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__238225620_Ptr, marshalToNative(receiverId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIsolatedWindowsHostMessengerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __238225620_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsHostMessengerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55ef9ebc044442ad832d1b89c089d1ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsHostMessengerStatics2(ptr: Pointer?): WithDefault =
        IIsolatedWindowsHostMessengerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsolatedWindowsHostMessengerStatics2 {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsHostMessengerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsHostMessengerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__238225620_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsHostMessengerStatics2):
        Array<IIsolatedWindowsHostMessengerStatics2?> = (elements as
        Array<IIsolatedWindowsHostMessengerStatics2?>).castToImpl<IIsolatedWindowsHostMessengerStatics2,IIsolatedWindowsHostMessengerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsHostMessengerStatics2?> =
        arrayOfNulls<IIsolatedWindowsHostMessengerStatics2_Impl>(size) as
        Array<IIsolatedWindowsHostMessengerStatics2?>
  }
}
