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

@ABIMarker(ICoreWindowStatic.ABI::class)
@Signature("{4d239005-3c2a-41b1-9022-536bb9cf93b1}")
@Guid("4d2390053c2a41b19022536bb9cf93b1")
@WinRTInterface("4d2390053c2a41b19022536bb9cf93b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindowStatic.ByReference::class)
public interface ICoreWindowStatic : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentThread(): CoreWindow?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWindowStatic> {
    public override fun getValue() = ABI.makeICoreWindowStatic(pointer.getPointer(0))

    public fun setValue(value: ICoreWindowStatic_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindowStatic {
    public val __1119855000_Ptr: Pointer?

    public val _1119855000_VtblPtr: Pointer?
      get() = __1119855000_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentThread(): CoreWindow? {
      val fnPtr = _1119855000_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWindow>()
      val hr = fn.invokeHR(arrayOf(__1119855000_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWindow>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWindowStatic_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1119855000_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindowStatic, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d2390053c2a41b19022536bb9cf93b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindowStatic(ptr: Pointer?): WithDefault = ICoreWindowStatic_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindowStatic {
      val address = segment.toRawLongValue()
      return makeICoreWindowStatic(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindowStatic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1119855000_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindowStatic): Array<ICoreWindowStatic?> = (elements
        as Array<ICoreWindowStatic?>).castToImpl<ICoreWindowStatic,ICoreWindowStatic_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindowStatic?> =
        arrayOfNulls<ICoreWindowStatic_Impl>(size) as Array<ICoreWindowStatic?>
  }
}
