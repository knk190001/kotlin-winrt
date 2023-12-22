package Windows.UI.Xaml.Automation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationElementIdentifiersStatics6.ABI::class)
@Signature("{de52b00d-8328-4eae-8035-f8db99c8bac4}")
@Guid("de52b00d83284eae8035f8db99c8bac4")
@WinRTInterface("de52b00d83284eae8035f8db99c8bac4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationElementIdentifiersStatics6.ByReference::class)
public interface IAutomationElementIdentifiersStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CultureProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationElementIdentifiersStatics6> {
    public override fun getValue() =
        ABI.makeIAutomationElementIdentifiersStatics6(pointer.getPointer(0))

    public fun setValue(value: IAutomationElementIdentifiersStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationElementIdentifiersStatics6 {
    public val __1667710993_Ptr: Pointer?

    public val _1667710993_VtblPtr: Pointer?
      get() = __1667710993_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CultureProperty(): AutomationProperty? {
      val fnPtr = _1667710993_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1667710993_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationElementIdentifiersStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1667710993_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationElementIdentifiersStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de52b00d83284eae8035f8db99c8bac4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationElementIdentifiersStatics6(ptr: Pointer?): WithDefault =
        IAutomationElementIdentifiersStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationElementIdentifiersStatics6 {
      val address = segment.toRawLongValue()
      return makeIAutomationElementIdentifiersStatics6(Pointer(address))
    }

    public override fun toNative(obj: IAutomationElementIdentifiersStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1667710993_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationElementIdentifiersStatics6):
        Array<IAutomationElementIdentifiersStatics6?> = (elements as
        Array<IAutomationElementIdentifiersStatics6?>).castToImpl<IAutomationElementIdentifiersStatics6,IAutomationElementIdentifiersStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationElementIdentifiersStatics6?> =
        arrayOfNulls<IAutomationElementIdentifiersStatics6_Impl>(size) as
        Array<IAutomationElementIdentifiersStatics6?>
  }
}
