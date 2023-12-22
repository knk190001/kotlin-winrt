package Windows.UI.Xaml.Media

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

@ABIMarker(IAcrylicBrushStatics2.ABI::class)
@Signature("{129188a8-bf11-5bbc-8445-8c510e5926c0}")
@Guid("129188a8bf115bbc84458c510e5926c0")
@WinRTInterface("129188a8bf115bbc84458c510e5926c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAcrylicBrushStatics2.ByReference::class)
public interface IAcrylicBrushStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TintLuminosityOpacityProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAcrylicBrushStatics2> {
    public override fun getValue() = ABI.makeIAcrylicBrushStatics2(pointer.getPointer(0))

    public fun setValue(value: IAcrylicBrushStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAcrylicBrushStatics2 {
    public val __2008394394_Ptr: Pointer?

    public val _2008394394_VtblPtr: Pointer?
      get() = __2008394394_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TintLuminosityOpacityProperty(): DependencyProperty? {
      val fnPtr = _2008394394_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2008394394_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAcrylicBrushStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2008394394_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAcrylicBrushStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("129188a8bf115bbc84458c510e5926c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAcrylicBrushStatics2(ptr: Pointer?): WithDefault =
        IAcrylicBrushStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAcrylicBrushStatics2 {
      val address = segment.toRawLongValue()
      return makeIAcrylicBrushStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAcrylicBrushStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2008394394_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAcrylicBrushStatics2): Array<IAcrylicBrushStatics2?> =
        (elements as
        Array<IAcrylicBrushStatics2?>).castToImpl<IAcrylicBrushStatics2,IAcrylicBrushStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAcrylicBrushStatics2?> =
        arrayOfNulls<IAcrylicBrushStatics2_Impl>(size) as Array<IAcrylicBrushStatics2?>
  }
}
