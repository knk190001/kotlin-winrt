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

@ABIMarker(IItemAutomationPeerFactory.ABI::class)
@Signature("{29065073-de3d-4d3f-97b4-4d6f9d53444d}")
@Guid("29065073de3d4d3f97b44d6f9d53444d")
@WinRTInterface("29065073de3d4d3f97b44d6f9d53444d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemAutomationPeerFactory.ByReference::class)
public interface IItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithParentAndItem(
    item: IUnknown?,
    parent: ItemsControlAutomationPeer?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemAutomationPeerFactory {
    public val __524805466_Ptr: Pointer?

    public val _524805466_VtblPtr: Pointer?
      get() = __524805466_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithParentAndItem(
      item: IUnknown?,
      parent: ItemsControlAutomationPeer?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ItemAutomationPeer? {
      val fnPtr = _524805466_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__524805466_Ptr, marshalToNative(item), marshalToNative(parent),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __524805466_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29065073de3d4d3f97b44d6f9d53444d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__524805466_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemAutomationPeerFactory):
        Array<IItemAutomationPeerFactory?> = (elements as
        Array<IItemAutomationPeerFactory?>).castToImpl<IItemAutomationPeerFactory,IItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemAutomationPeerFactory?> =
        arrayOfNulls<IItemAutomationPeerFactory_Impl>(size) as Array<IItemAutomationPeerFactory?>
  }
}
