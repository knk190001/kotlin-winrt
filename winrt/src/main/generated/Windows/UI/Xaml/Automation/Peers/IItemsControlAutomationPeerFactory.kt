package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.ItemsControl
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

@ABIMarker(IItemsControlAutomationPeerFactory.ABI::class)
@Signature("{4038a259-2e1a-49ca-a533-c64f181577e6}")
@Guid("4038a2592e1a49caa533c64f181577e6")
@WinRTInterface("4038a2592e1a49caa533c64f181577e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsControlAutomationPeerFactory.ByReference::class)
public interface IItemsControlAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ItemsControl?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ItemsControlAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsControlAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIItemsControlAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IItemsControlAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsControlAutomationPeerFactory {
    public val __319850884_Ptr: Pointer?

    public val _319850884_VtblPtr: Pointer?
      get() = __319850884_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ItemsControl?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ItemsControlAutomationPeer? {
      val fnPtr = _319850884_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemsControlAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__319850884_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemsControlAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IItemsControlAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __319850884_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsControlAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4038a2592e1a49caa533c64f181577e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsControlAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IItemsControlAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsControlAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIItemsControlAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IItemsControlAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__319850884_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsControlAutomationPeerFactory):
        Array<IItemsControlAutomationPeerFactory?> = (elements as
        Array<IItemsControlAutomationPeerFactory?>).castToImpl<IItemsControlAutomationPeerFactory,IItemsControlAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsControlAutomationPeerFactory?> =
        arrayOfNulls<IItemsControlAutomationPeerFactory_Impl>(size) as
        Array<IItemsControlAutomationPeerFactory?>
  }
}
