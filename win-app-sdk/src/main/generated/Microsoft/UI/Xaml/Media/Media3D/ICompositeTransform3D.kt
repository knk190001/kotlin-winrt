package Microsoft.UI.Xaml.Media.Media3D

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

@ABIMarker(ICompositeTransform3D.ABI::class)
@Signature("{cbaf163f-c254-5dcf-8ae4-40e21ce1b4ca}")
@Guid("cbaf163fc2545dcf8ae440e21ce1b4ca")
@WinRTInterface("cbaf163fc2545dcf8ae440e21ce1b4ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositeTransform3D.ByReference::class)
public interface ICompositeTransform3D : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterX(): Double

  @InterfaceMethod(1)
  public fun put_CenterX(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_CenterY(): Double

  @InterfaceMethod(3)
  public fun put_CenterY(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_CenterZ(): Double

  @InterfaceMethod(5)
  public fun put_CenterZ(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_RotationX(): Double

  @InterfaceMethod(7)
  public fun put_RotationX(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_RotationY(): Double

  @InterfaceMethod(9)
  public fun put_RotationY(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_RotationZ(): Double

  @InterfaceMethod(11)
  public fun put_RotationZ(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_ScaleX(): Double

  @InterfaceMethod(13)
  public fun put_ScaleX(value: Double): Unit

  @InterfaceMethod(14)
  public fun get_ScaleY(): Double

  @InterfaceMethod(15)
  public fun put_ScaleY(value: Double): Unit

  @InterfaceMethod(16)
  public fun get_ScaleZ(): Double

  @InterfaceMethod(17)
  public fun put_ScaleZ(value: Double): Unit

  @InterfaceMethod(18)
  public fun get_TranslateX(): Double

  @InterfaceMethod(19)
  public fun put_TranslateX(value: Double): Unit

  @InterfaceMethod(20)
  public fun get_TranslateY(): Double

  @InterfaceMethod(21)
  public fun put_TranslateY(value: Double): Unit

  @InterfaceMethod(22)
  public fun get_TranslateZ(): Double

  @InterfaceMethod(23)
  public fun put_TranslateZ(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositeTransform3D> {
    public override fun getValue() = ABI.makeICompositeTransform3D(pointer.getPointer(0))

    public fun setValue(value: ICompositeTransform3D_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositeTransform3D {
    public val __485929824_Ptr: Pointer?

    public val _485929824_VtblPtr: Pointer?
      get() = __485929824_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterX(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CenterX(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CenterY(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CenterY(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CenterZ(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_CenterZ(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RotationX(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_RotationX(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_RotationY(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_RotationY(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_RotationZ(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_RotationZ(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ScaleX(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_ScaleX(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ScaleY(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_ScaleY(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ScaleZ(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_ScaleZ(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_TranslateX(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_TranslateX(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_TranslateY(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_TranslateY(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_TranslateZ(): Double {
      val fnPtr = _485929824_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_TranslateZ(value: Double): Unit {
      val fnPtr = _485929824_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__485929824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositeTransform3D_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __485929824_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositeTransform3D, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cbaf163fc2545dcf8ae440e21ce1b4ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositeTransform3D(ptr: Pointer?): WithDefault =
        ICompositeTransform3D_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositeTransform3D {
      val address = segment.toRawLongValue()
      return makeICompositeTransform3D(Pointer(address))
    }

    public override fun toNative(obj: ICompositeTransform3D): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__485929824_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositeTransform3D): Array<ICompositeTransform3D?> =
        (elements as
        Array<ICompositeTransform3D?>).castToImpl<ICompositeTransform3D,ICompositeTransform3D_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositeTransform3D?> =
        arrayOfNulls<ICompositeTransform3D_Impl>(size) as Array<ICompositeTransform3D?>
  }
}
