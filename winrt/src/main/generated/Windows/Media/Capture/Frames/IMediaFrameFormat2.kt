package Windows.Media.Capture.Frames

import Windows.Media.MediaProperties.AudioEncodingProperties
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

@ABIMarker(IMediaFrameFormat2.ABI::class)
@Signature("{63856340-5e87-4c10-86d1-6df097a6c6a8}")
@Guid("638563405e874c1086d16df097a6c6a8")
@WinRTInterface("638563405e874c1086d16df097a6c6a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameFormat2.ByReference::class)
public interface IMediaFrameFormat2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AudioEncodingProperties(): AudioEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameFormat2> {
    public override fun getValue() = ABI.makeIMediaFrameFormat2(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameFormat2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameFormat2 {
    public val __1813306764_Ptr: Pointer?

    public val _1813306764_VtblPtr: Pointer?
      get() = __1813306764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioEncodingProperties(): AudioEncodingProperties? {
      val fnPtr = _1813306764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1813306764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameFormat2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813306764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameFormat2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("638563405e874c1086d16df097a6c6a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameFormat2(ptr: Pointer?): WithDefault = IMediaFrameFormat2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameFormat2 {
      val address = segment.toRawLongValue()
      return makeIMediaFrameFormat2(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameFormat2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813306764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameFormat2): Array<IMediaFrameFormat2?> =
        (elements as
        Array<IMediaFrameFormat2?>).castToImpl<IMediaFrameFormat2,IMediaFrameFormat2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameFormat2?> =
        arrayOfNulls<IMediaFrameFormat2_Impl>(size) as Array<IMediaFrameFormat2?>
  }
}
