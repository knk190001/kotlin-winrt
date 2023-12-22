package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IExponentialEaseStatics.ABI::class)
@Signature("{f37ee7e3-a761-4352-9ad6-70794567581a}")
@Guid("f37ee7e3a76143529ad670794567581a")
@WinRTInterface("f37ee7e3a76143529ad670794567581a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExponentialEaseStatics.ByReference::class)
public interface IExponentialEaseStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExponentProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExponentialEaseStatics> {
    public override fun getValue() = ABI.makeIExponentialEaseStatics(pointer.getPointer(0))

    public fun setValue(value: IExponentialEaseStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExponentialEaseStatics {
    public val __965745400_Ptr: Pointer?

    public val _965745400_VtblPtr: Pointer?
      get() = __965745400_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExponentProperty(): DependencyProperty? {
      val fnPtr = _965745400_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__965745400_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IExponentialEaseStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __965745400_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExponentialEaseStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f37ee7e3a76143529ad670794567581a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExponentialEaseStatics(ptr: Pointer?): WithDefault =
        IExponentialEaseStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExponentialEaseStatics {
      val address = segment.toRawLongValue()
      return makeIExponentialEaseStatics(Pointer(address))
    }

    public override fun toNative(obj: IExponentialEaseStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__965745400_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExponentialEaseStatics): Array<IExponentialEaseStatics?>
        = (elements as
        Array<IExponentialEaseStatics?>).castToImpl<IExponentialEaseStatics,IExponentialEaseStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExponentialEaseStatics?> =
        arrayOfNulls<IExponentialEaseStatics_Impl>(size) as Array<IExponentialEaseStatics?>
  }
}
