package Windows.UI.Xaml.Automation.Provider

import Windows.UI.Xaml.Automation.Peers.AutomationNavigationDirection
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

@ABIMarker(ICustomNavigationProvider.ABI::class)
@Signature("{2bd8a6d0-2fa3-4717-b28c-4917ce54928d}")
@Guid("2bd8a6d02fa34717b28c4917ce54928d")
@WinRTInterface("2bd8a6d02fa34717b28c4917ce54928d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomNavigationProvider.ByReference::class)
public interface ICustomNavigationProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun NavigateCustom(direction: AutomationNavigationDirection?): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomNavigationProvider> {
    public override fun getValue() = ABI.makeICustomNavigationProvider(pointer.getPointer(0))

    public fun setValue(value: ICustomNavigationProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomNavigationProvider {
    public val __1117200014_Ptr: Pointer?

    public val _1117200014_VtblPtr: Pointer?
      get() = __1117200014_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun NavigateCustom(direction: AutomationNavigationDirection?): IUnknown? {
      val fnPtr = _1117200014_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1117200014_Ptr, marshalToNative(direction), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class ICustomNavigationProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1117200014_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomNavigationProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2bd8a6d02fa34717b28c4917ce54928d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomNavigationProvider(ptr: Pointer?): WithDefault =
        ICustomNavigationProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomNavigationProvider {
      val address = segment.toRawLongValue()
      return makeICustomNavigationProvider(Pointer(address))
    }

    public override fun toNative(obj: ICustomNavigationProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1117200014_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomNavigationProvider):
        Array<ICustomNavigationProvider?> = (elements as
        Array<ICustomNavigationProvider?>).castToImpl<ICustomNavigationProvider,ICustomNavigationProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomNavigationProvider?> =
        arrayOfNulls<ICustomNavigationProvider_Impl>(size) as Array<ICustomNavigationProvider?>
  }
}
