package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IPlaneProjectionStatics.ABI::class)
@Signature("{96d86c18-90dd-564a-828a-8735e4219b1d}")
@Guid("96d86c1890dd564a828a8735e4219b1d")
@WinRTInterface("96d86c1890dd564a828a8735e4219b1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaneProjectionStatics.ByReference::class)
public interface IPlaneProjectionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalOffsetXProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_LocalOffsetYProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_LocalOffsetZProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_RotationXProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_RotationYProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_RotationZProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_CenterOfRotationXProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_CenterOfRotationYProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_CenterOfRotationZProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_GlobalOffsetXProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_GlobalOffsetYProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_GlobalOffsetZProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_ProjectionMatrixProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaneProjectionStatics> {
    public override fun getValue() = ABI.makeIPlaneProjectionStatics(pointer.getPointer(0))

    public fun setValue(value: IPlaneProjectionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaneProjectionStatics {
    public val __1508875499_Ptr: Pointer?

    public val _1508875499_VtblPtr: Pointer?
      get() = __1508875499_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalOffsetXProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LocalOffsetYProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LocalOffsetZProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RotationXProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_RotationYProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RotationZProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CenterOfRotationXProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_CenterOfRotationYProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_CenterOfRotationZProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_GlobalOffsetXProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_GlobalOffsetYProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_GlobalOffsetZProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_ProjectionMatrixProperty(): DependencyProperty? {
      val fnPtr = _1508875499_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1508875499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPlaneProjectionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1508875499_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaneProjectionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96d86c1890dd564a828a8735e4219b1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaneProjectionStatics(ptr: Pointer?): WithDefault =
        IPlaneProjectionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaneProjectionStatics {
      val address = segment.toRawLongValue()
      return makeIPlaneProjectionStatics(Pointer(address))
    }

    public override fun toNative(obj: IPlaneProjectionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1508875499_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaneProjectionStatics): Array<IPlaneProjectionStatics?>
        = (elements as
        Array<IPlaneProjectionStatics?>).castToImpl<IPlaneProjectionStatics,IPlaneProjectionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaneProjectionStatics?> =
        arrayOfNulls<IPlaneProjectionStatics_Impl>(size) as Array<IPlaneProjectionStatics?>
  }
}
