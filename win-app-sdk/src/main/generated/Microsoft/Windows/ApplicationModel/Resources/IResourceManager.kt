package Microsoft.Windows.ApplicationModel.Resources

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IResourceManager.ABI::class)
@Signature("{ac2291ef-81be-5c99-a0ae-bcee0180b8a8}")
@Guid("ac2291ef81be5c99a0aebcee0180b8a8")
@WinRTInterface("ac2291ef81be5c99a0aebcee0180b8a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceManager.ByReference::class)
public interface IResourceManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MainResourceMap(): ResourceMap?

  @InterfaceMethod(1)
  public fun CreateResourceContext(): ResourceContext?

  @InterfaceMethod(2)
  public fun add_ResourceNotFound(handler: TypedEventHandler<ResourceManager?,
      ResourceNotFoundEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ResourceNotFound(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceManager> {
    public override fun getValue() = ABI.makeIResourceManager(pointer.getPointer(0))

    public fun setValue(value: IResourceManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceManager {
    public val __701821937_Ptr: Pointer?

    public val _701821937_VtblPtr: Pointer?
      get() = __701821937_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MainResourceMap(): ResourceMap? {
      val fnPtr = _701821937_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceMap>()
      val hr = fn.invokeHR(arrayOf(__701821937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceMap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateResourceContext(): ResourceContext? {
      val fnPtr = _701821937_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceContext>()
      val hr = fn.invokeHR(arrayOf(__701821937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_ResourceNotFound(handler: TypedEventHandler<ResourceManager?,
        ResourceNotFoundEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _701821937_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__701821937_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ResourceNotFound(token: EventRegistrationToken?): Unit {
      val fnPtr = _701821937_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__701821937_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IResourceManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __701821937_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac2291ef81be5c99a0aebcee0180b8a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceManager(ptr: Pointer?): WithDefault = IResourceManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceManager {
      val address = segment.toRawLongValue()
      return makeIResourceManager(Pointer(address))
    }

    public override fun toNative(obj: IResourceManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__701821937_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceManager): Array<IResourceManager?> = (elements as
        Array<IResourceManager?>).castToImpl<IResourceManager,IResourceManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceManager?> =
        arrayOfNulls<IResourceManager_Impl>(size) as Array<IResourceManager?>
  }
}
