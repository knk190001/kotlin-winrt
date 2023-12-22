package Windows.UI.Input.Preview.Injection

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

@ABIMarker(IInputInjectorStatics.ABI::class)
@Signature("{deae6943-7402-4141-a5c6-0c01aa57b16a}")
@Guid("deae694374024141a5c60c01aa57b16a")
@WinRTInterface("deae694374024141a5c60c01aa57b16a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputInjectorStatics.ByReference::class)
public interface IInputInjectorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreate(): InputInjector?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputInjectorStatics> {
    public override fun getValue() = ABI.makeIInputInjectorStatics(pointer.getPointer(0))

    public fun setValue(value: IInputInjectorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputInjectorStatics {
    public val __965663822_Ptr: Pointer?

    public val _965663822_VtblPtr: Pointer?
      get() = __965663822_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreate(): InputInjector? {
      val fnPtr = _965663822_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputInjector>()
      val hr = fn.invokeHR(arrayOf(__965663822_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputInjector>(result.getValue())
      return resultValue
    }
  }

  public class IInputInjectorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __965663822_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputInjectorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("deae694374024141a5c60c01aa57b16a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputInjectorStatics(ptr: Pointer?): WithDefault =
        IInputInjectorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputInjectorStatics {
      val address = segment.toRawLongValue()
      return makeIInputInjectorStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputInjectorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__965663822_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputInjectorStatics): Array<IInputInjectorStatics?> =
        (elements as
        Array<IInputInjectorStatics?>).castToImpl<IInputInjectorStatics,IInputInjectorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputInjectorStatics?> =
        arrayOfNulls<IInputInjectorStatics_Impl>(size) as Array<IInputInjectorStatics?>
  }
}
