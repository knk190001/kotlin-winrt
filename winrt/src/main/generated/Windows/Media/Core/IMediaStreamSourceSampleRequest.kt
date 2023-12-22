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

@ABIMarker(IMediaStreamSourceSampleRequest.ABI::class)
@Signature("{4db341a9-3501-4d9b-83f9-8f235c822532}")
@Guid("4db341a935014d9b83f98f235c822532")
@WinRTInterface("4db341a935014d9b83f98f235c822532")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSourceSampleRequest.ByReference::class)
public interface IMediaStreamSourceSampleRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StreamDescriptor(): IMediaStreamDescriptor?

  @InterfaceMethod(1)
  public fun GetDeferral(): MediaStreamSourceSampleRequestDeferral?

  @InterfaceMethod(2)
  public fun put_Sample(value: MediaStreamSample?): Unit

  @InterfaceMethod(3)
  public fun get_Sample(): MediaStreamSample?

  @InterfaceMethod(4)
  public fun ReportSampleProgress(progress: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSourceSampleRequest> {
    public override fun getValue() = ABI.makeIMediaStreamSourceSampleRequest(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSourceSampleRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSourceSampleRequest {
    public val __657351195_Ptr: Pointer?

    public val _657351195_VtblPtr: Pointer?
      get() = __657351195_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StreamDescriptor(): IMediaStreamDescriptor? {
      val fnPtr = _657351195_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMediaStreamDescriptor>()
      val hr = fn.invokeHR(arrayOf(__657351195_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMediaStreamDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): MediaStreamSourceSampleRequestDeferral? {
      val fnPtr = _657351195_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSourceSampleRequestDeferral>()
      val hr = fn.invokeHR(arrayOf(__657351195_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSourceSampleRequestDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Sample(value: MediaStreamSample?): Unit {
      val fnPtr = _657351195_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__657351195_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Sample(): MediaStreamSample? {
      val fnPtr = _657351195_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSample>()
      val hr = fn.invokeHR(arrayOf(__657351195_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSample>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ReportSampleProgress(progress: WinDef.UINT): Unit {
      val fnPtr = _657351195_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__657351195_Ptr, progress,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaStreamSourceSampleRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __657351195_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSourceSampleRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4db341a935014d9b83f98f235c822532")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSourceSampleRequest(ptr: Pointer?): WithDefault =
        IMediaStreamSourceSampleRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSourceSampleRequest {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSourceSampleRequest(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSourceSampleRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__657351195_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSourceSampleRequest):
        Array<IMediaStreamSourceSampleRequest?> = (elements as
        Array<IMediaStreamSourceSampleRequest?>).castToImpl<IMediaStreamSourceSampleRequest,IMediaStreamSourceSampleRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSourceSampleRequest?> =
        arrayOfNulls<IMediaStreamSourceSampleRequest_Impl>(size) as
        Array<IMediaStreamSourceSampleRequest?>
  }
}
