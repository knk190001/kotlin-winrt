package Windows.Storage.AccessCache

import Windows.System.User
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

@ABIMarker(IStorageApplicationPermissionsStatics2.ABI::class)
@Signature("{072716ec-aa05-4294-9a11-1a3d04519ad0}")
@Guid("072716ecaa0542949a111a3d04519ad0")
@WinRTInterface("072716ecaa0542949a111a3d04519ad0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageApplicationPermissionsStatics2.ByReference::class)
public interface IStorageApplicationPermissionsStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFutureAccessListForUser(user: User?): StorageItemAccessList?

  @InterfaceMethod(1)
  public fun GetMostRecentlyUsedListForUser(user: User?): StorageItemMostRecentlyUsedList?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageApplicationPermissionsStatics2> {
    public override fun getValue() =
        ABI.makeIStorageApplicationPermissionsStatics2(pointer.getPointer(0))

    public fun setValue(value: IStorageApplicationPermissionsStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageApplicationPermissionsStatics2 {
    public val __2026307091_Ptr: Pointer?

    public val _2026307091_VtblPtr: Pointer?
      get() = __2026307091_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFutureAccessListForUser(user: User?): StorageItemAccessList? {
      val fnPtr = _2026307091_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageItemAccessList>()
      val hr = fn.invokeHR(arrayOf(__2026307091_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageItemAccessList>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetMostRecentlyUsedListForUser(user: User?):
        StorageItemMostRecentlyUsedList? {
      val fnPtr = _2026307091_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageItemMostRecentlyUsedList>()
      val hr = fn.invokeHR(arrayOf(__2026307091_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageItemMostRecentlyUsedList>(result.getValue())
      return resultValue
    }
  }

  public class IStorageApplicationPermissionsStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2026307091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageApplicationPermissionsStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("072716ecaa0542949a111a3d04519ad0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageApplicationPermissionsStatics2(ptr: Pointer?): WithDefault =
        IStorageApplicationPermissionsStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageApplicationPermissionsStatics2 {
      val address = segment.toRawLongValue()
      return makeIStorageApplicationPermissionsStatics2(Pointer(address))
    }

    public override fun toNative(obj: IStorageApplicationPermissionsStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2026307091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageApplicationPermissionsStatics2):
        Array<IStorageApplicationPermissionsStatics2?> = (elements as
        Array<IStorageApplicationPermissionsStatics2?>).castToImpl<IStorageApplicationPermissionsStatics2,IStorageApplicationPermissionsStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageApplicationPermissionsStatics2?> =
        arrayOfNulls<IStorageApplicationPermissionsStatics2_Impl>(size) as
        Array<IStorageApplicationPermissionsStatics2?>
  }
}
