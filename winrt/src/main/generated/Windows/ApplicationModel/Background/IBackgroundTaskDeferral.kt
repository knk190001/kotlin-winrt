package Windows.ApplicationModel.Background

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

@ABIMarker(IBackgroundTaskDeferral.ABI::class)
@Signature("{93cc156d-af27-4dd3-846e-24ee40cadd25}")
@Guid("93cc156daf274dd3846e24ee40cadd25")
@WinRTInterface("93cc156daf274dd3846e24ee40cadd25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskDeferral.ByReference::class)
public interface IBackgroundTaskDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskDeferral> {
    public override fun getValue() = ABI.makeIBackgroundTaskDeferral(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskDeferral {
    public val __1838027889_Ptr: Pointer?

    public val _1838027889_VtblPtr: Pointer?
      get() = __1838027889_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _1838027889_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1838027889_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundTaskDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1838027889_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93cc156daf274dd3846e24ee40cadd25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskDeferral(ptr: Pointer?): WithDefault =
        IBackgroundTaskDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskDeferral {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskDeferral(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1838027889_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskDeferral): Array<IBackgroundTaskDeferral?>
        = (elements as
        Array<IBackgroundTaskDeferral?>).castToImpl<IBackgroundTaskDeferral,IBackgroundTaskDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskDeferral?> =
        arrayOfNulls<IBackgroundTaskDeferral_Impl>(size) as Array<IBackgroundTaskDeferral?>
  }
}
