package Windows.UI.Xaml

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

@ABIMarker(IFrameworkElementProtected7.ABI::class)
@Signature("{65aa0480-22e3-5103-ad2a-b626f88ca5ae}")
@Guid("65aa048022e35103ad2ab626f88ca5ae")
@WinRTInterface("65aa048022e35103ad2ab626f88ca5ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementProtected7.ByReference::class)
public interface IFrameworkElementProtected7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InvalidateViewport(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementProtected7> {
    public override fun getValue() = ABI.makeIFrameworkElementProtected7(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementProtected7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementProtected7 {
    public val __739842087_Ptr: Pointer?

    public val _739842087_VtblPtr: Pointer?
      get() = __739842087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InvalidateViewport(): Unit {
      val fnPtr = _739842087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__739842087_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameworkElementProtected7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __739842087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementProtected7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("65aa048022e35103ad2ab626f88ca5ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementProtected7(ptr: Pointer?): WithDefault =
        IFrameworkElementProtected7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementProtected7 {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementProtected7(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementProtected7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__739842087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementProtected7):
        Array<IFrameworkElementProtected7?> = (elements as
        Array<IFrameworkElementProtected7?>).castToImpl<IFrameworkElementProtected7,IFrameworkElementProtected7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementProtected7?> =
        arrayOfNulls<IFrameworkElementProtected7_Impl>(size) as Array<IFrameworkElementProtected7?>
  }
}
