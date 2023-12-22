package Windows.Media.Capture.Frames

import Windows.Foundation.Collections.IMapView
import Windows.Media.MediaProperties.MediaRatio
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaFrameFormat.ABI::class)
@Signature("{71902b4e-b279-4a97-a9db-bd5a2fb78f39}")
@Guid("71902b4eb2794a97a9dbbd5a2fb78f39")
@WinRTInterface("71902b4eb2794a97a9dbbd5a2fb78f39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameFormat.ByReference::class)
public interface IMediaFrameFormat : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MajorType(): String?

  @InterfaceMethod(1)
  public fun get_Subtype(): String?

  @InterfaceMethod(2)
  public fun get_FrameRate(): MediaRatio?

  @InterfaceMethod(3)
  public fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  @InterfaceMethod(4)
  public fun get_VideoFormat(): VideoMediaFrameFormat?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameFormat> {
    public override fun getValue() = ABI.makeIMediaFrameFormat(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameFormat_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameFormat {
    public val __1166872422_Ptr: Pointer?

    public val _1166872422_VtblPtr: Pointer?
      get() = __1166872422_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MajorType(): String? {
      val fnPtr = _1166872422_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1166872422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Subtype(): String? {
      val fnPtr = _1166872422_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1166872422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FrameRate(): MediaRatio? {
      val fnPtr = _1166872422_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaRatio>()
      val hr = fn.invokeHR(arrayOf(__1166872422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaRatio>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
        IUnknown?>? {
      val fnPtr = _1166872422_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1166872422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_VideoFormat(): VideoMediaFrameFormat? {
      val fnPtr = _1166872422_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoMediaFrameFormat>()
      val hr = fn.invokeHR(arrayOf(__1166872422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoMediaFrameFormat>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameFormat_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1166872422_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameFormat, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71902b4eb2794a97a9dbbd5a2fb78f39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameFormat(ptr: Pointer?): WithDefault = IMediaFrameFormat_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameFormat {
      val address = segment.toRawLongValue()
      return makeIMediaFrameFormat(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1166872422_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameFormat): Array<IMediaFrameFormat?> = (elements
        as Array<IMediaFrameFormat?>).castToImpl<IMediaFrameFormat,IMediaFrameFormat_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameFormat?> =
        arrayOfNulls<IMediaFrameFormat_Impl>(size) as Array<IMediaFrameFormat?>
  }
}
