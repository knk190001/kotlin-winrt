package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Numerics.Matrix3x2
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

@ABIMarker(IInkStroke2.ABI::class)
@Signature("{5db9e4f4-bafa-4de1-89d3-201b1ed7d89b}")
@Guid("5db9e4f4bafa4de189d3201b1ed7d89b")
@WinRTInterface("5db9e4f4bafa4de189d3201b1ed7d89b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStroke2.ByReference::class)
public interface IInkStroke2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointTransform(): Matrix3x2?

  @InterfaceMethod(1)
  public fun put_PointTransform(value: Matrix3x2?): Unit

  @InterfaceMethod(2)
  public fun GetInkPoints(): IVectorView<InkPoint?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkStroke2> {
    public override fun getValue() = ABI.makeIInkStroke2(pointer.getPointer(0))

    public fun setValue(value: IInkStroke2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStroke2 {
    public val __1658420046_Ptr: Pointer?

    public val _1658420046_VtblPtr: Pointer?
      get() = __1658420046_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointTransform(): Matrix3x2? {
      val fnPtr = _1658420046_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3x2>()
      val hr = fn.invokeHR(arrayOf(__1658420046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3x2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PointTransform(value: Matrix3x2?): Unit {
      val fnPtr = _1658420046_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1658420046_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetInkPoints(): IVectorView<InkPoint?>? {
      val fnPtr = _1658420046_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<InkPoint?>>()
      val hr = fn.invokeHR(arrayOf(__1658420046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<InkPoint?>>(result.getValue())
      return resultValue
    }
  }

  public class IInkStroke2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1658420046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStroke2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5db9e4f4bafa4de189d3201b1ed7d89b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStroke2(ptr: Pointer?): WithDefault = IInkStroke2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStroke2 {
      val address = segment.toRawLongValue()
      return makeIInkStroke2(Pointer(address))
    }

    public override fun toNative(obj: IInkStroke2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1658420046_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStroke2): Array<IInkStroke2?> = (elements as
        Array<IInkStroke2?>).castToImpl<IInkStroke2,IInkStroke2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStroke2?> =
        arrayOfNulls<IInkStroke2_Impl>(size) as Array<IInkStroke2?>
  }
}
