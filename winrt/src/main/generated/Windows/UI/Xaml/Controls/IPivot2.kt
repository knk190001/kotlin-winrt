package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DataTemplate
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IPivot2.ABI::class)
@Signature("{8b8a8660-1a55-411c-a82d-18991c3f0d6f}")
@Guid("8b8a86601a55411ca82d18991c3f0d6f")
@WinRTInterface("8b8a86601a55411ca82d18991c3f0d6f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivot2.ByReference::class)
public interface IPivot2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LeftHeader(): IUnknown?

  @InterfaceMethod(1)
  public fun put_LeftHeader(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_LeftHeaderTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_LeftHeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_RightHeader(): IUnknown?

  @InterfaceMethod(5)
  public fun put_RightHeader(value: IUnknown?): Unit

  @InterfaceMethod(6)
  public fun get_RightHeaderTemplate(): DataTemplate?

  @InterfaceMethod(7)
  public fun put_RightHeaderTemplate(value: DataTemplate?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPivot2> {
    public override fun getValue() = ABI.makeIPivot2(pointer.getPointer(0))

    public fun setValue(value: IPivot2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivot2 {
    public val __647336780_Ptr: Pointer?

    public val _647336780_VtblPtr: Pointer?
      get() = __647336780_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LeftHeader(): IUnknown? {
      val fnPtr = _647336780_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__647336780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_LeftHeader(value: IUnknown?): Unit {
      val fnPtr = _647336780_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__647336780_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LeftHeaderTemplate(): DataTemplate? {
      val fnPtr = _647336780_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__647336780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_LeftHeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _647336780_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__647336780_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RightHeader(): IUnknown? {
      val fnPtr = _647336780_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__647336780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_RightHeader(value: IUnknown?): Unit {
      val fnPtr = _647336780_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__647336780_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RightHeaderTemplate(): DataTemplate? {
      val fnPtr = _647336780_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__647336780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_RightHeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _647336780_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__647336780_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPivot2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __647336780_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivot2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b8a86601a55411ca82d18991c3f0d6f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivot2(ptr: Pointer?): WithDefault = IPivot2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivot2 {
      val address = segment.toRawLongValue()
      return makeIPivot2(Pointer(address))
    }

    public override fun toNative(obj: IPivot2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__647336780_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivot2): Array<IPivot2?> = (elements as
        Array<IPivot2?>).castToImpl<IPivot2,IPivot2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivot2?> = arrayOfNulls<IPivot2_Impl>(size) as
        Array<IPivot2?>
  }
}
