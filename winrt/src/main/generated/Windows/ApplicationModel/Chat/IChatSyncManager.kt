package Windows.ApplicationModel.Chat

import Windows.Foundation.IAsyncAction
import Windows.Security.Credentials.WebAccount
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

@ABIMarker(IChatSyncManager.ABI::class)
@Signature("{7ba52c63-2650-486f-b4b4-6bd9d3d63c84}")
@Guid("7ba52c632650486fb4b46bd9d3d63c84")
@WinRTInterface("7ba52c632650486fb4b46bd9d3d63c84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatSyncManager.ByReference::class)
public interface IChatSyncManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Configuration(): ChatSyncConfiguration?

  @InterfaceMethod(1)
  public fun AssociateAccountAsync(webAccount: WebAccount?): IAsyncAction?

  @InterfaceMethod(2)
  public fun UnassociateAccountAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun IsAccountAssociated(webAccount: WebAccount?): Boolean

  @InterfaceMethod(4)
  public fun StartSync(): Unit

  @InterfaceMethod(5)
  public fun SetConfigurationAsync(configuration: ChatSyncConfiguration?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatSyncManager> {
    public override fun getValue() = ABI.makeIChatSyncManager(pointer.getPointer(0))

    public fun setValue(value: IChatSyncManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatSyncManager {
    public val __1106630221_Ptr: Pointer?

    public val _1106630221_VtblPtr: Pointer?
      get() = __1106630221_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Configuration(): ChatSyncConfiguration? {
      val fnPtr = _1106630221_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatSyncConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1106630221_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatSyncConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AssociateAccountAsync(webAccount: WebAccount?): IAsyncAction? {
      val fnPtr = _1106630221_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1106630221_Ptr, marshalToNative(webAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun UnassociateAccountAsync(): IAsyncAction? {
      val fnPtr = _1106630221_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1106630221_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun IsAccountAssociated(webAccount: WebAccount?): Boolean {
      val fnPtr = _1106630221_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1106630221_Ptr, marshalToNative(webAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun StartSync(): Unit {
      val fnPtr = _1106630221_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1106630221_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SetConfigurationAsync(configuration: ChatSyncConfiguration?):
        IAsyncAction? {
      val fnPtr = _1106630221_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1106630221_Ptr, marshalToNative(configuration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IChatSyncManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1106630221_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatSyncManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ba52c632650486fb4b46bd9d3d63c84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatSyncManager(ptr: Pointer?): WithDefault = IChatSyncManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatSyncManager {
      val address = segment.toRawLongValue()
      return makeIChatSyncManager(Pointer(address))
    }

    public override fun toNative(obj: IChatSyncManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1106630221_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatSyncManager): Array<IChatSyncManager?> = (elements as
        Array<IChatSyncManager?>).castToImpl<IChatSyncManager,IChatSyncManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatSyncManager?> =
        arrayOfNulls<IChatSyncManager_Impl>(size) as Array<IChatSyncManager?>
  }
}
