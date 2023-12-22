package Microsoft.UI.Xaml.Automation

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

@ABIMarker(ITablePatternIdentifiers.ABI::class)
@Signature("{3d7f9c0b-ff8f-50fa-bc01-2cc3c2e06e2c}")
@Guid("3d7f9c0bff8f50fabc012cc3c2e06e2c")
@WinRTInterface("3d7f9c0bff8f50fabc012cc3c2e06e2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITablePatternIdentifiers.ByReference::class)
public interface ITablePatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITablePatternIdentifiers> {
    public override fun getValue() = ABI.makeITablePatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: ITablePatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITablePatternIdentifiers {
    public val __1245179490_Ptr: Pointer?

    public val _1245179490_VtblPtr: Pointer?
      get() = __1245179490_Ptr?.getPointer(0)
  }

  public class ITablePatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1245179490_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITablePatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d7f9c0bff8f50fabc012cc3c2e06e2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITablePatternIdentifiers(ptr: Pointer?): WithDefault =
        ITablePatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITablePatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeITablePatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: ITablePatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1245179490_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITablePatternIdentifiers):
        Array<ITablePatternIdentifiers?> = (elements as
        Array<ITablePatternIdentifiers?>).castToImpl<ITablePatternIdentifiers,ITablePatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITablePatternIdentifiers?> =
        arrayOfNulls<ITablePatternIdentifiers_Impl>(size) as Array<ITablePatternIdentifiers?>
  }
}
