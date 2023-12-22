package Windows.Networking.NetworkOperators

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandModem3.ABI::class)
@Signature("{e9fec6ea-2f34-4582-9102-c314d2a87eec}")
@Guid("e9fec6ea2f3445829102c314d2a87eec")
@WinRTInterface("e9fec6ea2f3445829102c314d2a87eec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandModem3.ByReference::class)
public interface IMobileBroadbandModem3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetPcoAsync(): IAsyncOperation<MobileBroadbandPco?>?

  @InterfaceMethod(1)
  public fun get_IsInEmergencyCallMode(): Boolean

  @InterfaceMethod(2)
  public fun add_IsInEmergencyCallModeChanged(handler: TypedEventHandler<MobileBroadbandModem?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_IsInEmergencyCallModeChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandModem3> {
    public override fun getValue() = ABI.makeIMobileBroadbandModem3(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandModem3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandModem3 {
    public val __1123440763_Ptr: Pointer?

    public val _1123440763_VtblPtr: Pointer?
      get() = __1123440763_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetPcoAsync(): IAsyncOperation<MobileBroadbandPco?>? {
      val fnPtr = _1123440763_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandPco?>>()
      val hr = fn.invokeHR(arrayOf(__1123440763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MobileBroadbandPco?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsInEmergencyCallMode(): Boolean {
      val fnPtr = _1123440763_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1123440763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override
        fun add_IsInEmergencyCallModeChanged(handler: TypedEventHandler<MobileBroadbandModem?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1123440763_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1123440763_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_IsInEmergencyCallModeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1123440763_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1123440763_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMobileBroadbandModem3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1123440763_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandModem3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e9fec6ea2f3445829102c314d2a87eec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandModem3(ptr: Pointer?): WithDefault =
        IMobileBroadbandModem3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandModem3 {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandModem3(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandModem3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1123440763_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandModem3): Array<IMobileBroadbandModem3?> =
        (elements as
        Array<IMobileBroadbandModem3?>).castToImpl<IMobileBroadbandModem3,IMobileBroadbandModem3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandModem3?> =
        arrayOfNulls<IMobileBroadbandModem3_Impl>(size) as Array<IMobileBroadbandModem3?>
  }
}
