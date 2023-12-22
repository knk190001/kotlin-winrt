package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Calls.Background.PhoneTriggerType
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneTriggerFactory.ABI::class)
@Signature("{a0d93cda-5fc1-48fb-a546-32262040157b}")
@Guid("a0d93cda5fc148fba54632262040157b")
@WinRTInterface("a0d93cda5fc148fba54632262040157b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneTriggerFactory.ByReference::class)
public interface IPhoneTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(type: PhoneTriggerType?, oneShot: Boolean): PhoneTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneTriggerFactory> {
    public override fun getValue() = ABI.makeIPhoneTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: IPhoneTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneTriggerFactory {
    public val __1957105745_Ptr: Pointer?

    public val _1957105745_VtblPtr: Pointer?
      get() = __1957105745_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(type: PhoneTriggerType?, oneShot: Boolean): PhoneTrigger? {
      val fnPtr = _1957105745_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneTrigger>()
      val hr = fn.invokeHR(arrayOf(__1957105745_Ptr, marshalToNative(type), oneShot, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1957105745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a0d93cda5fc148fba54632262040157b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneTriggerFactory(ptr: Pointer?): WithDefault = IPhoneTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneTriggerFactory {
      val address = segment.toRawLongValue()
      return makeIPhoneTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: IPhoneTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1957105745_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneTriggerFactory): Array<IPhoneTriggerFactory?> =
        (elements as
        Array<IPhoneTriggerFactory?>).castToImpl<IPhoneTriggerFactory,IPhoneTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneTriggerFactory?> =
        arrayOfNulls<IPhoneTriggerFactory_Impl>(size) as Array<IPhoneTriggerFactory?>
  }
}
