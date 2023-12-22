package Windows.Media.Protection

import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IMediaProtectionManager.ABI::class)
@Signature("{45694947-c741-434b-a79e-474c12d93d2f}")
@Guid("45694947c741434ba79e474c12d93d2f")
@WinRTInterface("45694947c741434ba79e474c12d93d2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaProtectionManager.ByReference::class)
public interface IMediaProtectionManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ServiceRequested(handler: ServiceRequestedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ServiceRequested(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_RebootNeeded(handler: RebootNeededEventHandler?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_RebootNeeded(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_ComponentLoadFailed(handler: ComponentLoadFailedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ComponentLoadFailed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_Properties(): IPropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaProtectionManager> {
    public override fun getValue() = ABI.makeIMediaProtectionManager(pointer.getPointer(0))

    public fun setValue(value: IMediaProtectionManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaProtectionManager {
    public val __1607533717_Ptr: Pointer?

    public val _1607533717_VtblPtr: Pointer?
      get() = __1607533717_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ServiceRequested(handler: ServiceRequestedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1607533717_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1607533717_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ServiceRequested(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1607533717_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1607533717_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_RebootNeeded(handler: RebootNeededEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1607533717_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1607533717_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_RebootNeeded(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1607533717_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1607533717_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_ComponentLoadFailed(handler: ComponentLoadFailedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1607533717_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1607533717_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ComponentLoadFailed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1607533717_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1607533717_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Properties(): IPropertySet? {
      val fnPtr = _1607533717_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1607533717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }
  }

  public class IMediaProtectionManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1607533717_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaProtectionManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("45694947c741434ba79e474c12d93d2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaProtectionManager(ptr: Pointer?): WithDefault =
        IMediaProtectionManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaProtectionManager {
      val address = segment.toRawLongValue()
      return makeIMediaProtectionManager(Pointer(address))
    }

    public override fun toNative(obj: IMediaProtectionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1607533717_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaProtectionManager): Array<IMediaProtectionManager?>
        = (elements as
        Array<IMediaProtectionManager?>).castToImpl<IMediaProtectionManager,IMediaProtectionManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaProtectionManager?> =
        arrayOfNulls<IMediaProtectionManager_Impl>(size) as Array<IMediaProtectionManager?>
  }
}
