package Windows.UI.Xaml.Controls

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

@ABIMarker(IDropDownButtonAutomationPeerFactory.ABI::class)
@Signature("{b8c449b2-6354-5c0c-9e95-e0c99a293a44}")
@Guid("b8c449b263545c0c9e95e0c99a293a44")
@WinRTInterface("b8c449b263545c0c9e95e0c99a293a44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropDownButtonAutomationPeerFactory.ByReference::class)
public interface IDropDownButtonAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: DropDownButton?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): DropDownButtonAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDropDownButtonAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIDropDownButtonAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IDropDownButtonAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropDownButtonAutomationPeerFactory {
    public val __169121554_Ptr: Pointer?

    public val _169121554_VtblPtr: Pointer?
      get() = __169121554_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: DropDownButton?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): DropDownButtonAutomationPeer? {
      val fnPtr = _169121554_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DropDownButtonAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__169121554_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DropDownButtonAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IDropDownButtonAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __169121554_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropDownButtonAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8c449b263545c0c9e95e0c99a293a44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropDownButtonAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IDropDownButtonAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropDownButtonAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIDropDownButtonAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IDropDownButtonAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__169121554_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropDownButtonAutomationPeerFactory):
        Array<IDropDownButtonAutomationPeerFactory?> = (elements as
        Array<IDropDownButtonAutomationPeerFactory?>).castToImpl<IDropDownButtonAutomationPeerFactory,IDropDownButtonAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropDownButtonAutomationPeerFactory?> =
        arrayOfNulls<IDropDownButtonAutomationPeerFactory_Impl>(size) as
        Array<IDropDownButtonAutomationPeerFactory?>
  }
}
