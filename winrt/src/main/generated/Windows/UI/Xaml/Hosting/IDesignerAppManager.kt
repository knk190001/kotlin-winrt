package Windows.UI.Xaml.Hosting

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Size
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IDesignerAppManager.ABI::class)
@Signature("{a6272caa-d5c6-40cb-abd9-27ba43831bb7}")
@Guid("a6272caad5c640cbabd927ba43831bb7")
@WinRTInterface("a6272caad5c640cbabd927ba43831bb7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesignerAppManager.ByReference::class)
public interface IDesignerAppManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppUserModelId(): String?

  @InterfaceMethod(1)
  public fun add_DesignerAppExited(handler: TypedEventHandler<DesignerAppManager?,
      DesignerAppExitedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_DesignerAppExited(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun CreateNewViewAsync(initialViewState: DesignerAppViewState?, initialViewSize: Size?):
      IAsyncOperation<DesignerAppView?>?

  @InterfaceMethod(4)
  public fun LoadObjectIntoAppAsync(
    dllName: String?,
    classId: com.sun.jna.platform.win32.Guid.GUID?,
    initializationData: String?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesignerAppManager> {
    public override fun getValue() = ABI.makeIDesignerAppManager(pointer.getPointer(0))

    public fun setValue(value: IDesignerAppManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesignerAppManager {
    public val __1311437891_Ptr: Pointer?

    public val _1311437891_VtblPtr: Pointer?
      get() = __1311437891_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppUserModelId(): String? {
      val fnPtr = _1311437891_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1311437891_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_DesignerAppExited(handler: TypedEventHandler<DesignerAppManager?,
        DesignerAppExitedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1311437891_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1311437891_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_DesignerAppExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _1311437891_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1311437891_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun CreateNewViewAsync(initialViewState: DesignerAppViewState?,
        initialViewSize: Size?): IAsyncOperation<DesignerAppView?>? {
      val fnPtr = _1311437891_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DesignerAppView?>>()
      val hr = fn.invokeHR(arrayOf(__1311437891_Ptr, marshalToNative(initialViewState),
          marshalToNative(initialViewSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DesignerAppView?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun LoadObjectIntoAppAsync(
      dllName: String?,
      classId: com.sun.jna.platform.win32.Guid.GUID?,
      initializationData: String?
    ): IAsyncAction? {
      val fnPtr = _1311437891_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1311437891_Ptr, marshalToNative(dllName),
          marshalToNative(classId), marshalToNative(initializationData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IDesignerAppManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1311437891_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesignerAppManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6272caad5c640cbabd927ba43831bb7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesignerAppManager(ptr: Pointer?): WithDefault = IDesignerAppManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesignerAppManager {
      val address = segment.toRawLongValue()
      return makeIDesignerAppManager(Pointer(address))
    }

    public override fun toNative(obj: IDesignerAppManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1311437891_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesignerAppManager): Array<IDesignerAppManager?> =
        (elements as
        Array<IDesignerAppManager?>).castToImpl<IDesignerAppManager,IDesignerAppManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesignerAppManager?> =
        arrayOfNulls<IDesignerAppManager_Impl>(size) as Array<IDesignerAppManager?>
  }
}
