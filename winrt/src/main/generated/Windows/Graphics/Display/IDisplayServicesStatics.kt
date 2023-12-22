package Windows.Graphics.Display

import Windows.Graphics.DisplayId
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

@ABIMarker(IDisplayServicesStatics.ABI::class)
@Signature("{dc2096bf-730a-5560-b461-91c13d692e0c}")
@Guid("dc2096bf730a5560b46191c13d692e0c")
@WinRTInterface("dc2096bf730a5560b46191c13d692e0c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayServicesStatics.ByReference::class)
public interface IDisplayServicesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAll(): Array<DisplayId?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayServicesStatics> {
    public override fun getValue() = ABI.makeIDisplayServicesStatics(pointer.getPointer(0))

    public fun setValue(value: IDisplayServicesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayServicesStatics {
    public val __1268832324_Ptr: Pointer?

    public val _1268832324_VtblPtr: Pointer?
      get() = __1268832324_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAll(): Array<DisplayId?>? {
      val fnPtr = _1268832324_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<DisplayId>()
      val hr = fn.invokeHR(arrayOf(__1268832324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array as Array<DisplayId?>
      return resultValue
    }
  }

  public class IDisplayServicesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1268832324_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayServicesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc2096bf730a5560b46191c13d692e0c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayServicesStatics(ptr: Pointer?): WithDefault =
        IDisplayServicesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayServicesStatics {
      val address = segment.toRawLongValue()
      return makeIDisplayServicesStatics(Pointer(address))
    }

    public override fun toNative(obj: IDisplayServicesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1268832324_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayServicesStatics): Array<IDisplayServicesStatics?>
        = (elements as
        Array<IDisplayServicesStatics?>).castToImpl<IDisplayServicesStatics,IDisplayServicesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayServicesStatics?> =
        arrayOfNulls<IDisplayServicesStatics_Impl>(size) as Array<IDisplayServicesStatics?>
  }
}
