package Windows.Media.Capture.Frames

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.TypedEventHandler
import Windows.Media.Devices.Core.CameraIntrinsics
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMediaFrameSource.ABI::class)
@Signature("{d6782953-90db-46a8-8add-2aa884a8d253}")
@Guid("d678295390db46a88add2aa884a8d253")
@WinRTInterface("d678295390db46a88add2aa884a8d253")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameSource.ByReference::class)
public interface IMediaFrameSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Info(): MediaFrameSourceInfo?

  @InterfaceMethod(1)
  public fun get_Controller(): MediaFrameSourceController?

  @InterfaceMethod(2)
  public fun get_SupportedFormats(): IVectorView<MediaFrameFormat?>?

  @InterfaceMethod(3)
  public fun get_CurrentFormat(): MediaFrameFormat?

  @InterfaceMethod(4)
  public fun SetFormatAsync(format: MediaFrameFormat?): IAsyncAction?

  @InterfaceMethod(5)
  public fun add_FormatChanged(handler: TypedEventHandler<MediaFrameSource?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_FormatChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun TryGetCameraIntrinsics(format: MediaFrameFormat?): CameraIntrinsics?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameSource> {
    public override fun getValue() = ABI.makeIMediaFrameSource(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameSource {
    public val __1539145610_Ptr: Pointer?

    public val _1539145610_VtblPtr: Pointer?
      get() = __1539145610_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Info(): MediaFrameSourceInfo? {
      val fnPtr = _1539145610_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameSourceInfo>()
      val hr = fn.invokeHR(arrayOf(__1539145610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameSourceInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Controller(): MediaFrameSourceController? {
      val fnPtr = _1539145610_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameSourceController>()
      val hr = fn.invokeHR(arrayOf(__1539145610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameSourceController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SupportedFormats(): IVectorView<MediaFrameFormat?>? {
      val fnPtr = _1539145610_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaFrameFormat?>>()
      val hr = fn.invokeHR(arrayOf(__1539145610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaFrameFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CurrentFormat(): MediaFrameFormat? {
      val fnPtr = _1539145610_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameFormat>()
      val hr = fn.invokeHR(arrayOf(__1539145610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetFormatAsync(format: MediaFrameFormat?): IAsyncAction? {
      val fnPtr = _1539145610_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1539145610_Ptr, marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_FormatChanged(handler: TypedEventHandler<MediaFrameSource?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1539145610_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1539145610_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_FormatChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1539145610_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1539145610_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun TryGetCameraIntrinsics(format: MediaFrameFormat?): CameraIntrinsics? {
      val fnPtr = _1539145610_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraIntrinsics>()
      val hr = fn.invokeHR(arrayOf(__1539145610_Ptr, marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraIntrinsics>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1539145610_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d678295390db46a88add2aa884a8d253")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameSource(ptr: Pointer?): WithDefault = IMediaFrameSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameSource {
      val address = segment.toRawLongValue()
      return makeIMediaFrameSource(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1539145610_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameSource): Array<IMediaFrameSource?> = (elements
        as Array<IMediaFrameSource?>).castToImpl<IMediaFrameSource,IMediaFrameSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameSource?> =
        arrayOfNulls<IMediaFrameSource_Impl>(size) as Array<IMediaFrameSource?>
  }
}
