package Microsoft.UI.Xaml.Media

import Windows.UI.Color
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

@ABIMarker(IGradientStop.ABI::class)
@Signature("{48bcb039-e8e1-5743-94c3-f766011d3b5d}")
@Guid("48bcb039e8e1574394c3f766011d3b5d")
@WinRTInterface("48bcb039e8e1574394c3f766011d3b5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGradientStop.ByReference::class)
public interface IGradientStop : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): Color?

  @InterfaceMethod(1)
  public fun put_Color(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_Offset(): Double

  @InterfaceMethod(3)
  public fun put_Offset(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGradientStop>
      {
    public override fun getValue() = ABI.makeIGradientStop(pointer.getPointer(0))

    public fun setValue(value: IGradientStop_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGradientStop {
    public val __907186691_Ptr: Pointer?

    public val _907186691_VtblPtr: Pointer?
      get() = __907186691_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): Color? {
      val fnPtr = _907186691_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__907186691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _907186691_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__907186691_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Offset(): Double {
      val fnPtr = _907186691_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__907186691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Offset(value: Double): Unit {
      val fnPtr = _907186691_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__907186691_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGradientStop_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __907186691_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGradientStop, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48bcb039e8e1574394c3f766011d3b5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGradientStop(ptr: Pointer?): WithDefault = IGradientStop_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGradientStop {
      val address = segment.toRawLongValue()
      return makeIGradientStop(Pointer(address))
    }

    public override fun toNative(obj: IGradientStop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__907186691_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGradientStop): Array<IGradientStop?> = (elements as
        Array<IGradientStop?>).castToImpl<IGradientStop,IGradientStop_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGradientStop?> =
        arrayOfNulls<IGradientStop_Impl>(size) as Array<IGradientStop?>
  }
}
