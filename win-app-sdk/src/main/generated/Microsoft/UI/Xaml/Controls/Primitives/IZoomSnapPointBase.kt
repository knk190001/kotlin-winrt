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

@ABIMarker(IZoomSnapPointBase.ABI::class)
@Signature("{c6d08756-0860-5c2d-abec-6eb4aa4b53d7}")
@Guid("c6d0875608605c2dabec6eb4aa4b53d7")
@WinRTInterface("c6d0875608605c2dabec6eb4aa4b53d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IZoomSnapPointBase.ByReference::class)
public interface IZoomSnapPointBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IZoomSnapPointBase> {
    public override fun getValue() = ABI.makeIZoomSnapPointBase(pointer.getPointer(0))

    public fun setValue(value: IZoomSnapPointBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IZoomSnapPointBase {
    public val __1995592339_Ptr: Pointer?

    public val _1995592339_VtblPtr: Pointer?
      get() = __1995592339_Ptr?.getPointer(0)
  }

  public class IZoomSnapPointBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1995592339_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IZoomSnapPointBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6d0875608605c2dabec6eb4aa4b53d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIZoomSnapPointBase(ptr: Pointer?): WithDefault = IZoomSnapPointBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IZoomSnapPointBase {
      val address = segment.toRawLongValue()
      return makeIZoomSnapPointBase(Pointer(address))
    }

    public override fun toNative(obj: IZoomSnapPointBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1995592339_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IZoomSnapPointBase): Array<IZoomSnapPointBase?> =
        (elements as
        Array<IZoomSnapPointBase?>).castToImpl<IZoomSnapPointBase,IZoomSnapPointBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IZoomSnapPointBase?> =
        arrayOfNulls<IZoomSnapPointBase_Impl>(size) as Array<IZoomSnapPointBase?>
  }
}
