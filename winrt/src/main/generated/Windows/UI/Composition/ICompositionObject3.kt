package Windows.UI.Composition

import Windows.System.DispatcherQueue
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

@ABIMarker(ICompositionObject3.ABI::class)
@Signature("{4bc27925-dacd-4cf2-98b1-986b76e7ebe6}")
@Guid("4bc27925dacd4cf298b1986b76e7ebe6")
@WinRTInterface("4bc27925dacd4cf298b1986b76e7ebe6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionObject3.ByReference::class)
public interface ICompositionObject3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DispatcherQueue(): DispatcherQueue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionObject3> {
    public override fun getValue() = ABI.makeICompositionObject3(pointer.getPointer(0))

    public fun setValue(value: ICompositionObject3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionObject3 {
    public val __1304991736_Ptr: Pointer?

    public val _1304991736_VtblPtr: Pointer?
      get() = __1304991736_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _1304991736_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__1304991736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionObject3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1304991736_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionObject3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4bc27925dacd4cf298b1986b76e7ebe6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionObject3(ptr: Pointer?): WithDefault = ICompositionObject3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionObject3 {
      val address = segment.toRawLongValue()
      return makeICompositionObject3(Pointer(address))
    }

    public override fun toNative(obj: ICompositionObject3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1304991736_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionObject3): Array<ICompositionObject3?> =
        (elements as
        Array<ICompositionObject3?>).castToImpl<ICompositionObject3,ICompositionObject3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionObject3?> =
        arrayOfNulls<ICompositionObject3_Impl>(size) as Array<ICompositionObject3?>
  }
}
