package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.Expander
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

@ABIMarker(IExpanderAutomationPeerFactory.ABI::class)
@Signature("{2024523b-4a40-5976-aaab-0f05664f7494}")
@Guid("2024523b4a405976aaab0f05664f7494")
@WinRTInterface("2024523b4a405976aaab0f05664f7494")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpanderAutomationPeerFactory.ByReference::class)
public interface IExpanderAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: Expander?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ExpanderAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpanderAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIExpanderAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IExpanderAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpanderAutomationPeerFactory {
    public val __1754256729_Ptr: Pointer?

    public val _1754256729_VtblPtr: Pointer?
      get() = __1754256729_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: Expander?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ExpanderAutomationPeer? {
      val fnPtr = _1754256729_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpanderAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1754256729_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpanderAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IExpanderAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1754256729_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpanderAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2024523b4a405976aaab0f05664f7494")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpanderAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IExpanderAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpanderAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIExpanderAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IExpanderAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1754256729_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpanderAutomationPeerFactory):
        Array<IExpanderAutomationPeerFactory?> = (elements as
        Array<IExpanderAutomationPeerFactory?>).castToImpl<IExpanderAutomationPeerFactory,IExpanderAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpanderAutomationPeerFactory?> =
        arrayOfNulls<IExpanderAutomationPeerFactory_Impl>(size) as
        Array<IExpanderAutomationPeerFactory?>
  }
}
