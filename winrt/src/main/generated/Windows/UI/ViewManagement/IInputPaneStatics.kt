package Windows.UI.ViewManagement

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

@ABIMarker(IInputPaneStatics.ABI::class)
@Signature("{95f4af3a-ef47-424a-9741-fd2815eba2bd}")
@Guid("95f4af3aef47424a9741fd2815eba2bd")
@WinRTInterface("95f4af3aef47424a9741fd2815eba2bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputPaneStatics.ByReference::class)
public interface IInputPaneStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): InputPane?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputPaneStatics> {
    public override fun getValue() = ABI.makeIInputPaneStatics(pointer.getPointer(0))

    public fun setValue(value: IInputPaneStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputPaneStatics {
    public val __1334777947_Ptr: Pointer?

    public val _1334777947_VtblPtr: Pointer?
      get() = __1334777947_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): InputPane? {
      val fnPtr = _1334777947_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputPane>()
      val hr = fn.invokeHR(arrayOf(__1334777947_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputPane>(result.getValue())
      return resultValue
    }
  }

  public class IInputPaneStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1334777947_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputPaneStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95f4af3aef47424a9741fd2815eba2bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputPaneStatics(ptr: Pointer?): WithDefault = IInputPaneStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputPaneStatics {
      val address = segment.toRawLongValue()
      return makeIInputPaneStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputPaneStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1334777947_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputPaneStatics): Array<IInputPaneStatics?> = (elements
        as Array<IInputPaneStatics?>).castToImpl<IInputPaneStatics,IInputPaneStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputPaneStatics?> =
        arrayOfNulls<IInputPaneStatics_Impl>(size) as Array<IInputPaneStatics?>
  }
}
