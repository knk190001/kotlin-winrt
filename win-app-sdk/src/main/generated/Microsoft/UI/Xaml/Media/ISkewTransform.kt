package Microsoft.UI.Xaml.Media

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

@ABIMarker(ISkewTransform.ABI::class)
@Signature("{230abaa6-a9b6-5210-873f-36bea29d7c06}")
@Guid("230abaa6a9b65210873f36bea29d7c06")
@WinRTInterface("230abaa6a9b65210873f36bea29d7c06")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISkewTransform.ByReference::class)
public interface ISkewTransform : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterX(): Double

  @InterfaceMethod(1)
  public fun put_CenterX(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_CenterY(): Double

  @InterfaceMethod(3)
  public fun put_CenterY(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_AngleX(): Double

  @InterfaceMethod(5)
  public fun put_AngleX(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_AngleY(): Double

  @InterfaceMethod(7)
  public fun put_AngleY(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISkewTransform>
      {
    public override fun getValue() = ABI.makeISkewTransform(pointer.getPointer(0))

    public fun setValue(value: ISkewTransform_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISkewTransform {
    public val __1580159217_Ptr: Pointer?

    public val _1580159217_VtblPtr: Pointer?
      get() = __1580159217_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterX(): Double {
      val fnPtr = _1580159217_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1580159217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CenterX(value: Double): Unit {
      val fnPtr = _1580159217_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1580159217_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CenterY(): Double {
      val fnPtr = _1580159217_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1580159217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CenterY(value: Double): Unit {
      val fnPtr = _1580159217_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1580159217_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AngleX(): Double {
      val fnPtr = _1580159217_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1580159217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AngleX(value: Double): Unit {
      val fnPtr = _1580159217_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1580159217_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AngleY(): Double {
      val fnPtr = _1580159217_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1580159217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_AngleY(value: Double): Unit {
      val fnPtr = _1580159217_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1580159217_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISkewTransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1580159217_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISkewTransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("230abaa6a9b65210873f36bea29d7c06")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISkewTransform(ptr: Pointer?): WithDefault = ISkewTransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISkewTransform {
      val address = segment.toRawLongValue()
      return makeISkewTransform(Pointer(address))
    }

    public override fun toNative(obj: ISkewTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1580159217_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISkewTransform): Array<ISkewTransform?> = (elements as
        Array<ISkewTransform?>).castToImpl<ISkewTransform,ISkewTransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISkewTransform?> =
        arrayOfNulls<ISkewTransform_Impl>(size) as Array<ISkewTransform?>
  }
}
