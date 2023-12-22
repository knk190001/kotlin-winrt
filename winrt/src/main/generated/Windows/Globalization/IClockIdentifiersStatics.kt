package Windows.Globalization

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

@ABIMarker(IClockIdentifiersStatics.ABI::class)
@Signature("{523805bb-12ec-4f83-bc31-b1b4376b0808}")
@Guid("523805bb12ec4f83bc31b1b4376b0808")
@WinRTInterface("523805bb12ec4f83bc31b1b4376b0808")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClockIdentifiersStatics.ByReference::class)
public interface IClockIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TwelveHour(): String?

  @InterfaceMethod(1)
  public fun get_TwentyFourHour(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClockIdentifiersStatics> {
    public override fun getValue() = ABI.makeIClockIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IClockIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClockIdentifiersStatics {
    public val __312895126_Ptr: Pointer?

    public val _312895126_VtblPtr: Pointer?
      get() = __312895126_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TwelveHour(): String? {
      val fnPtr = _312895126_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__312895126_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TwentyFourHour(): String? {
      val fnPtr = _312895126_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__312895126_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IClockIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __312895126_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClockIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("523805bb12ec4f83bc31b1b4376b0808")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClockIdentifiersStatics(ptr: Pointer?): WithDefault =
        IClockIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClockIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIClockIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IClockIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__312895126_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClockIdentifiersStatics):
        Array<IClockIdentifiersStatics?> = (elements as
        Array<IClockIdentifiersStatics?>).castToImpl<IClockIdentifiersStatics,IClockIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClockIdentifiersStatics?> =
        arrayOfNulls<IClockIdentifiersStatics_Impl>(size) as Array<IClockIdentifiersStatics?>
  }
}
