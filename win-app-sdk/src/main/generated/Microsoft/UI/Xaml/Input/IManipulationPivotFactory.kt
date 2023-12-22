package Microsoft.UI.Xaml.Input

import Windows.Foundation.Point
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IManipulationPivotFactory.ABI::class)
@Signature("{67143ccd-ea6c-5fe2-bef2-adcbd7af52fd}")
@Guid("67143ccdea6c5fe2bef2adcbd7af52fd")
@WinRTInterface("67143ccdea6c5fe2bef2adcbd7af52fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationPivotFactory.ByReference::class)
public interface IManipulationPivotFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithCenterAndRadius(center: Point?, radius: Double): ManipulationPivot?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationPivotFactory> {
    public override fun getValue() = ABI.makeIManipulationPivotFactory(pointer.getPointer(0))

    public fun setValue(value: IManipulationPivotFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationPivotFactory {
    public val __1650316976_Ptr: Pointer?

    public val _1650316976_VtblPtr: Pointer?
      get() = __1650316976_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithCenterAndRadius(center: Point?, radius: Double):
        ManipulationPivot? {
      val fnPtr = _1650316976_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationPivot>()
      val hr = fn.invokeHR(arrayOf(__1650316976_Ptr, marshalToNative(center), radius, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationPivot>(result.getValue())
      return resultValue
    }
  }

  public class IManipulationPivotFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1650316976_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationPivotFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67143ccdea6c5fe2bef2adcbd7af52fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationPivotFactory(ptr: Pointer?): WithDefault =
        IManipulationPivotFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IManipulationPivotFactory {
      val address = segment.toRawLongValue()
      return makeIManipulationPivotFactory(Pointer(address))
    }

    public override fun toNative(obj: IManipulationPivotFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1650316976_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationPivotFactory):
        Array<IManipulationPivotFactory?> = (elements as
        Array<IManipulationPivotFactory?>).castToImpl<IManipulationPivotFactory,IManipulationPivotFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationPivotFactory?> =
        arrayOfNulls<IManipulationPivotFactory_Impl>(size) as Array<IManipulationPivotFactory?>
  }
}
