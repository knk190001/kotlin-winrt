package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.ListViewItem
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

@ABIMarker(IListViewItemAutomationPeerFactory.ABI::class)
@Signature("{c47dfbc0-facc-4024-a73b-17ec4e662654}")
@Guid("c47dfbc0facc4024a73b17ec4e662654")
@WinRTInterface("c47dfbc0facc4024a73b17ec4e662654")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemAutomationPeerFactory.ByReference::class)
public interface IListViewItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ListViewItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ListViewItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIListViewItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IListViewItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemAutomationPeerFactory {
    public val __20514941_Ptr: Pointer?

    public val _20514941_VtblPtr: Pointer?
      get() = __20514941_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ListViewItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ListViewItemAutomationPeer? {
      val fnPtr = _20514941_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__20514941_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IListViewItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __20514941_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c47dfbc0facc4024a73b17ec4e662654")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IListViewItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIListViewItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__20514941_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemAutomationPeerFactory):
        Array<IListViewItemAutomationPeerFactory?> = (elements as
        Array<IListViewItemAutomationPeerFactory?>).castToImpl<IListViewItemAutomationPeerFactory,IListViewItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemAutomationPeerFactory?> =
        arrayOfNulls<IListViewItemAutomationPeerFactory_Impl>(size) as
        Array<IListViewItemAutomationPeerFactory?>
  }
}
