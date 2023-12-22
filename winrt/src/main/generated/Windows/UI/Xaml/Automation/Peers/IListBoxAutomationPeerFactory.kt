package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.ListBox
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

@ABIMarker(IListBoxAutomationPeerFactory.ABI::class)
@Signature("{e2362185-7df6-49f7-8abc-4c33f1a3d46e}")
@Guid("e23621857df649f78abc4c33f1a3d46e")
@WinRTInterface("e23621857df649f78abc4c33f1a3d46e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListBoxAutomationPeerFactory.ByReference::class)
public interface IListBoxAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ListBox?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ListBoxAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListBoxAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIListBoxAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IListBoxAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListBoxAutomationPeerFactory {
    public val __345513956_Ptr: Pointer?

    public val _345513956_VtblPtr: Pointer?
      get() = __345513956_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ListBox?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ListBoxAutomationPeer? {
      val fnPtr = _345513956_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListBoxAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__345513956_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListBoxAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IListBoxAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __345513956_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListBoxAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e23621857df649f78abc4c33f1a3d46e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListBoxAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IListBoxAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListBoxAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIListBoxAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IListBoxAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__345513956_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListBoxAutomationPeerFactory):
        Array<IListBoxAutomationPeerFactory?> = (elements as
        Array<IListBoxAutomationPeerFactory?>).castToImpl<IListBoxAutomationPeerFactory,IListBoxAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListBoxAutomationPeerFactory?> =
        arrayOfNulls<IListBoxAutomationPeerFactory_Impl>(size) as
        Array<IListBoxAutomationPeerFactory?>
  }
}
