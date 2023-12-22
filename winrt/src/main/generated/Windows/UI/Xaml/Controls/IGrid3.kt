package Windows.UI.Xaml.Controls

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGrid3.ABI::class)
@Signature("{12dfc5fc-2342-4dd2-9e7d-2090a171d1ef}")
@Guid("12dfc5fc23424dd29e7d2090a171d1ef")
@WinRTInterface("12dfc5fc23424dd29e7d2090a171d1ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGrid3.ByReference::class)
public interface IGrid3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RowSpacing(): Double

  @InterfaceMethod(1)
  public fun put_RowSpacing(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_ColumnSpacing(): Double

  @InterfaceMethod(3)
  public fun put_ColumnSpacing(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGrid3> {
    public override fun getValue() = ABI.makeIGrid3(pointer.getPointer(0))

    public fun setValue(value: IGrid3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGrid3 {
    public val __12825361_Ptr: Pointer?

    public val _12825361_VtblPtr: Pointer?
      get() = __12825361_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RowSpacing(): Double {
      val fnPtr = _12825361_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__12825361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_RowSpacing(value: Double): Unit {
      val fnPtr = _12825361_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__12825361_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ColumnSpacing(): Double {
      val fnPtr = _12825361_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__12825361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ColumnSpacing(value: Double): Unit {
      val fnPtr = _12825361_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__12825361_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGrid3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __12825361_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGrid3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12dfc5fc23424dd29e7d2090a171d1ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGrid3(ptr: Pointer?): WithDefault = IGrid3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGrid3 {
      val address = segment.toRawLongValue()
      return makeIGrid3(Pointer(address))
    }

    public override fun toNative(obj: IGrid3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__12825361_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGrid3): Array<IGrid3?> = (elements as
        Array<IGrid3?>).castToImpl<IGrid3,IGrid3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGrid3?> = arrayOfNulls<IGrid3_Impl>(size) as
        Array<IGrid3?>
  }
}
