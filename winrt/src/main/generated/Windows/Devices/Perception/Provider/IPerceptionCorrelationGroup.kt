package Windows.Devices.Perception.Provider

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IPerceptionCorrelationGroup.ABI::class)
@Signature("{752a0906-36a7-47bb-9b79-56cc6b746770}")
@Guid("752a090636a747bb9b7956cc6b746770")
@WinRTInterface("752a090636a747bb9b7956cc6b746770")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionCorrelationGroup.ByReference::class)
public interface IPerceptionCorrelationGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RelativeLocations(): IVectorView<PerceptionCorrelation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionCorrelationGroup> {
    public override fun getValue() = ABI.makeIPerceptionCorrelationGroup(pointer.getPointer(0))

    public fun setValue(value: IPerceptionCorrelationGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionCorrelationGroup {
    public val __826532845_Ptr: Pointer?

    public val _826532845_VtblPtr: Pointer?
      get() = __826532845_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RelativeLocations(): IVectorView<PerceptionCorrelation?>? {
      val fnPtr = _826532845_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PerceptionCorrelation?>>()
      val hr = fn.invokeHR(arrayOf(__826532845_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PerceptionCorrelation?>>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionCorrelationGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __826532845_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionCorrelationGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("752a090636a747bb9b7956cc6b746770")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionCorrelationGroup(ptr: Pointer?): WithDefault =
        IPerceptionCorrelationGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionCorrelationGroup {
      val address = segment.toRawLongValue()
      return makeIPerceptionCorrelationGroup(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionCorrelationGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__826532845_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionCorrelationGroup):
        Array<IPerceptionCorrelationGroup?> = (elements as
        Array<IPerceptionCorrelationGroup?>).castToImpl<IPerceptionCorrelationGroup,IPerceptionCorrelationGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionCorrelationGroup?> =
        arrayOfNulls<IPerceptionCorrelationGroup_Impl>(size) as Array<IPerceptionCorrelationGroup?>
  }
}
