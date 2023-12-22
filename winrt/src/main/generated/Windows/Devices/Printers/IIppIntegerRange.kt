package Windows.Devices.Printers

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

@ABIMarker(IIppIntegerRange.ABI::class)
@Signature("{92907346-c3ea-5ed6-bdb1-3752c62c6f7f}")
@Guid("92907346c3ea5ed6bdb13752c62c6f7f")
@WinRTInterface("92907346c3ea5ed6bdb13752c62c6f7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIppIntegerRange.ByReference::class)
public interface IIppIntegerRange : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Start(): Int

  @InterfaceMethod(1)
  public fun get_End(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIppIntegerRange> {
    public override fun getValue() = ABI.makeIIppIntegerRange(pointer.getPointer(0))

    public fun setValue(value: IIppIntegerRange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIppIntegerRange {
    public val __11471404_Ptr: Pointer?

    public val _11471404_VtblPtr: Pointer?
      get() = __11471404_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Start(): Int {
      val fnPtr = _11471404_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__11471404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_End(): Int {
      val fnPtr = _11471404_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__11471404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IIppIntegerRange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __11471404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIppIntegerRange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92907346c3ea5ed6bdb13752c62c6f7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIppIntegerRange(ptr: Pointer?): WithDefault = IIppIntegerRange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIppIntegerRange {
      val address = segment.toRawLongValue()
      return makeIIppIntegerRange(Pointer(address))
    }

    public override fun toNative(obj: IIppIntegerRange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__11471404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIppIntegerRange): Array<IIppIntegerRange?> = (elements as
        Array<IIppIntegerRange?>).castToImpl<IIppIntegerRange,IIppIntegerRange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIppIntegerRange?> =
        arrayOfNulls<IIppIntegerRange_Impl>(size) as Array<IIppIntegerRange?>
  }
}
