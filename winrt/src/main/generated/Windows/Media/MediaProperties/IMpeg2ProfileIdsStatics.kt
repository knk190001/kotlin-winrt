package Windows.Media.MediaProperties

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

@ABIMarker(IMpeg2ProfileIdsStatics.ABI::class)
@Signature("{a461ff85-e57a-4128-9b21-d5331b04235c}")
@Guid("a461ff85e57a41289b21d5331b04235c")
@WinRTInterface("a461ff85e57a41289b21d5331b04235c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMpeg2ProfileIdsStatics.ByReference::class)
public interface IMpeg2ProfileIdsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Simple(): Int

  @InterfaceMethod(1)
  public fun get_Main(): Int

  @InterfaceMethod(2)
  public fun get_SignalNoiseRatioScalable(): Int

  @InterfaceMethod(3)
  public fun get_SpatiallyScalable(): Int

  @InterfaceMethod(4)
  public fun get_High(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMpeg2ProfileIdsStatics> {
    public override fun getValue() = ABI.makeIMpeg2ProfileIdsStatics(pointer.getPointer(0))

    public fun setValue(value: IMpeg2ProfileIdsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMpeg2ProfileIdsStatics {
    public val __2116141424_Ptr: Pointer?

    public val _2116141424_VtblPtr: Pointer?
      get() = __2116141424_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Simple(): Int {
      val fnPtr = _2116141424_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2116141424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Main(): Int {
      val fnPtr = _2116141424_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2116141424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_SignalNoiseRatioScalable(): Int {
      val fnPtr = _2116141424_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2116141424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SpatiallyScalable(): Int {
      val fnPtr = _2116141424_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2116141424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_High(): Int {
      val fnPtr = _2116141424_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2116141424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IMpeg2ProfileIdsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2116141424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMpeg2ProfileIdsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a461ff85e57a41289b21d5331b04235c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMpeg2ProfileIdsStatics(ptr: Pointer?): WithDefault =
        IMpeg2ProfileIdsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMpeg2ProfileIdsStatics {
      val address = segment.toRawLongValue()
      return makeIMpeg2ProfileIdsStatics(Pointer(address))
    }

    public override fun toNative(obj: IMpeg2ProfileIdsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2116141424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMpeg2ProfileIdsStatics): Array<IMpeg2ProfileIdsStatics?>
        = (elements as
        Array<IMpeg2ProfileIdsStatics?>).castToImpl<IMpeg2ProfileIdsStatics,IMpeg2ProfileIdsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMpeg2ProfileIdsStatics?> =
        arrayOfNulls<IMpeg2ProfileIdsStatics_Impl>(size) as Array<IMpeg2ProfileIdsStatics?>
  }
}
