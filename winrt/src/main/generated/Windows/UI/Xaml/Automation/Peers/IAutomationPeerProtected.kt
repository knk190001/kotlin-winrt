package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Provider.IRawElementProviderSimple
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

@ABIMarker(IAutomationPeerProtected.ABI::class)
@Signature("{f4b40e52-642f-4629-a54a-ea5d2349c448}")
@Guid("f4b40e52642f4629a54aea5d2349c448")
@WinRTInterface("f4b40e52642f4629a54aea5d2349c448")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerProtected.ByReference::class)
public interface IAutomationPeerProtected : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PeerFromProvider(provider: IRawElementProviderSimple?): AutomationPeer?

  @InterfaceMethod(1)
  public fun ProviderFromPeer(peer: AutomationPeer?): IRawElementProviderSimple?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerProtected> {
    public override fun getValue() = ABI.makeIAutomationPeerProtected(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerProtected_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerProtected {
    public val __1359795491_Ptr: Pointer?

    public val _1359795491_VtblPtr: Pointer?
      get() = __1359795491_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PeerFromProvider(provider: IRawElementProviderSimple?): AutomationPeer? {
      val fnPtr = _1359795491_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1359795491_Ptr, marshalToNative(provider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ProviderFromPeer(peer: AutomationPeer?): IRawElementProviderSimple? {
      val fnPtr = _1359795491_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1359795491_Ptr, marshalToNative(peer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRawElementProviderSimple>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeerProtected_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1359795491_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerProtected, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f4b40e52642f4629a54aea5d2349c448")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerProtected(ptr: Pointer?): WithDefault =
        IAutomationPeerProtected_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerProtected {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerProtected(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerProtected): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1359795491_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerProtected):
        Array<IAutomationPeerProtected?> = (elements as
        Array<IAutomationPeerProtected?>).castToImpl<IAutomationPeerProtected,IAutomationPeerProtected_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerProtected?> =
        arrayOfNulls<IAutomationPeerProtected_Impl>(size) as Array<IAutomationPeerProtected?>
  }
}
