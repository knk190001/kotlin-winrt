package Windows.UI.StartScreen

import Windows.ApplicationModel.Core.AppListEntry
import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStartScreenManager.ABI::class)
@Signature("{4a1dcbcb-26e9-4eb4-8933-859eb6ecdb29}")
@Guid("4a1dcbcb26e94eb48933859eb6ecdb29")
@WinRTInterface("4a1dcbcb26e94eb48933859eb6ecdb29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStartScreenManager.ByReference::class)
public interface IStartScreenManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  @InterfaceMethod(1)
  public fun SupportsAppListEntry(appListEntry: AppListEntry?): Boolean

  @InterfaceMethod(2)
  public fun ContainsAppListEntryAsync(appListEntry: AppListEntry?): IAsyncOperation<Boolean>?

  @InterfaceMethod(3)
  public fun RequestAddAppListEntryAsync(appListEntry: AppListEntry?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStartScreenManager> {
    public override fun getValue() = ABI.makeIStartScreenManager(pointer.getPointer(0))

    public fun setValue(value: IStartScreenManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStartScreenManager {
    public val __169577399_Ptr: Pointer?

    public val _169577399_VtblPtr: Pointer?
      get() = __169577399_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _169577399_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__169577399_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SupportsAppListEntry(appListEntry: AppListEntry?): Boolean {
      val fnPtr = _169577399_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__169577399_Ptr, marshalToNative(appListEntry), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun ContainsAppListEntryAsync(appListEntry: AppListEntry?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _169577399_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__169577399_Ptr, marshalToNative(appListEntry), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestAddAppListEntryAsync(appListEntry: AppListEntry?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _169577399_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__169577399_Ptr, marshalToNative(appListEntry), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IStartScreenManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __169577399_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStartScreenManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a1dcbcb26e94eb48933859eb6ecdb29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStartScreenManager(ptr: Pointer?): WithDefault = IStartScreenManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStartScreenManager {
      val address = segment.toRawLongValue()
      return makeIStartScreenManager(Pointer(address))
    }

    public override fun toNative(obj: IStartScreenManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__169577399_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStartScreenManager): Array<IStartScreenManager?> =
        (elements as
        Array<IStartScreenManager?>).castToImpl<IStartScreenManager,IStartScreenManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStartScreenManager?> =
        arrayOfNulls<IStartScreenManager_Impl>(size) as Array<IStartScreenManager?>
  }
}
