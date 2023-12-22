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

@ABIMarker(IDiscreteColorKeyFrame.ABI::class)
@Signature("{230c08f4-e062-4cb1-8e2a-14093d73ed8c}")
@Guid("230c08f4e0624cb18e2a14093d73ed8c")
@WinRTInterface("230c08f4e0624cb18e2a14093d73ed8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDiscreteColorKeyFrame.ByReference::class)
public interface IDiscreteColorKeyFrame : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDiscreteColorKeyFrame> {
    public override fun getValue() = ABI.makeIDiscreteColorKeyFrame(pointer.getPointer(0))

    public fun setValue(value: IDiscreteColorKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDiscreteColorKeyFrame {
    public val __44724718_Ptr: Pointer?

    public val _44724718_VtblPtr: Pointer?
      get() = __44724718_Ptr?.getPointer(0)
  }

  public class IDiscreteColorKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __44724718_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDiscreteColorKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("230c08f4e0624cb18e2a14093d73ed8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDiscreteColorKeyFrame(ptr: Pointer?): WithDefault =
        IDiscreteColorKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDiscreteColorKeyFrame {
      val address = segment.toRawLongValue()
      return makeIDiscreteColorKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: IDiscreteColorKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__44724718_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDiscreteColorKeyFrame): Array<IDiscreteColorKeyFrame?> =
        (elements as
        Array<IDiscreteColorKeyFrame?>).castToImpl<IDiscreteColorKeyFrame,IDiscreteColorKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDiscreteColorKeyFrame?> =
        arrayOfNulls<IDiscreteColorKeyFrame_Impl>(size) as Array<IDiscreteColorKeyFrame?>
  }
}
