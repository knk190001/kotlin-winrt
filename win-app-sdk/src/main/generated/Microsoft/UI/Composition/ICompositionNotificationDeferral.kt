package Microsoft.UI.Composition

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

@ABIMarker(ICompositionNotificationDeferral.ABI::class)
@Signature("{396698b7-437b-5acf-aec9-6342c437faf1}")
@Guid("396698b7437b5acfaec96342c437faf1")
@WinRTInterface("396698b7437b5acfaec96342c437faf1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionNotificationDeferral.ByReference::class)
public interface ICompositionNotificationDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionNotificationDeferral> {
    public override fun getValue() = ABI.makeICompositionNotificationDeferral(pointer.getPointer(0))

    public fun setValue(value: ICompositionNotificationDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionNotificationDeferral {
    public val __869667591_Ptr: Pointer?

    public val _869667591_VtblPtr: Pointer?
      get() = __869667591_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _869667591_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__869667591_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionNotificationDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __869667591_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionNotificationDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("396698b7437b5acfaec96342c437faf1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionNotificationDeferral(ptr: Pointer?): WithDefault =
        ICompositionNotificationDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionNotificationDeferral {
      val address = segment.toRawLongValue()
      return makeICompositionNotificationDeferral(Pointer(address))
    }

    public override fun toNative(obj: ICompositionNotificationDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__869667591_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionNotificationDeferral):
        Array<ICompositionNotificationDeferral?> = (elements as
        Array<ICompositionNotificationDeferral?>).castToImpl<ICompositionNotificationDeferral,ICompositionNotificationDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionNotificationDeferral?> =
        arrayOfNulls<ICompositionNotificationDeferral_Impl>(size) as
        Array<ICompositionNotificationDeferral?>
  }
}
