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

@ABIMarker(ILineGeometryStatics.ABI::class)
@Signature("{ce0ecbf3-9389-5304-b7c8-5e610902f258}")
@Guid("ce0ecbf393895304b7c85e610902f258")
@WinRTInterface("ce0ecbf393895304b7c85e610902f258")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineGeometryStatics.ByReference::class)
public interface ILineGeometryStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartPointProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_EndPointProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineGeometryStatics> {
    public override fun getValue() = ABI.makeILineGeometryStatics(pointer.getPointer(0))

    public fun setValue(value: ILineGeometryStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineGeometryStatics {
    public val __2117976946_Ptr: Pointer?

    public val _2117976946_VtblPtr: Pointer?
      get() = __2117976946_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartPointProperty(): DependencyProperty? {
      val fnPtr = _2117976946_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2117976946_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EndPointProperty(): DependencyProperty? {
      val fnPtr = _2117976946_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2117976946_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ILineGeometryStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2117976946_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineGeometryStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce0ecbf393895304b7c85e610902f258")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineGeometryStatics(ptr: Pointer?): WithDefault = ILineGeometryStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineGeometryStatics {
      val address = segment.toRawLongValue()
      return makeILineGeometryStatics(Pointer(address))
    }

    public override fun toNative(obj: ILineGeometryStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2117976946_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineGeometryStatics): Array<ILineGeometryStatics?> =
        (elements as
        Array<ILineGeometryStatics?>).castToImpl<ILineGeometryStatics,ILineGeometryStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineGeometryStatics?> =
        arrayOfNulls<ILineGeometryStatics_Impl>(size) as Array<ILineGeometryStatics?>
  }
}
