package Windows.Web.AtomPub

import Windows.Foundation.IAsyncActionWithProgress
import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.Uri
import Windows.Storage.Streams.IInputStream
import Windows.Web.Syndication.ISyndicationClient
import Windows.Web.Syndication.ISyndicationClient.ABI.IID
import Windows.Web.Syndication.RetrievalProgress
import Windows.Web.Syndication.SyndicationItem
import Windows.Web.Syndication.TransferProgress
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IAtomPubClient.ABI::class)
@Signature("{35392c38-cded-4d4c-9637-05f15c1c9406}")
@Guid("35392c38cded4d4c963705f15c1c9406")
@WinRTInterface("35392c38cded4d4c963705f15c1c9406")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAtomPubClient.ByReference::class)
public interface IAtomPubClient : NativeMapped, IWinRTInterface, ISyndicationClient {
  @InterfaceMethod(0)
  public fun RetrieveServiceDocumentAsync(uri: Uri?): IAsyncOperationWithProgress<ServiceDocument?,
      RetrievalProgress?>?

  @InterfaceMethod(1)
  public fun RetrieveMediaResourceAsync(uri: Uri?): IAsyncOperationWithProgress<IInputStream?,
      RetrievalProgress?>?

  @InterfaceMethod(2)
  public fun RetrieveResourceAsync(uri: Uri?): IAsyncOperationWithProgress<SyndicationItem?,
      RetrievalProgress?>?

  @InterfaceMethod(3)
  public fun CreateResourceAsync(
    uri: Uri?,
    description: String?,
    item: SyndicationItem?
  ): IAsyncOperationWithProgress<SyndicationItem?, TransferProgress?>?

  @InterfaceMethod(4)
  public fun CreateMediaResourceAsync(
    uri: Uri?,
    mediaType: String?,
    description: String?,
    mediaStream: IInputStream?
  ): IAsyncOperationWithProgress<SyndicationItem?, TransferProgress?>?

  @InterfaceMethod(5)
  public fun UpdateMediaResourceAsync(
    uri: Uri?,
    mediaType: String?,
    mediaStream: IInputStream?
  ): IAsyncActionWithProgress<TransferProgress?>?

  @InterfaceMethod(6)
  public fun UpdateResourceAsync(uri: Uri?, item: SyndicationItem?):
      IAsyncActionWithProgress<TransferProgress?>?

  @InterfaceMethod(7)
  public fun UpdateResourceItemAsync(item: SyndicationItem?):
      IAsyncActionWithProgress<TransferProgress?>?

  @InterfaceMethod(8)
  public fun DeleteResourceAsync(uri: Uri?): IAsyncActionWithProgress<TransferProgress?>?

  @InterfaceMethod(9)
  public fun DeleteResourceItemAsync(item: SyndicationItem?):
      IAsyncActionWithProgress<TransferProgress?>?

