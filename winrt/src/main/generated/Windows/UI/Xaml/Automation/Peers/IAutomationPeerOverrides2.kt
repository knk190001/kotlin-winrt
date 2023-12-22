package Windows.UI.Xaml.Automation.Peers

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IAutomationPeerOverrides2.ABI::class)
@Signature("{2603682a-9da6-4023-b496-496e5ef228d2}")
@Guid("2603682a9da64023b496496e5ef228d2")
@WinRTInterface("2603682a9da64023b496496e5ef228d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerOverrides2.ByReference::class)
public interface IAutomationPeerOverrides2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowContextMenuCore(): Unit

  @InterfaceMethod(1)
  public fun GetControlledPeersCore(): IVectorView<AutomationPeer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerOverrides2> {
    public override fun getValue() = ABI.makeIAutomationPeerOverrides2(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerOverrides2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerOverrides2 {
    public val __706645404_Ptr: Pointer?

    public val _706645404_VtblPtr: Pointer?
      get() = __706645404_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowContextMenuCore(): Unit {
      val fnPtr = _706645404_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__706645404_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetControlledPeersCore(): IVectorView<AutomationPeer?>? {
      val fnPtr = _706645404_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__706645404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AutomationPeer?>>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeerOverrides2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __706645404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerOverrides2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2603682a9da64023b496496e5ef228d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerOverrides2(ptr: Pointer?): WithDefault =
        IAutomationPeerOverrides2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerOverrides2 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerOverrides2(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerOverrides2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__706645404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerOverrides2):
        Array<IAutomationPeerOverrides2?> = (elements as
        Array<IAutomationPeerOverrides2?>).castToImpl<IAutomationPeerOverrides2,IAutomationPeerOverrides2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerOverrides2?> =
        arrayOfNulls<IAutomationPeerOverrides2_Impl>(size) as Array<IAutomationPeerOverrides2?>
  }
}
