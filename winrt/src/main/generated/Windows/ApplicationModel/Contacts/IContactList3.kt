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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactList3.ABI::class)
@Signature("{1578ee57-26fc-41e8-a850-5aa32514aca9}")
@Guid("1578ee5726fc41e8a8505aa32514aca9")
@WinRTInterface("1578ee5726fc41e8a8505aa32514aca9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactList3.ByReference::class)
public interface IContactList3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LimitedWriteOperations(): ContactListLimitedWriteOperations?

  @InterfaceMethod(1)
  public fun GetChangeTracker(identity: String?): ContactChangeTracker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactList3>
      {
    public override fun getValue() = ABI.makeIContactList3(pointer.getPointer(0))

    public fun setValue(value: IContactList3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactList3 {
    public val __1319975423_Ptr: Pointer?

    public val _1319975423_VtblPtr: Pointer?
      get() = __1319975423_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LimitedWriteOperations(): ContactListLimitedWriteOperations? {
      val fnPtr = _1319975423_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactListLimitedWriteOperations>()
      val hr = fn.invokeHR(arrayOf(__1319975423_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactListLimitedWriteOperations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetChangeTracker(identity: String?): ContactChangeTracker? {
      val fnPtr = _1319975423_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__1319975423_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactChangeTracker>(result.getValue())
      return resultValue
    }
  }

  public class IContactList3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1319975423_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactList3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1578ee5726fc41e8a8505aa32514aca9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactList3(ptr: Pointer?): WithDefault = IContactList3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactList3 {
      val address = segment.toRawLongValue()
      return makeIContactList3(Pointer(address))
    }

    public override fun toNative(obj: IContactList3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1319975423_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactList3): Array<IContactList3?> = (elements as
        Array<IContactList3?>).castToImpl<IContactList3,IContactList3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactList3?> =
        arrayOfNulls<IContactList3_Impl>(size) as Array<IContactList3?>
  }
}
