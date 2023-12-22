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

@ABIMarker(IAutomationElementIdentifiersStatics5.ABI::class)
@Signature("{986a8206-de59-42f9-a1e7-62b8af9e756d}")
@Guid("986a8206de5942f9a1e762b8af9e756d")
@WinRTInterface("986a8206de5942f9a1e762b8af9e756d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationElementIdentifiersStatics5.ByReference::class)
public interface IAutomationElementIdentifiersStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPeripheralProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_IsDataValidForFormProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_FullDescriptionProperty(): AutomationProperty?

  @InterfaceMethod(3)
  public fun get_DescribedByProperty(): AutomationProperty?

  @InterfaceMethod(4)
  public fun get_FlowsToProperty(): AutomationProperty?

  @InterfaceMethod(5)
  public fun get_FlowsFromProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationElementIdentifiersStatics5> {
    public override fun getValue() =
        ABI.makeIAutomationElementIdentifiersStatics5(pointer.getPointer(0))

    public fun setValue(value: IAutomationElementIdentifiersStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationElementIdentifiersStatics5 {
    public val __1667710992_Ptr: Pointer?

    public val _1667710992_VtblPtr: Pointer?
      get() = __1667710992_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPeripheralProperty(): AutomationProperty? {
      val fnPtr = _1667710992_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1667710992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsDataValidForFormProperty(): AutomationProperty? {
      val fnPtr = _1667710992_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1667710992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FullDescriptionProperty(): AutomationProperty? {
      val fnPtr = _1667710992_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1667710992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DescribedByProperty(): AutomationProperty? {
      val fnPtr = _1667710992_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1667710992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FlowsToProperty(): AutomationProperty? {
      val fnPtr = _1667710992_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1667710992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_FlowsFromProperty(): AutomationProperty? {
      val fnPtr = _1667710992_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1667710992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationElementIdentifiersStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1667710992_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationElementIdentifiersStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("986a8206de5942f9a1e762b8af9e756d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationElementIdentifiersStatics5(ptr: Pointer?): WithDefault =
        IAutomationElementIdentifiersStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationElementIdentifiersStatics5 {
      val address = segment.toRawLongValue()
      return makeIAutomationElementIdentifiersStatics5(Pointer(address))
    }

    public override fun toNative(obj: IAutomationElementIdentifiersStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1667710992_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationElementIdentifiersStatics5):
        Array<IAutomationElementIdentifiersStatics5?> = (elements as
        Array<IAutomationElementIdentifiersStatics5?>).castToImpl<IAutomationElementIdentifiersStatics5,IAutomationElementIdentifiersStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationElementIdentifiersStatics5?> =
        arrayOfNulls<IAutomationElementIdentifiersStatics5_Impl>(size) as
        Array<IAutomationElementIdentifiersStatics5?>
  }
}
