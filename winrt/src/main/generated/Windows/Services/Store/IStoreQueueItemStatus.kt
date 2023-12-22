package Windows.Services.Store

import Windows.Foundation.HResult
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

@ABIMarker(IStoreQueueItemStatus.ABI::class)
@Signature("{9bd6796f-9cc3-4ec3-b2ef-7be433b30174}")
@Guid("9bd6796f9cc34ec3b2ef7be433b30174")
@WinRTInterface("9bd6796f9cc34ec3b2ef7be433b30174")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreQueueItemStatus.ByReference::class)
public interface IStoreQueueItemStatus : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PackageInstallState(): StoreQueueItemState?

  @InterfaceMethod(1)
  public fun get_PackageInstallExtendedState(): StoreQueueItemExtendedState?

  @InterfaceMethod(2)
  public fun get_UpdateStatus(): StorePackageUpdateStatus?

  @InterfaceMethod(3)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreQueueItemStatus> {
    public override fun getValue() = ABI.makeIStoreQueueItemStatus(pointer.getPointer(0))

    public fun setValue(value: IStoreQueueItemStatus_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreQueueItemStatus {
    public val __1102538466_Ptr: Pointer?

    public val _1102538466_VtblPtr: Pointer?
      get() = __1102538466_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PackageInstallState(): StoreQueueItemState? {
      val fnPtr = _1102538466_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreQueueItemState>()
      val hr = fn.invokeHR(arrayOf(__1102538466_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreQueueItemState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PackageInstallExtendedState(): StoreQueueItemExtendedState? {
      val fnPtr = _1102538466_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreQueueItemExtendedState>()
      val hr = fn.invokeHR(arrayOf(__1102538466_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreQueueItemExtendedState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_UpdateStatus(): StorePackageUpdateStatus? {
      val fnPtr = _1102538466_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorePackageUpdateStatus>()
      val hr = fn.invokeHR(arrayOf(__1102538466_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorePackageUpdateStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1102538466_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1102538466_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IStoreQueueItemStatus_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1102538466_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreQueueItemStatus, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9bd6796f9cc34ec3b2ef7be433b30174")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreQueueItemStatus(ptr: Pointer?): WithDefault =
        IStoreQueueItemStatus_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreQueueItemStatus {
      val address = segment.toRawLongValue()
      return makeIStoreQueueItemStatus(Pointer(address))
    }

    public override fun toNative(obj: IStoreQueueItemStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1102538466_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreQueueItemStatus): Array<IStoreQueueItemStatus?> =
        (elements as
        Array<IStoreQueueItemStatus?>).castToImpl<IStoreQueueItemStatus,IStoreQueueItemStatus_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreQueueItemStatus?> =
        arrayOfNulls<IStoreQueueItemStatus_Impl>(size) as Array<IStoreQueueItemStatus?>
  }
}
