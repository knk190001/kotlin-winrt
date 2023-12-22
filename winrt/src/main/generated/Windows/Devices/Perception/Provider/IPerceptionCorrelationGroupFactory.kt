package Windows.Devices.Perception.Provider

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IPerceptionCorrelationGroupFactory.ABI::class)
@Signature("{7dfe2088-63df-48ed-83b1-4ab829132995}")
@Guid("7dfe208863df48ed83b14ab829132995")
@WinRTInterface("7dfe208863df48ed83b14ab829132995")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionCorrelationGroupFactory.ByReference::class)
public interface IPerceptionCorrelationGroupFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(relativeLocations: IIterable<PerceptionCorrelation?>?):
      PerceptionCorrelationGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionCorrelationGroupFactory> {
    public override fun getValue() =
        ABI.makeIPerceptionCorrelationGroupFactory(pointer.getPointer(0))

    public fun setValue(value: IPerceptionCorrelationGroupFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionCorrelationGroupFactory {
    public val __1707151453_Ptr: Pointer?

    public val _1707151453_VtblPtr: Pointer?
      get() = __1707151453_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(relativeLocations: IIterable<PerceptionCorrelation?>?):
        PerceptionCorrelationGroup? {
      val fnPtr = _1707151453_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionCorrelationGroup>()
      val hr = fn.invokeHR(arrayOf(__1707151453_Ptr, marshalToNative(relativeLocations), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionCorrelationGroup>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionCorrelationGroupFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1707151453_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionCorrelationGroupFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7dfe208863df48ed83b14ab829132995")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionCorrelationGroupFactory(ptr: Pointer?): WithDefault =
        IPerceptionCorrelationGroupFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionCorrelationGroupFactory {
      val address = segment.toRawLongValue()
      return makeIPerceptionCorrelationGroupFactory(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionCorrelationGroupFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1707151453_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionCorrelationGroupFactory):
        Array<IPerceptionCorrelationGroupFactory?> = (elements as
        Array<IPerceptionCorrelationGroupFactory?>).castToImpl<IPerceptionCorrelationGroupFactory,IPerceptionCorrelationGroupFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionCorrelationGroupFactory?> =
        arrayOfNulls<IPerceptionCorrelationGroupFactory_Impl>(size) as
        Array<IPerceptionCorrelationGroupFactory?>
  }
}
