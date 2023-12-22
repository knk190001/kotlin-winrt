package Microsoft.UI.Xaml.Automation.Peers

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

@ABIMarker(IItemsControlAutomationPeerOverrides.ABI::class)
@Signature("{d751b35b-236e-5859-a834-52fa369cd3bd}")
@Guid("d751b35b236e5859a83452fa369cd3bd")
@WinRTInterface("d751b35b236e5859a83452fa369cd3bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsControlAutomationPeerOverrides.ByReference::class)
public interface IItemsControlAutomationPeerOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnCreateItemAutomationPeer(item: IUnknown?): ItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsControlAutomationPeerOverrides> {
    public override fun getValue() =
        ABI.makeIItemsControlAutomationPeerOverrides(pointer.getPointer(0))

    public fun setValue(value: IItemsControlAutomationPeerOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsControlAutomationPeerOverrides {
    public val __374956174_Ptr: Pointer?

    public val _374956174_VtblPtr: Pointer?
      get() = __374956174_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnCreateItemAutomationPeer(item: IUnknown?): ItemAutomationPeer? {
      val fnPtr = _374956174_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__374956174_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IItemsControlAutomationPeerOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __374956174_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsControlAutomationPeerOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d751b35b236e5859a83452fa369cd3bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsControlAutomationPeerOverrides(ptr: Pointer?): WithDefault =
        IItemsControlAutomationPeerOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsControlAutomationPeerOverrides {
      val address = segment.toRawLongValue()
      return makeIItemsControlAutomationPeerOverrides(Pointer(address))
    }

    public override fun toNative(obj: IItemsControlAutomationPeerOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__374956174_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsControlAutomationPeerOverrides):
        Array<IItemsControlAutomationPeerOverrides?> = (elements as
        Array<IItemsControlAutomationPeerOverrides?>).castToImpl<IItemsControlAutomationPeerOverrides,IItemsControlAutomationPeerOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsControlAutomationPeerOverrides?> =
        arrayOfNulls<IItemsControlAutomationPeerOverrides_Impl>(size) as
        Array<IItemsControlAutomationPeerOverrides?>
  }
}
