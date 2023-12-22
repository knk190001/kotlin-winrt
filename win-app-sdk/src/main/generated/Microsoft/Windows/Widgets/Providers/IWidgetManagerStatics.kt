package Microsoft.Windows.Widgets.Providers

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

@ABIMarker(IWidgetManagerStatics.ABI::class)
@Signature("{7f233b06-28e5-5e2b-8c04-a4fa747c28c7}")
@Guid("7f233b0628e55e2b8c04a4fa747c28c7")
@WinRTInterface("7f233b0628e55e2b8c04a4fa747c28c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetManagerStatics.ByReference::class)
public interface IWidgetManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): WidgetManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWidgetManagerStatics> {
    public override fun getValue() = ABI.makeIWidgetManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IWidgetManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetManagerStatics {
    public val __1609911213_Ptr: Pointer?

    public val _1609911213_VtblPtr: Pointer?
      get() = __1609911213_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): WidgetManager? {
      val fnPtr = _1609911213_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WidgetManager>()
      val hr = fn.invokeHR(arrayOf(__1609911213_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WidgetManager>(result.getValue())
      return resultValue
    }
  }

  public class IWidgetManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1609911213_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f233b0628e55e2b8c04a4fa747c28c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetManagerStatics(ptr: Pointer?): WithDefault =
        IWidgetManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetManagerStatics {
      val address = segment.toRawLongValue()
      return makeIWidgetManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IWidgetManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1609911213_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetManagerStatics): Array<IWidgetManagerStatics?> =
        (elements as
        Array<IWidgetManagerStatics?>).castToImpl<IWidgetManagerStatics,IWidgetManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetManagerStatics?> =
        arrayOfNulls<IWidgetManagerStatics_Impl>(size) as Array<IWidgetManagerStatics?>
  }
}
