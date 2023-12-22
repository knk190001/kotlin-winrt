package Windows.UI.WindowManagement

import Windows.Foundation.Rect
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

@ABIMarker(IAppWindowTitleBarOcclusion.ABI::class)
@Signature("{fea3cffd-2ccf-5fc3-aeae-f843876bf37e}")
@Guid("fea3cffd2ccf5fc3aeaef843876bf37e")
@WinRTInterface("fea3cffd2ccf5fc3aeaef843876bf37e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowTitleBarOcclusion.ByReference::class)
public interface IAppWindowTitleBarOcclusion : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OccludingRect(): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowTitleBarOcclusion> {
    public override fun getValue() = ABI.makeIAppWindowTitleBarOcclusion(pointer.getPointer(0))

    public fun setValue(value: IAppWindowTitleBarOcclusion_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowTitleBarOcclusion {
    public val __584072920_Ptr: Pointer?

    public val _584072920_VtblPtr: Pointer?
      get() = __584072920_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OccludingRect(): Rect? {
      val fnPtr = _584072920_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__584072920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class IAppWindowTitleBarOcclusion_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __584072920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowTitleBarOcclusion, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fea3cffd2ccf5fc3aeaef843876bf37e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowTitleBarOcclusion(ptr: Pointer?): WithDefault =
        IAppWindowTitleBarOcclusion_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowTitleBarOcclusion {
      val address = segment.toRawLongValue()
      return makeIAppWindowTitleBarOcclusion(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowTitleBarOcclusion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__584072920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowTitleBarOcclusion):
        Array<IAppWindowTitleBarOcclusion?> = (elements as
        Array<IAppWindowTitleBarOcclusion?>).castToImpl<IAppWindowTitleBarOcclusion,IAppWindowTitleBarOcclusion_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowTitleBarOcclusion?> =
        arrayOfNulls<IAppWindowTitleBarOcclusion_Impl>(size) as Array<IAppWindowTitleBarOcclusion?>
  }
}
