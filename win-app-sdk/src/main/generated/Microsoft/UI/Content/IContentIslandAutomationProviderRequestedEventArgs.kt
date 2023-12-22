package Microsoft.UI.Content

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentIslandAutomationProviderRequestedEventArgs.ABI::class)
@Signature("{9fe24bed-2b9c-5137-887f-403c94841824}")
@Guid("9fe24bed2b9c5137887f403c94841824")
@WinRTInterface("9fe24bed2b9c5137887f403c94841824")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentIslandAutomationProviderRequestedEventArgs.ByReference::class)
public interface IContentIslandAutomationProviderRequestedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_AutomationProvider(): IUnknown?

  @InterfaceMethod(1)
  public fun put_AutomationProvider(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_Handled(): Boolean

  @InterfaceMethod(3)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentIslandAutomationProviderRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIContentIslandAutomationProviderRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContentIslandAutomationProviderRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentIslandAutomationProviderRequestedEventArgs {
    public val __1951938357_Ptr: Pointer?

    public val _1951938357_VtblPtr: Pointer?
      get() = __1951938357_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutomationProvider(): IUnknown? {
      val fnPtr = _1951938357_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1951938357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AutomationProvider(value: IUnknown?): Unit {
      val fnPtr = _1951938357_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1951938357_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1951938357_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1951938357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1951938357_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1951938357_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentIslandAutomationProviderRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1951938357_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentIslandAutomationProviderRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fe24bed2b9c5137887f403c94841824")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentIslandAutomationProviderRequestedEventArgs(ptr: Pointer?): WithDefault =
        IContentIslandAutomationProviderRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContentIslandAutomationProviderRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContentIslandAutomationProviderRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContentIslandAutomationProviderRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1951938357_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentIslandAutomationProviderRequestedEventArgs):
        Array<IContentIslandAutomationProviderRequestedEventArgs?> = (elements as
        Array<IContentIslandAutomationProviderRequestedEventArgs?>).castToImpl<IContentIslandAutomationProviderRequestedEventArgs,IContentIslandAutomationProviderRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IContentIslandAutomationProviderRequestedEventArgs?> =
        arrayOfNulls<IContentIslandAutomationProviderRequestedEventArgs_Impl>(size) as
        Array<IContentIslandAutomationProviderRequestedEventArgs?>
  }
}
