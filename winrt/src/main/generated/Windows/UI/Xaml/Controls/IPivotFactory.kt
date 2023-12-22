package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IPivotFactory.ABI::class)
@Signature("{1b0a818e-2529-4762-ba44-9abc68c3ceca}")
@Guid("1b0a818e25294762ba449abc68c3ceca")
@WinRTInterface("1b0a818e25294762ba449abc68c3ceca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotFactory.ByReference::class)
public interface IPivotFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Pivot?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPivotFactory>
      {
    public override fun getValue() = ABI.makeIPivotFactory(pointer.getPointer(0))

    public fun setValue(value: IPivotFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotFactory {
    public val __664723324_Ptr: Pointer?

    public val _664723324_VtblPtr: Pointer?
      get() = __664723324_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Pivot? {
      val fnPtr = _664723324_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Pivot>()
      val hr = fn.invokeHR(arrayOf(__664723324_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Pivot>(result.getValue())
      return resultValue
    }
  }

  public class IPivotFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __664723324_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b0a818e25294762ba449abc68c3ceca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotFactory(ptr: Pointer?): WithDefault = IPivotFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotFactory {
      val address = segment.toRawLongValue()
      return makeIPivotFactory(Pointer(address))
    }

    public override fun toNative(obj: IPivotFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__664723324_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotFactory): Array<IPivotFactory?> = (elements as
        Array<IPivotFactory?>).castToImpl<IPivotFactory,IPivotFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotFactory?> =
        arrayOfNulls<IPivotFactory_Impl>(size) as Array<IPivotFactory?>
  }
}
