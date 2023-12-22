package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(ILinearDoubleKeyFrame.ABI::class)
@Signature("{8efdf265-9a7b-431d-8f0c-14c56b5ea4d9}")
@Guid("8efdf2659a7b431d8f0c14c56b5ea4d9")
@WinRTInterface("8efdf2659a7b431d8f0c14c56b5ea4d9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinearDoubleKeyFrame.ByReference::class)
public interface ILinearDoubleKeyFrame : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinearDoubleKeyFrame> {
    public override fun getValue() = ABI.makeILinearDoubleKeyFrame(pointer.getPointer(0))

    public fun setValue(value: ILinearDoubleKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinearDoubleKeyFrame {
    public val __746896074_Ptr: Pointer?

    public val _746896074_VtblPtr: Pointer?
      get() = __746896074_Ptr?.getPointer(0)
  }

  public class ILinearDoubleKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __746896074_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinearDoubleKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8efdf2659a7b431d8f0c14c56b5ea4d9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinearDoubleKeyFrame(ptr: Pointer?): WithDefault =
        ILinearDoubleKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILinearDoubleKeyFrame {
      val address = segment.toRawLongValue()
      return makeILinearDoubleKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: ILinearDoubleKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__746896074_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinearDoubleKeyFrame): Array<ILinearDoubleKeyFrame?> =
        (elements as
        Array<ILinearDoubleKeyFrame?>).castToImpl<ILinearDoubleKeyFrame,ILinearDoubleKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinearDoubleKeyFrame?> =
        arrayOfNulls<ILinearDoubleKeyFrame_Impl>(size) as Array<ILinearDoubleKeyFrame?>
  }
}
