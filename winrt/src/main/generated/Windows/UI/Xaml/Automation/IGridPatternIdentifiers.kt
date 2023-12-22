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

@ABIMarker(IGridPatternIdentifiers.ABI::class)
@Signature("{c902980f-96c5-450c-9044-7e52c24f9e94}")
@Guid("c902980f96c5450c90447e52c24f9e94")
@WinRTInterface("c902980f96c5450c90447e52c24f9e94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridPatternIdentifiers.ByReference::class)
public interface IGridPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridPatternIdentifiers> {
    public override fun getValue() = ABI.makeIGridPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: IGridPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridPatternIdentifiers {
    public val __1426740613_Ptr: Pointer?

    public val _1426740613_VtblPtr: Pointer?
      get() = __1426740613_Ptr?.getPointer(0)
  }

  public class IGridPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1426740613_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c902980f96c5450c90447e52c24f9e94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridPatternIdentifiers(ptr: Pointer?): WithDefault =
        IGridPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeIGridPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: IGridPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1426740613_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridPatternIdentifiers): Array<IGridPatternIdentifiers?>
        = (elements as
        Array<IGridPatternIdentifiers?>).castToImpl<IGridPatternIdentifiers,IGridPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridPatternIdentifiers?> =
        arrayOfNulls<IGridPatternIdentifiers_Impl>(size) as Array<IGridPatternIdentifiers?>
  }
}
