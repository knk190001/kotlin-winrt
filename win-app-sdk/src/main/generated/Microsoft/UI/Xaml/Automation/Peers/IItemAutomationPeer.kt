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

@ABIMarker(IItemAutomationPeer.ABI::class)
@Signature("{be8a71bb-3e36-54d2-920e-60722f1c62ff}")
@Guid("be8a71bb3e3654d2920e60722f1c62ff")
@WinRTInterface("be8a71bb3e3654d2920e60722f1c62ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemAutomationPeer.ByReference::class)
public interface IItemAutomationPeer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Item(): IUnknown?

  @InterfaceMethod(1)
  public fun get_ItemsControlAutomationPeer(): ItemsControlAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemAutomationPeer> {
    public override fun getValue() = ABI.makeIItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemAutomationPeer {
    public val __2107526063_Ptr: Pointer?

    public val _2107526063_VtblPtr: Pointer?
      get() = __2107526063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Item(): IUnknown? {
      val fnPtr = _2107526063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2107526063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemsControlAutomationPeer(): ItemsControlAutomationPeer? {
      val fnPtr = _2107526063_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemsControlAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__2107526063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemsControlAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2107526063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be8a71bb3e3654d2920e60722f1c62ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemAutomationPeer(ptr: Pointer?): WithDefault = IItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2107526063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemAutomationPeer): Array<IItemAutomationPeer?> =
        (elements as
        Array<IItemAutomationPeer?>).castToImpl<IItemAutomationPeer,IItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemAutomationPeer?> =
        arrayOfNulls<IItemAutomationPeer_Impl>(size) as Array<IItemAutomationPeer?>
  }
}
