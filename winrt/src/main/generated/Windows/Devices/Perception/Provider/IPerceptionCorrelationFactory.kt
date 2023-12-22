package Windows.Devices.Perception.Provider

import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector3
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPerceptionCorrelationFactory.ABI::class)
@Signature("{d4a6c425-2884-4a8f-8134-2835d7286cbf}")
@Guid("d4a6c42528844a8f81342835d7286cbf")
@WinRTInterface("d4a6c42528844a8f81342835d7286cbf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionCorrelationFactory.ByReference::class)
public interface IPerceptionCorrelationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    targetId: String?,
    position: Vector3?,
    orientation: Quaternion?
  ): PerceptionCorrelation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionCorrelationFactory> {
    public override fun getValue() = ABI.makeIPerceptionCorrelationFactory(pointer.getPointer(0))

    public fun setValue(value: IPerceptionCorrelationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionCorrelationFactory {
    public val __1656194312_Ptr: Pointer?

    public val _1656194312_VtblPtr: Pointer?
      get() = __1656194312_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      targetId: String?,
      position: Vector3?,
      orientation: Quaternion?
    ): PerceptionCorrelation? {
      val fnPtr = _1656194312_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionCorrelation>()
      val hr = fn.invokeHR(arrayOf(__1656194312_Ptr, marshalToNative(targetId),
          marshalToNative(position), marshalToNative(orientation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionCorrelation>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionCorrelationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1656194312_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionCorrelationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4a6c42528844a8f81342835d7286cbf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionCorrelationFactory(ptr: Pointer?): WithDefault =
        IPerceptionCorrelationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionCorrelationFactory {
      val address = segment.toRawLongValue()
      return makeIPerceptionCorrelationFactory(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionCorrelationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1656194312_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionCorrelationFactory):
        Array<IPerceptionCorrelationFactory?> = (elements as
        Array<IPerceptionCorrelationFactory?>).castToImpl<IPerceptionCorrelationFactory,IPerceptionCorrelationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionCorrelationFactory?> =
        arrayOfNulls<IPerceptionCorrelationFactory_Impl>(size) as
        Array<IPerceptionCorrelationFactory?>
  }
}
