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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IStoreConsumableResult.ABI::class)
@Signature("{ea5dab72-6a00-4052-be5b-bfdab4433352}")
@Guid("ea5dab726a004052be5bbfdab4433352")
@WinRTInterface("ea5dab726a004052be5bbfdab4433352")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreConsumableResult.ByReference::class)
public interface IStoreConsumableResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): StoreConsumableStatus?

  @InterfaceMethod(1)
  public fun get_TrackingId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_BalanceRemaining(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreConsumableResult> {
    public override fun getValue() = ABI.makeIStoreConsumableResult(pointer.getPointer(0))

    public fun setValue(value: IStoreConsumableResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreConsumableResult {
    public val __996263892_Ptr: Pointer?

    public val _996263892_VtblPtr: Pointer?
      get() = __996263892_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): StoreConsumableStatus? {
      val fnPtr = _996263892_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreConsumableStatus>()
      val hr = fn.invokeHR(arrayOf(__996263892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreConsumableStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TrackingId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _996263892_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__996263892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BalanceRemaining(): WinDef.UINT {
      val fnPtr = _996263892_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__996263892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _996263892_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__996263892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IStoreConsumableResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __996263892_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreConsumableResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea5dab726a004052be5bbfdab4433352")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreConsumableResult(ptr: Pointer?): WithDefault =
        IStoreConsumableResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreConsumableResult {
      val address = segment.toRawLongValue()
      return makeIStoreConsumableResult(Pointer(address))
    }

    public override fun toNative(obj: IStoreConsumableResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__996263892_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreConsumableResult): Array<IStoreConsumableResult?> =
        (elements as
        Array<IStoreConsumableResult?>).castToImpl<IStoreConsumableResult,IStoreConsumableResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreConsumableResult?> =
        arrayOfNulls<IStoreConsumableResult_Impl>(size) as Array<IStoreConsumableResult?>
  }
}
