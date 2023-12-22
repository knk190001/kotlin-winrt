package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.TextBox
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

@ABIMarker(ITextBoxAutomationPeerFactory.ABI::class)
@Signature("{01f0c067-966b-4130-b872-469e42bd4a7f}")
@Guid("01f0c067966b4130b872469e42bd4a7f")
@WinRTInterface("01f0c067966b4130b872469e42bd4a7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxAutomationPeerFactory.ByReference::class)
public interface ITextBoxAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: TextBox?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): TextBoxAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxAutomationPeerFactory> {
    public override fun getValue() = ABI.makeITextBoxAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ITextBoxAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxAutomationPeerFactory {
    public val __1779796053_Ptr: Pointer?

    public val _1779796053_VtblPtr: Pointer?
      get() = __1779796053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: TextBox?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): TextBoxAutomationPeer? {
      val fnPtr = _1779796053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextBoxAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1779796053_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextBoxAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ITextBoxAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1779796053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01f0c067966b4130b872469e42bd4a7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ITextBoxAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeITextBoxAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1779796053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxAutomationPeerFactory):
        Array<ITextBoxAutomationPeerFactory?> = (elements as
        Array<ITextBoxAutomationPeerFactory?>).castToImpl<ITextBoxAutomationPeerFactory,ITextBoxAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxAutomationPeerFactory?> =
        arrayOfNulls<ITextBoxAutomationPeerFactory_Impl>(size) as
        Array<ITextBoxAutomationPeerFactory?>
  }
}
