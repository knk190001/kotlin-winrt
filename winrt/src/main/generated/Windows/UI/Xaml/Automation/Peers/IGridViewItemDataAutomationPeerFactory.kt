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

@ABIMarker(IGridViewItemDataAutomationPeerFactory.ABI::class)
@Signature("{a65e7a88-770d-402c-996f-67506af2a4af}")
@Guid("a65e7a88770d402c996f67506af2a4af")
@WinRTInterface("a65e7a88770d402c996f67506af2a4af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewItemDataAutomationPeerFactory.ByReference::class)
public interface IGridViewItemDataAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithParentAndItem(
    item: IUnknown?,
    parent: GridViewAutomationPeer?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): GridViewItemDataAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewItemDataAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIGridViewItemDataAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IGridViewItemDataAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewItemDataAutomationPeerFactory {
    public val __1593214801_Ptr: Pointer?

    public val _1593214801_VtblPtr: Pointer?
      get() = __1593214801_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithParentAndItem(
      item: IUnknown?,
      parent: GridViewAutomationPeer?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): GridViewItemDataAutomationPeer? {
      val fnPtr = _1593214801_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridViewItemDataAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1593214801_Ptr, marshalToNative(item), marshalToNative(parent),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridViewItemDataAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IGridViewItemDataAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1593214801_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewItemDataAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a65e7a88770d402c996f67506af2a4af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewItemDataAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IGridViewItemDataAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewItemDataAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIGridViewItemDataAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IGridViewItemDataAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1593214801_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewItemDataAutomationPeerFactory):
        Array<IGridViewItemDataAutomationPeerFactory?> = (elements as
        Array<IGridViewItemDataAutomationPeerFactory?>).castToImpl<IGridViewItemDataAutomationPeerFactory,IGridViewItemDataAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewItemDataAutomationPeerFactory?> =
        arrayOfNulls<IGridViewItemDataAutomationPeerFactory_Impl>(size) as
        Array<IGridViewItemDataAutomationPeerFactory?>
  }
}
