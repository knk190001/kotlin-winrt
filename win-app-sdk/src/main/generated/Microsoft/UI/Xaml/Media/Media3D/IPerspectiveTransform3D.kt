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

@ABIMarker(IPerspectiveTransform3D.ABI::class)
@Signature("{4006cc46-684e-54ea-a421-dae5b0556b85}")
@Guid("4006cc46684e54eaa421dae5b0556b85")
@WinRTInterface("4006cc46684e54eaa421dae5b0556b85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerspectiveTransform3D.ByReference::class)
public interface IPerspectiveTransform3D : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Depth(): Double

  @InterfaceMethod(1)
  public fun put_Depth(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_OffsetX(): Double

  @InterfaceMethod(3)
  public fun put_OffsetX(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_OffsetY(): Double

  @InterfaceMethod(5)
  public fun put_OffsetY(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerspectiveTransform3D> {
    public override fun getValue() = ABI.makeIPerspectiveTransform3D(pointer.getPointer(0))

    public fun setValue(value: IPerspectiveTransform3D_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerspectiveTransform3D {
    public val __1102153547_Ptr: Pointer?

    public val _1102153547_VtblPtr: Pointer?
      get() = __1102153547_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Depth(): Double {
      val fnPtr = _1102153547_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1102153547_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Depth(value: Double): Unit {
      val fnPtr = _1102153547_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1102153547_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OffsetX(): Double {
      val fnPtr = _1102153547_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1102153547_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_OffsetX(value: Double): Unit {
      val fnPtr = _1102153547_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1102153547_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OffsetY(): Double {
      val fnPtr = _1102153547_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1102153547_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_OffsetY(value: Double): Unit {
      val fnPtr = _1102153547_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1102153547_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPerspectiveTransform3D_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1102153547_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerspectiveTransform3D, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4006cc46684e54eaa421dae5b0556b85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerspectiveTransform3D(ptr: Pointer?): WithDefault =
        IPerspectiveTransform3D_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerspectiveTransform3D {
      val address = segment.toRawLongValue()
      return makeIPerspectiveTransform3D(Pointer(address))
    }

    public override fun toNative(obj: IPerspectiveTransform3D): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1102153547_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerspectiveTransform3D): Array<IPerspectiveTransform3D?>
        = (elements as
        Array<IPerspectiveTransform3D?>).castToImpl<IPerspectiveTransform3D,IPerspectiveTransform3D_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerspectiveTransform3D?> =
        arrayOfNulls<IPerspectiveTransform3D_Impl>(size) as Array<IPerspectiveTransform3D?>
  }
}
