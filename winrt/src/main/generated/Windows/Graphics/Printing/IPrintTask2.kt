package Windows.Graphics.Printing

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

@ABIMarker(IPrintTask2.ABI::class)
@Signature("{36234877-3e53-4d9d-8f5e-316ac8dedae1}")
@Guid("362348773e534d9d8f5e316ac8dedae1")
@WinRTInterface("362348773e534d9d8f5e316ac8dedae1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTask2.ByReference::class)
public interface IPrintTask2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_IsPreviewEnabled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_IsPreviewEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPrintTask2> {
    public override fun getValue() = ABI.makeIPrintTask2(pointer.getPointer(0))

    public fun setValue(value: IPrintTask2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTask2 {
    public val __1154032732_Ptr: Pointer?

    public val _1154032732_VtblPtr: Pointer?
      get() = __1154032732_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsPreviewEnabled(value: Boolean): Unit {
      val fnPtr = _1154032732_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1154032732_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_IsPreviewEnabled(): Boolean {
      val fnPtr = _1154032732_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1154032732_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrintTask2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1154032732_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTask2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("362348773e534d9d8f5e316ac8dedae1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTask2(ptr: Pointer?): WithDefault = IPrintTask2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTask2 {
      val address = segment.toRawLongValue()
      return makeIPrintTask2(Pointer(address))
    }

    public override fun toNative(obj: IPrintTask2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1154032732_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTask2): Array<IPrintTask2?> = (elements as
        Array<IPrintTask2?>).castToImpl<IPrintTask2,IPrintTask2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTask2?> =
        arrayOfNulls<IPrintTask2_Impl>(size) as Array<IPrintTask2?>
  }
}
