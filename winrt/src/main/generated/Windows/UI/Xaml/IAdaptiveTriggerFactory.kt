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

@ABIMarker(IAdaptiveTriggerFactory.ABI::class)
@Signature("{c966d482-5aeb-4841-9247-c1a0bdd6f59f}")
@Guid("c966d4825aeb48419247c1a0bdd6f59f")
@WinRTInterface("c966d4825aeb48419247c1a0bdd6f59f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveTriggerFactory.ByReference::class)
public interface IAdaptiveTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): AdaptiveTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveTriggerFactory> {
    public override fun getValue() = ABI.makeIAdaptiveTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveTriggerFactory {
    public val __1733784294_Ptr: Pointer?

    public val _1733784294_VtblPtr: Pointer?
      get() = __1733784294_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AdaptiveTrigger? {
      val fnPtr = _1733784294_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveTrigger>()
      val hr = fn.invokeHR(arrayOf(__1733784294_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1733784294_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c966d4825aeb48419247c1a0bdd6f59f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveTriggerFactory(ptr: Pointer?): WithDefault =
        IAdaptiveTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveTriggerFactory {
      val address = segment.toRawLongValue()
      return makeIAdaptiveTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1733784294_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveTriggerFactory): Array<IAdaptiveTriggerFactory?>
        = (elements as
        Array<IAdaptiveTriggerFactory?>).castToImpl<IAdaptiveTriggerFactory,IAdaptiveTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveTriggerFactory?> =
        arrayOfNulls<IAdaptiveTriggerFactory_Impl>(size) as Array<IAdaptiveTriggerFactory?>
  }
}
