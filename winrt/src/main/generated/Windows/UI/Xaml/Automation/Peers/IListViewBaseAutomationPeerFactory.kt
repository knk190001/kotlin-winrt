package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.ListViewBase
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

@ABIMarker(IListViewBaseAutomationPeerFactory.ABI::class)
@Signature("{70d3c2be-8950-4647-9362-fd002f8ff82e}")
@Guid("70d3c2be895046479362fd002f8ff82e")
@WinRTInterface("70d3c2be895046479362fd002f8ff82e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBaseAutomationPeerFactory.ByReference::class)
public interface IListViewBaseAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ListViewBase?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ListViewBaseAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewBaseAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIListViewBaseAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IListViewBaseAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBaseAutomationPeerFactory {
    public val __2015375739_Ptr: Pointer?

    public val _2015375739_VtblPtr: Pointer?
      get() = __2015375739_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ListViewBase?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ListViewBaseAutomationPeer? {
      val fnPtr = _2015375739_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewBaseAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__2015375739_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewBaseAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IListViewBaseAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2015375739_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBaseAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("70d3c2be895046479362fd002f8ff82e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBaseAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IListViewBaseAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBaseAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIListViewBaseAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IListViewBaseAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2015375739_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBaseAutomationPeerFactory):
        Array<IListViewBaseAutomationPeerFactory?> = (elements as
        Array<IListViewBaseAutomationPeerFactory?>).castToImpl<IListViewBaseAutomationPeerFactory,IListViewBaseAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBaseAutomationPeerFactory?> =
        arrayOfNulls<IListViewBaseAutomationPeerFactory_Impl>(size) as
        Array<IListViewBaseAutomationPeerFactory?>
  }
}
