package Windows.UI.Xaml.Media

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

@ABIMarker(IProjection.ABI::class)
@Signature("{b3443557-7f39-4d04-a89c-844338cac897}")
@Guid("b34435577f394d04a89c844338cac897")
@WinRTInterface("b34435577f394d04a89c844338cac897")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProjection.ByReference::class)
public interface IProjection : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IProjection> {
    public override fun getValue() = ABI.makeIProjection(pointer.getPointer(0))

    public fun setValue(value: IProjection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProjection {
    public val __1059548853_Ptr: Pointer?

    public val _1059548853_VtblPtr: Pointer?
      get() = __1059548853_Ptr?.getPointer(0)
  }

  public class IProjection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1059548853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProjection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b34435577f394d04a89c844338cac897")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProjection(ptr: Pointer?): WithDefault = IProjection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProjection {
      val address = segment.toRawLongValue()
      return makeIProjection(Pointer(address))
    }

    public override fun toNative(obj: IProjection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1059548853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProjection): Array<IProjection?> = (elements as
        Array<IProjection?>).castToImpl<IProjection,IProjection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProjection?> =
        arrayOfNulls<IProjection_Impl>(size) as Array<IProjection?>
  }
}
