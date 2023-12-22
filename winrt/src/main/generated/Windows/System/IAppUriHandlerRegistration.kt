package Windows.System

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncAction
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppUriHandlerRegistration.ABI::class)
@Signature("{6f73aeb1-4569-5c3f-9ba0-99123eea32c3}")
@Guid("6f73aeb145695c3f9ba099123eea32c3")
@WinRTInterface("6f73aeb145695c3f9ba099123eea32c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppUriHandlerRegistration.ByReference::class)
public interface IAppUriHandlerRegistration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_User(): User?

  @InterfaceMethod(2)
  public fun GetAppAddedHostsAsync(): IAsyncOperation<IVector<AppUriHandlerHost?>?>?

  @InterfaceMethod(3)
  public fun SetAppAddedHostsAsync(hosts: IIterable<AppUriHandlerHost?>?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppUriHandlerRegistration> {
    public override fun getValue() = ABI.makeIAppUriHandlerRegistration(pointer.getPointer(0))

    public fun setValue(value: IAppUriHandlerRegistration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppUriHandlerRegistration {
    public val __1889956617_Ptr: Pointer?

    public val _1889956617_VtblPtr: Pointer?
      get() = __1889956617_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1889956617_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1889956617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_User(): User? {
      val fnPtr = _1889956617_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1889956617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAppAddedHostsAsync(): IAsyncOperation<IVector<AppUriHandlerHost?>?>? {
      val fnPtr = _1889956617_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<AppUriHandlerHost?>?>>()
      val hr = fn.invokeHR(arrayOf(__1889956617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<AppUriHandlerHost?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetAppAddedHostsAsync(hosts: IIterable<AppUriHandlerHost?>?):
        IAsyncAction? {
      val fnPtr = _1889956617_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1889956617_Ptr, marshalToNative(hosts), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAppUriHandlerRegistration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1889956617_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppUriHandlerRegistration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f73aeb145695c3f9ba099123eea32c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppUriHandlerRegistration(ptr: Pointer?): WithDefault =
        IAppUriHandlerRegistration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppUriHandlerRegistration {
      val address = segment.toRawLongValue()
      return makeIAppUriHandlerRegistration(Pointer(address))
    }

    public override fun toNative(obj: IAppUriHandlerRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1889956617_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppUriHandlerRegistration):
        Array<IAppUriHandlerRegistration?> = (elements as
        Array<IAppUriHandlerRegistration?>).castToImpl<IAppUriHandlerRegistration,IAppUriHandlerRegistration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppUriHandlerRegistration?> =
        arrayOfNulls<IAppUriHandlerRegistration_Impl>(size) as Array<IAppUriHandlerRegistration?>
  }
}
