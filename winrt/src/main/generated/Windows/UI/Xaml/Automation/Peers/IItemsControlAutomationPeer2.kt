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

@ABIMarker(IItemsControlAutomationPeer2.ABI::class)
@Signature("{c48d8917-95a8-47b8-a517-bf891a6c039b}")
@Guid("c48d891795a847b8a517bf891a6c039b")
@WinRTInterface("c48d891795a847b8a517bf891a6c039b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsControlAutomationPeer2.ByReference::class)
public interface IItemsControlAutomationPeer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateItemAutomationPeer(item: IUnknown?): ItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsControlAutomationPeer2> {
    public override fun getValue() = ABI.makeIItemsControlAutomationPeer2(pointer.getPointer(0))

    public fun setValue(value: IItemsControlAutomationPeer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsControlAutomationPeer2 {
    public val __37339972_Ptr: Pointer?

    public val _37339972_VtblPtr: Pointer?
      get() = __37339972_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateItemAutomationPeer(item: IUnknown?): ItemAutomationPeer? {
      val fnPtr = _37339972_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__37339972_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IItemsControlAutomationPeer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __37339972_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsControlAutomationPeer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c48d891795a847b8a517bf891a6c039b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsControlAutomationPeer2(ptr: Pointer?): WithDefault =
        IItemsControlAutomationPeer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsControlAutomationPeer2 {
      val address = segment.toRawLongValue()
      return makeIItemsControlAutomationPeer2(Pointer(address))
    }

    public override fun toNative(obj: IItemsControlAutomationPeer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__37339972_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsControlAutomationPeer2):
        Array<IItemsControlAutomationPeer2?> = (elements as
        Array<IItemsControlAutomationPeer2?>).castToImpl<IItemsControlAutomationPeer2,IItemsControlAutomationPeer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsControlAutomationPeer2?> =
        arrayOfNulls<IItemsControlAutomationPeer2_Impl>(size) as
        Array<IItemsControlAutomationPeer2?>
  }
}
