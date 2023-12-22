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

@ABIMarker(IInputLightDismissActionStatics.ABI::class)
@Signature("{ed9b8def-6496-5169-984d-d44b4e690623}")
@Guid("ed9b8def64965169984dd44b4e690623")
@WinRTInterface("ed9b8def64965169984dd44b4e690623")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputLightDismissActionStatics.ByReference::class)
public interface IInputLightDismissActionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForWindowId(windowId: WindowId?): InputLightDismissAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputLightDismissActionStatics> {
    public override fun getValue() = ABI.makeIInputLightDismissActionStatics(pointer.getPointer(0))

    public fun setValue(value: IInputLightDismissActionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputLightDismissActionStatics {
    public val __1319075722_Ptr: Pointer?

    public val _1319075722_VtblPtr: Pointer?
      get() = __1319075722_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForWindowId(windowId: WindowId?): InputLightDismissAction? {
      val fnPtr = _1319075722_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputLightDismissAction>()
      val hr = fn.invokeHR(arrayOf(__1319075722_Ptr, marshalToNative(windowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputLightDismissAction>(result.getValue())
      return resultValue
    }
  }

  public class IInputLightDismissActionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1319075722_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputLightDismissActionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed9b8def64965169984dd44b4e690623")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputLightDismissActionStatics(ptr: Pointer?): WithDefault =
        IInputLightDismissActionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputLightDismissActionStatics {
      val address = segment.toRawLongValue()
      return makeIInputLightDismissActionStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputLightDismissActionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1319075722_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputLightDismissActionStatics):
        Array<IInputLightDismissActionStatics?> = (elements as
        Array<IInputLightDismissActionStatics?>).castToImpl<IInputLightDismissActionStatics,IInputLightDismissActionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputLightDismissActionStatics?> =
        arrayOfNulls<IInputLightDismissActionStatics_Impl>(size) as
        Array<IInputLightDismissActionStatics?>
  }
}
