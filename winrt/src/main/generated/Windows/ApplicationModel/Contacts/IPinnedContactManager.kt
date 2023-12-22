package Windows.ApplicationModel.Contacts

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IPinnedContactManager.ABI::class)
@Signature("{fcbc740c-e1d6-45c3-b8b6-a35604e167a0}")
@Guid("fcbc740ce1d645c3b8b6a35604e167a0")
@WinRTInterface("fcbc740ce1d645c3b8b6a35604e167a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPinnedContactManager.ByReference::class)
public interface IPinnedContactManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  @InterfaceMethod(1)
  public fun IsPinSurfaceSupported(surface: PinnedContactSurface?): Boolean

  @InterfaceMethod(2)
  public fun IsContactPinned(contact: Contact?, surface: PinnedContactSurface?): Boolean

  @InterfaceMethod(3)
  public fun RequestPinContactAsync(contact: Contact?, surface: PinnedContactSurface?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(4)
  public fun RequestPinContactsAsync(contacts: IIterable<Contact?>?,
      surface: PinnedContactSurface?): IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun RequestUnpinContactAsync(contact: Contact?, surface: PinnedContactSurface?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(6)
  public fun SignalContactActivity(contact: Contact?): Unit

  @InterfaceMethod(7)
  public fun GetPinnedContactIdsAsync(): IAsyncOperation<PinnedContactIdsQueryResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPinnedContactManager> {
    public override fun getValue() = ABI.makeIPinnedContactManager(pointer.getPointer(0))

    public fun setValue(value: IPinnedContactManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPinnedContactManager {
    public val __487660625_Ptr: Pointer?

    public val _487660625_VtblPtr: Pointer?
      get() = __487660625_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _487660625_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__487660625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsPinSurfaceSupported(surface: PinnedContactSurface?): Boolean {
      val fnPtr = _487660625_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__487660625_Ptr, marshalToNative(surface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun IsContactPinned(contact: Contact?, surface: PinnedContactSurface?):
        Boolean {
      val fnPtr = _487660625_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__487660625_Ptr, marshalToNative(contact),
          marshalToNative(surface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun RequestPinContactAsync(contact: Contact?, surface: PinnedContactSurface?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _487660625_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__487660625_Ptr, marshalToNative(contact),
          marshalToNative(surface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestPinContactsAsync(contacts: IIterable<Contact?>?,
        surface: PinnedContactSurface?): IAsyncOperation<Boolean>? {
      val fnPtr = _487660625_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__487660625_Ptr, marshalToNative(contacts),
          marshalToNative(surface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RequestUnpinContactAsync(contact: Contact?, surface: PinnedContactSurface?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _487660625_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__487660625_Ptr, marshalToNative(contact),
          marshalToNative(surface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SignalContactActivity(contact: Contact?): Unit {
      val fnPtr = _487660625_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487660625_Ptr, marshalToNative(contact),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun GetPinnedContactIdsAsync(): IAsyncOperation<PinnedContactIdsQueryResult?>? {
      val fnPtr = _487660625_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PinnedContactIdsQueryResult?>>()
      val hr = fn.invokeHR(arrayOf(__487660625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PinnedContactIdsQueryResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IPinnedContactManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __487660625_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPinnedContactManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcbc740ce1d645c3b8b6a35604e167a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPinnedContactManager(ptr: Pointer?): WithDefault =
        IPinnedContactManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPinnedContactManager {
      val address = segment.toRawLongValue()
      return makeIPinnedContactManager(Pointer(address))
    }

    public override fun toNative(obj: IPinnedContactManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__487660625_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPinnedContactManager): Array<IPinnedContactManager?> =
        (elements as
        Array<IPinnedContactManager?>).castToImpl<IPinnedContactManager,IPinnedContactManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPinnedContactManager?> =
        arrayOfNulls<IPinnedContactManager_Impl>(size) as Array<IPinnedContactManager?>
  }
}
