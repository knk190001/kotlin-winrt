package Microsoft.UI.Xaml.Media.Animation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILinearPointKeyFrame.ABI::class)
@Signature("{4ec22493-bacb-5105-ac16-8ea5418ab76e}")
@Guid("4ec22493bacb5105ac168ea5418ab76e")
@WinRTInterface("4ec22493bacb5105ac168ea5418ab76e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinearPointKeyFrame.ByReference::class)
public interface ILinearPointKeyFrame : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinearPointKeyFrame> {
    public override fun getValue() = ABI.makeILinearPointKeyFrame(pointer.getPointer(0))

    public fun setValue(value: ILinearPointKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinearPointKeyFrame {
    public val __76124418_Ptr: Pointer?

    public val _76124418_VtblPtr: Pointer?
      get() = __76124418_Ptr?.getPointer(0)
  }

  public class ILinearPointKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __76124418_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinearPointKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ec22493bacb5105ac168ea5418ab76e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinearPointKeyFrame(ptr: Pointer?): WithDefault = ILinearPointKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILinearPointKeyFrame {
      val address = segment.toRawLongValue()
      return makeILinearPointKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: ILinearPointKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__76124418_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinearPointKeyFrame): Array<ILinearPointKeyFrame?> =
        (elements as
        Array<ILinearPointKeyFrame?>).castToImpl<ILinearPointKeyFrame,ILinearPointKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinearPointKeyFrame?> =
        arrayOfNulls<ILinearPointKeyFrame_Impl>(size) as Array<ILinearPointKeyFrame?>
  }
}
