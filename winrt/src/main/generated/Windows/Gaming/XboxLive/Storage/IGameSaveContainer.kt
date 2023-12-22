package Windows.Gaming.XboxLive.Storage

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IGameSaveContainer.ABI::class)
@Signature("{c3c08f89-563f-4ecd-9c6f-33fd0e323d10}")
@Guid("c3c08f89563f4ecd9c6f33fd0e323d10")
@WinRTInterface("c3c08f89563f4ecd9c6f33fd0e323d10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameSaveContainer.ByReference::class)
public interface IGameSaveContainer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Provider(): GameSaveProvider?

  @InterfaceMethod(2)
  public fun SubmitUpdatesAsync(
    blobsToWrite: IMapView<String?, IBuffer?>?,
    blobsToDelete: IIterable<String?>?,
    displayName: String?
  ): IAsyncOperation<GameSaveOperationResult?>?

  @InterfaceMethod(3)
  public fun ReadAsync(blobsToRead: IMapView<String?, IBuffer?>?):
      IAsyncOperation<GameSaveOperationResult?>?

  @InterfaceMethod(4)
  public fun GetAsync(blobsToRead: IIterable<String?>?): IAsyncOperation<GameSaveBlobGetResult?>?

  @InterfaceMethod(5)
  public fun SubmitPropertySetUpdatesAsync(
    blobsToWrite: IPropertySet?,
    blobsToDelete: IIterable<String?>?,
    displayName: String?
  ): IAsyncOperation<GameSaveOperationResult?>?

  @InterfaceMethod(6)
  public fun CreateBlobInfoQuery(blobNamePrefix: String?): GameSaveBlobInfoQuery?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameSaveContainer> {
    public override fun getValue() = ABI.makeIGameSaveContainer(pointer.getPointer(0))

    public fun setValue(value: IGameSaveContainer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameSaveContainer {
    public val __410935799_Ptr: Pointer?

    public val _410935799_VtblPtr: Pointer?
      get() = __410935799_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _410935799_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__410935799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Provider(): GameSaveProvider? {
      val fnPtr = _410935799_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameSaveProvider>()
      val hr = fn.invokeHR(arrayOf(__410935799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameSaveProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SubmitUpdatesAsync(
      blobsToWrite: IMapView<String?, IBuffer?>?,
      blobsToDelete: IIterable<String?>?,
      displayName: String?
    ): IAsyncOperation<GameSaveOperationResult?>? {
      val fnPtr = _410935799_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameSaveOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__410935799_Ptr, marshalToNative(blobsToWrite),
          marshalToNative(blobsToDelete), marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameSaveOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReadAsync(blobsToRead: IMapView<String?, IBuffer?>?):
        IAsyncOperation<GameSaveOperationResult?>? {
      val fnPtr = _410935799_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameSaveOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__410935799_Ptr, marshalToNative(blobsToRead), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameSaveOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetAsync(blobsToRead: IIterable<String?>?):
        IAsyncOperation<GameSaveBlobGetResult?>? {
      val fnPtr = _410935799_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameSaveBlobGetResult?>>()
      val hr = fn.invokeHR(arrayOf(__410935799_Ptr, marshalToNative(blobsToRead), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameSaveBlobGetResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SubmitPropertySetUpdatesAsync(
      blobsToWrite: IPropertySet?,
      blobsToDelete: IIterable<String?>?,
      displayName: String?
    ): IAsyncOperation<GameSaveOperationResult?>? {
      val fnPtr = _410935799_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameSaveOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__410935799_Ptr, marshalToNative(blobsToWrite),
          marshalToNative(blobsToDelete), marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameSaveOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateBlobInfoQuery(blobNamePrefix: String?): GameSaveBlobInfoQuery? {
      val fnPtr = _410935799_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameSaveBlobInfoQuery>()
      val hr = fn.invokeHR(arrayOf(__410935799_Ptr, marshalToNative(blobNamePrefix), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameSaveBlobInfoQuery>(result.getValue())
      return resultValue
    }
  }

  public class IGameSaveContainer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __410935799_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameSaveContainer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3c08f89563f4ecd9c6f33fd0e323d10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameSaveContainer(ptr: Pointer?): WithDefault = IGameSaveContainer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameSaveContainer {
      val address = segment.toRawLongValue()
      return makeIGameSaveContainer(Pointer(address))
    }

    public override fun toNative(obj: IGameSaveContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__410935799_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameSaveContainer): Array<IGameSaveContainer?> =
        (elements as
        Array<IGameSaveContainer?>).castToImpl<IGameSaveContainer,IGameSaveContainer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameSaveContainer?> =
        arrayOfNulls<IGameSaveContainer_Impl>(size) as Array<IGameSaveContainer?>
  }
}
