package Windows.UI.Composition

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionGeometry.ABI::class)
@Signature("{e985217c-6a17-4207-abd8-5fd3dd612a9d}")
@Guid("e985217c6a174207abd85fd3dd612a9d")
@WinRTInterface("e985217c6a174207abd85fd3dd612a9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionGeometry.ByReference::class)
public interface ICompositionGeometry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TrimEnd(): Float

  @InterfaceMethod(1)
  public fun put_TrimEnd(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_TrimOffset(): Float

  @InterfaceMethod(3)
  public fun put_TrimOffset(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_TrimStart(): Float

  @InterfaceMethod(5)
  public fun put_TrimStart(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionGeometry> {
    public override fun getValue() = ABI.makeICompositionGeometry(pointer.getPointer(0))

    public fun setValue(value: ICompositionGeometry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionGeometry {
    public val __739403314_Ptr: Pointer?

    public val _739403314_VtblPtr: Pointer?
      get() = __739403314_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TrimEnd(): Float {
      val fnPtr = _739403314_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__739403314_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_TrimEnd(value: Float): Unit {
      val fnPtr = _739403314_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__739403314_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TrimOffset(): Float {
      val fnPtr = _739403314_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__739403314_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_TrimOffset(value: Float): Unit {
      val fnPtr = _739403314_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__739403314_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TrimStart(): Float {
      val fnPtr = _739403314_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__739403314_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_TrimStart(value: Float): Unit {
      val fnPtr = _739403314_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__739403314_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionGeometry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __739403314_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionGeometry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e985217c6a174207abd85fd3dd612a9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionGeometry(ptr: Pointer?): WithDefault = ICompositionGeometry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionGeometry {
      val address = segment.toRawLongValue()
      return makeICompositionGeometry(Pointer(address))
    }

    public override fun toNative(obj: ICompositionGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__739403314_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionGeometry): Array<ICompositionGeometry?> =
        (elements as
        Array<ICompositionGeometry?>).castToImpl<ICompositionGeometry,ICompositionGeometry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionGeometry?> =
        arrayOfNulls<ICompositionGeometry_Impl>(size) as Array<ICompositionGeometry?>
  }
}
