package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.TabViewItem
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

@ABIMarker(ITabViewItemAutomationPeerFactory.ABI::class)
@Signature("{00218040-9c0d-5c52-b578-593b809047b3}")
@Guid("002180409c0d5c52b578593b809047b3")
@WinRTInterface("002180409c0d5c52b578593b809047b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewItemAutomationPeerFactory.ByReference::class)
public interface ITabViewItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: TabViewItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): TabViewItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeITabViewItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ITabViewItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewItemAutomationPeerFactory {
    public val __1564090631_Ptr: Pointer?

    public val _1564090631_VtblPtr: Pointer?
      get() = __1564090631_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: TabViewItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): TabViewItemAutomationPeer? {
      val fnPtr = _1564090631_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TabViewItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1564090631_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TabViewItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1564090631_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("002180409c0d5c52b578593b809047b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ITabViewItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeITabViewItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ITabViewItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1564090631_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewItemAutomationPeerFactory):
        Array<ITabViewItemAutomationPeerFactory?> = (elements as
        Array<ITabViewItemAutomationPeerFactory?>).castToImpl<ITabViewItemAutomationPeerFactory,ITabViewItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewItemAutomationPeerFactory?> =
        arrayOfNulls<ITabViewItemAutomationPeerFactory_Impl>(size) as
        Array<ITabViewItemAutomationPeerFactory?>
  }
}
