package Microsoft.UI.Input

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInputDesktopNamedResourceCursorStatics.ABI::class)
@Signature("{e8b6d5aa-898b-5e69-b01f-383a0943e3e4}")
@Guid("e8b6d5aa898b5e69b01f383a0943e3e4")
@WinRTInterface("e8b6d5aa898b5e69b01f383a0943e3e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputDesktopNamedResourceCursorStatics.ByReference::class)
public interface IInputDesktopNamedResourceCursorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(resourceName: String?): InputDesktopNamedResourceCursor?

  @InterfaceMethod(1)
  public fun CreateFromModule(moduleName: String?, resourceName: String?):
      InputDesktopNamedResourceCursor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputDesktopNamedResourceCursorStatics> {
    public override fun getValue() =
        ABI.makeIInputDesktopNamedResourceCursorStatics(pointer.getPointer(0))

    public fun setValue(value: IInputDesktopNamedResourceCursorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputDesktopNamedResourceCursorStatics {
    public val __1369330099_Ptr: Pointer?

    public val _1369330099_VtblPtr: Pointer?
      get() = __1369330099_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(resourceName: String?): InputDesktopNamedResourceCursor? {
      val fnPtr = _1369330099_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputDesktopNamedResourceCursor>()
      val hr = fn.invokeHR(arrayOf(__1369330099_Ptr, marshalToNative(resourceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputDesktopNamedResourceCursor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromModule(moduleName: String?, resourceName: String?):
        InputDesktopNamedResourceCursor? {
      val fnPtr = _1369330099_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputDesktopNamedResourceCursor>()
      val hr = fn.invokeHR(arrayOf(__1369330099_Ptr, marshalToNative(moduleName),
          marshalToNative(resourceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputDesktopNamedResourceCursor>(result.getValue())
      return resultValue
    }
  }

  public class IInputDesktopNamedResourceCursorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1369330099_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputDesktopNamedResourceCursorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8b6d5aa898b5e69b01f383a0943e3e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputDesktopNamedResourceCursorStatics(ptr: Pointer?): WithDefault =
        IInputDesktopNamedResourceCursorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInputDesktopNamedResourceCursorStatics {
      val address = segment.toRawLongValue()
      return makeIInputDesktopNamedResourceCursorStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputDesktopNamedResourceCursorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1369330099_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputDesktopNamedResourceCursorStatics):
        Array<IInputDesktopNamedResourceCursorStatics?> = (elements as
        Array<IInputDesktopNamedResourceCursorStatics?>).castToImpl<IInputDesktopNamedResourceCursorStatics,IInputDesktopNamedResourceCursorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputDesktopNamedResourceCursorStatics?> =
        arrayOfNulls<IInputDesktopNamedResourceCursorStatics_Impl>(size) as
        Array<IInputDesktopNamedResourceCursorStatics?>
  }
}
