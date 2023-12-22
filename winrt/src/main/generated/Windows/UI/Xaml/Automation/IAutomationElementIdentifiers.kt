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

@ABIMarker(IAutomationElementIdentifiers.ABI::class)
@Signature("{e68a63cf-4345-4e2d-8a6a-49cce1fa2dcc}")
@Guid("e68a63cf43454e2d8a6a49cce1fa2dcc")
@WinRTInterface("e68a63cf43454e2d8a6a49cce1fa2dcc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationElementIdentifiers.ByReference::class)
public interface IAutomationElementIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationElementIdentifiers> {
    public override fun getValue() = ABI.makeIAutomationElementIdentifiers(pointer.getPointer(0))

    public fun setValue(value: IAutomationElementIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationElementIdentifiers {
    public val __2114338080_Ptr: Pointer?

    public val _2114338080_VtblPtr: Pointer?
      get() = __2114338080_Ptr?.getPointer(0)
  }

  public class IAutomationElementIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2114338080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationElementIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e68a63cf43454e2d8a6a49cce1fa2dcc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationElementIdentifiers(ptr: Pointer?): WithDefault =
        IAutomationElementIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationElementIdentifiers {
      val address = segment.toRawLongValue()
      return makeIAutomationElementIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: IAutomationElementIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2114338080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationElementIdentifiers):
        Array<IAutomationElementIdentifiers?> = (elements as
        Array<IAutomationElementIdentifiers?>).castToImpl<IAutomationElementIdentifiers,IAutomationElementIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationElementIdentifiers?> =
        arrayOfNulls<IAutomationElementIdentifiers_Impl>(size) as
        Array<IAutomationElementIdentifiers?>
  }
}
