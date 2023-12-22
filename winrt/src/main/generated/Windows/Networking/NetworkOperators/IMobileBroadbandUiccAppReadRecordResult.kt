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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandUiccAppReadRecordResult.ABI::class)
@Signature("{64c95285-358e-47c5-8249-695f383b2bdb}")
@Guid("64c95285358e47c58249695f383b2bdb")
@WinRTInterface("64c95285358e47c58249695f383b2bdb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandUiccAppReadRecordResult.ByReference::class)
public interface IMobileBroadbandUiccAppReadRecordResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): MobileBroadbandUiccAppOperationStatus?

  @InterfaceMethod(1)
  public fun get_Data(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandUiccAppReadRecordResult> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandUiccAppReadRecordResult(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandUiccAppReadRecordResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandUiccAppReadRecordResult {
    public val __542822517_Ptr: Pointer?

    public val _542822517_VtblPtr: Pointer?
      get() = __542822517_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): MobileBroadbandUiccAppOperationStatus? {
      val fnPtr = _542822517_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandUiccAppOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__542822517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandUiccAppOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Data(): IBuffer? {
      val fnPtr = _542822517_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__542822517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandUiccAppReadRecordResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __542822517_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandUiccAppReadRecordResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64c95285358e47c58249695f383b2bdb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandUiccAppReadRecordResult(ptr: Pointer?): WithDefault =
        IMobileBroadbandUiccAppReadRecordResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandUiccAppReadRecordResult {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandUiccAppReadRecordResult(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandUiccAppReadRecordResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__542822517_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandUiccAppReadRecordResult):
        Array<IMobileBroadbandUiccAppReadRecordResult?> = (elements as
        Array<IMobileBroadbandUiccAppReadRecordResult?>).castToImpl<IMobileBroadbandUiccAppReadRecordResult,IMobileBroadbandUiccAppReadRecordResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandUiccAppReadRecordResult?> =
        arrayOfNulls<IMobileBroadbandUiccAppReadRecordResult_Impl>(size) as
        Array<IMobileBroadbandUiccAppReadRecordResult?>
  }
}
