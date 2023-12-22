package Windows.ApplicationModel.Contacts

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactListLimitedWriteOperations.ABI::class)
@Signature("{e19813da-4a0b-44b8-9a1f-a0f3d218175f}")
@Guid("e19813da4a0b44b89a1fa0f3d218175f")
@WinRTInterface("e19813da4a0b44b89a1fa0f3d218175f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListLimitedWriteOperations.ByReference::class)
public interface IContactListLimitedWriteOperations : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreateOrUpdateContactAsync(contact: Contact?): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun TryDeleteContactAsync(contactId: String?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListLimitedWriteOperations> {
    public override fun getValue() =
        ABI.makeIContactListLimitedWriteOperations(pointer.getPointer(0))

    public fun setValue(value: IContactListLimitedWriteOperations_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListLimitedWriteOperations {
    public val __1722257597_Ptr: Pointer?

    public val _1722257597_VtblPtr: Pointer?
      get() = __1722257597_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreateOrUpdateContactAsync(contact: Contact?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1722257597_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1722257597_Ptr, marshalToNative(contact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryDeleteContactAsync(contactId: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _1722257597_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1722257597_Ptr, marshalToNative(contactId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IContactListLimitedWriteOperations_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1722257597_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListLimitedWriteOperations, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e19813da4a0b44b89a1fa0f3d218175f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListLimitedWriteOperations(ptr: Pointer?): WithDefault =
        IContactListLimitedWriteOperations_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactListLimitedWriteOperations {
      val address = segment.toRawLongValue()
      return makeIContactListLimitedWriteOperations(Pointer(address))
    }

    public override fun toNative(obj: IContactListLimitedWriteOperations): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1722257597_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListLimitedWriteOperations):
        Array<IContactListLimitedWriteOperations?> = (elements as
        Array<IContactListLimitedWriteOperations?>).castToImpl<IContactListLimitedWriteOperations,IContactListLimitedWriteOperations_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactListLimitedWriteOperations?> =
        arrayOfNulls<IContactListLimitedWriteOperations_Impl>(size) as
        Array<IContactListLimitedWriteOperations?>
  }
}
