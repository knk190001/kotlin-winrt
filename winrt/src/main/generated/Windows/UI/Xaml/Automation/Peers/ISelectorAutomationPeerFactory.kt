package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.Primitives.Selector
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

@ABIMarker(ISelectorAutomationPeerFactory.ABI::class)
@Signature("{7b525646-829b-4dcc-bd52-5a8d0399387a}")
@Guid("7b525646829b4dccbd525a8d0399387a")
@WinRTInterface("7b525646829b4dccbd525a8d0399387a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectorAutomationPeerFactory.ByReference::class)
public interface ISelectorAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: Selector?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): SelectorAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectorAutomationPeerFactory> {
    public override fun getValue() = ABI.makeISelectorAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ISelectorAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectorAutomationPeerFactory {
    public val __658109786_Ptr: Pointer?

    public val _658109786_VtblPtr: Pointer?
      get() = __658109786_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: Selector?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): SelectorAutomationPeer? {
      val fnPtr = _658109786_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SelectorAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__658109786_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SelectorAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ISelectorAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __658109786_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectorAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b525646829b4dccbd525a8d0399387a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectorAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ISelectorAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectorAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeISelectorAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISelectorAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__658109786_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectorAutomationPeerFactory):
        Array<ISelectorAutomationPeerFactory?> = (elements as
        Array<ISelectorAutomationPeerFactory?>).castToImpl<ISelectorAutomationPeerFactory,ISelectorAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectorAutomationPeerFactory?> =
        arrayOfNulls<ISelectorAutomationPeerFactory_Impl>(size) as
        Array<ISelectorAutomationPeerFactory?>
  }
}
