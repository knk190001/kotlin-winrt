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

@ABIMarker(IDiscreteObjectKeyFrame.ABI::class)
@Signature("{c7dcde89-f12d-4a9c-8199-e7a9ece3a473}")
@Guid("c7dcde89f12d4a9c8199e7a9ece3a473")
@WinRTInterface("c7dcde89f12d4a9c8199e7a9ece3a473")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDiscreteObjectKeyFrame.ByReference::class)
public interface IDiscreteObjectKeyFrame : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDiscreteObjectKeyFrame> {
    public override fun getValue() = ABI.makeIDiscreteObjectKeyFrame(pointer.getPointer(0))

    public fun setValue(value: IDiscreteObjectKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDiscreteObjectKeyFrame {
    public val __1530376076_Ptr: Pointer?

    public val _1530376076_VtblPtr: Pointer?
      get() = __1530376076_Ptr?.getPointer(0)
  }

  public class IDiscreteObjectKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1530376076_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDiscreteObjectKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7dcde89f12d4a9c8199e7a9ece3a473")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDiscreteObjectKeyFrame(ptr: Pointer?): WithDefault =
        IDiscreteObjectKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDiscreteObjectKeyFrame {
      val address = segment.toRawLongValue()
      return makeIDiscreteObjectKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: IDiscreteObjectKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1530376076_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDiscreteObjectKeyFrame): Array<IDiscreteObjectKeyFrame?>
        = (elements as
        Array<IDiscreteObjectKeyFrame?>).castToImpl<IDiscreteObjectKeyFrame,IDiscreteObjectKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDiscreteObjectKeyFrame?> =
        arrayOfNulls<IDiscreteObjectKeyFrame_Impl>(size) as Array<IDiscreteObjectKeyFrame?>
  }
}
