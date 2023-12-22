package Windows.UI.Core

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreCursor.ABI::class)
@Signature("{96893acf-111d-442c-8a77-b87992f8e2d6}")
@Guid("96893acf111d442c8a77b87992f8e2d6")
@WinRTInterface("96893acf111d442c8a77b87992f8e2d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreCursor.ByReference::class)
public interface ICoreCursor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Type(): CoreCursorType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICoreCursor> {
    public override fun getValue() = ABI.makeICoreCursor(pointer.getPointer(0))

    public fun setValue(value: ICoreCursor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreCursor {
    public val __376155632_Ptr: Pointer?

    public val _376155632_VtblPtr: Pointer?
      get() = __376155632_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _376155632_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__376155632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Type(): CoreCursorType? {
      val fnPtr = _376155632_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreCursorType>()
      val hr = fn.invokeHR(arrayOf(__376155632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreCursorType>(result.getValue())
      return resultValue
    }
  }

  public class ICoreCursor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __376155632_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreCursor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96893acf111d442c8a77b87992f8e2d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreCursor(ptr: Pointer?): WithDefault = ICoreCursor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreCursor {
      val address = segment.toRawLongValue()
      return makeICoreCursor(Pointer(address))
    }

    public override fun toNative(obj: ICoreCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__376155632_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreCursor): Array<ICoreCursor?> = (elements as
        Array<ICoreCursor?>).castToImpl<ICoreCursor,ICoreCursor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreCursor?> =
        arrayOfNulls<ICoreCursor_Impl>(size) as Array<ICoreCursor?>
  }
}
