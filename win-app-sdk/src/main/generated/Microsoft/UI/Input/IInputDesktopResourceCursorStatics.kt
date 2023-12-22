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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IInputDesktopResourceCursorStatics.ABI::class)
@Signature("{f440dc37-a0b6-56eb-bcec-b024f2233d47}")
@Guid("f440dc37a0b656ebbcecb024f2233d47")
@WinRTInterface("f440dc37a0b656ebbcecb024f2233d47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputDesktopResourceCursorStatics.ByReference::class)
public interface IInputDesktopResourceCursorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(resourceId: WinDef.UINT): InputDesktopResourceCursor?

  @InterfaceMethod(1)
  public fun CreateFromModule(moduleName: String?, resourceId: WinDef.UINT):
      InputDesktopResourceCursor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputDesktopResourceCursorStatics> {
    public override fun getValue() =
        ABI.makeIInputDesktopResourceCursorStatics(pointer.getPointer(0))

    public fun setValue(value: IInputDesktopResourceCursorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputDesktopResourceCursorStatics {
    public val __1591313910_Ptr: Pointer?

    public val _1591313910_VtblPtr: Pointer?
      get() = __1591313910_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(resourceId: WinDef.UINT): InputDesktopResourceCursor? {
      val fnPtr = _1591313910_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputDesktopResourceCursor>()
      val hr = fn.invokeHR(arrayOf(__1591313910_Ptr, resourceId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputDesktopResourceCursor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromModule(moduleName: String?, resourceId: WinDef.UINT):
        InputDesktopResourceCursor? {
      val fnPtr = _1591313910_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputDesktopResourceCursor>()
      val hr = fn.invokeHR(arrayOf(__1591313910_Ptr, marshalToNative(moduleName), resourceId,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputDesktopResourceCursor>(result.getValue())
      return resultValue
    }
  }

  public class IInputDesktopResourceCursorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1591313910_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputDesktopResourceCursorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f440dc37a0b656ebbcecb024f2233d47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputDesktopResourceCursorStatics(ptr: Pointer?): WithDefault =
        IInputDesktopResourceCursorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputDesktopResourceCursorStatics {
      val address = segment.toRawLongValue()
      return makeIInputDesktopResourceCursorStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputDesktopResourceCursorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1591313910_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputDesktopResourceCursorStatics):
        Array<IInputDesktopResourceCursorStatics?> = (elements as
        Array<IInputDesktopResourceCursorStatics?>).castToImpl<IInputDesktopResourceCursorStatics,IInputDesktopResourceCursorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputDesktopResourceCursorStatics?> =
        arrayOfNulls<IInputDesktopResourceCursorStatics_Impl>(size) as
        Array<IInputDesktopResourceCursorStatics?>
  }
}
