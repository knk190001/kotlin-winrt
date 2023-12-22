package Windows.Networking.XboxLive

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXboxLiveEndpointPairCreationResult.ABI::class)
@Signature("{d9a8bb95-2aab-4d1e-9794-33ecc0dcf0fe}")
@Guid("d9a8bb952aab4d1e979433ecc0dcf0fe")
@WinRTInterface("d9a8bb952aab4d1e979433ecc0dcf0fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXboxLiveEndpointPairCreationResult.ByReference::class)
public interface IXboxLiveEndpointPairCreationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceAddress(): XboxLiveDeviceAddress?

  @InterfaceMethod(1)
  public fun get_Status(): XboxLiveEndpointPairCreationStatus?

  @InterfaceMethod(2)
  public fun get_IsExistingPathEvaluation(): Boolean

  @InterfaceMethod(3)
  public fun get_EndpointPair(): XboxLiveEndpointPair?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXboxLiveEndpointPairCreationResult> {
    public override fun getValue() =
        ABI.makeIXboxLiveEndpointPairCreationResult(pointer.getPointer(0))

    public fun setValue(value: IXboxLiveEndpointPairCreationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXboxLiveEndpointPairCreationResult {
    public val __620334875_Ptr: Pointer?

    public val _620334875_VtblPtr: Pointer?
      get() = __620334875_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceAddress(): XboxLiveDeviceAddress? {
      val fnPtr = _620334875_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveDeviceAddress>()
      val hr = fn.invokeHR(arrayOf(__620334875_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveDeviceAddress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): XboxLiveEndpointPairCreationStatus? {
      val fnPtr = _620334875_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveEndpointPairCreationStatus>()
      val hr = fn.invokeHR(arrayOf(__620334875_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveEndpointPairCreationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsExistingPathEvaluation(): Boolean {
      val fnPtr = _620334875_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__620334875_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_EndpointPair(): XboxLiveEndpointPair? {
      val fnPtr = _620334875_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveEndpointPair>()
      val hr = fn.invokeHR(arrayOf(__620334875_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveEndpointPair>(result.getValue())
      return resultValue
    }
  }

  public class IXboxLiveEndpointPairCreationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __620334875_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXboxLiveEndpointPairCreationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d9a8bb952aab4d1e979433ecc0dcf0fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXboxLiveEndpointPairCreationResult(ptr: Pointer?): WithDefault =
        IXboxLiveEndpointPairCreationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXboxLiveEndpointPairCreationResult {
      val address = segment.toRawLongValue()
      return makeIXboxLiveEndpointPairCreationResult(Pointer(address))
    }

    public override fun toNative(obj: IXboxLiveEndpointPairCreationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__620334875_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXboxLiveEndpointPairCreationResult):
        Array<IXboxLiveEndpointPairCreationResult?> = (elements as
        Array<IXboxLiveEndpointPairCreationResult?>).castToImpl<IXboxLiveEndpointPairCreationResult,IXboxLiveEndpointPairCreationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXboxLiveEndpointPairCreationResult?> =
        arrayOfNulls<IXboxLiveEndpointPairCreationResult_Impl>(size) as
        Array<IXboxLiveEndpointPairCreationResult?>
  }
}
