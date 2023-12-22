package Windows.Globalization.NumberFormatting

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
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INumberFormatter2.ABI::class)
@Signature("{d4a8c1f0-80d0-4b0d-a89e-882c1e8f8310}")
@Guid("d4a8c1f080d04b0da89e882c1e8f8310")
@WinRTInterface("d4a8c1f080d04b0da89e882c1e8f8310")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumberFormatter2.ByReference::class)
public interface INumberFormatter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FormatInt(value: Long): String?

  @InterfaceMethod(1)
  public fun FormatUInt(value: WinDef.ULONG): String?

  @InterfaceMethod(2)
  public fun FormatDouble(value: Double): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INumberFormatter2> {
    public override fun getValue() = ABI.makeINumberFormatter2(pointer.getPointer(0))

    public fun setValue(value: INumberFormatter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumberFormatter2 {
    public val __151748692_Ptr: Pointer?

    public val _151748692_VtblPtr: Pointer?
      get() = __151748692_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FormatInt(value: Long): String? {
      val fnPtr = _151748692_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__151748692_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FormatUInt(value: WinDef.ULONG): String? {
      val fnPtr = _151748692_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__151748692_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FormatDouble(value: Double): String? {
      val fnPtr = _151748692_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__151748692_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class INumberFormatter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __151748692_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumberFormatter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4a8c1f080d04b0da89e882c1e8f8310")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumberFormatter2(ptr: Pointer?): WithDefault = INumberFormatter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumberFormatter2 {
      val address = segment.toRawLongValue()
      return makeINumberFormatter2(Pointer(address))
    }

    public override fun toNative(obj: INumberFormatter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__151748692_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumberFormatter2): Array<INumberFormatter2?> = (elements
        as Array<INumberFormatter2?>).castToImpl<INumberFormatter2,INumberFormatter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumberFormatter2?> =
        arrayOfNulls<INumberFormatter2_Impl>(size) as Array<INumberFormatter2?>
  }
}
