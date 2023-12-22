package Windows.Media.DialProtocol

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

@ABIMarker(IDialDevice.ABI::class)
@Signature("{fff0edaf-759f-41d2-a20a-7f29ce0b3784}")
@Guid("fff0edaf759f41d2a20a7f29ce0b3784")
@WinRTInterface("fff0edaf759f41d2a20a7f29ce0b3784")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialDevice.ByReference::class)
public interface IDialDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun GetDialApp(appName: String?): DialApp?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDialDevice> {
    public override fun getValue() = ABI.makeIDialDevice(pointer.getPointer(0))

    public fun setValue(value: IDialDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialDevice {
    public val __1793268050_Ptr: Pointer?

    public val _1793268050_VtblPtr: Pointer?
      get() = __1793268050_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1793268050_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1793268050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDialApp(appName: String?): DialApp? {
      val fnPtr = _1793268050_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DialApp>()
      val hr = fn.invokeHR(arrayOf(__1793268050_Ptr, marshalToNative(appName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DialApp>(result.getValue())
      return resultValue
    }
  }

  public class IDialDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1793268050_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fff0edaf759f41d2a20a7f29ce0b3784")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialDevice(ptr: Pointer?): WithDefault = IDialDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialDevice {
      val address = segment.toRawLongValue()
      return makeIDialDevice(Pointer(address))
    }

    public override fun toNative(obj: IDialDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1793268050_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialDevice): Array<IDialDevice?> = (elements as
        Array<IDialDevice?>).castToImpl<IDialDevice,IDialDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialDevice?> =
        arrayOfNulls<IDialDevice_Impl>(size) as Array<IDialDevice?>
  }
}
