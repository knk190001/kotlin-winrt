package Windows.UI.Notifications

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToastCollectionManager.ABI::class)
@Signature("{2a1821fe-179d-49bc-b79d-a527920d3665}")
@Guid("2a1821fe179d49bcb79da527920d3665")
@WinRTInterface("2a1821fe179d49bcb79da527920d3665")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastCollectionManager.ByReference::class)
public interface IToastCollectionManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SaveToastCollectionAsync(collection: ToastCollection?): IAsyncAction?

  @InterfaceMethod(1)
  public fun FindAllToastCollectionsAsync(): IAsyncOperation<IVectorView<ToastCollection?>?>?

  @InterfaceMethod(2)
  public fun GetToastCollectionAsync(collectionId: String?): IAsyncOperation<ToastCollection?>?

  @InterfaceMethod(3)
  public fun RemoveToastCollectionAsync(collectionId: String?): IAsyncAction?

  @InterfaceMethod(4)
  public fun RemoveAllToastCollectionsAsync(): IAsyncAction?

  @InterfaceMethod(5)
  public fun get_User(): User?

  @InterfaceMethod(6)
  public fun get_AppId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastCollectionManager> {
    public override fun getValue() = ABI.makeIToastCollectionManager(pointer.getPointer(0))

    public fun setValue(value: IToastCollectionManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastCollectionManager {
    public val __536832056_Ptr: Pointer?

    public val _536832056_VtblPtr: Pointer?
      get() = __536832056_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SaveToastCollectionAsync(collection: ToastCollection?): IAsyncAction? {
      val fnPtr = _536832056_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__536832056_Ptr, marshalToNative(collection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindAllToastCollectionsAsync():
        IAsyncOperation<IVectorView<ToastCollection?>?>? {
      val fnPtr = _536832056_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ToastCollection?>?>>()
      val hr = fn.invokeHR(arrayOf(__536832056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ToastCollection?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetToastCollectionAsync(collectionId: String?):
        IAsyncOperation<ToastCollection?>? {
      val fnPtr = _536832056_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ToastCollection?>>()
      val hr = fn.invokeHR(arrayOf(__536832056_Ptr, marshalToNative(collectionId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ToastCollection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RemoveToastCollectionAsync(collectionId: String?): IAsyncAction? {
      val fnPtr = _536832056_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__536832056_Ptr, marshalToNative(collectionId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RemoveAllToastCollectionsAsync(): IAsyncAction? {
      val fnPtr = _536832056_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__536832056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_User(): User? {
      val fnPtr = _536832056_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__536832056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_AppId(): String? {
      val fnPtr = _536832056_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__536832056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IToastCollectionManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __536832056_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastCollectionManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a1821fe179d49bcb79da527920d3665")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastCollectionManager(ptr: Pointer?): WithDefault =
        IToastCollectionManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastCollectionManager {
      val address = segment.toRawLongValue()
      return makeIToastCollectionManager(Pointer(address))
    }

    public override fun toNative(obj: IToastCollectionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__536832056_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastCollectionManager): Array<IToastCollectionManager?>
        = (elements as
        Array<IToastCollectionManager?>).castToImpl<IToastCollectionManager,IToastCollectionManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastCollectionManager?> =
        arrayOfNulls<IToastCollectionManager_Impl>(size) as Array<IToastCollectionManager?>
  }
}
