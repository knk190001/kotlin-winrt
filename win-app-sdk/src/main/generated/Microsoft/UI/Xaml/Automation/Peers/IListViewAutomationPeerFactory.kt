package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.ListView
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

@ABIMarker(IListViewAutomationPeerFactory.ABI::class)
@Signature("{3c6d8fc2-57ea-584e-9a89-504c65251d0f}")
@Guid("3c6d8fc257ea584e9a89504c65251d0f")
@WinRTInterface("3c6d8fc257ea584e9a89504c65251d0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewAutomationPeerFactory.ByReference::class)
public interface IListViewAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ListView?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ListViewAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIListViewAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IListViewAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewAutomationPeerFactory {
    public val __1819176821_Ptr: Pointer?

    public val _1819176821_VtblPtr: Pointer?
      get() = __1819176821_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ListView?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ListViewAutomationPeer? {
      val fnPtr = _1819176821_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1819176821_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IListViewAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1819176821_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c6d8fc257ea584e9a89504c65251d0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IListViewAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIListViewAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IListViewAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1819176821_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewAutomationPeerFactory):
        Array<IListViewAutomationPeerFactory?> = (elements as
        Array<IListViewAutomationPeerFactory?>).castToImpl<IListViewAutomationPeerFactory,IListViewAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewAutomationPeerFactory?> =
        arrayOfNulls<IListViewAutomationPeerFactory_Impl>(size) as
        Array<IListViewAutomationPeerFactory?>
  }
}
