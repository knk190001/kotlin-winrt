package Windows.Devices.I2c

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

@ABIMarker(II2cController.ABI::class)
@Signature("{c48ab1b2-87a0-4166-8e3e-b4b8f97cd729}")
@Guid("c48ab1b287a041668e3eb4b8f97cd729")
@WinRTInterface("c48ab1b287a041668e3eb4b8f97cd729")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = II2cController.ByReference::class)
public interface II2cController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDevice(settings: I2cConnectionSettings?): I2cDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<II2cController>
      {
    public override fun getValue() = ABI.makeII2cController(pointer.getPointer(0))

    public fun setValue(value: II2cController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : II2cController {
    public val __1676020149_Ptr: Pointer?

    public val _1676020149_VtblPtr: Pointer?
      get() = __1676020149_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDevice(settings: I2cConnectionSettings?): I2cDevice? {
      val fnPtr = _1676020149_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<I2cDevice>()
      val hr = fn.invokeHR(arrayOf(__1676020149_Ptr, marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<I2cDevice>(result.getValue())
      return resultValue
    }
  }

  public class II2cController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1676020149_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<II2cController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c48ab1b287a041668e3eb4b8f97cd729")

    public override val layout: ValueLayout = ADDRESS

    public fun makeII2cController(ptr: Pointer?): WithDefault = II2cController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): II2cController {
      val address = segment.toRawLongValue()
      return makeII2cController(Pointer(address))
    }

    public override fun toNative(obj: II2cController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1676020149_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: II2cController): Array<II2cController?> = (elements as
        Array<II2cController?>).castToImpl<II2cController,II2cController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<II2cController?> =
        arrayOfNulls<II2cController_Impl>(size) as Array<II2cController?>
  }
}
