package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Activation.BackgroundActivatedEventArgs
import Windows.Foundation.Collections.IMapView
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IBackgroundTaskRegistrationGroup.ABI::class)
@Signature("{2ab1919a-871b-4167-8a76-055cd67b5b23}")
@Guid("2ab1919a871b41678a76055cd67b5b23")
@WinRTInterface("2ab1919a871b41678a76055cd67b5b23")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskRegistrationGroup.ByReference::class)
public interface IBackgroundTaskRegistrationGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun add_BackgroundActivated(handler: TypedEventHandler<BackgroundTaskRegistrationGroup?,
      BackgroundActivatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_BackgroundActivated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_AllTasks(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
      BackgroundTaskRegistration?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskRegistrationGroup> {
    public override fun getValue() = ABI.makeIBackgroundTaskRegistrationGroup(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskRegistrationGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskRegistrationGroup {
    public val __1558434398_Ptr: Pointer?

    public val _1558434398_VtblPtr: Pointer?
      get() = __1558434398_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1558434398_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1558434398_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _1558434398_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1558434398_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun add_BackgroundActivated(handler: TypedEventHandler<BackgroundTaskRegistrationGroup?,
        BackgroundActivatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1558434398_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1558434398_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_BackgroundActivated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1558434398_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1558434398_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AllTasks(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
        BackgroundTaskRegistration?>? {
      val fnPtr = _1558434398_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          BackgroundTaskRegistration?>>()
      val hr = fn.invokeHR(arrayOf(__1558434398_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          BackgroundTaskRegistration?>>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundTaskRegistrationGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1558434398_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskRegistrationGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ab1919a871b41678a76055cd67b5b23")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskRegistrationGroup(ptr: Pointer?): WithDefault =
        IBackgroundTaskRegistrationGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskRegistrationGroup {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskRegistrationGroup(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskRegistrationGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1558434398_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskRegistrationGroup):
        Array<IBackgroundTaskRegistrationGroup?> = (elements as
        Array<IBackgroundTaskRegistrationGroup?>).castToImpl<IBackgroundTaskRegistrationGroup,IBackgroundTaskRegistrationGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskRegistrationGroup?> =
        arrayOfNulls<IBackgroundTaskRegistrationGroup_Impl>(size) as
        Array<IBackgroundTaskRegistrationGroup?>
  }
}
