package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.SearchBox
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

@ABIMarker(ISearchBoxAutomationPeerFactory.ABI::class)
@Signature("{b3c01430-7faa-41bb-8e91-7c761c5267f1}")
@Guid("b3c014307faa41bb8e917c761c5267f1")
@WinRTInterface("b3c014307faa41bb8e917c761c5267f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchBoxAutomationPeerFactory.ByReference::class)
public interface ISearchBoxAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: SearchBox?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): SearchBoxAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchBoxAutomationPeerFactory> {
    public override fun getValue() = ABI.makeISearchBoxAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ISearchBoxAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchBoxAutomationPeerFactory {
    public val __1269446362_Ptr: Pointer?

    public val _1269446362_VtblPtr: Pointer?
      get() = __1269446362_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: SearchBox?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): SearchBoxAutomationPeer? {
      val fnPtr = _1269446362_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchBoxAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1269446362_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchBoxAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ISearchBoxAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1269446362_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchBoxAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3c014307faa41bb8e917c761c5267f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchBoxAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ISearchBoxAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchBoxAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeISearchBoxAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISearchBoxAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1269446362_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchBoxAutomationPeerFactory):
        Array<ISearchBoxAutomationPeerFactory?> = (elements as
        Array<ISearchBoxAutomationPeerFactory?>).castToImpl<ISearchBoxAutomationPeerFactory,ISearchBoxAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchBoxAutomationPeerFactory?> =
        arrayOfNulls<ISearchBoxAutomationPeerFactory_Impl>(size) as
        Array<ISearchBoxAutomationPeerFactory?>
  }
}
