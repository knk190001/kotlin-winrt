package Microsoft.UI.Xaml

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

@ABIMarker(IWindowStatics.ABI::class)
@Signature("{8cc985e3-a41a-5df4-b531-d3a1788d86c5}")
@Guid("8cc985e3a41a5df4b531d3a1788d86c5")
@WinRTInterface("8cc985e3a41a5df4b531d3a1788d86c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowStatics.ByReference::class)
public interface IWindowStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): Window?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWindowStatics>
      {
    public override fun getValue() = ABI.makeIWindowStatics(pointer.getPointer(0))

    public fun setValue(value: IWindowStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowStatics {
    public val __864444210_Ptr: Pointer?

    public val _864444210_VtblPtr: Pointer?
      get() = __864444210_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): Window? {
      val fnPtr = _864444210_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Window>()
      val hr = fn.invokeHR(arrayOf(__864444210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Window>(result.getValue())
      return resultValue
    }
  }

  public class IWindowStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __864444210_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8cc985e3a41a5df4b531d3a1788d86c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowStatics(ptr: Pointer?): WithDefault = IWindowStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowStatics {
      val address = segment.toRawLongValue()
      return makeIWindowStatics(Pointer(address))
    }

    public override fun toNative(obj: IWindowStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__864444210_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowStatics): Array<IWindowStatics?> = (elements as
        Array<IWindowStatics?>).castToImpl<IWindowStatics,IWindowStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowStatics?> =
        arrayOfNulls<IWindowStatics_Impl>(size) as Array<IWindowStatics?>
  }
}
