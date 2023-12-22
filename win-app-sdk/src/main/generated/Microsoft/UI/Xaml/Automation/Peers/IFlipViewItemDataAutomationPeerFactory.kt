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

@ABIMarker(IFlipViewItemDataAutomationPeerFactory.ABI::class)
@Signature("{6f892ace-4467-587c-953c-c1c13b632e5f}")
@Guid("6f892ace4467587c953cc1c13b632e5f")
@WinRTInterface("6f892ace4467587c953cc1c13b632e5f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipViewItemDataAutomationPeerFactory.ByReference::class)
public interface IFlipViewItemDataAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithParentAndItem(
    item: IUnknown?,
    parent: FlipViewAutomationPeer?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): FlipViewItemDataAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlipViewItemDataAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIFlipViewItemDataAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IFlipViewItemDataAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipViewItemDataAutomationPeerFactory {
    public val __997827777_Ptr: Pointer?

    public val _997827777_VtblPtr: Pointer?
      get() = __997827777_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithParentAndItem(
      item: IUnknown?,
      parent: FlipViewAutomationPeer?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): FlipViewItemDataAutomationPeer? {
      val fnPtr = _997827777_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlipViewItemDataAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__997827777_Ptr, marshalToNative(item), marshalToNative(parent),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlipViewItemDataAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IFlipViewItemDataAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __997827777_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipViewItemDataAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f892ace4467587c953cc1c13b632e5f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipViewItemDataAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IFlipViewItemDataAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipViewItemDataAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIFlipViewItemDataAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IFlipViewItemDataAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__997827777_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipViewItemDataAutomationPeerFactory):
        Array<IFlipViewItemDataAutomationPeerFactory?> = (elements as
        Array<IFlipViewItemDataAutomationPeerFactory?>).castToImpl<IFlipViewItemDataAutomationPeerFactory,IFlipViewItemDataAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipViewItemDataAutomationPeerFactory?> =
        arrayOfNulls<IFlipViewItemDataAutomationPeerFactory_Impl>(size) as
        Array<IFlipViewItemDataAutomationPeerFactory?>
  }
}
