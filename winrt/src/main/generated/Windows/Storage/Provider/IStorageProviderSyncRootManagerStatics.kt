package Windows.Storage.Provider

import Windows.Foundation.Collections.IVectorView
import Windows.Storage.IStorageFolder
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

@ABIMarker(IStorageProviderSyncRootManagerStatics.ABI::class)
@Signature("{3e99fbbf-8fe3-4b40-abc7-f6fc3d74c98e}")
@Guid("3e99fbbf8fe34b40abc7f6fc3d74c98e")
@WinRTInterface("3e99fbbf8fe34b40abc7f6fc3d74c98e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderSyncRootManagerStatics.ByReference::class)
public interface IStorageProviderSyncRootManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Register(syncRootInformation: StorageProviderSyncRootInfo?): Unit

  @InterfaceMethod(1)
  public fun Unregister(id: String?): Unit

  @InterfaceMethod(2)
  public fun GetSyncRootInformationForFolder(folder: IStorageFolder?): StorageProviderSyncRootInfo?

  @InterfaceMethod(3)
  public fun GetSyncRootInformationForId(id: String?): StorageProviderSyncRootInfo?

  @InterfaceMethod(4)
  public fun GetCurrentSyncRoots(): IVectorView<StorageProviderSyncRootInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderSyncRootManagerStatics> {
    public override fun getValue() =
        ABI.makeIStorageProviderSyncRootManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderSyncRootManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderSyncRootManagerStatics {
    public val __745661977_Ptr: Pointer?

    public val _745661977_VtblPtr: Pointer?
      get() = __745661977_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Register(syncRootInformation: StorageProviderSyncRootInfo?): Unit {
      val fnPtr = _745661977_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__745661977_Ptr, marshalToNative(syncRootInformation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Unregister(id: String?): Unit {
      val fnPtr = _745661977_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__745661977_Ptr, marshalToNative(id),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetSyncRootInformationForFolder(folder: IStorageFolder?):
        StorageProviderSyncRootInfo? {
      val fnPtr = _745661977_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderSyncRootInfo>()
      val hr = fn.invokeHR(arrayOf(__745661977_Ptr, marshalToNative(folder), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderSyncRootInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetSyncRootInformationForId(id: String?): StorageProviderSyncRootInfo? {
      val fnPtr = _745661977_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderSyncRootInfo>()
      val hr = fn.invokeHR(arrayOf(__745661977_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderSyncRootInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetCurrentSyncRoots(): IVectorView<StorageProviderSyncRootInfo?>? {
      val fnPtr = _745661977_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StorageProviderSyncRootInfo?>>()
      val hr = fn.invokeHR(arrayOf(__745661977_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<StorageProviderSyncRootInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProviderSyncRootManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __745661977_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderSyncRootManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3e99fbbf8fe34b40abc7f6fc3d74c98e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderSyncRootManagerStatics(ptr: Pointer?): WithDefault =
        IStorageProviderSyncRootManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderSyncRootManagerStatics {
      val address = segment.toRawLongValue()
      return makeIStorageProviderSyncRootManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderSyncRootManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__745661977_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderSyncRootManagerStatics):
        Array<IStorageProviderSyncRootManagerStatics?> = (elements as
        Array<IStorageProviderSyncRootManagerStatics?>).castToImpl<IStorageProviderSyncRootManagerStatics,IStorageProviderSyncRootManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderSyncRootManagerStatics?> =
        arrayOfNulls<IStorageProviderSyncRootManagerStatics_Impl>(size) as
        Array<IStorageProviderSyncRootManagerStatics?>
  }
}