  @InterfaceMethod(10)
  public fun CancelAsyncOperations(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAtomPubClient>
      {
    public override fun getValue() = ABI.makeIAtomPubClient(pointer.getPointer(0))

    public fun setValue(value: IAtomPubClient_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAtomPubClient, ISyndicationClient.WithDefault {
    public val __52754645_Ptr: Pointer?

    public val _52754645_VtblPtr: Pointer?
      get() = __52754645_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RetrieveServiceDocumentAsync(uri: Uri?):
        IAsyncOperationWithProgress<ServiceDocument?, RetrievalProgress?>? {
      val fnPtr = _52754645_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<ServiceDocument?,
          RetrievalProgress?>>()
      val hr = fn.invokeHR(arrayOf(__52754645_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<ServiceDocument?,
          RetrievalProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RetrieveMediaResourceAsync(uri: Uri?):
        IAsyncOperationWithProgress<IInputStream?, RetrievalProgress?>? {
      val fnPtr = _52754645_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<IInputStream?,
          RetrievalProgress?>>()
      val hr = fn.invokeHR(arrayOf(__52754645_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<IInputStream?,
          RetrievalProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RetrieveResourceAsync(uri: Uri?):
        IAsyncOperationWithProgress<SyndicationItem?, RetrievalProgress?>? {
      val fnPtr = _52754645_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<SyndicationItem?,
          RetrievalProgress?>>()
      val hr = fn.invokeHR(arrayOf(__52754645_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<SyndicationItem?,
          RetrievalProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateResourceAsync(
      uri: Uri?,
      description: String?,
      item: SyndicationItem?
    ): IAsyncOperationWithProgress<SyndicationItem?, TransferProgress?>? {
      val fnPtr = _52754645_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<SyndicationItem?,
          TransferProgress?>>()
      val hr = fn.invokeHR(arrayOf(__52754645_Ptr, marshalToNative(uri),
          marshalToNative(description), marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<SyndicationItem?,
          TransferProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateMediaResourceAsync(
      uri: Uri?,
      mediaType: String?,
      description: String?,
      mediaStream: IInputStream?
    ): IAsyncOperationWithProgress<SyndicationItem?, TransferProgress?>? {
      val fnPtr = _52754645_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<SyndicationItem?,
          TransferProgress?>>()
      val hr = fn.invokeHR(arrayOf(__52754645_Ptr, marshalToNative(uri), marshalToNative(mediaType),
          marshalToNative(description), marshalToNative(mediaStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<SyndicationItem?,
          TransferProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun UpdateMediaResourceAsync(
      uri: Uri?,
      mediaType: String?,
      mediaStream: IInputStream?
    ): IAsyncActionWithProgress<TransferProgress?>? {
      val fnPtr = _52754645_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncActionWithProgress<TransferProgress?>>()
      val hr = fn.invokeHR(arrayOf(__52754645_Ptr, marshalToNative(uri), marshalToNative(mediaType),
          marshalToNative(mediaStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncActionWithProgress<TransferProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun UpdateResourceAsync(uri: Uri?, item: SyndicationItem?):
        IAsyncActionWithProgress<TransferProgress?>? {
      val fnPtr = _52754645_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncActionWithProgress<TransferProgress?>>()
      val hr = fn.invokeHR(arrayOf(__52754645_Ptr, marshalToNative(uri), marshalToNative(item),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncActionWithProgress<TransferProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun UpdateResourceItemAsync(item: SyndicationItem?):
        IAsyncActionWithProgress<TransferProgress?>? {
      val fnPtr = _52754645_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncActionWithProgress<TransferProgress?>>()
      val hr = fn.invokeHR(arrayOf(__52754645_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncActionWithProgress<TransferProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun DeleteResourceAsync(uri: Uri?):
        IAsyncActionWithProgress<TransferProgress?>? {
      val fnPtr = _52754645_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncActionWithProgress<TransferProgress?>>()
      val hr = fn.invokeHR(arrayOf(__52754645_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncActionWithProgress<TransferProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun DeleteResourceItemAsync(item: SyndicationItem?):
        IAsyncActionWithProgress<TransferProgress?>? {
      val fnPtr = _52754645_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncActionWithProgress<TransferProgress?>>()
      val hr = fn.invokeHR(arrayOf(__52754645_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncActionWithProgress<TransferProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CancelAsyncOperations(): Unit {
      val fnPtr = _52754645_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__52754645_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAtomPubClient_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISyndicationClient {
    public override val __796507003_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_52754645_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __52754645_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAtomPubClient, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("35392c38cded4d4c963705f15c1c9406")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAtomPubClient(ptr: Pointer?): WithDefault = IAtomPubClient_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAtomPubClient {
      val address = segment.toRawLongValue()
      return makeIAtomPubClient(Pointer(address))
    }

    public override fun toNative(obj: IAtomPubClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__52754645_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAtomPubClient): Array<IAtomPubClient?> = (elements as
        Array<IAtomPubClient?>).castToImpl<IAtomPubClient,IAtomPubClient_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAtomPubClient?> =
        arrayOfNulls<IAtomPubClient_Impl>(size) as Array<IAtomPubClient?>
  }
}
