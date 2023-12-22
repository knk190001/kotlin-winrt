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

@ABIMarker(IMultipleViewPatternIdentifiers.ABI::class)
@Signature("{70e4c847-2b82-5ecf-b808-e9d453c1fe53}")
@Guid("70e4c8472b825ecfb808e9d453c1fe53")
@WinRTInterface("70e4c8472b825ecfb808e9d453c1fe53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMultipleViewPatternIdentifiers.ByReference::class)
public interface IMultipleViewPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMultipleViewPatternIdentifiers> {
    public override fun getValue() = ABI.makeIMultipleViewPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: IMultipleViewPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMultipleViewPatternIdentifiers {
    public val __1133101301_Ptr: Pointer?

    public val _1133101301_VtblPtr: Pointer?
      get() = __1133101301_Ptr?.getPointer(0)
  }

  public class IMultipleViewPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1133101301_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMultipleViewPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("70e4c8472b825ecfb808e9d453c1fe53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMultipleViewPatternIdentifiers(ptr: Pointer?): WithDefault =
        IMultipleViewPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMultipleViewPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeIMultipleViewPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: IMultipleViewPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1133101301_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMultipleViewPatternIdentifiers):
        Array<IMultipleViewPatternIdentifiers?> = (elements as
        Array<IMultipleViewPatternIdentifiers?>).castToImpl<IMultipleViewPatternIdentifiers,IMultipleViewPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMultipleViewPatternIdentifiers?> =
        arrayOfNulls<IMultipleViewPatternIdentifiers_Impl>(size) as
        Array<IMultipleViewPatternIdentifiers?>
  }
}
