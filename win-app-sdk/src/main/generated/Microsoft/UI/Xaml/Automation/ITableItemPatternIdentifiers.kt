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

@ABIMarker(ITableItemPatternIdentifiers.ABI::class)
@Signature("{b4de5d03-a5b4-5ca1-8715-16c8c6a10fcc}")
@Guid("b4de5d03a5b45ca1871516c8c6a10fcc")
@WinRTInterface("b4de5d03a5b45ca1871516c8c6a10fcc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITableItemPatternIdentifiers.ByReference::class)
public interface ITableItemPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITableItemPatternIdentifiers> {
    public override fun getValue() = ABI.makeITableItemPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: ITableItemPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITableItemPatternIdentifiers {
    public val __519295701_Ptr: Pointer?

    public val _519295701_VtblPtr: Pointer?
      get() = __519295701_Ptr?.getPointer(0)
  }

  public class ITableItemPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __519295701_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITableItemPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4de5d03a5b45ca1871516c8c6a10fcc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITableItemPatternIdentifiers(ptr: Pointer?): WithDefault =
        ITableItemPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITableItemPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeITableItemPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: ITableItemPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__519295701_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITableItemPatternIdentifiers):
        Array<ITableItemPatternIdentifiers?> = (elements as
        Array<ITableItemPatternIdentifiers?>).castToImpl<ITableItemPatternIdentifiers,ITableItemPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITableItemPatternIdentifiers?> =
        arrayOfNulls<ITableItemPatternIdentifiers_Impl>(size) as
        Array<ITableItemPatternIdentifiers?>
  }
}
