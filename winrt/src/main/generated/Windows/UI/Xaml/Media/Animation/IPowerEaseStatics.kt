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

@ABIMarker(IPowerEaseStatics.ABI::class)
@Signature("{a5955103-91a2-460c-9c41-d28f6a939bda}")
@Guid("a595510391a2460c9c41d28f6a939bda")
@WinRTInterface("a595510391a2460c9c41d28f6a939bda")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPowerEaseStatics.ByReference::class)
public interface IPowerEaseStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PowerProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPowerEaseStatics> {
    public override fun getValue() = ABI.makeIPowerEaseStatics(pointer.getPointer(0))

    public fun setValue(value: IPowerEaseStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPowerEaseStatics {
    public val __128466872_Ptr: Pointer?

    public val _128466872_VtblPtr: Pointer?
      get() = __128466872_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PowerProperty(): DependencyProperty? {
      val fnPtr = _128466872_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__128466872_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPowerEaseStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __128466872_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPowerEaseStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a595510391a2460c9c41d28f6a939bda")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPowerEaseStatics(ptr: Pointer?): WithDefault = IPowerEaseStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPowerEaseStatics {
      val address = segment.toRawLongValue()
      return makeIPowerEaseStatics(Pointer(address))
    }

    public override fun toNative(obj: IPowerEaseStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__128466872_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPowerEaseStatics): Array<IPowerEaseStatics?> = (elements
        as Array<IPowerEaseStatics?>).castToImpl<IPowerEaseStatics,IPowerEaseStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPowerEaseStatics?> =
        arrayOfNulls<IPowerEaseStatics_Impl>(size) as Array<IPowerEaseStatics?>
  }
}
