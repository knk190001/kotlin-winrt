package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Graphics.Imaging.BitmapAlphaMode
import Windows.Graphics.Imaging.BitmapPixelFormat
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

@ABIMarker(IAppBroadcastPreviewStreamReader.ABI::class)
@Signature("{92228d50-db3f-40a8-8cd4-f4e371ddab37}")
@Guid("92228d50db3f40a88cd4f4e371ddab37")
@WinRTInterface("92228d50db3f40a88cd4f4e371ddab37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastPreviewStreamReader.ByReference::class)
public interface IAppBroadcastPreviewStreamReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoWidth(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_VideoHeight(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_VideoStride(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_VideoBitmapPixelFormat(): BitmapPixelFormat?

  @InterfaceMethod(4)
  public fun get_VideoBitmapAlphaMode(): BitmapAlphaMode?

  @InterfaceMethod(5)
  public fun TryGetNextVideoFrame(): AppBroadcastPreviewStreamVideoFrame?

  @InterfaceMethod(6)
  public fun add_VideoFrameArrived(value: TypedEventHandler<AppBroadcastPreviewStreamReader?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_VideoFrameArrived(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastPreviewStreamReader> {
    public override fun getValue() = ABI.makeIAppBroadcastPreviewStreamReader(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastPreviewStreamReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastPreviewStreamReader {
    public val __1794269619_Ptr: Pointer?

    public val _1794269619_VtblPtr: Pointer?
      get() = __1794269619_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoWidth(): WinDef.UINT {
      val fnPtr = _1794269619_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1794269619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_VideoHeight(): WinDef.UINT {
      val fnPtr = _1794269619_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1794269619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_VideoStride(): WinDef.UINT {
      val fnPtr = _1794269619_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1794269619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_VideoBitmapPixelFormat(): BitmapPixelFormat? {
      val fnPtr = _1794269619_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__1794269619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_VideoBitmapAlphaMode(): BitmapAlphaMode? {
      val fnPtr = _1794269619_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapAlphaMode>()
      val hr = fn.invokeHR(arrayOf(__1794269619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapAlphaMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun TryGetNextVideoFrame(): AppBroadcastPreviewStreamVideoFrame? {
      val fnPtr = _1794269619_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastPreviewStreamVideoFrame>()
      val hr = fn.invokeHR(arrayOf(__1794269619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastPreviewStreamVideoFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override
        fun add_VideoFrameArrived(value: TypedEventHandler<AppBroadcastPreviewStreamReader?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1794269619_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1794269619_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_VideoFrameArrived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1794269619_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794269619_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastPreviewStreamReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1794269619_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastPreviewStreamReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92228d50db3f40a88cd4f4e371ddab37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastPreviewStreamReader(ptr: Pointer?): WithDefault =
        IAppBroadcastPreviewStreamReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastPreviewStreamReader {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastPreviewStreamReader(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastPreviewStreamReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1794269619_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastPreviewStreamReader):
        Array<IAppBroadcastPreviewStreamReader?> = (elements as
        Array<IAppBroadcastPreviewStreamReader?>).castToImpl<IAppBroadcastPreviewStreamReader,IAppBroadcastPreviewStreamReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastPreviewStreamReader?> =
        arrayOfNulls<IAppBroadcastPreviewStreamReader_Impl>(size) as
        Array<IAppBroadcastPreviewStreamReader?>
  }
}
