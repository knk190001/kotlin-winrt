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

@ABIMarker(IPaneThemeTransitionStatics.ABI::class)
@Signature("{316b382f-4be4-1797-b45c-cd900bbe0caa}")
@Guid("316b382f4be41797b45ccd900bbe0caa")
@WinRTInterface("316b382f4be41797b45ccd900bbe0caa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaneThemeTransitionStatics.ByReference::class)
public interface IPaneThemeTransitionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EdgeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaneThemeTransitionStatics> {
    public override fun getValue() = ABI.makeIPaneThemeTransitionStatics(pointer.getPointer(0))

    public fun setValue(value: IPaneThemeTransitionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaneThemeTransitionStatics {
    public val __196337163_Ptr: Pointer?

    public val _196337163_VtblPtr: Pointer?
      get() = __196337163_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EdgeProperty(): DependencyProperty? {
      val fnPtr = _196337163_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__196337163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPaneThemeTransitionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __196337163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaneThemeTransitionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("316b382f4be41797b45ccd900bbe0caa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaneThemeTransitionStatics(ptr: Pointer?): WithDefault =
        IPaneThemeTransitionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaneThemeTransitionStatics {
      val address = segment.toRawLongValue()
      return makeIPaneThemeTransitionStatics(Pointer(address))
    }

    public override fun toNative(obj: IPaneThemeTransitionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__196337163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaneThemeTransitionStatics):
        Array<IPaneThemeTransitionStatics?> = (elements as
        Array<IPaneThemeTransitionStatics?>).castToImpl<IPaneThemeTransitionStatics,IPaneThemeTransitionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaneThemeTransitionStatics?> =
        arrayOfNulls<IPaneThemeTransitionStatics_Impl>(size) as Array<IPaneThemeTransitionStatics?>
  }
}
