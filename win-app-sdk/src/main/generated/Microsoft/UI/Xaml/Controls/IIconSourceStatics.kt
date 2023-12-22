package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IIconSourceStatics.ABI::class)
@Signature("{eed55973-7e15-575f-af8e-ae2b9b975dd7}")
@Guid("eed559737e15575faf8eae2b9b975dd7")
@WinRTInterface("eed559737e15575faf8eae2b9b975dd7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIconSourceStatics.ByReference::class)
public interface IIconSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ForegroundProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIconSourceStatics> {
    public override fun getValue() = ABI.makeIIconSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IIconSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIconSourceStatics {
    public val __935674954_Ptr: Pointer?

    public val _935674954_VtblPtr: Pointer?
      get() = __935674954_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ForegroundProperty(): DependencyProperty? {
      val fnPtr = _935674954_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__935674954_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IIconSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __935674954_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIconSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eed559737e15575faf8eae2b9b975dd7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIconSourceStatics(ptr: Pointer?): WithDefault = IIconSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIconSourceStatics {
      val address = segment.toRawLongValue()
      return makeIIconSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IIconSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__935674954_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIconSourceStatics): Array<IIconSourceStatics?> =
        (elements as
        Array<IIconSourceStatics?>).castToImpl<IIconSourceStatics,IIconSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIconSourceStatics?> =
        arrayOfNulls<IIconSourceStatics_Impl>(size) as Array<IIconSourceStatics?>
  }
}
