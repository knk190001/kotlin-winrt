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

@ABIMarker(IDockPatternIdentifiers.ABI::class)
@Signature("{75574f99-d145-547e-972b-7d879f93c03e}")
@Guid("75574f99d145547e972b7d879f93c03e")
@WinRTInterface("75574f99d145547e972b7d879f93c03e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDockPatternIdentifiers.ByReference::class)
public interface IDockPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDockPatternIdentifiers> {
    public override fun getValue() = ABI.makeIDockPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: IDockPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDockPatternIdentifiers {
    public val __595517229_Ptr: Pointer?

    public val _595517229_VtblPtr: Pointer?
      get() = __595517229_Ptr?.getPointer(0)
  }

  public class IDockPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __595517229_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDockPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75574f99d145547e972b7d879f93c03e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDockPatternIdentifiers(ptr: Pointer?): WithDefault =
        IDockPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDockPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeIDockPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: IDockPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__595517229_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDockPatternIdentifiers): Array<IDockPatternIdentifiers?>
        = (elements as
        Array<IDockPatternIdentifiers?>).castToImpl<IDockPatternIdentifiers,IDockPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDockPatternIdentifiers?> =
        arrayOfNulls<IDockPatternIdentifiers_Impl>(size) as Array<IDockPatternIdentifiers?>
  }
}
