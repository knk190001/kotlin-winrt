package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IGridStatics2.ABI::class)
@Signature("{2d666658-58b6-4a1b-841b-875ba93b5d6a}")
@Guid("2d66665858b64a1b841b875ba93b5d6a")
@WinRTInterface("2d66665858b64a1b841b875ba93b5d6a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridStatics2.ByReference::class)
public interface IGridStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_BorderThicknessProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_PaddingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGridStatics2>
      {
    public override fun getValue() = ABI.makeIGridStatics2(pointer.getPointer(0))

    public fun setValue(value: IGridStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridStatics2 {
    public val __650335375_Ptr: Pointer?

    public val _650335375_VtblPtr: Pointer?
      get() = __650335375_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BorderBrushProperty(): DependencyProperty? {
      val fnPtr = _650335375_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__650335375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _650335375_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__650335375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _650335375_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__650335375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PaddingProperty(): DependencyProperty? {
      val fnPtr = _650335375_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__650335375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IGridStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __650335375_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d66665858b64a1b841b875ba93b5d6a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridStatics2(ptr: Pointer?): WithDefault = IGridStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridStatics2 {
      val address = segment.toRawLongValue()
      return makeIGridStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGridStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__650335375_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridStatics2): Array<IGridStatics2?> = (elements as
        Array<IGridStatics2?>).castToImpl<IGridStatics2,IGridStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridStatics2?> =
        arrayOfNulls<IGridStatics2_Impl>(size) as Array<IGridStatics2?>
  }
}
