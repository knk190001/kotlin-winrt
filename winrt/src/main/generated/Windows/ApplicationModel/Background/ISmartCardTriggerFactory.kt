package Windows.ApplicationModel.Background

import Windows.Devices.SmartCards.SmartCardTriggerType
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

@ABIMarker(ISmartCardTriggerFactory.ABI::class)
@Signature("{63bf54c3-89c1-4e00-a9d3-97c629269dad}")
@Guid("63bf54c389c14e00a9d397c629269dad")
@WinRTInterface("63bf54c389c14e00a9d397c629269dad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardTriggerFactory.ByReference::class)
public interface ISmartCardTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(triggerType: SmartCardTriggerType?): SmartCardTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardTriggerFactory> {
    public override fun getValue() = ABI.makeISmartCardTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: ISmartCardTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardTriggerFactory {
    public val __65317882_Ptr: Pointer?

    public val _65317882_VtblPtr: Pointer?
      get() = __65317882_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(triggerType: SmartCardTriggerType?): SmartCardTrigger? {
      val fnPtr = _65317882_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardTrigger>()
      val hr = fn.invokeHR(arrayOf(__65317882_Ptr, marshalToNative(triggerType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardTrigger>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __65317882_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63bf54c389c14e00a9d397c629269dad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardTriggerFactory(ptr: Pointer?): WithDefault =
        ISmartCardTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardTriggerFactory {
      val address = segment.toRawLongValue()
      return makeISmartCardTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__65317882_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardTriggerFactory):
        Array<ISmartCardTriggerFactory?> = (elements as
        Array<ISmartCardTriggerFactory?>).castToImpl<ISmartCardTriggerFactory,ISmartCardTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardTriggerFactory?> =
        arrayOfNulls<ISmartCardTriggerFactory_Impl>(size) as Array<ISmartCardTriggerFactory?>
  }
}
