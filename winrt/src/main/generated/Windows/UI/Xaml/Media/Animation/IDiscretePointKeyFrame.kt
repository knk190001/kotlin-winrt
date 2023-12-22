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

@ABIMarker(IDiscretePointKeyFrame.ABI::class)
@Signature("{e0a9070d-4c42-4a90-983a-75f5a83a2fbe}")
@Guid("e0a9070d4c424a90983a75f5a83a2fbe")
@WinRTInterface("e0a9070d4c424a90983a75f5a83a2fbe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDiscretePointKeyFrame.ByReference::class)
public interface IDiscretePointKeyFrame : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDiscretePointKeyFrame> {
    public override fun getValue() = ABI.makeIDiscretePointKeyFrame(pointer.getPointer(0))

    public fun setValue(value: IDiscretePointKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDiscretePointKeyFrame {
    public val __1886505153_Ptr: Pointer?

    public val _1886505153_VtblPtr: Pointer?
      get() = __1886505153_Ptr?.getPointer(0)
  }

  public class IDiscretePointKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1886505153_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDiscretePointKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0a9070d4c424a90983a75f5a83a2fbe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDiscretePointKeyFrame(ptr: Pointer?): WithDefault =
        IDiscretePointKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDiscretePointKeyFrame {
      val address = segment.toRawLongValue()
      return makeIDiscretePointKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: IDiscretePointKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1886505153_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDiscretePointKeyFrame): Array<IDiscretePointKeyFrame?> =
        (elements as
        Array<IDiscretePointKeyFrame?>).castToImpl<IDiscretePointKeyFrame,IDiscretePointKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDiscretePointKeyFrame?> =
        arrayOfNulls<IDiscretePointKeyFrame_Impl>(size) as Array<IDiscretePointKeyFrame?>
  }
}
