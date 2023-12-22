package Windows.UI.Text.Core

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

@ABIMarker(ICoreTextLayoutRequest2.ABI::class)
@Signature("{676de624-cd3d-4bcd-bf01-7f7110954511}")
@Guid("676de624cd3d4bcdbf017f7110954511")
@WinRTInterface("676de624cd3d4bcdbf017f7110954511")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextLayoutRequest2.ByReference::class)
public interface ICoreTextLayoutRequest2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LayoutBoundsVisualPixels(): CoreTextLayoutBounds?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextLayoutRequest2> {
    public override fun getValue() = ABI.makeICoreTextLayoutRequest2(pointer.getPointer(0))

    public fun setValue(value: ICoreTextLayoutRequest2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextLayoutRequest2 {
    public val __1318885201_Ptr: Pointer?

    public val _1318885201_VtblPtr: Pointer?
      get() = __1318885201_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LayoutBoundsVisualPixels(): CoreTextLayoutBounds? {
      val fnPtr = _1318885201_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextLayoutBounds>()
      val hr = fn.invokeHR(arrayOf(__1318885201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextLayoutBounds>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextLayoutRequest2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1318885201_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextLayoutRequest2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("676de624cd3d4bcdbf017f7110954511")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextLayoutRequest2(ptr: Pointer?): WithDefault =
        ICoreTextLayoutRequest2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextLayoutRequest2 {
      val address = segment.toRawLongValue()
      return makeICoreTextLayoutRequest2(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextLayoutRequest2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1318885201_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextLayoutRequest2): Array<ICoreTextLayoutRequest2?>
        = (elements as
        Array<ICoreTextLayoutRequest2?>).castToImpl<ICoreTextLayoutRequest2,ICoreTextLayoutRequest2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextLayoutRequest2?> =
        arrayOfNulls<ICoreTextLayoutRequest2_Impl>(size) as Array<ICoreTextLayoutRequest2?>
  }
}
