package Windows.UI.Xaml.Automation.Provider

import Windows.UI.Xaml.Automation.AutomationProperty
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IItemContainerProvider.ABI::class)
@Signature("{ef5cd845-e1d4-40f4-bad5-c7fad44a703e}")
@Guid("ef5cd845e1d440f4bad5c7fad44a703e")
@WinRTInterface("ef5cd845e1d440f4bad5c7fad44a703e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemContainerProvider.ByReference::class)
public interface IItemContainerProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindItemByProperty(
    startAfter: IRawElementProviderSimple?,
    automationProperty: AutomationProperty?,
    value: IUnknown?
  ): IRawElementProviderSimple?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemContainerProvider> {
    public override fun getValue() = ABI.makeIItemContainerProvider(pointer.getPointer(0))

    public fun setValue(value: IItemContainerProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemContainerProvider {
    public val __1270245209_Ptr: Pointer?

    public val _1270245209_VtblPtr: Pointer?
      get() = __1270245209_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindItemByProperty(
      startAfter: IRawElementProviderSimple?,
      automationProperty: AutomationProperty?,
      value: IUnknown?
    ): IRawElementProviderSimple? {
      val fnPtr = _1270245209_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1270245209_Ptr, marshalToNative(startAfter),
          marshalToNative(automationProperty), marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRawElementProviderSimple>(result.getValue())
      return resultValue
    }
  }

  public class IItemContainerProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1270245209_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemContainerProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef5cd845e1d440f4bad5c7fad44a703e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemContainerProvider(ptr: Pointer?): WithDefault =
        IItemContainerProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemContainerProvider {
      val address = segment.toRawLongValue()
      return makeIItemContainerProvider(Pointer(address))
    }

    public override fun toNative(obj: IItemContainerProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1270245209_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemContainerProvider): Array<IItemContainerProvider?> =
        (elements as
        Array<IItemContainerProvider?>).castToImpl<IItemContainerProvider,IItemContainerProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemContainerProvider?> =
        arrayOfNulls<IItemContainerProvider_Impl>(size) as Array<IItemContainerProvider?>
  }
}
