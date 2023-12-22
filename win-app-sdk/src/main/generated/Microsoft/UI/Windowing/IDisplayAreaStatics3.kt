package Microsoft.UI.Windowing

import Microsoft.UI.DisplayId
import Microsoft.UI.WindowId
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

@ABIMarker(IDisplayAreaStatics3.ABI::class)
@Signature("{745d3602-268b-5060-8437-fcc025e255d6}")
@Guid("745d3602268b50608437fcc025e255d6")
@WinRTInterface("745d3602268b50608437fcc025e255d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayAreaStatics3.ByReference::class)
public interface IDisplayAreaStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetMetricsFromWindowId(windowId: WindowId?): DisplayId?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayAreaStatics3> {
    public override fun getValue() = ABI.makeIDisplayAreaStatics3(pointer.getPointer(0))

    public fun setValue(value: IDisplayAreaStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayAreaStatics3 {
    public val __1551565908_Ptr: Pointer?

    public val _1551565908_VtblPtr: Pointer?
      get() = __1551565908_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetMetricsFromWindowId(windowId: WindowId?): DisplayId? {
      val fnPtr = _1551565908_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayId>()
      val hr = fn.invokeHR(arrayOf(__1551565908_Ptr, marshalToNative(windowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayId>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayAreaStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1551565908_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayAreaStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("745d3602268b50608437fcc025e255d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayAreaStatics3(ptr: Pointer?): WithDefault = IDisplayAreaStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayAreaStatics3 {
      val address = segment.toRawLongValue()
      return makeIDisplayAreaStatics3(Pointer(address))
    }

    public override fun toNative(obj: IDisplayAreaStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1551565908_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayAreaStatics3): Array<IDisplayAreaStatics3?> =
        (elements as
        Array<IDisplayAreaStatics3?>).castToImpl<IDisplayAreaStatics3,IDisplayAreaStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayAreaStatics3?> =
        arrayOfNulls<IDisplayAreaStatics3_Impl>(size) as Array<IDisplayAreaStatics3?>
  }
}
