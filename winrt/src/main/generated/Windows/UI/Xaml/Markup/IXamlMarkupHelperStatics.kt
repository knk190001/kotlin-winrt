package Windows.UI.Xaml.Markup

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(IXamlMarkupHelperStatics.ABI::class)
@Signature("{c9bc3725-f34f-445c-81a2-6b72a5e8f072}")
@Guid("c9bc3725f34f445c81a26b72a5e8f072")
@WinRTInterface("c9bc3725f34f445c81a26b72a5e8f072")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlMarkupHelperStatics.ByReference::class)
public interface IXamlMarkupHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun UnloadObject(element: DependencyObject?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlMarkupHelperStatics> {
    public override fun getValue() = ABI.makeIXamlMarkupHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IXamlMarkupHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlMarkupHelperStatics {
    public val __914239715_Ptr: Pointer?

    public val _914239715_VtblPtr: Pointer?
      get() = __914239715_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun UnloadObject(element: DependencyObject?): Unit {
      val fnPtr = _914239715_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__914239715_Ptr, marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlMarkupHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __914239715_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlMarkupHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9bc3725f34f445c81a26b72a5e8f072")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlMarkupHelperStatics(ptr: Pointer?): WithDefault =
        IXamlMarkupHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlMarkupHelperStatics {
      val address = segment.toRawLongValue()
      return makeIXamlMarkupHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IXamlMarkupHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__914239715_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlMarkupHelperStatics):
        Array<IXamlMarkupHelperStatics?> = (elements as
        Array<IXamlMarkupHelperStatics?>).castToImpl<IXamlMarkupHelperStatics,IXamlMarkupHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlMarkupHelperStatics?> =
        arrayOfNulls<IXamlMarkupHelperStatics_Impl>(size) as Array<IXamlMarkupHelperStatics?>
  }
}
