package Windows.Media.Core

import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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

@ABIMarker(IMediaStreamSourceStartingRequest.ABI::class)
@Signature("{2a9093e4-35c4-4b1b-a791-0d99db56dd1d}")
@Guid("2a9093e435c44b1ba7910d99db56dd1d")
@WinRTInterface("2a9093e435c44b1ba7910d99db56dd1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSourceStartingRequest.ByReference::class)
public interface IMediaStreamSourceStartingRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartPosition(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun GetDeferral(): MediaStreamSourceStartingRequestDeferral?

  @InterfaceMethod(2)
  public fun SetActualStartPosition(position: TimeSpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSourceStartingRequest> {
    public override fun getValue() =
        ABI.makeIMediaStreamSourceStartingRequest(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSourceStartingRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSourceStartingRequest {
    public val __1227344571_Ptr: Pointer?

    public val _1227344571_VtblPtr: Pointer?
      get() = __1227344571_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartPosition(): IReference<TimeSpan?>? {
      val fnPtr = _1227344571_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1227344571_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): MediaStreamSourceStartingRequestDeferral? {
      val fnPtr = _1227344571_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSourceStartingRequestDeferral>()
      val hr = fn.invokeHR(arrayOf(__1227344571_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaStreamSourceStartingRequestDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetActualStartPosition(position: TimeSpan?): Unit {
      val fnPtr = _1227344571_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1227344571_Ptr, marshalToNative(position),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaStreamSourceStartingRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1227344571_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSourceStartingRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a9093e435c44b1ba7910d99db56dd1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSourceStartingRequest(ptr: Pointer?): WithDefault =
        IMediaStreamSourceStartingRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSourceStartingRequest {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSourceStartingRequest(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSourceStartingRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1227344571_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSourceStartingRequest):
        Array<IMediaStreamSourceStartingRequest?> = (elements as
        Array<IMediaStreamSourceStartingRequest?>).castToImpl<IMediaStreamSourceStartingRequest,IMediaStreamSourceStartingRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSourceStartingRequest?> =
        arrayOfNulls<IMediaStreamSourceStartingRequest_Impl>(size) as
        Array<IMediaStreamSourceStartingRequest?>
  }
}
