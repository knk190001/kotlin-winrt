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

@ABIMarker(IScrollPatternIdentifiers.ABI::class)
@Signature("{04f1a4b8-edc7-55f2-96df-a9c7e809372e}")
@Guid("04f1a4b8edc755f296dfa9c7e809372e")
@WinRTInterface("04f1a4b8edc755f296dfa9c7e809372e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollPatternIdentifiers.ByReference::class)
public interface IScrollPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollPatternIdentifiers> {
    public override fun getValue() = ABI.makeIScrollPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: IScrollPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollPatternIdentifiers {
    public val __1943647891_Ptr: Pointer?

    public val _1943647891_VtblPtr: Pointer?
      get() = __1943647891_Ptr?.getPointer(0)
  }

  public class IScrollPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1943647891_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("04f1a4b8edc755f296dfa9c7e809372e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollPatternIdentifiers(ptr: Pointer?): WithDefault =
        IScrollPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeIScrollPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: IScrollPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1943647891_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollPatternIdentifiers):
        Array<IScrollPatternIdentifiers?> = (elements as
        Array<IScrollPatternIdentifiers?>).castToImpl<IScrollPatternIdentifiers,IScrollPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollPatternIdentifiers?> =
        arrayOfNulls<IScrollPatternIdentifiers_Impl>(size) as Array<IScrollPatternIdentifiers?>
  }
}
