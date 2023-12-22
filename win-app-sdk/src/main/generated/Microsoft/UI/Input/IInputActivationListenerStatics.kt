package Microsoft.UI.Input

import Microsoft.UI.WindowId
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IInputActivationListenerStatics.ABI::class)
@Signature("{c4249843-f053-5c99-9d51-720ade94224d}")
@Guid("c4249843f0535c999d51720ade94224d")
@WinRTInterface("c4249843f0535c999d51720ade94224d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputActivationListenerStatics.ByReference::class)
public interface IInputActivationListenerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForWindowId(windowId: WindowId?): InputActivationListener?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputActivationListenerStatics> {
    public override fun getValue() = ABI.makeIInputActivationListenerStatics(pointer.getPointer(0))

    public fun setValue(value: IInputActivationListenerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputActivationListenerStatics {
    public val __34490250_Ptr: Pointer?

    public val _34490250_VtblPtr: Pointer?
      get() = __34490250_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForWindowId(windowId: WindowId?): InputActivationListener? {
      val fnPtr = _34490250_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputActivationListener>()
      val hr = fn.invokeHR(arrayOf(__34490250_Ptr, marshalToNative(windowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputActivationListener>(result.getValue())
      return resultValue
    }
  }

  public class IInputActivationListenerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __34490250_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputActivationListenerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4249843f0535c999d51720ade94224d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputActivationListenerStatics(ptr: Pointer?): WithDefault =
        IInputActivationListenerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputActivationListenerStatics {
      val address = segment.toRawLongValue()
      return makeIInputActivationListenerStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputActivationListenerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__34490250_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputActivationListenerStatics):
        Array<IInputActivationListenerStatics?> = (elements as
        Array<IInputActivationListenerStatics?>).castToImpl<IInputActivationListenerStatics,IInputActivationListenerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputActivationListenerStatics?> =
        arrayOfNulls<IInputActivationListenerStatics_Impl>(size) as
        Array<IInputActivationListenerStatics?>
  }
}
