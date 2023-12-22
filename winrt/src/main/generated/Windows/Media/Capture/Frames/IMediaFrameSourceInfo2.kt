package Windows.Media.Capture.Frames

import Windows.Foundation.Collections.IVectorView
import Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaFrameSourceInfo2.ABI::class)
@Signature("{195a7855-6457-42c6-a769-19b65bd32e6e}")
@Guid("195a7855645742c6a76919b65bd32e6e")
@WinRTInterface("195a7855645742c6a76919b65bd32e6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameSourceInfo2.ByReference::class)
public interface IMediaFrameSourceInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProfileId(): String?

  @InterfaceMethod(1)
  public fun get_VideoProfileMediaDescription():
      IVectorView<MediaCaptureVideoProfileMediaDescription?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameSourceInfo2> {
    public override fun getValue() = ABI.makeIMediaFrameSourceInfo2(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameSourceInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameSourceInfo2 {
    public val __428795866_Ptr: Pointer?

    public val _428795866_VtblPtr: Pointer?
      get() = __428795866_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProfileId(): String? {
      val fnPtr = _428795866_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__428795866_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoProfileMediaDescription():
        IVectorView<MediaCaptureVideoProfileMediaDescription?>? {
      val fnPtr = _428795866_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaCaptureVideoProfileMediaDescription?>>()
      val hr = fn.invokeHR(arrayOf(__428795866_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MediaCaptureVideoProfileMediaDescription?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameSourceInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __428795866_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameSourceInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("195a7855645742c6a76919b65bd32e6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameSourceInfo2(ptr: Pointer?): WithDefault =
        IMediaFrameSourceInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameSourceInfo2 {
      val address = segment.toRawLongValue()
      return makeIMediaFrameSourceInfo2(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameSourceInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__428795866_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameSourceInfo2): Array<IMediaFrameSourceInfo2?> =
        (elements as
        Array<IMediaFrameSourceInfo2?>).castToImpl<IMediaFrameSourceInfo2,IMediaFrameSourceInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameSourceInfo2?> =
        arrayOfNulls<IMediaFrameSourceInfo2_Impl>(size) as Array<IMediaFrameSourceInfo2?>
  }
}
