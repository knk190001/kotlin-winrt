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

@ABIMarker(ITogglePatternIdentifiers.ABI::class)
@Signature("{a0d2df4c-ba59-51d9-9c01-034d7941c280}")
@Guid("a0d2df4cba5951d99c01034d7941c280")
@WinRTInterface("a0d2df4cba5951d99c01034d7941c280")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITogglePatternIdentifiers.ByReference::class)
public interface ITogglePatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITogglePatternIdentifiers> {
    public override fun getValue() = ABI.makeITogglePatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: ITogglePatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITogglePatternIdentifiers {
    public val __910928436_Ptr: Pointer?

    public val _910928436_VtblPtr: Pointer?
      get() = __910928436_Ptr?.getPointer(0)
  }

  public class ITogglePatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __910928436_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITogglePatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a0d2df4cba5951d99c01034d7941c280")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITogglePatternIdentifiers(ptr: Pointer?): WithDefault =
        ITogglePatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITogglePatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeITogglePatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: ITogglePatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__910928436_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITogglePatternIdentifiers):
        Array<ITogglePatternIdentifiers?> = (elements as
        Array<ITogglePatternIdentifiers?>).castToImpl<ITogglePatternIdentifiers,ITogglePatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITogglePatternIdentifiers?> =
        arrayOfNulls<ITogglePatternIdentifiers_Impl>(size) as Array<ITogglePatternIdentifiers?>
  }
}
