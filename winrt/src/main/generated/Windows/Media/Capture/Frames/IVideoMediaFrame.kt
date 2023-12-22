package Windows.Media.Capture.Frames

import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import Windows.Graphics.Imaging.SoftwareBitmap
import Windows.Media.Devices.Core.CameraIntrinsics
import Windows.Media.VideoFrame
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

@ABIMarker(IVideoMediaFrame.ABI::class)
@Signature("{00dd4ccb-32bd-4fe1-a013-7cc13cf5dbcf}")
@Guid("00dd4ccb32bd4fe1a0137cc13cf5dbcf")
@WinRTInterface("00dd4ccb32bd4fe1a0137cc13cf5dbcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoMediaFrame.ByReference::class)
public interface IVideoMediaFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameReference(): MediaFrameReference?

  @InterfaceMethod(1)
  public fun get_VideoFormat(): VideoMediaFrameFormat?

  @InterfaceMethod(2)
  public fun get_SoftwareBitmap(): SoftwareBitmap?

  @InterfaceMethod(3)
  public fun get_Direct3DSurface(): IDirect3DSurface?

  @InterfaceMethod(4)
  public fun get_CameraIntrinsics(): CameraIntrinsics?

  @InterfaceMethod(5)
  public fun get_InfraredMediaFrame(): InfraredMediaFrame?

  @InterfaceMethod(6)
  public fun get_DepthMediaFrame(): DepthMediaFrame?

  @InterfaceMethod(7)
  public fun GetVideoFrame(): VideoFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoMediaFrame> {
    public override fun getValue() = ABI.makeIVideoMediaFrame(pointer.getPointer(0))

    public fun setValue(value: IVideoMediaFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoMediaFrame {
    public val __866527198_Ptr: Pointer?

    public val _866527198_VtblPtr: Pointer?
      get() = __866527198_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameReference(): MediaFrameReference? {
      val fnPtr = _866527198_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameReference>()
      val hr = fn.invokeHR(arrayOf(__866527198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoFormat(): VideoMediaFrameFormat? {
      val fnPtr = _866527198_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoMediaFrameFormat>()
      val hr = fn.invokeHR(arrayOf(__866527198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoMediaFrameFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SoftwareBitmap(): SoftwareBitmap? {
      val fnPtr = _866527198_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__866527198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Direct3DSurface(): IDirect3DSurface? {
      val fnPtr = _866527198_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDirect3DSurface>()
      val hr = fn.invokeHR(arrayOf(__866527198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDirect3DSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CameraIntrinsics(): CameraIntrinsics? {
      val fnPtr = _866527198_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraIntrinsics>()
      val hr = fn.invokeHR(arrayOf(__866527198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraIntrinsics>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_InfraredMediaFrame(): InfraredMediaFrame? {
      val fnPtr = _866527198_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfraredMediaFrame>()
      val hr = fn.invokeHR(arrayOf(__866527198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfraredMediaFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DepthMediaFrame(): DepthMediaFrame? {
      val fnPtr = _866527198_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DepthMediaFrame>()
      val hr = fn.invokeHR(arrayOf(__866527198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DepthMediaFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetVideoFrame(): VideoFrame? {
      val fnPtr = _866527198_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__866527198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }
  }

  public class IVideoMediaFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __866527198_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoMediaFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00dd4ccb32bd4fe1a0137cc13cf5dbcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoMediaFrame(ptr: Pointer?): WithDefault = IVideoMediaFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoMediaFrame {
      val address = segment.toRawLongValue()
      return makeIVideoMediaFrame(Pointer(address))
    }

    public override fun toNative(obj: IVideoMediaFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__866527198_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoMediaFrame): Array<IVideoMediaFrame?> = (elements as
        Array<IVideoMediaFrame?>).castToImpl<IVideoMediaFrame,IVideoMediaFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoMediaFrame?> =
        arrayOfNulls<IVideoMediaFrame_Impl>(size) as Array<IVideoMediaFrame?>
  }
}
