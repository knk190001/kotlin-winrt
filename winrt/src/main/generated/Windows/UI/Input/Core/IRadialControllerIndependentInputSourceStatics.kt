package Windows.UI.Input.Core

import Windows.ApplicationModel.Core.CoreApplicationView
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

@ABIMarker(IRadialControllerIndependentInputSourceStatics.ABI::class)
@Signature("{3d577ef5-4cee-11e6-b535-001bdc06ab3b}")
@Guid("3d577ef54cee11e6b535001bdc06ab3b")
@WinRTInterface("3d577ef54cee11e6b535001bdc06ab3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerIndependentInputSourceStatics.ByReference::class)
public interface IRadialControllerIndependentInputSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForView(view: CoreApplicationView?): RadialControllerIndependentInputSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerIndependentInputSourceStatics> {
    public override fun getValue() =
        ABI.makeIRadialControllerIndependentInputSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerIndependentInputSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerIndependentInputSourceStatics {
    public val __2071724856_Ptr: Pointer?

    public val _2071724856_VtblPtr: Pointer?
      get() = __2071724856_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForView(view: CoreApplicationView?):
        RadialControllerIndependentInputSource? {
      val fnPtr = _2071724856_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerIndependentInputSource>()
      val hr = fn.invokeHR(arrayOf(__2071724856_Ptr, marshalToNative(view), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerIndependentInputSource>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerIndependentInputSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2071724856_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerIndependentInputSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d577ef54cee11e6b535001bdc06ab3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerIndependentInputSourceStatics(ptr: Pointer?): WithDefault =
        IRadialControllerIndependentInputSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRadialControllerIndependentInputSourceStatics {
      val address = segment.toRawLongValue()
      return makeIRadialControllerIndependentInputSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerIndependentInputSourceStatics): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2071724856_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerIndependentInputSourceStatics):
        Array<IRadialControllerIndependentInputSourceStatics?> = (elements as
        Array<IRadialControllerIndependentInputSourceStatics?>).castToImpl<IRadialControllerIndependentInputSourceStatics,IRadialControllerIndependentInputSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerIndependentInputSourceStatics?> =
        arrayOfNulls<IRadialControllerIndependentInputSourceStatics_Impl>(size) as
        Array<IRadialControllerIndependentInputSourceStatics?>
  }
}
