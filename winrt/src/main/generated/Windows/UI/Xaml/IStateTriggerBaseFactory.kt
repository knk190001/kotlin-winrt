package Windows.UI.Xaml

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

@ABIMarker(IStateTriggerBaseFactory.ABI::class)
@Signature("{970e2c4b-bfaf-47b0-be42-c1d711bb2e9f}")
@Guid("970e2c4bbfaf47b0be42c1d711bb2e9f")
@WinRTInterface("970e2c4bbfaf47b0be42c1d711bb2e9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStateTriggerBaseFactory.ByReference::class)
public interface IStateTriggerBaseFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): StateTriggerBase?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStateTriggerBaseFactory> {
    public override fun getValue() = ABI.makeIStateTriggerBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IStateTriggerBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStateTriggerBaseFactory {
    public val __1669148672_Ptr: Pointer?

    public val _1669148672_VtblPtr: Pointer?
      get() = __1669148672_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        StateTriggerBase? {
      val fnPtr = _1669148672_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StateTriggerBase>()
      val hr = fn.invokeHR(arrayOf(__1669148672_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StateTriggerBase>(result.getValue())
      return resultValue
    }
  }

  public class IStateTriggerBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1669148672_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStateTriggerBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("970e2c4bbfaf47b0be42c1d711bb2e9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStateTriggerBaseFactory(ptr: Pointer?): WithDefault =
        IStateTriggerBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStateTriggerBaseFactory {
      val address = segment.toRawLongValue()
      return makeIStateTriggerBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IStateTriggerBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1669148672_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStateTriggerBaseFactory):
        Array<IStateTriggerBaseFactory?> = (elements as
        Array<IStateTriggerBaseFactory?>).castToImpl<IStateTriggerBaseFactory,IStateTriggerBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStateTriggerBaseFactory?> =
        arrayOfNulls<IStateTriggerBaseFactory_Impl>(size) as Array<IStateTriggerBaseFactory?>
  }
}
