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

@ABIMarker(IMobileBroadbandDeviceServiceCommandResult.ABI::class)
@Signature("{b0f46abb-94d6-44b9-a538-f0810b645389}")
@Guid("b0f46abb94d644b9a538f0810b645389")
@WinRTInterface("b0f46abb94d644b9a538f0810b645389")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandDeviceServiceCommandResult.ByReference::class)
public interface IMobileBroadbandDeviceServiceCommandResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StatusCode(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_ResponseData(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandDeviceServiceCommandResult> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandDeviceServiceCommandResult(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandDeviceServiceCommandResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandDeviceServiceCommandResult {
    public val __1701545659_Ptr: Pointer?

    public val _1701545659_VtblPtr: Pointer?
      get() = __1701545659_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StatusCode(): WinDef.UINT {
      val fnPtr = _1701545659_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1701545659_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ResponseData(): IBuffer? {
      val fnPtr = _1701545659_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1701545659_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandDeviceServiceCommandResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1701545659_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandDeviceServiceCommandResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0f46abb94d644b9a538f0810b645389")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandDeviceServiceCommandResult(ptr: Pointer?): WithDefault =
        IMobileBroadbandDeviceServiceCommandResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandDeviceServiceCommandResult {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandDeviceServiceCommandResult(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandDeviceServiceCommandResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1701545659_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandDeviceServiceCommandResult):
        Array<IMobileBroadbandDeviceServiceCommandResult?> = (elements as
        Array<IMobileBroadbandDeviceServiceCommandResult?>).castToImpl<IMobileBroadbandDeviceServiceCommandResult,IMobileBroadbandDeviceServiceCommandResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandDeviceServiceCommandResult?> =
        arrayOfNulls<IMobileBroadbandDeviceServiceCommandResult_Impl>(size) as
        Array<IMobileBroadbandDeviceServiceCommandResult?>
  }
}
