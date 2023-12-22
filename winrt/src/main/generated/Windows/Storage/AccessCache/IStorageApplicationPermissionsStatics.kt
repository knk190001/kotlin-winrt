package Windows.Storage.AccessCache

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

@ABIMarker(IStorageApplicationPermissionsStatics.ABI::class)
@Signature("{4391dfaa-d033-48f9-8060-3ec847d2e3f1}")
@Guid("4391dfaad03348f980603ec847d2e3f1")
@WinRTInterface("4391dfaad03348f980603ec847d2e3f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageApplicationPermissionsStatics.ByReference::class)
public interface IStorageApplicationPermissionsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FutureAccessList(): StorageItemAccessList?

  @InterfaceMethod(1)
  public fun get_MostRecentlyUsedList(): StorageItemMostRecentlyUsedList?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageApplicationPermissionsStatics> {
    public override fun getValue() =
        ABI.makeIStorageApplicationPermissionsStatics(pointer.getPointer(0))

    public fun setValue(value: IStorageApplicationPermissionsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageApplicationPermissionsStatics {
    public val __211729921_Ptr: Pointer?

    public val _211729921_VtblPtr: Pointer?
      get() = __211729921_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FutureAccessList(): StorageItemAccessList? {
      val fnPtr = _211729921_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageItemAccessList>()
      val hr = fn.invokeHR(arrayOf(__211729921_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageItemAccessList>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MostRecentlyUsedList(): StorageItemMostRecentlyUsedList? {
      val fnPtr = _211729921_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageItemMostRecentlyUsedList>()
      val hr = fn.invokeHR(arrayOf(__211729921_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageItemMostRecentlyUsedList>(result.getValue())
      return resultValue
    }
  }

  public class IStorageApplicationPermissionsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __211729921_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageApplicationPermissionsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4391dfaad03348f980603ec847d2e3f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageApplicationPermissionsStatics(ptr: Pointer?): WithDefault =
        IStorageApplicationPermissionsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageApplicationPermissionsStatics {
      val address = segment.toRawLongValue()
      return makeIStorageApplicationPermissionsStatics(Pointer(address))
    }

    public override fun toNative(obj: IStorageApplicationPermissionsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__211729921_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageApplicationPermissionsStatics):
        Array<IStorageApplicationPermissionsStatics?> = (elements as
        Array<IStorageApplicationPermissionsStatics?>).castToImpl<IStorageApplicationPermissionsStatics,IStorageApplicationPermissionsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageApplicationPermissionsStatics?> =
        arrayOfNulls<IStorageApplicationPermissionsStatics_Impl>(size) as
        Array<IStorageApplicationPermissionsStatics?>
  }
}
