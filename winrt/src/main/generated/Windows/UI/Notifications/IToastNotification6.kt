package Windows.UI.Notifications

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToastNotification6.ABI::class)
@Signature("{43ebfe53-89ae-5c1e-a279-3aecfe9b6f54}")
@Guid("43ebfe5389ae5c1ea2793aecfe9b6f54")
@WinRTInterface("43ebfe5389ae5c1ea2793aecfe9b6f54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotification6.ByReference::class)
public interface IToastNotification6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExpiresOnReboot(): Boolean

  @InterfaceMethod(1)
  public fun put_ExpiresOnReboot(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotification6> {
    public override fun getValue() = ABI.makeIToastNotification6(pointer.getPointer(0))

    public fun setValue(value: IToastNotification6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotification6 {
    public val __108921292_Ptr: Pointer?

    public val _108921292_VtblPtr: Pointer?
      get() = __108921292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExpiresOnReboot(): Boolean {
      val fnPtr = _108921292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__108921292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ExpiresOnReboot(value: Boolean): Unit {
      val fnPtr = _108921292_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__108921292_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToastNotification6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __108921292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotification6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43ebfe5389ae5c1ea2793aecfe9b6f54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotification6(ptr: Pointer?): WithDefault = IToastNotification6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotification6 {
      val address = segment.toRawLongValue()
      return makeIToastNotification6(Pointer(address))
    }

    public override fun toNative(obj: IToastNotification6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__108921292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotification6): Array<IToastNotification6?> =
        (elements as
        Array<IToastNotification6?>).castToImpl<IToastNotification6,IToastNotification6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotification6?> =
        arrayOfNulls<IToastNotification6_Impl>(size) as Array<IToastNotification6?>
  }
}
