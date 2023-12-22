package Microsoft.UI.Xaml.Data

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

@ABIMarker(IRelativeSource.ABI::class)
@Signature("{7ffc8126-5dd8-58bb-b686-c71eddea07b2}")
@Guid("7ffc81265dd858bbb686c71eddea07b2")
@WinRTInterface("7ffc81265dd858bbb686c71eddea07b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRelativeSource.ByReference::class)
public interface IRelativeSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): RelativeSourceMode?

  @InterfaceMethod(1)
  public fun put_Mode(value: RelativeSourceMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRelativeSource> {
    public override fun getValue() = ABI.makeIRelativeSource(pointer.getPointer(0))

    public fun setValue(value: IRelativeSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRelativeSource {
    public val __1641888230_Ptr: Pointer?

    public val _1641888230_VtblPtr: Pointer?
      get() = __1641888230_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): RelativeSourceMode? {
      val fnPtr = _1641888230_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RelativeSourceMode>()
      val hr = fn.invokeHR(arrayOf(__1641888230_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RelativeSourceMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mode(value: RelativeSourceMode?): Unit {
      val fnPtr = _1641888230_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1641888230_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRelativeSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1641888230_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRelativeSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ffc81265dd858bbb686c71eddea07b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRelativeSource(ptr: Pointer?): WithDefault = IRelativeSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRelativeSource {
      val address = segment.toRawLongValue()
      return makeIRelativeSource(Pointer(address))
    }

    public override fun toNative(obj: IRelativeSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1641888230_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRelativeSource): Array<IRelativeSource?> = (elements as
        Array<IRelativeSource?>).castToImpl<IRelativeSource,IRelativeSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRelativeSource?> =
        arrayOfNulls<IRelativeSource_Impl>(size) as Array<IRelativeSource?>
  }
}
