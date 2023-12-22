package Windows.Devices.WiFiDirect.Services

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs.ABI::class)
@Signature("{dcd9e01e-83df-43e5-8f43-cbe8479e84eb}")
@Guid("dcd9e01e83df43e58f43cbe8479e84eb")
@WinRTInterface("dcd9e01e83df43e58f43cbe8479e84eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs.ByReference::class)
public interface IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Session(): WiFiDirectServiceSession?

  @InterfaceMethod(1)
  public fun get_SessionInfo(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs> {
    public override fun getValue() =
        ABI.makeIWiFiDirectServiceAutoAcceptSessionConnectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs {
    public val __1561428525_Ptr: Pointer?

    public val _1561428525_VtblPtr: Pointer?
      get() = __1561428525_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Session(): WiFiDirectServiceSession? {
      val fnPtr = _1561428525_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectServiceSession>()
      val hr = fn.invokeHR(arrayOf(__1561428525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectServiceSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SessionInfo(): IBuffer? {
      val fnPtr = _1561428525_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1561428525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1561428525_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dcd9e01e83df43e58f43cbe8479e84eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectServiceAutoAcceptSessionConnectedEventArgs(ptr: Pointer?): WithDefault
        = IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectServiceAutoAcceptSessionConnectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1561428525_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs):
        Array<IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs?> = (elements as
        Array<IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs?>).castToImpl<IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs,IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs?> =
        arrayOfNulls<IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs_Impl>(size) as
        Array<IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs?>
  }
}
