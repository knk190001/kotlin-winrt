package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(ILayoutInformation.ABI::class)
@Signature("{ceea0a8c-5a4f-5d7a-8fea-77b5e0e0230c}")
@Guid("ceea0a8c5a4f5d7a8fea77b5e0e0230c")
@WinRTInterface("ceea0a8c5a4f5d7a8fea77b5e0e0230c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILayoutInformation.ByReference::class)
public interface ILayoutInformation : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILayoutInformation> {
    public override fun getValue() = ABI.makeILayoutInformation(pointer.getPointer(0))

    public fun setValue(value: ILayoutInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILayoutInformation {
    public val __1831288975_Ptr: Pointer?

    public val _1831288975_VtblPtr: Pointer?
      get() = __1831288975_Ptr?.getPointer(0)
  }

  public class ILayoutInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1831288975_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILayoutInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ceea0a8c5a4f5d7a8fea77b5e0e0230c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILayoutInformation(ptr: Pointer?): WithDefault = ILayoutInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILayoutInformation {
      val address = segment.toRawLongValue()
      return makeILayoutInformation(Pointer(address))
    }

    public override fun toNative(obj: ILayoutInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1831288975_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILayoutInformation): Array<ILayoutInformation?> =
        (elements as
        Array<ILayoutInformation?>).castToImpl<ILayoutInformation,ILayoutInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILayoutInformation?> =
        arrayOfNulls<ILayoutInformation_Impl>(size) as Array<ILayoutInformation?>
  }
}
