package Windows.Networking.NetworkOperators

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IMobileBroadbandDeviceServiceDataSession.ABI::class)
@Signature("{dad62333-8bcf-4289-8a37-045c2169486a}")
@Guid("dad623338bcf42898a37045c2169486a")
@WinRTInterface("dad623338bcf42898a37045c2169486a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandDeviceServiceDataSession.ByReference::class)
public interface IMobileBroadbandDeviceServiceDataSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun WriteDataAsync(value: IBuffer?): IAsyncAction?

  @InterfaceMethod(1)
  public fun CloseSession(): Unit

  @InterfaceMethod(2)
  public
      fun add_DataReceived(eventHandler: TypedEventHandler<MobileBroadbandDeviceServiceDataSession?,
      MobileBroadbandDeviceServiceDataReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_DataReceived(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandDeviceServiceDataSession> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandDeviceServiceDataSession(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandDeviceServiceDataSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandDeviceServiceDataSession {
    public val __932758327_Ptr: Pointer?

    public val _932758327_VtblPtr: Pointer?
      get() = __932758327_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun WriteDataAsync(value: IBuffer?): IAsyncAction? {
      val fnPtr = _932758327_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__932758327_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CloseSession(): Unit {
      val fnPtr = _932758327_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932758327_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_DataReceived(eventHandler: TypedEventHandler<MobileBroadbandDeviceServiceDataSession?,
        MobileBroadbandDeviceServiceDataReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _932758327_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__932758327_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_DataReceived(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _932758327_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932758327_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMobileBroadbandDeviceServiceDataSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __932758327_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandDeviceServiceDataSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dad623338bcf42898a37045c2169486a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandDeviceServiceDataSession(ptr: Pointer?): WithDefault =
        IMobileBroadbandDeviceServiceDataSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandDeviceServiceDataSession {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandDeviceServiceDataSession(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandDeviceServiceDataSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__932758327_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandDeviceServiceDataSession):
        Array<IMobileBroadbandDeviceServiceDataSession?> = (elements as
        Array<IMobileBroadbandDeviceServiceDataSession?>).castToImpl<IMobileBroadbandDeviceServiceDataSession,IMobileBroadbandDeviceServiceDataSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandDeviceServiceDataSession?> =
        arrayOfNulls<IMobileBroadbandDeviceServiceDataSession_Impl>(size) as
        Array<IMobileBroadbandDeviceServiceDataSession?>
  }
}
