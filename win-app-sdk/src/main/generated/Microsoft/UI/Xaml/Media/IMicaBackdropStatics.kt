package Microsoft.UI.Xaml.Media

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

@ABIMarker(IMicaBackdropStatics.ABI::class)
@Signature("{a63abdce-c796-5509-9f4d-072bc1e599f1}")
@Guid("a63abdcec79655099f4d072bc1e599f1")
@WinRTInterface("a63abdcec79655099f4d072bc1e599f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMicaBackdropStatics.ByReference::class)
public interface IMicaBackdropStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KindProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMicaBackdropStatics> {
    public override fun getValue() = ABI.makeIMicaBackdropStatics(pointer.getPointer(0))

    public fun setValue(value: IMicaBackdropStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMicaBackdropStatics {
    public val __362720156_Ptr: Pointer?

    public val _362720156_VtblPtr: Pointer?
      get() = __362720156_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KindProperty(): DependencyProperty? {
      val fnPtr = _362720156_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__362720156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMicaBackdropStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __362720156_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMicaBackdropStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a63abdcec79655099f4d072bc1e599f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMicaBackdropStatics(ptr: Pointer?): WithDefault = IMicaBackdropStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMicaBackdropStatics {
      val address = segment.toRawLongValue()
      return makeIMicaBackdropStatics(Pointer(address))
    }

    public override fun toNative(obj: IMicaBackdropStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__362720156_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMicaBackdropStatics): Array<IMicaBackdropStatics?> =
        (elements as
        Array<IMicaBackdropStatics?>).castToImpl<IMicaBackdropStatics,IMicaBackdropStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMicaBackdropStatics?> =
        arrayOfNulls<IMicaBackdropStatics_Impl>(size) as Array<IMicaBackdropStatics?>
  }
}
