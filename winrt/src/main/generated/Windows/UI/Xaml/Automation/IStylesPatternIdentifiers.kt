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

@ABIMarker(IStylesPatternIdentifiers.ABI::class)
@Signature("{b0e4e201-e89d-436b-8287-4f7903466879}")
@Guid("b0e4e201e89d436b82874f7903466879")
@WinRTInterface("b0e4e201e89d436b82874f7903466879")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStylesPatternIdentifiers.ByReference::class)
public interface IStylesPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStylesPatternIdentifiers> {
    public override fun getValue() = ABI.makeIStylesPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: IStylesPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStylesPatternIdentifiers {
    public val __1384767913_Ptr: Pointer?

    public val _1384767913_VtblPtr: Pointer?
      get() = __1384767913_Ptr?.getPointer(0)
  }

  public class IStylesPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1384767913_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStylesPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0e4e201e89d436b82874f7903466879")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStylesPatternIdentifiers(ptr: Pointer?): WithDefault =
        IStylesPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStylesPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeIStylesPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: IStylesPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1384767913_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStylesPatternIdentifiers):
        Array<IStylesPatternIdentifiers?> = (elements as
        Array<IStylesPatternIdentifiers?>).castToImpl<IStylesPatternIdentifiers,IStylesPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStylesPatternIdentifiers?> =
        arrayOfNulls<IStylesPatternIdentifiers_Impl>(size) as Array<IStylesPatternIdentifiers?>
  }
}
