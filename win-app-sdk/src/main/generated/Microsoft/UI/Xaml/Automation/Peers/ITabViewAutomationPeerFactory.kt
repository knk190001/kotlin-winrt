package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.TabView
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

@ABIMarker(ITabViewAutomationPeerFactory.ABI::class)
@Signature("{f8d8c7cb-47cc-5da5-bd1a-e2e1ba0fd24d}")
@Guid("f8d8c7cb47cc5da5bd1ae2e1ba0fd24d")
@WinRTInterface("f8d8c7cb47cc5da5bd1ae2e1ba0fd24d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewAutomationPeerFactory.ByReference::class)
public interface ITabViewAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: TabView?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): TabViewAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewAutomationPeerFactory> {
    public override fun getValue() = ABI.makeITabViewAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ITabViewAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewAutomationPeerFactory {
    public val __1825984218_Ptr: Pointer?

    public val _1825984218_VtblPtr: Pointer?
      get() = __1825984218_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: TabView?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): TabViewAutomationPeer? {
      val fnPtr = _1825984218_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TabViewAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1825984218_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TabViewAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1825984218_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8d8c7cb47cc5da5bd1ae2e1ba0fd24d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ITabViewAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeITabViewAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ITabViewAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1825984218_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewAutomationPeerFactory):
        Array<ITabViewAutomationPeerFactory?> = (elements as
        Array<ITabViewAutomationPeerFactory?>).castToImpl<ITabViewAutomationPeerFactory,ITabViewAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewAutomationPeerFactory?> =
        arrayOfNulls<ITabViewAutomationPeerFactory_Impl>(size) as
        Array<ITabViewAutomationPeerFactory?>
  }
}
