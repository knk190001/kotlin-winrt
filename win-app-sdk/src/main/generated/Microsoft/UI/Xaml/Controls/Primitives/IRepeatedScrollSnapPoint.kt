package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IRepeatedScrollSnapPoint.ABI::class)
@Signature("{5828fb51-8ebb-596d-a871-50063479362d}")
@Guid("5828fb518ebb596da87150063479362d")
@WinRTInterface("5828fb518ebb596da87150063479362d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepeatedScrollSnapPoint.ByReference::class)
public interface IRepeatedScrollSnapPoint : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Offset(): Double

  @InterfaceMethod(1)
  public fun get_Interval(): Double

  @InterfaceMethod(2)
  public fun get_Start(): Double

  @InterfaceMethod(3)
  public fun get_End(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepeatedScrollSnapPoint> {
    public override fun getValue() = ABI.makeIRepeatedScrollSnapPoint(pointer.getPointer(0))

    public fun setValue(value: IRepeatedScrollSnapPoint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepeatedScrollSnapPoint {
    public val __78598834_Ptr: Pointer?

    public val _78598834_VtblPtr: Pointer?
      get() = __78598834_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Offset(): Double {
      val fnPtr = _78598834_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__78598834_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Interval(): Double {
      val fnPtr = _78598834_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__78598834_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Start(): Double {
      val fnPtr = _78598834_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__78598834_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_End(): Double {
      val fnPtr = _78598834_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__78598834_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IRepeatedScrollSnapPoint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __78598834_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepeatedScrollSnapPoint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5828fb518ebb596da87150063479362d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepeatedScrollSnapPoint(ptr: Pointer?): WithDefault =
        IRepeatedScrollSnapPoint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepeatedScrollSnapPoint {
      val address = segment.toRawLongValue()
      return makeIRepeatedScrollSnapPoint(Pointer(address))
    }

    public override fun toNative(obj: IRepeatedScrollSnapPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__78598834_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepeatedScrollSnapPoint):
        Array<IRepeatedScrollSnapPoint?> = (elements as
        Array<IRepeatedScrollSnapPoint?>).castToImpl<IRepeatedScrollSnapPoint,IRepeatedScrollSnapPoint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepeatedScrollSnapPoint?> =
        arrayOfNulls<IRepeatedScrollSnapPoint_Impl>(size) as Array<IRepeatedScrollSnapPoint?>
  }
}
