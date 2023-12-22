package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.RichTextBlock
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
@Signature("{2038ae61-1389-467a-aed6-37334da9622b}")
@Guid("2038ae611389467aaed637334da9622b")
@WinRTInterface("2038ae611389467aaed637334da9622b")
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
    public val __135209189_Ptr: Pointer?

    public val _135209189_VtblPtr: Pointer?
      get() = __135209189_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: RichTextBlock?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): RichTextBlockAutomationPeer? {
      val fnPtr = _135209189_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RichTextBlockAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__135209189_Ptr, marshalToNative(owner),
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
    public override val __135209189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2038ae611389467aaed637334da9622b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IRichTextBlockAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__135209189_Ptr))
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
