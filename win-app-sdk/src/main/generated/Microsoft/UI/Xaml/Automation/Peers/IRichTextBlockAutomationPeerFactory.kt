package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.RichTextBlock
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

@ABIMarker(IRichTextBlockAutomationPeerFactory.ABI::class)
@Signature("{f8a4485b-2895-5886-8ff6-497e4f1a6e3d}")
@Guid("f8a4485b289558868ff6497e4f1a6e3d")
@WinRTInterface("f8a4485b289558868ff6497e4f1a6e3d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlockAutomationPeerFactory.ByReference::class)
public interface IRichTextBlockAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: RichTextBlock?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): RichTextBlockAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlockAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIRichTextBlockAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlockAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlockAutomationPeerFactory {
    public val __1731218640_Ptr: Pointer?

    public val _1731218640_VtblPtr: Pointer?
      get() = __1731218640_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: RichTextBlock?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): RichTextBlockAutomationPeer? {
      val fnPtr = _1731218640_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RichTextBlockAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1731218640_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RichTextBlockAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IRichTextBlockAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1731218640_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8a4485b289558868ff6497e4f1a6e3d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IRichTextBlockAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1731218640_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlockAutomationPeerFactory):
        Array<IRichTextBlockAutomationPeerFactory?> = (elements as
        Array<IRichTextBlockAutomationPeerFactory?>).castToImpl<IRichTextBlockAutomationPeerFactory,IRichTextBlockAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlockAutomationPeerFactory?> =
        arrayOfNulls<IRichTextBlockAutomationPeerFactory_Impl>(size) as
        Array<IRichTextBlockAutomationPeerFactory?>
  }
}
