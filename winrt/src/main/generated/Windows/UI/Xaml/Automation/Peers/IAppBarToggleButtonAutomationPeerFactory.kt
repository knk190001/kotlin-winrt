package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.AppBarToggleButton
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

@ABIMarker(IAppBarToggleButtonAutomationPeerFactory.ABI::class)
@Signature("{d6f9139d-02c1-4221-9591-7d4efeb74701}")
@Guid("d6f9139d02c1422195917d4efeb74701")
@WinRTInterface("d6f9139d02c1422195917d4efeb74701")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButtonAutomationPeerFactory.ByReference::class)
public interface IAppBarToggleButtonAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: AppBarToggleButton?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): AppBarToggleButtonAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButtonAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIAppBarToggleButtonAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButtonAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButtonAutomationPeerFactory {
    public val __925178399_Ptr: Pointer?

    public val _925178399_VtblPtr: Pointer?
      get() = __925178399_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: AppBarToggleButton?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): AppBarToggleButtonAutomationPeer? {
      val fnPtr = _925178399_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarToggleButtonAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__925178399_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarToggleButtonAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarToggleButtonAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __925178399_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButtonAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d6f9139d02c1422195917d4efeb74701")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButtonAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IAppBarToggleButtonAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBarToggleButtonAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButtonAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButtonAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__925178399_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButtonAutomationPeerFactory):
        Array<IAppBarToggleButtonAutomationPeerFactory?> = (elements as
        Array<IAppBarToggleButtonAutomationPeerFactory?>).castToImpl<IAppBarToggleButtonAutomationPeerFactory,IAppBarToggleButtonAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButtonAutomationPeerFactory?> =
        arrayOfNulls<IAppBarToggleButtonAutomationPeerFactory_Impl>(size) as
        Array<IAppBarToggleButtonAutomationPeerFactory?>
  }
}
