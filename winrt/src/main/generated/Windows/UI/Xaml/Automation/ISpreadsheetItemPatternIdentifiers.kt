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

@ABIMarker(ISpreadsheetItemPatternIdentifiers.ABI::class)
@Signature("{84347e19-ca4b-46a2-a794-c87928a3b1ab}")
@Guid("84347e19ca4b46a2a794c87928a3b1ab")
@WinRTInterface("84347e19ca4b46a2a794c87928a3b1ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpreadsheetItemPatternIdentifiers.ByReference::class)
public interface ISpreadsheetItemPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpreadsheetItemPatternIdentifiers> {
    public override fun getValue() =
        ABI.makeISpreadsheetItemPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: ISpreadsheetItemPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpreadsheetItemPatternIdentifiers {
    public val __1543272030_Ptr: Pointer?

    public val _1543272030_VtblPtr: Pointer?
      get() = __1543272030_Ptr?.getPointer(0)
  }

  public class ISpreadsheetItemPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1543272030_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpreadsheetItemPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84347e19ca4b46a2a794c87928a3b1ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpreadsheetItemPatternIdentifiers(ptr: Pointer?): WithDefault =
        ISpreadsheetItemPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpreadsheetItemPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeISpreadsheetItemPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: ISpreadsheetItemPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1543272030_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpreadsheetItemPatternIdentifiers):
        Array<ISpreadsheetItemPatternIdentifiers?> = (elements as
        Array<ISpreadsheetItemPatternIdentifiers?>).castToImpl<ISpreadsheetItemPatternIdentifiers,ISpreadsheetItemPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpreadsheetItemPatternIdentifiers?> =
        arrayOfNulls<ISpreadsheetItemPatternIdentifiers_Impl>(size) as
        Array<ISpreadsheetItemPatternIdentifiers?>
  }
}
