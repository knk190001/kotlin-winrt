package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactChangeTracker2.ABI::class)
@Signature("{7f8ad0fc-9321-4d18-9c09-d708c63fcd31}")
@Guid("7f8ad0fc93214d189c09d708c63fcd31")
@WinRTInterface("7f8ad0fc93214d189c09d708c63fcd31")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactChangeTracker2.ByReference::class)
public interface IContactChangeTracker2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTracking(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactChangeTracker2> {
    public override fun getValue() = ABI.makeIContactChangeTracker2(pointer.getPointer(0))

    public fun setValue(value: IContactChangeTracker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactChangeTracker2 {
    public val __217336162_Ptr: Pointer?

    public val _217336162_VtblPtr: Pointer?
      get() = __217336162_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTracking(): Boolean {
      val fnPtr = _217336162_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__217336162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IContactChangeTracker2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __217336162_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactChangeTracker2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f8ad0fc93214d189c09d708c63fcd31")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactChangeTracker2(ptr: Pointer?): WithDefault =
        IContactChangeTracker2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactChangeTracker2 {
      val address = segment.toRawLongValue()
      return makeIContactChangeTracker2(Pointer(address))
    }

    public override fun toNative(obj: IContactChangeTracker2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__217336162_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactChangeTracker2): Array<IContactChangeTracker2?> =
        (elements as
        Array<IContactChangeTracker2?>).castToImpl<IContactChangeTracker2,IContactChangeTracker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactChangeTracker2?> =
        arrayOfNulls<IContactChangeTracker2_Impl>(size) as Array<IContactChangeTracker2?>
  }
}
