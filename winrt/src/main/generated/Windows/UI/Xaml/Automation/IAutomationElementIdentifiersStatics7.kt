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

@ABIMarker(IAutomationElementIdentifiersStatics7.ABI::class)
@Signature("{00f1abb2-742c-446a-a8f6-1672b10d2874}")
@Guid("00f1abb2742c446aa8f61672b10d2874")
@WinRTInterface("00f1abb2742c446aa8f61672b10d2874")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationElementIdentifiersStatics7.ByReference::class)
public interface IAutomationElementIdentifiersStatics7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeadingLevelProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationElementIdentifiersStatics7> {
    public override fun getValue() =
        ABI.makeIAutomationElementIdentifiersStatics7(pointer.getPointer(0))

    public fun setValue(value: IAutomationElementIdentifiersStatics7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationElementIdentifiersStatics7 {
    public val __1667710994_Ptr: Pointer?

    public val _1667710994_VtblPtr: Pointer?
      get() = __1667710994_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeadingLevelProperty(): AutomationProperty? {
      val fnPtr = _1667710994_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1667710994_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationElementIdentifiersStatics7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1667710994_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationElementIdentifiersStatics7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00f1abb2742c446aa8f61672b10d2874")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationElementIdentifiersStatics7(ptr: Pointer?): WithDefault =
        IAutomationElementIdentifiersStatics7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationElementIdentifiersStatics7 {
      val address = segment.toRawLongValue()
      return makeIAutomationElementIdentifiersStatics7(Pointer(address))
    }

    public override fun toNative(obj: IAutomationElementIdentifiersStatics7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1667710994_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationElementIdentifiersStatics7):
        Array<IAutomationElementIdentifiersStatics7?> = (elements as
        Array<IAutomationElementIdentifiersStatics7?>).castToImpl<IAutomationElementIdentifiersStatics7,IAutomationElementIdentifiersStatics7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationElementIdentifiersStatics7?> =
        arrayOfNulls<IAutomationElementIdentifiersStatics7_Impl>(size) as
        Array<IAutomationElementIdentifiersStatics7?>
  }
}
