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

@ABIMarker(IInputDesktopResourceCursor.ABI::class)
@Signature("{1df2777f-7c90-58fc-a7a3-d5736c6510fd}")
@Guid("1df2777f7c9058fca7a3d5736c6510fd")
@WinRTInterface("1df2777f7c9058fca7a3d5736c6510fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputDesktopResourceCursor.ByReference::class)
public interface IInputDesktopResourceCursor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ModuleName(): String?

  @InterfaceMethod(1)
  public fun get_ResourceId(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputDesktopResourceCursor> {
    public override fun getValue() = ABI.makeIInputDesktopResourceCursor(pointer.getPointer(0))

    public fun setValue(value: IInputDesktopResourceCursor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputDesktopResourceCursor {
    public val __263382321_Ptr: Pointer?

    public val _263382321_VtblPtr: Pointer?
      get() = __263382321_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ModuleName(): String? {
      val fnPtr = _263382321_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__263382321_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ResourceId(): WinDef.UINT {
      val fnPtr = _263382321_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__263382321_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IInputDesktopResourceCursor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __263382321_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputDesktopResourceCursor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1df2777f7c9058fca7a3d5736c6510fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputDesktopResourceCursor(ptr: Pointer?): WithDefault =
        IInputDesktopResourceCursor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputDesktopResourceCursor {
      val address = segment.toRawLongValue()
      return makeIInputDesktopResourceCursor(Pointer(address))
    }

    public override fun toNative(obj: IInputDesktopResourceCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__263382321_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputDesktopResourceCursor):
        Array<IInputDesktopResourceCursor?> = (elements as
        Array<IInputDesktopResourceCursor?>).castToImpl<IInputDesktopResourceCursor,IInputDesktopResourceCursor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputDesktopResourceCursor?> =
        arrayOfNulls<IInputDesktopResourceCursor_Impl>(size) as Array<IInputDesktopResourceCursor?>
  }
}
