package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.RichEditBox
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

@ABIMarker(IRichEditBoxAutomationPeerFactory.ABI::class)
@Signature("{84f0d84f-54ca-58f2-ac50-d379aab75463}")
@Guid("84f0d84f54ca58f2ac50d379aab75463")
@WinRTInterface("84f0d84f54ca58f2ac50d379aab75463")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBoxAutomationPeerFactory.ByReference::class)
public interface IRichEditBoxAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: RichEditBox?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): RichEditBoxAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditBoxAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIRichEditBoxAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IRichEditBoxAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBoxAutomationPeerFactory {
    public val __1431307055_Ptr: Pointer?

    public val _1431307055_VtblPtr: Pointer?
      get() = __1431307055_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: RichEditBox?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): RichEditBoxAutomationPeer? {
      val fnPtr = _1431307055_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RichEditBoxAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1431307055_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RichEditBoxAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IRichEditBoxAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1431307055_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBoxAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84f0d84f54ca58f2ac50d379aab75463")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBoxAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IRichEditBoxAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBoxAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIRichEditBoxAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBoxAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1431307055_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBoxAutomationPeerFactory):
        Array<IRichEditBoxAutomationPeerFactory?> = (elements as
        Array<IRichEditBoxAutomationPeerFactory?>).castToImpl<IRichEditBoxAutomationPeerFactory,IRichEditBoxAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBoxAutomationPeerFactory?> =
        arrayOfNulls<IRichEditBoxAutomationPeerFactory_Impl>(size) as
        Array<IRichEditBoxAutomationPeerFactory?>
  }
}
