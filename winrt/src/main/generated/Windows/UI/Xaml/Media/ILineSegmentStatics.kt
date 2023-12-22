package Windows.UI.Xaml.Media

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

@ABIMarker(ILineSegmentStatics.ABI::class)
@Signature("{9fcab141-04c0-4afb-87b3-e800b969b894}")
@Guid("9fcab14104c04afb87b3e800b969b894")
@WinRTInterface("9fcab14104c04afb87b3e800b969b894")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineSegmentStatics.ByReference::class)
public interface ILineSegmentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineSegmentStatics> {
    public override fun getValue() = ABI.makeILineSegmentStatics(pointer.getPointer(0))

    public fun setValue(value: ILineSegmentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineSegmentStatics {
    public val __1962054946_Ptr: Pointer?

    public val _1962054946_VtblPtr: Pointer?
      get() = __1962054946_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointProperty(): DependencyProperty? {
      val fnPtr = _1962054946_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1962054946_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ILineSegmentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1962054946_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineSegmentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fcab14104c04afb87b3e800b969b894")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineSegmentStatics(ptr: Pointer?): WithDefault = ILineSegmentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineSegmentStatics {
      val address = segment.toRawLongValue()
      return makeILineSegmentStatics(Pointer(address))
    }

    public override fun toNative(obj: ILineSegmentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1962054946_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineSegmentStatics): Array<ILineSegmentStatics?> =
        (elements as
        Array<ILineSegmentStatics?>).castToImpl<ILineSegmentStatics,ILineSegmentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineSegmentStatics?> =
        arrayOfNulls<ILineSegmentStatics_Impl>(size) as Array<ILineSegmentStatics?>
  }
}
