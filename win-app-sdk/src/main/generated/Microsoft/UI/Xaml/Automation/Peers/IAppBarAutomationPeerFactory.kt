package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.AppBar
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

@ABIMarker(IAppBarAutomationPeerFactory.ABI::class)
@Signature("{64f68ce4-ad2d-5c18-abc0-d0157cc63088}")
@Guid("64f68ce4ad2d5c18abc0d0157cc63088")
@WinRTInterface("64f68ce4ad2d5c18abc0d0157cc63088")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarAutomationPeerFactory.ByReference::class)
public interface IAppBarAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: AppBar?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): AppBarAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIAppBarAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IAppBarAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarAutomationPeerFactory {
    public val __2126309724_Ptr: Pointer?

    public val _2126309724_VtblPtr: Pointer?
      get() = __2126309724_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: AppBar?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): AppBarAutomationPeer? {
      val fnPtr = _2126309724_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__2126309724_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2126309724_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64f68ce4ad2d5c18abc0d0157cc63088")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IAppBarAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIAppBarAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppBarAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2126309724_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarAutomationPeerFactory):
        Array<IAppBarAutomationPeerFactory?> = (elements as
        Array<IAppBarAutomationPeerFactory?>).castToImpl<IAppBarAutomationPeerFactory,IAppBarAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarAutomationPeerFactory?> =
        arrayOfNulls<IAppBarAutomationPeerFactory_Impl>(size) as
        Array<IAppBarAutomationPeerFactory?>
  }
}
