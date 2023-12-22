package Windows.UI.Input

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

@ABIMarker(IRadialControllerConfigurationStatics.ABI::class)
@Signature("{79b6b0e5-069a-4486-a99d-8db772b9642f}")
@Guid("79b6b0e5069a4486a99d8db772b9642f")
@WinRTInterface("79b6b0e5069a4486a99d8db772b9642f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerConfigurationStatics.ByReference::class)
public interface IRadialControllerConfigurationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): RadialControllerConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerConfigurationStatics> {
    public override fun getValue() =
        ABI.makeIRadialControllerConfigurationStatics(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerConfigurationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerConfigurationStatics {
    public val __1618536312_Ptr: Pointer?

    public val _1618536312_VtblPtr: Pointer?
      get() = __1618536312_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): RadialControllerConfiguration? {
      val fnPtr = _1618536312_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1618536312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerConfigurationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1618536312_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerConfigurationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79b6b0e5069a4486a99d8db772b9642f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerConfigurationStatics(ptr: Pointer?): WithDefault =
        IRadialControllerConfigurationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialControllerConfigurationStatics {
      val address = segment.toRawLongValue()
      return makeIRadialControllerConfigurationStatics(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerConfigurationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1618536312_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerConfigurationStatics):
        Array<IRadialControllerConfigurationStatics?> = (elements as
        Array<IRadialControllerConfigurationStatics?>).castToImpl<IRadialControllerConfigurationStatics,IRadialControllerConfigurationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerConfigurationStatics?> =
        arrayOfNulls<IRadialControllerConfigurationStatics_Impl>(size) as
        Array<IRadialControllerConfigurationStatics?>
  }
}
