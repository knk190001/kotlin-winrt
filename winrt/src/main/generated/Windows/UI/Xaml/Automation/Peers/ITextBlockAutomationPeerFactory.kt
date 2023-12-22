package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.TextBlock
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

@ABIMarker(ITextBlockAutomationPeerFactory.ABI::class)
@Signature("{76bf924b-7ca0-4b01-bc5c-a8cf4d3691de}")
@Guid("76bf924b7ca04b01bc5ca8cf4d3691de")
@WinRTInterface("76bf924b7ca04b01bc5ca8cf4d3691de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBlockAutomationPeerFactory.ByReference::class)
public interface ITextBlockAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: TextBlock?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): TextBlockAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBlockAutomationPeerFactory> {
    public override fun getValue() = ABI.makeITextBlockAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ITextBlockAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBlockAutomationPeerFactory {
    public val __1689112343_Ptr: Pointer?

    public val _1689112343_VtblPtr: Pointer?
      get() = __1689112343_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: TextBlock?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): TextBlockAutomationPeer? {
      val fnPtr = _1689112343_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextBlockAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1689112343_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextBlockAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ITextBlockAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1689112343_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBlockAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76bf924b7ca04b01bc5ca8cf4d3691de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBlockAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ITextBlockAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBlockAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeITextBlockAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ITextBlockAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1689112343_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBlockAutomationPeerFactory):
        Array<ITextBlockAutomationPeerFactory?> = (elements as
        Array<ITextBlockAutomationPeerFactory?>).castToImpl<ITextBlockAutomationPeerFactory,ITextBlockAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBlockAutomationPeerFactory?> =
        arrayOfNulls<ITextBlockAutomationPeerFactory_Impl>(size) as
        Array<ITextBlockAutomationPeerFactory?>
  }
}
