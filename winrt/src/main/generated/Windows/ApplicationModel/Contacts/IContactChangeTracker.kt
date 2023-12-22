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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactChangeTracker.ABI::class)
@Signature("{6e992952-309b-404d-9712-b37bd30278aa}")
@Guid("6e992952309b404d9712b37bd30278aa")
@WinRTInterface("6e992952309b404d9712b37bd30278aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactChangeTracker.ByReference::class)
public interface IContactChangeTracker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Enable(): Unit

  @InterfaceMethod(1)
  public fun GetChangeReader(): ContactChangeReader?

  @InterfaceMethod(2)
  public fun Reset(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactChangeTracker> {
    public override fun getValue() = ABI.makeIContactChangeTracker(pointer.getPointer(0))

    public fun setValue(value: IContactChangeTracker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactChangeTracker {
    public val __1655557140_Ptr: Pointer?

    public val _1655557140_VtblPtr: Pointer?
      get() = __1655557140_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Enable(): Unit {
      val fnPtr = _1655557140_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1655557140_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetChangeReader(): ContactChangeReader? {
      val fnPtr = _1655557140_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactChangeReader>()
      val hr = fn.invokeHR(arrayOf(__1655557140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactChangeReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Reset(): Unit {
      val fnPtr = _1655557140_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1655557140_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactChangeTracker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1655557140_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactChangeTracker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e992952309b404d9712b37bd30278aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactChangeTracker(ptr: Pointer?): WithDefault =
        IContactChangeTracker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactChangeTracker {
      val address = segment.toRawLongValue()
      return makeIContactChangeTracker(Pointer(address))
    }

    public override fun toNative(obj: IContactChangeTracker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1655557140_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactChangeTracker): Array<IContactChangeTracker?> =
        (elements as
        Array<IContactChangeTracker?>).castToImpl<IContactChangeTracker,IContactChangeTracker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactChangeTracker?> =
        arrayOfNulls<IContactChangeTracker_Impl>(size) as Array<IContactChangeTracker?>
  }
}
