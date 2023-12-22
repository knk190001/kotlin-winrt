package Microsoft.UI.Xaml.Shapes

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

@ABIMarker(IEllipse.ABI::class)
@Signature("{805c39aa-fa8a-5e0b-9847-4ab81b42a3df}")
@Guid("805c39aafa8a5e0b98474ab81b42a3df")
@WinRTInterface("805c39aafa8a5e0b98474ab81b42a3df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEllipse.ByReference::class)
public interface IEllipse : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEllipse> {
    public override fun getValue() = ABI.makeIEllipse(pointer.getPointer(0))

    public fun setValue(value: IEllipse_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEllipse {
    public val __626848397_Ptr: Pointer?

    public val _626848397_VtblPtr: Pointer?
      get() = __626848397_Ptr?.getPointer(0)
  }

  public class IEllipse_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __626848397_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEllipse, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("805c39aafa8a5e0b98474ab81b42a3df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEllipse(ptr: Pointer?): WithDefault = IEllipse_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEllipse {
      val address = segment.toRawLongValue()
      return makeIEllipse(Pointer(address))
    }

    public override fun toNative(obj: IEllipse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__626848397_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEllipse): Array<IEllipse?> = (elements as
        Array<IEllipse?>).castToImpl<IEllipse,IEllipse_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEllipse?> = arrayOfNulls<IEllipse_Impl>(size) as
        Array<IEllipse?>
  }
}
