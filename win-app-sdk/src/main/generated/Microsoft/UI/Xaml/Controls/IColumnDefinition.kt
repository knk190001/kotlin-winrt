package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.GridLength
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

@ABIMarker(IColumnDefinition.ABI::class)
@Signature("{454cea14-87ec-5890-bb62-f1d82a94758e}")
@Guid("454cea1487ec5890bb62f1d82a94758e")
@WinRTInterface("454cea1487ec5890bb62f1d82a94758e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColumnDefinition.ByReference::class)
public interface IColumnDefinition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Width(): GridLength?

  @InterfaceMethod(1)
  public fun put_Width(value: GridLength?): Unit

  @InterfaceMethod(2)
  public fun get_MaxWidth(): Double

  @InterfaceMethod(3)
  public fun put_MaxWidth(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_MinWidth(): Double

  @InterfaceMethod(5)
  public fun put_MinWidth(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_ActualWidth(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColumnDefinition> {
    public override fun getValue() = ABI.makeIColumnDefinition(pointer.getPointer(0))

    public fun setValue(value: IColumnDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColumnDefinition {
    public val __1549504784_Ptr: Pointer?

    public val _1549504784_VtblPtr: Pointer?
      get() = __1549504784_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Width(): GridLength? {
      val fnPtr = _1549504784_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridLength>()
      val hr = fn.invokeHR(arrayOf(__1549504784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridLength>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Width(value: GridLength?): Unit {
      val fnPtr = _1549504784_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1549504784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxWidth(): Double {
      val fnPtr = _1549504784_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1549504784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MaxWidth(value: Double): Unit {
      val fnPtr = _1549504784_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1549504784_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MinWidth(): Double {
      val fnPtr = _1549504784_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1549504784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MinWidth(value: Double): Unit {
      val fnPtr = _1549504784_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1549504784_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ActualWidth(): Double {
      val fnPtr = _1549504784_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1549504784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IColumnDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1549504784_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColumnDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("454cea1487ec5890bb62f1d82a94758e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColumnDefinition(ptr: Pointer?): WithDefault = IColumnDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColumnDefinition {
      val address = segment.toRawLongValue()
      return makeIColumnDefinition(Pointer(address))
    }

    public override fun toNative(obj: IColumnDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1549504784_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColumnDefinition): Array<IColumnDefinition?> = (elements
        as Array<IColumnDefinition?>).castToImpl<IColumnDefinition,IColumnDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColumnDefinition?> =
        arrayOfNulls<IColumnDefinition_Impl>(size) as Array<IColumnDefinition?>
  }
}
