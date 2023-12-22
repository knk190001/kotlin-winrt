package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.Primitives.ScrollBar
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

@ABIMarker(IScrollBarAutomationPeerFactory.ABI::class)
@Signature("{e1302110-afeb-4595-8e3d-edc0844a2b21}")
@Guid("e1302110afeb45958e3dedc0844a2b21")
@WinRTInterface("e1302110afeb45958e3dedc0844a2b21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollBarAutomationPeerFactory.ByReference::class)
public interface IScrollBarAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ScrollBar?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ScrollBarAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollBarAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIScrollBarAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollBarAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollBarAutomationPeerFactory {
    public val __1624200701_Ptr: Pointer?

    public val _1624200701_VtblPtr: Pointer?
      get() = __1624200701_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ScrollBar?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ScrollBarAutomationPeer? {
      val fnPtr = _1624200701_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollBarAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1624200701_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollBarAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IScrollBarAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1624200701_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollBarAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1302110afeb45958e3dedc0844a2b21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollBarAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IScrollBarAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollBarAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIScrollBarAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollBarAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1624200701_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollBarAutomationPeerFactory):
        Array<IScrollBarAutomationPeerFactory?> = (elements as
        Array<IScrollBarAutomationPeerFactory?>).castToImpl<IScrollBarAutomationPeerFactory,IScrollBarAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollBarAutomationPeerFactory?> =
        arrayOfNulls<IScrollBarAutomationPeerFactory_Impl>(size) as
        Array<IScrollBarAutomationPeerFactory?>
  }
}
