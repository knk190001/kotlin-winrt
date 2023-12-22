package Windows.UI.Input.Inking

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IInkStroke4.ABI::class)
@Signature("{cd5b62e5-b6e9-5b91-a577-1921d2348690}")
@Guid("cd5b62e5b6e95b91a5771921d2348690")
@WinRTInterface("cd5b62e5b6e95b91a5771921d2348690")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStroke4.ByReference::class)
public interface IInkStroke4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerId(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkStroke4> {
    public override fun getValue() = ABI.makeIInkStroke4(pointer.getPointer(0))

    public fun setValue(value: IInkStroke4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStroke4 {
    public val __1658420048_Ptr: Pointer?

    public val _1658420048_VtblPtr: Pointer?
      get() = __1658420048_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerId(): WinDef.UINT {
      val fnPtr = _1658420048_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1658420048_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IInkStroke4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1658420048_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStroke4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd5b62e5b6e95b91a5771921d2348690")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStroke4(ptr: Pointer?): WithDefault = IInkStroke4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStroke4 {
      val address = segment.toRawLongValue()
      return makeIInkStroke4(Pointer(address))
    }

    public override fun toNative(obj: IInkStroke4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1658420048_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStroke4): Array<IInkStroke4?> = (elements as
        Array<IInkStroke4?>).castToImpl<IInkStroke4,IInkStroke4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStroke4?> =
        arrayOfNulls<IInkStroke4_Impl>(size) as Array<IInkStroke4?>
  }
}
