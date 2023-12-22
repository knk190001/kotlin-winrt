package Windows.Devices.WiFiDirect.Services

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

@ABIMarker(IWiFiDirectServiceSessionRequestedEventArgs.ABI::class)
@Signature("{74bdcc11-53d6-4999-b4f8-6c8ecc1771e7}")
@Guid("74bdcc1153d64999b4f86c8ecc1771e7")
@WinRTInterface("74bdcc1153d64999b4f86c8ecc1771e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectServiceSessionRequestedEventArgs.ByReference::class)
public interface IWiFiDirectServiceSessionRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetSessionRequest(): WiFiDirectServiceSessionRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectServiceSessionRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIWiFiDirectServiceSessionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectServiceSessionRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectServiceSessionRequestedEventArgs {
    public val __390858559_Ptr: Pointer?

    public val _390858559_VtblPtr: Pointer?
      get() = __390858559_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetSessionRequest(): WiFiDirectServiceSessionRequest? {
      val fnPtr = _390858559_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectServiceSessionRequest>()
      val hr = fn.invokeHR(arrayOf(__390858559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectServiceSessionRequest>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectServiceSessionRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __390858559_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectServiceSessionRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("74bdcc1153d64999b4f86c8ecc1771e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectServiceSessionRequestedEventArgs(ptr: Pointer?): WithDefault =
        IWiFiDirectServiceSessionRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWiFiDirectServiceSessionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectServiceSessionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectServiceSessionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__390858559_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectServiceSessionRequestedEventArgs):
        Array<IWiFiDirectServiceSessionRequestedEventArgs?> = (elements as
        Array<IWiFiDirectServiceSessionRequestedEventArgs?>).castToImpl<IWiFiDirectServiceSessionRequestedEventArgs,IWiFiDirectServiceSessionRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectServiceSessionRequestedEventArgs?> =
        arrayOfNulls<IWiFiDirectServiceSessionRequestedEventArgs_Impl>(size) as
        Array<IWiFiDirectServiceSessionRequestedEventArgs?>
  }
}
