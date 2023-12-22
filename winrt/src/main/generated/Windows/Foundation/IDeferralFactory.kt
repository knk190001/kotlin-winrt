package Windows.Foundation

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

@ABIMarker(IDeferralFactory.ABI::class)
@Signature("{65a1ecc5-3fb5-4832-8ca9-f061b281d13a}")
@Guid("65a1ecc53fb548328ca9f061b281d13a")
@WinRTInterface("65a1ecc53fb548328ca9f061b281d13a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeferralFactory.ByReference::class)
public interface IDeferralFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(handler: DeferralCompletedHandler?): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeferralFactory> {
    public override fun getValue() = ABI.makeIDeferralFactory(pointer.getPointer(0))

    public fun setValue(value: IDeferralFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeferralFactory {
    public val __197057748_Ptr: Pointer?

    public val _197057748_VtblPtr: Pointer?
      get() = __197057748_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(handler: DeferralCompletedHandler?): Deferral? {
      val fnPtr = _197057748_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__197057748_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IDeferralFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __197057748_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeferralFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("65a1ecc53fb548328ca9f061b281d13a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeferralFactory(ptr: Pointer?): WithDefault = IDeferralFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeferralFactory {
      val address = segment.toRawLongValue()
      return makeIDeferralFactory(Pointer(address))
    }

    public override fun toNative(obj: IDeferralFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__197057748_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeferralFactory): Array<IDeferralFactory?> = (elements as
        Array<IDeferralFactory?>).castToImpl<IDeferralFactory,IDeferralFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeferralFactory?> =
        arrayOfNulls<IDeferralFactory_Impl>(size) as Array<IDeferralFactory?>
  }
}
