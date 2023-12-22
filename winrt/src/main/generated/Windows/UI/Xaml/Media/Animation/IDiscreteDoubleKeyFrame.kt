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

@ABIMarker(IDiscreteDoubleKeyFrame.ABI::class)
@Signature("{f5f51f3a-ad11-49ce-8e1c-08fdf1447446}")
@Guid("f5f51f3aad1149ce8e1c08fdf1447446")
@WinRTInterface("f5f51f3aad1149ce8e1c08fdf1447446")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDiscreteDoubleKeyFrame.ByReference::class)
public interface IDiscreteDoubleKeyFrame : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDiscreteDoubleKeyFrame> {
    public override fun getValue() = ABI.makeIDiscreteDoubleKeyFrame(pointer.getPointer(0))

    public fun setValue(value: IDiscreteDoubleKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDiscreteDoubleKeyFrame {
    public val __1071502878_Ptr: Pointer?

    public val _1071502878_VtblPtr: Pointer?
      get() = __1071502878_Ptr?.getPointer(0)
  }

  public class IDiscreteDoubleKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1071502878_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDiscreteDoubleKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5f51f3aad1149ce8e1c08fdf1447446")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDiscreteDoubleKeyFrame(ptr: Pointer?): WithDefault =
        IDiscreteDoubleKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDiscreteDoubleKeyFrame {
      val address = segment.toRawLongValue()
      return makeIDiscreteDoubleKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: IDiscreteDoubleKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1071502878_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDiscreteDoubleKeyFrame): Array<IDiscreteDoubleKeyFrame?>
        = (elements as
        Array<IDiscreteDoubleKeyFrame?>).castToImpl<IDiscreteDoubleKeyFrame,IDiscreteDoubleKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDiscreteDoubleKeyFrame?> =
        arrayOfNulls<IDiscreteDoubleKeyFrame_Impl>(size) as Array<IDiscreteDoubleKeyFrame?>
  }
}
