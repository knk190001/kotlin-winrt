package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(IItemsControlAutomationPeerOverrides2.ABI::class)
@Signature("{361dc0e8-b56f-45e9-80fe-10a0fb0fe177}")
@Guid("361dc0e8b56f45e980fe10a0fb0fe177")
@WinRTInterface("361dc0e8b56f45e980fe10a0fb0fe177")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsControlAutomationPeerOverrides2.ByReference::class)
public interface IItemsControlAutomationPeerOverrides2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnCreateItemAutomationPeer(item: IUnknown?): ItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsControlAutomationPeerOverrides2> {
    public override fun getValue() =
        ABI.makeIItemsControlAutomationPeerOverrides2(pointer.getPointer(0))

    public fun setValue(value: IItemsControlAutomationPeerOverrides2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsControlAutomationPeerOverrides2 {
    public val __1723018183_Ptr: Pointer?

    public val _1723018183_VtblPtr: Pointer?
      get() = __1723018183_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnCreateItemAutomationPeer(item: IUnknown?): ItemAutomationPeer? {
      val fnPtr = _1723018183_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1723018183_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IItemsControlAutomationPeerOverrides2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1723018183_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsControlAutomationPeerOverrides2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("361dc0e8b56f45e980fe10a0fb0fe177")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsControlAutomationPeerOverrides2(ptr: Pointer?): WithDefault =
        IItemsControlAutomationPeerOverrides2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsControlAutomationPeerOverrides2 {
      val address = segment.toRawLongValue()
      return makeIItemsControlAutomationPeerOverrides2(Pointer(address))
    }

    public override fun toNative(obj: IItemsControlAutomationPeerOverrides2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1723018183_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsControlAutomationPeerOverrides2):
        Array<IItemsControlAutomationPeerOverrides2?> = (elements as
        Array<IItemsControlAutomationPeerOverrides2?>).castToImpl<IItemsControlAutomationPeerOverrides2,IItemsControlAutomationPeerOverrides2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsControlAutomationPeerOverrides2?> =
        arrayOfNulls<IItemsControlAutomationPeerOverrides2_Impl>(size) as
        Array<IItemsControlAutomationPeerOverrides2?>
  }
}
