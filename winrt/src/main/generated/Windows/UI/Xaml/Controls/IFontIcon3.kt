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

@ABIMarker(IFontIcon3.ABI::class)
@Signature("{6155d919-1c6c-4950-8794-231ef0914d94}")
@Guid("6155d9191c6c49508794231ef0914d94")
@WinRTInterface("6155d9191c6c49508794231ef0914d94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontIcon3.ByReference::class)
public interface IFontIcon3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MirroredWhenRightToLeft(): Boolean

  @InterfaceMethod(1)
  public fun put_MirroredWhenRightToLeft(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFontIcon3> {
    public override fun getValue() = ABI.makeIFontIcon3(pointer.getPointer(0))

    public fun setValue(value: IFontIcon3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontIcon3 {
    public val __468398895_Ptr: Pointer?

    public val _468398895_VtblPtr: Pointer?
      get() = __468398895_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MirroredWhenRightToLeft(): Boolean {
      val fnPtr = _468398895_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__468398895_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MirroredWhenRightToLeft(value: Boolean): Unit {
      val fnPtr = _468398895_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__468398895_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFontIcon3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __468398895_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontIcon3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6155d9191c6c49508794231ef0914d94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontIcon3(ptr: Pointer?): WithDefault = IFontIcon3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontIcon3 {
      val address = segment.toRawLongValue()
      return makeIFontIcon3(Pointer(address))
    }

    public override fun toNative(obj: IFontIcon3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__468398895_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontIcon3): Array<IFontIcon3?> = (elements as
        Array<IFontIcon3?>).castToImpl<IFontIcon3,IFontIcon3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontIcon3?> = arrayOfNulls<IFontIcon3_Impl>(size)
        as Array<IFontIcon3?>
  }
}
