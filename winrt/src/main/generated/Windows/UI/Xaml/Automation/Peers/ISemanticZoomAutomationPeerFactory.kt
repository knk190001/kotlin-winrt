package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.SemanticZoom
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

@ABIMarker(ISemanticZoomAutomationPeerFactory.ABI::class)
@Signature("{f518d44d-a493-4496-b077-9674c7f4c5fa}")
@Guid("f518d44da4934496b0779674c7f4c5fa")
@WinRTInterface("f518d44da4934496b0779674c7f4c5fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISemanticZoomAutomationPeerFactory.ByReference::class)
public interface ISemanticZoomAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: SemanticZoom?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): SemanticZoomAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISemanticZoomAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeISemanticZoomAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ISemanticZoomAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISemanticZoomAutomationPeerFactory {
    public val __2122743488_Ptr: Pointer?

    public val _2122743488_VtblPtr: Pointer?
      get() = __2122743488_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: SemanticZoom?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): SemanticZoomAutomationPeer? {
      val fnPtr = _2122743488_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SemanticZoomAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__2122743488_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SemanticZoomAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ISemanticZoomAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2122743488_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISemanticZoomAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f518d44da4934496b0779674c7f4c5fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISemanticZoomAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ISemanticZoomAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISemanticZoomAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeISemanticZoomAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISemanticZoomAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2122743488_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISemanticZoomAutomationPeerFactory):
        Array<ISemanticZoomAutomationPeerFactory?> = (elements as
        Array<ISemanticZoomAutomationPeerFactory?>).castToImpl<ISemanticZoomAutomationPeerFactory,ISemanticZoomAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISemanticZoomAutomationPeerFactory?> =
        arrayOfNulls<ISemanticZoomAutomationPeerFactory_Impl>(size) as
        Array<ISemanticZoomAutomationPeerFactory?>
  }
}
