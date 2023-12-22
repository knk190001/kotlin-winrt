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
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INumberRounder.ABI::class)
@Signature("{5473c375-38ed-4631-b80c-ef34fc48b7f5}")
@Guid("5473c37538ed4631b80cef34fc48b7f5")
@WinRTInterface("5473c37538ed4631b80cef34fc48b7f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumberRounder.ByReference::class)
public interface INumberRounder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RoundInt32(value: Int): Int

  @InterfaceMethod(1)
  public fun RoundUInt32(value: WinDef.UINT): WinDef.UINT

  @InterfaceMethod(2)
  public fun RoundInt64(value: Long): Long

  @InterfaceMethod(3)
  public fun RoundUInt64(value: WinDef.ULONG): WinDef.ULONG

  @InterfaceMethod(4)
  public fun RoundSingle(value: Float): Float

  @InterfaceMethod(5)
  public fun RoundDouble(value: Double): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<INumberRounder>
      {
    public override fun getValue() = ABI.makeINumberRounder(pointer.getPointer(0))

    public fun setValue(value: INumberRounder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumberRounder {
    public val __653821297_Ptr: Pointer?

    public val _653821297_VtblPtr: Pointer?
      get() = __653821297_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RoundInt32(value: Int): Int {
      val fnPtr = _653821297_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__653821297_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun RoundUInt32(value: WinDef.UINT): WinDef.UINT {
      val fnPtr = _653821297_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__653821297_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun RoundInt64(value: Long): Long {
      val fnPtr = _653821297_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__653821297_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun RoundUInt64(value: WinDef.ULONG): WinDef.ULONG {
      val fnPtr = _653821297_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__653821297_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun RoundSingle(value: Float): Float {
      val fnPtr = _653821297_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__653821297_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun RoundDouble(value: Double): Double {
      val fnPtr = _653821297_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__653821297_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class INumberRounder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __653821297_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumberRounder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5473c37538ed4631b80cef34fc48b7f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumberRounder(ptr: Pointer?): WithDefault = INumberRounder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumberRounder {
      val address = segment.toRawLongValue()
      return makeINumberRounder(Pointer(address))
    }

    public override fun toNative(obj: INumberRounder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__653821297_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumberRounder): Array<INumberRounder?> = (elements as
        Array<INumberRounder?>).castToImpl<INumberRounder,INumberRounder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumberRounder?> =
        arrayOfNulls<INumberRounder_Impl>(size) as Array<INumberRounder?>
  }
}
