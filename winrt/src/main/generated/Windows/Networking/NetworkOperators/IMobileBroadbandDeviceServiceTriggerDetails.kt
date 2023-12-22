package Windows.Networking.NetworkOperators

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandDeviceServiceTriggerDetails.ABI::class)
@Signature("{4a055b70-b9ae-4458-9241-a6a5fbf18a0c}")
@Guid("4a055b70b9ae44589241a6a5fbf18a0c")
@WinRTInterface("4a055b70b9ae44589241a6a5fbf18a0c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandDeviceServiceTriggerDetails.ByReference::class)
public interface IMobileBroadbandDeviceServiceTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_DeviceServiceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_ReceivedData(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandDeviceServiceTriggerDetails> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandDeviceServiceTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandDeviceServiceTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandDeviceServiceTriggerDetails {
    public val __875186957_Ptr: Pointer?

    public val _875186957_VtblPtr: Pointer?
      get() = __875186957_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _875186957_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__875186957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceServiceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _875186957_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__875186957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ReceivedData(): IBuffer? {
      val fnPtr = _875186957_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__875186957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandDeviceServiceTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __875186957_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandDeviceServiceTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a055b70b9ae44589241a6a5fbf18a0c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandDeviceServiceTriggerDetails(ptr: Pointer?): WithDefault =
        IMobileBroadbandDeviceServiceTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandDeviceServiceTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandDeviceServiceTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandDeviceServiceTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__875186957_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandDeviceServiceTriggerDetails):
        Array<IMobileBroadbandDeviceServiceTriggerDetails?> = (elements as
        Array<IMobileBroadbandDeviceServiceTriggerDetails?>).castToImpl<IMobileBroadbandDeviceServiceTriggerDetails,IMobileBroadbandDeviceServiceTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandDeviceServiceTriggerDetails?> =
        arrayOfNulls<IMobileBroadbandDeviceServiceTriggerDetails_Impl>(size) as
        Array<IMobileBroadbandDeviceServiceTriggerDetails?>
  }
}
