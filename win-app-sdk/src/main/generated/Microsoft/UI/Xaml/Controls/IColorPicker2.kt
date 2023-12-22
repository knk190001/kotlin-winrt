package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IColorPicker2.ABI::class)
@Signature("{802e64c9-4608-5c4c-93cf-6c462e3c1068}")
@Guid("802e64c946085c4c93cf6c462e3c1068")
@WinRTInterface("802e64c946085c4c93cf6c462e3c1068")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorPicker2.ByReference::class)
public interface IColorPicker2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(1)
  public fun put_Orientation(value: Orientation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IColorPicker2>
      {
    public override fun getValue() = ABI.makeIColorPicker2(pointer.getPointer(0))

    public fun setValue(value: IColorPicker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorPicker2 {
    public val __493176776_Ptr: Pointer?

    public val _493176776_VtblPtr: Pointer?
      get() = __493176776_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _493176776_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__493176776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _493176776_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__493176776_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IColorPicker2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __493176776_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorPicker2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("802e64c946085c4c93cf6c462e3c1068")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorPicker2(ptr: Pointer?): WithDefault = IColorPicker2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorPicker2 {
      val address = segment.toRawLongValue()
      return makeIColorPicker2(Pointer(address))
    }

    public override fun toNative(obj: IColorPicker2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__493176776_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorPicker2): Array<IColorPicker2?> = (elements as
        Array<IColorPicker2?>).castToImpl<IColorPicker2,IColorPicker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorPicker2?> =
        arrayOfNulls<IColorPicker2_Impl>(size) as Array<IColorPicker2?>
  }
}
