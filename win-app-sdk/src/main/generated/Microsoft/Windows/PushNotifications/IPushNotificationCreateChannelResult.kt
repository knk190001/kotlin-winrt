package Microsoft.Windows.PushNotifications

import Windows.Foundation.HResult
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

@ABIMarker(IPushNotificationCreateChannelResult.ABI::class)
@Signature("{4df3717f-5d33-56e9-b381-1b350c95722e}")
@Guid("4df3717f5d3356e9b3811b350c95722e")
@WinRTInterface("4df3717f5d3356e9b3811b350c95722e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationCreateChannelResult.ByReference::class)
public interface IPushNotificationCreateChannelResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Channel(): PushNotificationChannel?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(2)
  public fun get_Status(): PushNotificationChannelStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationCreateChannelResult> {
    public override fun getValue() =
        ABI.makeIPushNotificationCreateChannelResult(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationCreateChannelResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationCreateChannelResult {
    public val __789664601_Ptr: Pointer?

    public val _789664601_VtblPtr: Pointer?
      get() = __789664601_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Channel(): PushNotificationChannel? {
      val fnPtr = _789664601_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PushNotificationChannel>()
      val hr = fn.invokeHR(arrayOf(__789664601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PushNotificationChannel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _789664601_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__789664601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Status(): PushNotificationChannelStatus? {
      val fnPtr = _789664601_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PushNotificationChannelStatus>()
      val hr = fn.invokeHR(arrayOf(__789664601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PushNotificationChannelStatus>(result.getValue())
      return resultValue
    }
  }

  public class IPushNotificationCreateChannelResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __789664601_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationCreateChannelResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4df3717f5d3356e9b3811b350c95722e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationCreateChannelResult(ptr: Pointer?): WithDefault =
        IPushNotificationCreateChannelResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPushNotificationCreateChannelResult {
      val address = segment.toRawLongValue()
      return makeIPushNotificationCreateChannelResult(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationCreateChannelResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__789664601_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationCreateChannelResult):
        Array<IPushNotificationCreateChannelResult?> = (elements as
        Array<IPushNotificationCreateChannelResult?>).castToImpl<IPushNotificationCreateChannelResult,IPushNotificationCreateChannelResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationCreateChannelResult?> =
        arrayOfNulls<IPushNotificationCreateChannelResult_Impl>(size) as
        Array<IPushNotificationCreateChannelResult?>
  }
}
