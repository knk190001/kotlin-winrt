package Windows.Media.Protection.PlayReady

import Windows.Foundation.IAsyncOperation
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INDMessenger.ABI::class)
@Signature("{d42df95d-a75b-47bf-8249-bc83820da38a}")
@Guid("d42df95da75b47bf8249bc83820da38a")
@WinRTInterface("d42df95da75b47bf8249bc83820da38a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDMessenger.ByReference::class)
public interface INDMessenger : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SendRegistrationRequestAsync(sessionIDBytes: Array<Byte>,
      challengeDataBytes: Array<Byte>): IAsyncOperation<INDSendResult?>?

  @InterfaceMethod(1)
  public fun SendProximityDetectionStartAsync(
    pdType: NDProximityDetectionType?,
    transmitterChannelBytes: Array<Byte>,
    sessionIDBytes: Array<Byte>,
    challengeDataBytes: Array<Byte>
  ): IAsyncOperation<INDSendResult?>?

  @InterfaceMethod(2)
  public fun SendProximityDetectionResponseAsync(
    pdType: NDProximityDetectionType?,
    transmitterChannelBytes: Array<Byte>,
    sessionIDBytes: Array<Byte>,
    responseDataBytes: Array<Byte>
  ): IAsyncOperation<INDSendResult?>?

  @InterfaceMethod(3)
  public fun SendLicenseFetchRequestAsync(sessionIDBytes: Array<Byte>,
      challengeDataBytes: Array<Byte>): IAsyncOperation<INDSendResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<INDMessenger> {
    public override fun getValue() = ABI.makeINDMessenger(pointer.getPointer(0))

    public fun setValue(value: INDMessenger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDMessenger {
    public val __1426051043_Ptr: Pointer?

    public val _1426051043_VtblPtr: Pointer?
      get() = __1426051043_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SendRegistrationRequestAsync(sessionIDBytes: Array<Byte>,
        challengeDataBytes: Array<Byte>): IAsyncOperation<INDSendResult?>? {
      val fnPtr = _1426051043_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<INDSendResult?>>()
      val hr = fn.invokeHR(arrayOf(__1426051043_Ptr,
          sessionIDBytes.size,marshalToNative(sessionIDBytes),
          challengeDataBytes.size,marshalToNative(challengeDataBytes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<INDSendResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SendProximityDetectionStartAsync(
      pdType: NDProximityDetectionType?,
      transmitterChannelBytes: Array<Byte>,
      sessionIDBytes: Array<Byte>,
      challengeDataBytes: Array<Byte>
    ): IAsyncOperation<INDSendResult?>? {
      val fnPtr = _1426051043_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<INDSendResult?>>()
      val hr = fn.invokeHR(arrayOf(__1426051043_Ptr, marshalToNative(pdType),
          transmitterChannelBytes.size,marshalToNative(transmitterChannelBytes),
          sessionIDBytes.size,marshalToNative(sessionIDBytes),
          challengeDataBytes.size,marshalToNative(challengeDataBytes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<INDSendResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SendProximityDetectionResponseAsync(
      pdType: NDProximityDetectionType?,
      transmitterChannelBytes: Array<Byte>,
      sessionIDBytes: Array<Byte>,
      responseDataBytes: Array<Byte>
    ): IAsyncOperation<INDSendResult?>? {
      val fnPtr = _1426051043_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<INDSendResult?>>()
      val hr = fn.invokeHR(arrayOf(__1426051043_Ptr, marshalToNative(pdType),
          transmitterChannelBytes.size,marshalToNative(transmitterChannelBytes),
          sessionIDBytes.size,marshalToNative(sessionIDBytes),
          responseDataBytes.size,marshalToNative(responseDataBytes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<INDSendResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SendLicenseFetchRequestAsync(sessionIDBytes: Array<Byte>,
        challengeDataBytes: Array<Byte>): IAsyncOperation<INDSendResult?>? {
      val fnPtr = _1426051043_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<INDSendResult?>>()
      val hr = fn.invokeHR(arrayOf(__1426051043_Ptr,
          sessionIDBytes.size,marshalToNative(sessionIDBytes),
          challengeDataBytes.size,marshalToNative(challengeDataBytes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<INDSendResult?>>(result.getValue())
      return resultValue
    }
  }

  public class INDMessenger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1426051043_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDMessenger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d42df95da75b47bf8249bc83820da38a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDMessenger(ptr: Pointer?): WithDefault = INDMessenger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDMessenger {
      val address = segment.toRawLongValue()
      return makeINDMessenger(Pointer(address))
    }

    public override fun toNative(obj: INDMessenger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1426051043_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDMessenger): Array<INDMessenger?> = (elements as
        Array<INDMessenger?>).castToImpl<INDMessenger,INDMessenger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDMessenger?> =
        arrayOfNulls<INDMessenger_Impl>(size) as Array<INDMessenger?>
  }
}
