package Windows.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkToolbarEraserButton2.ABI::class)
@Signature("{e7a59257-5ae8-436d-b2e2-93c200900ca0}")
@Guid("e7a592575ae8436db2e293c200900ca0")
@WinRTInterface("e7a592575ae8436db2e293c200900ca0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarEraserButton2.ByReference::class)
public interface IInkToolbarEraserButton2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsClearAllVisible(): Boolean

  @InterfaceMethod(1)
  public fun put_IsClearAllVisible(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarEraserButton2> {
    public override fun getValue() = ABI.makeIInkToolbarEraserButton2(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarEraserButton2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarEraserButton2 {
    public val __593959741_Ptr: Pointer?

    public val _593959741_VtblPtr: Pointer?
      get() = __593959741_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsClearAllVisible(): Boolean {
      val fnPtr = _593959741_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__593959741_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsClearAllVisible(value: Boolean): Unit {
      val fnPtr = _593959741_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__593959741_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkToolbarEraserButton2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __593959741_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarEraserButton2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7a592575ae8436db2e293c200900ca0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarEraserButton2(ptr: Pointer?): WithDefault =
        IInkToolbarEraserButton2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarEraserButton2 {
      val address = segment.toRawLongValue()
      return makeIInkToolbarEraserButton2(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarEraserButton2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__593959741_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarEraserButton2):
        Array<IInkToolbarEraserButton2?> = (elements as
        Array<IInkToolbarEraserButton2?>).castToImpl<IInkToolbarEraserButton2,IInkToolbarEraserButton2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarEraserButton2?> =
        arrayOfNulls<IInkToolbarEraserButton2_Impl>(size) as Array<IInkToolbarEraserButton2?>
  }
}
