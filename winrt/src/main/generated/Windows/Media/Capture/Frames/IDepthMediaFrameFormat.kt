package Windows.Media.Capture.Frames

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDepthMediaFrameFormat.ABI::class)
@Signature("{c312cf40-d729-453e-8780-2e04f140d28e}")
@Guid("c312cf40d729453e87802e04f140d28e")
@WinRTInterface("c312cf40d729453e87802e04f140d28e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDepthMediaFrameFormat.ByReference::class)
public interface IDepthMediaFrameFormat : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoFormat(): VideoMediaFrameFormat?

  @InterfaceMethod(1)
  public fun get_DepthScaleInMeters(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDepthMediaFrameFormat> {
    public override fun getValue() = ABI.makeIDepthMediaFrameFormat(pointer.getPointer(0))

    public fun setValue(value: IDepthMediaFrameFormat_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDepthMediaFrameFormat {
    public val __1110725565_Ptr: Pointer?

    public val _1110725565_VtblPtr: Pointer?
      get() = __1110725565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoFormat(): VideoMediaFrameFormat? {
      val fnPtr = _1110725565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoMediaFrameFormat>()
      val hr = fn.invokeHR(arrayOf(__1110725565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoMediaFrameFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DepthScaleInMeters(): Double {
      val fnPtr = _1110725565_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1110725565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IDepthMediaFrameFormat_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1110725565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDepthMediaFrameFormat, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c312cf40d729453e87802e04f140d28e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDepthMediaFrameFormat(ptr: Pointer?): WithDefault =
        IDepthMediaFrameFormat_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDepthMediaFrameFormat {
      val address = segment.toRawLongValue()
      return makeIDepthMediaFrameFormat(Pointer(address))
    }

    public override fun toNative(obj: IDepthMediaFrameFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1110725565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDepthMediaFrameFormat): Array<IDepthMediaFrameFormat?> =
        (elements as
        Array<IDepthMediaFrameFormat?>).castToImpl<IDepthMediaFrameFormat,IDepthMediaFrameFormat_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDepthMediaFrameFormat?> =
        arrayOfNulls<IDepthMediaFrameFormat_Impl>(size) as Array<IDepthMediaFrameFormat?>
  }
}
