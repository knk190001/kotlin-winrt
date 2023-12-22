package Microsoft.UI.Xaml.Media

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

@ABIMarker(IPathSegment.ABI::class)
@Signature("{b922ebbe-08f0-57e9-8785-7e57097f3bd4}")
@Guid("b922ebbe08f057e987857e57097f3bd4")
@WinRTInterface("b922ebbe08f057e987857e57097f3bd4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathSegment.ByReference::class)
public interface IPathSegment : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPathSegment> {
    public override fun getValue() = ABI.makeIPathSegment(pointer.getPointer(0))

    public fun setValue(value: IPathSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathSegment {
    public val __1930461571_Ptr: Pointer?

    public val _1930461571_VtblPtr: Pointer?
      get() = __1930461571_Ptr?.getPointer(0)
  }

  public class IPathSegment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1930461571_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathSegment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b922ebbe08f057e987857e57097f3bd4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathSegment(ptr: Pointer?): WithDefault = IPathSegment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathSegment {
      val address = segment.toRawLongValue()
      return makeIPathSegment(Pointer(address))
    }

    public override fun toNative(obj: IPathSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1930461571_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathSegment): Array<IPathSegment?> = (elements as
        Array<IPathSegment?>).castToImpl<IPathSegment,IPathSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathSegment?> =
        arrayOfNulls<IPathSegment_Impl>(size) as Array<IPathSegment?>
  }
}
