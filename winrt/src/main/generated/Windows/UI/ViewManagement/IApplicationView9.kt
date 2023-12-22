package Windows.UI.ViewManagement

import Windows.Foundation.Collections.IVectorView
import Windows.UI.WindowManagement.DisplayRegion
import Windows.UI.WindowManagement.WindowingEnvironment
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

@ABIMarker(IApplicationView9.ABI::class)
@Signature("{9c6516f9-021a-5f01-93e5-9bdad2647574}")
@Guid("9c6516f9021a5f0193e59bdad2647574")
@WinRTInterface("9c6516f9021a5f0193e59bdad2647574")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationView9.ByReference::class)
public interface IApplicationView9 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WindowingEnvironment(): WindowingEnvironment?

  @InterfaceMethod(1)
  public fun GetDisplayRegions(): IVectorView<DisplayRegion?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationView9> {
    public override fun getValue() = ABI.makeIApplicationView9(pointer.getPointer(0))

    public fun setValue(value: IApplicationView9_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationView9 {
    public val __2067439274_Ptr: Pointer?

    public val _2067439274_VtblPtr: Pointer?
      get() = __2067439274_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WindowingEnvironment(): WindowingEnvironment? {
      val fnPtr = _2067439274_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowingEnvironment>()
      val hr = fn.invokeHR(arrayOf(__2067439274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowingEnvironment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDisplayRegions(): IVectorView<DisplayRegion?>? {
      val fnPtr = _2067439274_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DisplayRegion?>>()
      val hr = fn.invokeHR(arrayOf(__2067439274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DisplayRegion?>>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationView9_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2067439274_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationView9, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c6516f9021a5f0193e59bdad2647574")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationView9(ptr: Pointer?): WithDefault = IApplicationView9_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationView9 {
      val address = segment.toRawLongValue()
      return makeIApplicationView9(Pointer(address))
    }

    public override fun toNative(obj: IApplicationView9): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2067439274_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationView9): Array<IApplicationView9?> = (elements
        as Array<IApplicationView9?>).castToImpl<IApplicationView9,IApplicationView9_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationView9?> =
        arrayOfNulls<IApplicationView9_Impl>(size) as Array<IApplicationView9?>
  }
}
