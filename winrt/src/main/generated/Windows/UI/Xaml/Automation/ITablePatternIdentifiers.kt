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

@ABIMarker(ITablePatternIdentifiers.ABI::class)
@Signature("{38d104fe-0d0c-412a-bf8d-51ede683baf5}")
@Guid("38d104fe0d0c412abf8d51ede683baf5")
@WinRTInterface("38d104fe0d0c412abf8d51ede683baf5")
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
    public val __502941267_Ptr: Pointer?

    public val _502941267_VtblPtr: Pointer?
      get() = __502941267_Ptr?.getPointer(0)
  }

  public class ITablePatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __502941267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITablePatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38d104fe0d0c412abf8d51ede683baf5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITablePatternIdentifiers(ptr: Pointer?): WithDefault =
        ITablePatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITablePatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeITablePatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: ITablePatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__502941267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITablePatternIdentifiers):
        Array<ITablePatternIdentifiers?> = (elements as
        Array<ITablePatternIdentifiers?>).castToImpl<ITablePatternIdentifiers,ITablePatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITablePatternIdentifiers?> =
        arrayOfNulls<ITablePatternIdentifiers_Impl>(size) as Array<ITablePatternIdentifiers?>
  }
}
