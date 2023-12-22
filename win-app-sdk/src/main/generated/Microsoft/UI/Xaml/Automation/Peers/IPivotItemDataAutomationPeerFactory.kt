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

@ABIMarker(IPivotItemDataAutomationPeerFactory.ABI::class)
@Signature("{26d7a6e9-ce6b-5690-9024-75ce5770b0d6}")
@Guid("26d7a6e9ce6b5690902475ce5770b0d6")
@WinRTInterface("26d7a6e9ce6b5690902475ce5770b0d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotItemDataAutomationPeerFactory.ByReference::class)
public interface IPivotItemDataAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithParentAndItem(item: IUnknown?, parent: PivotAutomationPeer?):
      PivotItemDataAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPivotItemDataAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIPivotItemDataAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IPivotItemDataAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotItemDataAutomationPeerFactory {
    public val __1733797419_Ptr: Pointer?

    public val _1733797419_VtblPtr: Pointer?
      get() = __1733797419_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithParentAndItem(item: IUnknown?,
        parent: PivotAutomationPeer?): PivotItemDataAutomationPeer? {
      val fnPtr = _1733797419_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PivotItemDataAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1733797419_Ptr, marshalToNative(item), marshalToNative(parent),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PivotItemDataAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IPivotItemDataAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1733797419_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotItemDataAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("26d7a6e9ce6b5690902475ce5770b0d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotItemDataAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IPivotItemDataAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotItemDataAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIPivotItemDataAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IPivotItemDataAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1733797419_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotItemDataAutomationPeerFactory):
        Array<IPivotItemDataAutomationPeerFactory?> = (elements as
        Array<IPivotItemDataAutomationPeerFactory?>).castToImpl<IPivotItemDataAutomationPeerFactory,IPivotItemDataAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotItemDataAutomationPeerFactory?> =
        arrayOfNulls<IPivotItemDataAutomationPeerFactory_Impl>(size) as
        Array<IPivotItemDataAutomationPeerFactory?>
  }
}
