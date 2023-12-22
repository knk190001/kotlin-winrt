package Windows.Networking.NetworkOperators

import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMobileBroadbandDeviceServiceCommandSession.ABI::class)
@Signature("{fc098a45-913b-4914-b6c3-ae6304593e75}")
@Guid("fc098a45913b4914b6c3ae6304593e75")
@WinRTInterface("fc098a45913b4914b6c3ae6304593e75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandDeviceServiceCommandSession.ByReference::class)
public interface IMobileBroadbandDeviceServiceCommandSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SendQueryCommandAsync(commandId: WinDef.UINT, `data`: IBuffer?):
      IAsyncOperation<MobileBroadbandDeviceServiceCommandResult?>?

  @InterfaceMethod(1)
  public fun SendSetCommandAsync(commandId: WinDef.UINT, `data`: IBuffer?):
      IAsyncOperation<MobileBroadbandDeviceServiceCommandResult?>?

  @InterfaceMethod(2)
  public fun CloseSession(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandDeviceServiceCommandSession> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandDeviceServiceCommandSession(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandDeviceServiceCommandSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandDeviceServiceCommandSession {
    public val __320866706_Ptr: Pointer?

    public val _320866706_VtblPtr: Pointer?
      get() = __320866706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SendQueryCommandAsync(commandId: WinDef.UINT, `data`: IBuffer?):
        IAsyncOperation<MobileBroadbandDeviceServiceCommandResult?>? {
      val fnPtr = _320866706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MobileBroadbandDeviceServiceCommandResult?>>()
      val hr = fn.invokeHR(arrayOf(__320866706_Ptr, commandId, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandDeviceServiceCommandResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SendSetCommandAsync(commandId: WinDef.UINT, `data`: IBuffer?):
        IAsyncOperation<MobileBroadbandDeviceServiceCommandResult?>? {
      val fnPtr = _320866706_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MobileBroadbandDeviceServiceCommandResult?>>()
      val hr = fn.invokeHR(arrayOf(__320866706_Ptr, commandId, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandDeviceServiceCommandResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CloseSession(): Unit {
      val fnPtr = _320866706_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320866706_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMobileBroadbandDeviceServiceCommandSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __320866706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandDeviceServiceCommandSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc098a45913b4914b6c3ae6304593e75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandDeviceServiceCommandSession(ptr: Pointer?): WithDefault =
        IMobileBroadbandDeviceServiceCommandSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandDeviceServiceCommandSession {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandDeviceServiceCommandSession(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandDeviceServiceCommandSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__320866706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandDeviceServiceCommandSession):
        Array<IMobileBroadbandDeviceServiceCommandSession?> = (elements as
        Array<IMobileBroadbandDeviceServiceCommandSession?>).castToImpl<IMobileBroadbandDeviceServiceCommandSession,IMobileBroadbandDeviceServiceCommandSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandDeviceServiceCommandSession?> =
        arrayOfNulls<IMobileBroadbandDeviceServiceCommandSession_Impl>(size) as
        Array<IMobileBroadbandDeviceServiceCommandSession?>
  }
}
