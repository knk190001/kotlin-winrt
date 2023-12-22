package Windows.UI.Composition

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

@ABIMarker(IVisual3.ABI::class)
@Signature("{30be580d-f4b6-4ab7-80dd-3738cbac9f2c}")
@Guid("30be580df4b64ab780dd3738cbac9f2c")
@WinRTInterface("30be580df4b64ab780dd3738cbac9f2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisual3.ByReference::class)
public interface IVisual3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsHitTestVisible(): Boolean

  @InterfaceMethod(1)
  public fun put_IsHitTestVisible(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVisual3> {
    public override fun getValue() = ABI.makeIVisual3(pointer.getPointer(0))

    public fun setValue(value: IVisual3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisual3 {
    public val __1503992197_Ptr: Pointer?

    public val _1503992197_VtblPtr: Pointer?
      get() = __1503992197_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsHitTestVisible(): Boolean {
      val fnPtr = _1503992197_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1503992197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsHitTestVisible(value: Boolean): Unit {
      val fnPtr = _1503992197_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1503992197_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisual3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1503992197_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisual3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30be580df4b64ab780dd3738cbac9f2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisual3(ptr: Pointer?): WithDefault = IVisual3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisual3 {
      val address = segment.toRawLongValue()
      return makeIVisual3(Pointer(address))
    }

    public override fun toNative(obj: IVisual3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1503992197_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisual3): Array<IVisual3?> = (elements as
        Array<IVisual3?>).castToImpl<IVisual3,IVisual3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisual3?> = arrayOfNulls<IVisual3_Impl>(size) as
        Array<IVisual3?>
  }
}
