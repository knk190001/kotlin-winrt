package Windows.Media.Audio

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

@ABIMarker(IEqualizerBand.ABI::class)
@Signature("{c00a5a6a-262d-4b85-9bb7-43280b62ed0c}")
@Guid("c00a5a6a262d4b859bb743280b62ed0c")
@WinRTInterface("c00a5a6a262d4b859bb743280b62ed0c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEqualizerBand.ByReference::class)
public interface IEqualizerBand : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Bandwidth(): Double

  @InterfaceMethod(1)
  public fun put_Bandwidth(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_FrequencyCenter(): Double

  @InterfaceMethod(3)
  public fun put_FrequencyCenter(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_Gain(): Double

  @InterfaceMethod(5)
  public fun put_Gain(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEqualizerBand>
      {
    public override fun getValue() = ABI.makeIEqualizerBand(pointer.getPointer(0))

    public fun setValue(value: IEqualizerBand_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEqualizerBand {
    public val __1535591071_Ptr: Pointer?

    public val _1535591071_VtblPtr: Pointer?
      get() = __1535591071_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Bandwidth(): Double {
      val fnPtr = _1535591071_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1535591071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Bandwidth(value: Double): Unit {
      val fnPtr = _1535591071_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1535591071_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FrequencyCenter(): Double {
      val fnPtr = _1535591071_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1535591071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_FrequencyCenter(value: Double): Unit {
      val fnPtr = _1535591071_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1535591071_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Gain(): Double {
      val fnPtr = _1535591071_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1535591071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Gain(value: Double): Unit {
      val fnPtr = _1535591071_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1535591071_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEqualizerBand_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1535591071_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEqualizerBand, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c00a5a6a262d4b859bb743280b62ed0c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEqualizerBand(ptr: Pointer?): WithDefault = IEqualizerBand_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEqualizerBand {
      val address = segment.toRawLongValue()
      return makeIEqualizerBand(Pointer(address))
    }

    public override fun toNative(obj: IEqualizerBand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1535591071_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEqualizerBand): Array<IEqualizerBand?> = (elements as
        Array<IEqualizerBand?>).castToImpl<IEqualizerBand,IEqualizerBand_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEqualizerBand?> =
        arrayOfNulls<IEqualizerBand_Impl>(size) as Array<IEqualizerBand?>
  }
}
