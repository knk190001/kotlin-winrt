package Windows.UI.Xaml.Automation

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

@ABIMarker(IExpandCollapsePatternIdentifiers.ABI::class)
@Signature("{b006bac0-751b-4d55-92cb-613ec1bdf5d0}")
@Guid("b006bac0751b4d5592cb613ec1bdf5d0")
@WinRTInterface("b006bac0751b4d5592cb613ec1bdf5d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpandCollapsePatternIdentifiers.ByReference::class)
public interface IExpandCollapsePatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpandCollapsePatternIdentifiers> {
    public override fun getValue() =
        ABI.makeIExpandCollapsePatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: IExpandCollapsePatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpandCollapsePatternIdentifiers {
    public val __1042542492_Ptr: Pointer?

    public val _1042542492_VtblPtr: Pointer?
      get() = __1042542492_Ptr?.getPointer(0)
  }

  public class IExpandCollapsePatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1042542492_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpandCollapsePatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b006bac0751b4d5592cb613ec1bdf5d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpandCollapsePatternIdentifiers(ptr: Pointer?): WithDefault =
        IExpandCollapsePatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpandCollapsePatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeIExpandCollapsePatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: IExpandCollapsePatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1042542492_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpandCollapsePatternIdentifiers):
        Array<IExpandCollapsePatternIdentifiers?> = (elements as
        Array<IExpandCollapsePatternIdentifiers?>).castToImpl<IExpandCollapsePatternIdentifiers,IExpandCollapsePatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpandCollapsePatternIdentifiers?> =
        arrayOfNulls<IExpandCollapsePatternIdentifiers_Impl>(size) as
        Array<IExpandCollapsePatternIdentifiers?>
  }
}
