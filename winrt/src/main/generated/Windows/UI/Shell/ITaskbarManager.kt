package Windows.UI.Shell

import Windows.ApplicationModel.Core.AppListEntry
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITaskbarManager.ABI::class)
@Signature("{87490a19-1ad9-49f4-b2e8-86738dc5ac40}")
@Guid("87490a191ad949f4b2e886738dc5ac40")
@WinRTInterface("87490a191ad949f4b2e886738dc5ac40")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITaskbarManager.ByReference::class)
public interface ITaskbarManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_IsPinningAllowed(): Boolean

  @InterfaceMethod(2)
  public fun IsCurrentAppPinnedAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(3)
  public fun IsAppListEntryPinnedAsync(appListEntry: AppListEntry?): IAsyncOperation<Boolean>?

  @InterfaceMethod(4)
  public fun RequestPinCurrentAppAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun RequestPinAppListEntryAsync(appListEntry: AppListEntry?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITaskbarManager> {
    public override fun getValue() = ABI.makeITaskbarManager(pointer.getPointer(0))

    public fun setValue(value: ITaskbarManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITaskbarManager {
    public val __1857322873_Ptr: Pointer?

    public val _1857322873_VtblPtr: Pointer?
      get() = __1857322873_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSupported(): Boolean {
      val fnPtr = _1857322873_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1857322873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsPinningAllowed(): Boolean {
      val fnPtr = _1857322873_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1857322873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun IsCurrentAppPinnedAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1857322873_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1857322873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun IsAppListEntryPinnedAsync(appListEntry: AppListEntry?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1857322873_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1857322873_Ptr, marshalToNative(appListEntry), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestPinCurrentAppAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1857322873_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1857322873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RequestPinAppListEntryAsync(appListEntry: AppListEntry?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1857322873_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1857322873_Ptr, marshalToNative(appListEntry), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ITaskbarManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1857322873_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITaskbarManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87490a191ad949f4b2e886738dc5ac40")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITaskbarManager(ptr: Pointer?): WithDefault = ITaskbarManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITaskbarManager {
      val address = segment.toRawLongValue()
      return makeITaskbarManager(Pointer(address))
    }

    public override fun toNative(obj: ITaskbarManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1857322873_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITaskbarManager): Array<ITaskbarManager?> = (elements as
        Array<ITaskbarManager?>).castToImpl<ITaskbarManager,ITaskbarManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITaskbarManager?> =
        arrayOfNulls<ITaskbarManager_Impl>(size) as Array<ITaskbarManager?>
  }
}
