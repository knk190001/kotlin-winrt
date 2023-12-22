package Windows.Media.Core

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

@ABIMarker(IMediaStreamSourceSwitchStreamsRequest.ABI::class)
@Signature("{41b8808e-38a9-4ec3-9ba0-b69b85501e90}")
@Guid("41b8808e38a94ec39ba0b69b85501e90")
@WinRTInterface("41b8808e38a94ec39ba0b69b85501e90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSourceSwitchStreamsRequest.ByReference::class)
public interface IMediaStreamSourceSwitchStreamsRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldStreamDescriptor(): IMediaStreamDescriptor?

  @InterfaceMethod(1)
  public fun get_NewStreamDescriptor(): IMediaStreamDescriptor?

  @InterfaceMethod(2)
  public fun GetDeferral(): MediaStreamSourceSwitchStreamsRequestDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSourceSwitchStreamsRequest> {
    public override fun getValue() =
        ABI.makeIMediaStreamSourceSwitchStreamsRequest(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSourceSwitchStreamsRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSourceSwitchStreamsRequest {
    public val __1270053606_Ptr: Pointer?

    public val _1270053606_VtblPtr: Pointer?
      get() = __1270053606_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldStreamDescriptor(): IMediaStreamDescriptor? {
      val fnPtr = _1270053606_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMediaStreamDescriptor>()
      val hr = fn.invokeHR(arrayOf(__1270053606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMediaStreamDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewStreamDescriptor(): IMediaStreamDescriptor? {
      val fnPtr = _1270053606_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMediaStreamDescriptor>()
      val hr = fn.invokeHR(arrayOf(__1270053606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMediaStreamDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): MediaStreamSourceSwitchStreamsRequestDeferral? {
      val fnPtr = _1270053606_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSourceSwitchStreamsRequestDeferral>()
      val hr = fn.invokeHR(arrayOf(__1270053606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaStreamSourceSwitchStreamsRequestDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamSourceSwitchStreamsRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1270053606_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSourceSwitchStreamsRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41b8808e38a94ec39ba0b69b85501e90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSourceSwitchStreamsRequest(ptr: Pointer?): WithDefault =
        IMediaStreamSourceSwitchStreamsRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSourceSwitchStreamsRequest {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSourceSwitchStreamsRequest(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSourceSwitchStreamsRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1270053606_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSourceSwitchStreamsRequest):
        Array<IMediaStreamSourceSwitchStreamsRequest?> = (elements as
        Array<IMediaStreamSourceSwitchStreamsRequest?>).castToImpl<IMediaStreamSourceSwitchStreamsRequest,IMediaStreamSourceSwitchStreamsRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSourceSwitchStreamsRequest?> =
        arrayOfNulls<IMediaStreamSourceSwitchStreamsRequest_Impl>(size) as
        Array<IMediaStreamSourceSwitchStreamsRequest?>
  }
}
