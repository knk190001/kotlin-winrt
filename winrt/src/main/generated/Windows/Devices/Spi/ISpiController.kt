package Windows.Devices.Spi

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

@ABIMarker(ISpiController.ABI::class)
@Signature("{a8d3c829-9895-4159-a934-8741f1ee6d27}")
@Guid("a8d3c82998954159a9348741f1ee6d27")
@WinRTInterface("a8d3c82998954159a9348741f1ee6d27")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpiController.ByReference::class)
public interface ISpiController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDevice(settings: SpiConnectionSettings?): SpiDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpiController>
      {
    public override fun getValue() = ABI.makeISpiController(pointer.getPointer(0))

    public fun setValue(value: ISpiController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpiController {
    public val __716528239_Ptr: Pointer?

    public val _716528239_VtblPtr: Pointer?
      get() = __716528239_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDevice(settings: SpiConnectionSettings?): SpiDevice? {
      val fnPtr = _716528239_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpiDevice>()
      val hr = fn.invokeHR(arrayOf(__716528239_Ptr, marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpiDevice>(result.getValue())
      return resultValue
    }
  }

  public class ISpiController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __716528239_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpiController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a8d3c82998954159a9348741f1ee6d27")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpiController(ptr: Pointer?): WithDefault = ISpiController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpiController {
      val address = segment.toRawLongValue()
      return makeISpiController(Pointer(address))
    }

    public override fun toNative(obj: ISpiController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__716528239_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpiController): Array<ISpiController?> = (elements as
        Array<ISpiController?>).castToImpl<ISpiController,ISpiController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpiController?> =
        arrayOfNulls<ISpiController_Impl>(size) as Array<ISpiController?>
  }
}
