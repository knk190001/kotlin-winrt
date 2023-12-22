package Windows.UI.Xaml.Controls

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

@ABIMarker(ITwoPaneViewFactory.ABI::class)
@Signature("{18ff792d-58b4-59ed-a051-51aceffbcca9}")
@Guid("18ff792d58b459eda05151aceffbcca9")
@WinRTInterface("18ff792d58b459eda05151aceffbcca9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITwoPaneViewFactory.ByReference::class)
public interface ITwoPaneViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): TwoPaneView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITwoPaneViewFactory> {
    public override fun getValue() = ABI.makeITwoPaneViewFactory(pointer.getPointer(0))

    public fun setValue(value: ITwoPaneViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITwoPaneViewFactory {
    public val __1210945715_Ptr: Pointer?

    public val _1210945715_VtblPtr: Pointer?
      get() = __1210945715_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TwoPaneView? {
      val fnPtr = _1210945715_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TwoPaneView>()
      val hr = fn.invokeHR(arrayOf(__1210945715_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TwoPaneView>(result.getValue())
      return resultValue
    }
  }

  public class ITwoPaneViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1210945715_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITwoPaneViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18ff792d58b459eda05151aceffbcca9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITwoPaneViewFactory(ptr: Pointer?): WithDefault = ITwoPaneViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITwoPaneViewFactory {
      val address = segment.toRawLongValue()
      return makeITwoPaneViewFactory(Pointer(address))
    }

    public override fun toNative(obj: ITwoPaneViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1210945715_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITwoPaneViewFactory): Array<ITwoPaneViewFactory?> =
        (elements as
        Array<ITwoPaneViewFactory?>).castToImpl<ITwoPaneViewFactory,ITwoPaneViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITwoPaneViewFactory?> =
        arrayOfNulls<ITwoPaneViewFactory_Impl>(size) as Array<ITwoPaneViewFactory?>
  }
}
