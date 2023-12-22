package Windows.ApplicationModel.Calls

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

@ABIMarker(IPhoneCallStore.ABI::class)
@Signature("{5f610748-18a6-4173-86d1-28be9dc62dba}")
@Guid("5f61074818a6417386d128be9dc62dba")
@WinRTInterface("5f61074818a6417386d128be9dc62dba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallStore.ByReference::class)
public interface IPhoneCallStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsEmergencyPhoneNumberAsync(number: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun GetDefaultLineAsync(): IAsyncOperation<com.sun.jna.platform.win32.Guid.GUID?>?

  @InterfaceMethod(2)
  public fun RequestLineWatcher(): PhoneLineWatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallStore> {
    public override fun getValue() = ABI.makeIPhoneCallStore(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallStore {
    public val __1156580013_Ptr: Pointer?

    public val _1156580013_VtblPtr: Pointer?
      get() = __1156580013_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsEmergencyPhoneNumberAsync(number: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _1156580013_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1156580013_Ptr, marshalToNative(number), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDefaultLineAsync():
        IAsyncOperation<com.sun.jna.platform.win32.Guid.GUID?>? {
      val fnPtr = _1156580013_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<com.sun.jna.platform.win32.Guid.GUID?>>()
      val hr = fn.invokeHR(arrayOf(__1156580013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<com.sun.jna.platform.win32.Guid.GUID?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestLineWatcher(): PhoneLineWatcher? {
      val fnPtr = _1156580013_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineWatcher>()
      val hr = fn.invokeHR(arrayOf(__1156580013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineWatcher>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1156580013_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f61074818a6417386d128be9dc62dba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallStore(ptr: Pointer?): WithDefault = IPhoneCallStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallStore {
      val address = segment.toRawLongValue()
      return makeIPhoneCallStore(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1156580013_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallStore): Array<IPhoneCallStore?> = (elements as
        Array<IPhoneCallStore?>).castToImpl<IPhoneCallStore,IPhoneCallStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallStore?> =
        arrayOfNulls<IPhoneCallStore_Impl>(size) as Array<IPhoneCallStore?>
  }
}
