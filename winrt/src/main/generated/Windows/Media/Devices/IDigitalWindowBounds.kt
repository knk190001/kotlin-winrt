package Windows.Media.Devices

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

@ABIMarker(IDigitalWindowBounds.ABI::class)
@Signature("{dd4f21dd-d173-5c6b-8c25-bdd26d5122b1}")
@Guid("dd4f21ddd1735c6b8c25bdd26d5122b1")
@WinRTInterface("dd4f21ddd1735c6b8c25bdd26d5122b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDigitalWindowBounds.ByReference::class)
public interface IDigitalWindowBounds : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NormalizedOriginTop(): Double

  @InterfaceMethod(1)
  public fun put_NormalizedOriginTop(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_NormalizedOriginLeft(): Double

  @InterfaceMethod(3)
  public fun put_NormalizedOriginLeft(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_Scale(): Double

  @InterfaceMethod(5)
  public fun put_Scale(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDigitalWindowBounds> {
    public override fun getValue() = ABI.makeIDigitalWindowBounds(pointer.getPointer(0))

    public fun setValue(value: IDigitalWindowBounds_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDigitalWindowBounds {
    public val __590330428_Ptr: Pointer?

    public val _590330428_VtblPtr: Pointer?
      get() = __590330428_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NormalizedOriginTop(): Double {
      val fnPtr = _590330428_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__590330428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_NormalizedOriginTop(value: Double): Unit {
      val fnPtr = _590330428_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__590330428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_NormalizedOriginLeft(): Double {
      val fnPtr = _590330428_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__590330428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_NormalizedOriginLeft(value: Double): Unit {
      val fnPtr = _590330428_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__590330428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Scale(): Double {
      val fnPtr = _590330428_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__590330428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Scale(value: Double): Unit {
      val fnPtr = _590330428_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__590330428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDigitalWindowBounds_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __590330428_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDigitalWindowBounds, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd4f21ddd1735c6b8c25bdd26d5122b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDigitalWindowBounds(ptr: Pointer?): WithDefault = IDigitalWindowBounds_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDigitalWindowBounds {
      val address = segment.toRawLongValue()
      return makeIDigitalWindowBounds(Pointer(address))
    }

    public override fun toNative(obj: IDigitalWindowBounds): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__590330428_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDigitalWindowBounds): Array<IDigitalWindowBounds?> =
        (elements as
        Array<IDigitalWindowBounds?>).castToImpl<IDigitalWindowBounds,IDigitalWindowBounds_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDigitalWindowBounds?> =
        arrayOfNulls<IDigitalWindowBounds_Impl>(size) as Array<IDigitalWindowBounds?>
  }
}
