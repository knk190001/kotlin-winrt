package Windows.Devices.WiFi

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

@ABIMarker(IWiFiConnectionResult.ABI::class)
@Signature("{143bdfd9-c37d-40be-a5c8-857bce85a931}")
@Guid("143bdfd9c37d40bea5c8857bce85a931")
@WinRTInterface("143bdfd9c37d40bea5c8857bce85a931")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiConnectionResult.ByReference::class)
public interface IWiFiConnectionResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConnectionStatus(): WiFiConnectionStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiConnectionResult> {
    public override fun getValue() = ABI.makeIWiFiConnectionResult(pointer.getPointer(0))

    public fun setValue(value: IWiFiConnectionResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiConnectionResult {
    public val __142547176_Ptr: Pointer?

    public val _142547176_VtblPtr: Pointer?
      get() = __142547176_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConnectionStatus(): WiFiConnectionStatus? {
      val fnPtr = _142547176_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiConnectionStatus>()
      val hr = fn.invokeHR(arrayOf(__142547176_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiConnectionStatus>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiConnectionResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __142547176_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiConnectionResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("143bdfd9c37d40bea5c8857bce85a931")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiConnectionResult(ptr: Pointer?): WithDefault =
        IWiFiConnectionResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiConnectionResult {
      val address = segment.toRawLongValue()
      return makeIWiFiConnectionResult(Pointer(address))
    }

    public override fun toNative(obj: IWiFiConnectionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__142547176_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiConnectionResult): Array<IWiFiConnectionResult?> =
        (elements as
        Array<IWiFiConnectionResult?>).castToImpl<IWiFiConnectionResult,IWiFiConnectionResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiConnectionResult?> =
        arrayOfNulls<IWiFiConnectionResult_Impl>(size) as Array<IWiFiConnectionResult?>
  }
}
